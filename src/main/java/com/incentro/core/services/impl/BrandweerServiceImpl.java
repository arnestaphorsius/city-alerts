package main.java.com.incentro.core.services.impl;

import main.java.com.incentro.core.services.BrandweerService;
import main.java.com.incentro.core.util.App;
import main.java.com.incentro.core.util.Constants;
import main.java.com.incentro.ws.models.dr.IncomingDoc;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Arne Staphorsius.
 * @since 16-2-2016.
 */
public class BrandweerServiceImpl implements BrandweerService {

  private static Logger log = LogManager.getLogger(BrandweerServiceImpl.class);

  private static DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

  @Override
  public String getIndicatoren(Connection conn, String bagID) {

    PreparedStatement st = null;
    ResultSet rs = null;

    String kleurcode = null;

    if (bagID == null) {
      log.warn("No BAG ID was supplied in the request.");
      return null;
    }

    try {

      String table = App.getProperty(Constants.DataRequest.DB_TABLE);

      String sql = "SELECT * FROM " + table + " WHERE bag_id = ?";

      st = conn.prepareStatement(sql);
      st.setString(1, bagID);

      rs = st.executeQuery();

      if (rs.next()) kleurcode = rs.getString("risicovol_kleurcode");
      else log.info("No database entry found for BAG ID " + bagID);

    } catch (SQLException e) {
      log.error(e);
    } finally {
      try {
        if (st != null) st.close();
        if (rs != null) rs.close();
      } catch (SQLException e) {
        log.warn(e);
      }
    }

    return kleurcode;
  }

  @Override
  public void insertStatusResponse(Connection conn, IncomingDoc incomingDoc) {

    if (incomingDoc == null) {
      log.error("Nothing to insert in to the database.");

    } else {

      PreparedStatement st = null;

      try {
        String table = App.getProperty(Constants.StatusResponse.DB_TABLE);

        String currentDate = dateFormat.format(new Date());

        String sql = "INSERT INTO " + table + "(log_time,incident_id,incident_prioriteit,incident_start_dtg,bag_id" +
            ",gevraagde_indicator,status) VALUES(?, ?, ?, ?, ?, ?, ?)";

        st = conn.prepareStatement(sql);

        st.setString(1, currentDate);
        st.setString(2, incomingDoc.getINCIDENTID());
        st.setString(3, incomingDoc.getPRIORITEITINCIDENT());
        st.setString(4, incomingDoc.getDTGSTARTINCIDENT() != null ?
              incomingDoc.getDTGSTARTINCIDENT().toString(): null);

        if (incomingDoc.getLocatie() != null && incomingDoc.getLocatie().getBag() != null) {
          st.setString(5, incomingDoc.getLocatie().getBag().getBagid()); } else st.setString(5, null);

        IncomingDoc.Indicator indicator = incomingDoc.getIndicator();
        st.setString(6, indicator != null ? incomingDoc.getIndicator().getGevraagdeindicator() : null);
        st.setString(7, indicator != null ? incomingDoc.getIndicator().getMaximaaltoegestaanwaarschuwingsniveau().toString() : null);

        st.executeUpdate();

      } catch (SQLException e) {
        log.error(e);
      } finally {
        try {
          if (st != null) st.close();
        } catch (SQLException e) {
          log.warn(e);
        }
      }
    }
  }
}
