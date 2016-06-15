package main.java.com.incentro.core.services.impl;

import main.java.com.incentro.core.services.BrandweerService;
import main.java.com.incentro.core.util.App;
import main.java.com.incentro.core.util.Constants;
import main.java.com.incentro.ws.models.dr.IncomingDoc;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigInteger;
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
  public main.java.com.incentro.ws.models.bd.IncomingDoc.Indicator getIndicatoren(Connection conn,
                                                                                  String bagID,
                                                                                  IncomingDoc.Indicator indicator) {

    PreparedStatement st = null;
    ResultSet rs = null;

    main.java.com.incentro.ws.models.bd.IncomingDoc.Indicator kleurIndicator =
        new main.java.com.incentro.ws.models.bd.IncomingDoc.Indicator();

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

      final int maxNiveau = indicator != null && indicator.getMaximaaltoegestaanwaarschuwingsniveau() != null ?
          indicator.getMaximaaltoegestaanwaarschuwingsniveau().intValue() : 0;

      if (rs.next()) {

        final String risicovol_kleurcode = rs.getString("risicovol_kleurcode");

        String kleurcode = risicovol_kleurcode == null ? "wit" : risicovol_kleurcode.toLowerCase();
        switch (kleurcode) {
          case "rood": kleurIndicator.setWaarschuwingsniveau(BigInteger.valueOf(Math.max(1, maxNiveau))); break;
          case "oranje": kleurIndicator.setWaarschuwingsniveau(BigInteger.valueOf(Math.max(2, maxNiveau))); break;
          case "blauw": kleurIndicator.setWaarschuwingsniveau(BigInteger.valueOf(Math.max(3, maxNiveau))); break;
          default: kleurIndicator.setWaarschuwingsniveau(BigInteger.valueOf(0));
        }

        kleurIndicator.setLabel(rs.getString("risicovol_label"));
        kleurIndicator.setAanvullendeinfo(rs.getString("risicovol_aanvullende_informatie"));
      }
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
    if (indicator != null) kleurIndicator.setIndicator(indicator.getGevraagdeindicator());

    return kleurIndicator;
  }

  @Override
  public void insertStatusResponse(Connection conn, main.java.com.incentro.ws.models.bd.IncomingDoc incomingDoc) {

    if (incomingDoc == null) {
      log.error("Nothing to insert in to the database.");

    } else {

      PreparedStatement st = null;

      try {
        String table = App.getProperty(Constants.StatusResponse.DB_TABLE);

        String currentDate = dateFormat.format(new Date());

        String sql = "INSERT INTO " + table + "(log_time,incident_id,incident_prioriteit,incident_start_dtg,bag_id" +
            ",gevraagde_indicator,indicator_waarschuwingsniveau,indicator_label,indicator_aanvullende_informatie) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";

        st = conn.prepareStatement(sql);

        st.setString(1, currentDate);
        st.setString(2, incomingDoc.getIncidentid());
        st.setString(3, incomingDoc.getPrioriteitincident());
        st.setString(4, incomingDoc.getDtgstartincident() != null ?
              incomingDoc.getDtgstartincident().toString(): null);

        if (incomingDoc.getLocatie() != null && incomingDoc.getLocatie().getBag() != null) {
          st.setString(5, incomingDoc.getLocatie().getBag().getBagid()); } else st.setString(5, null);

        main.java.com.incentro.ws.models.bd.IncomingDoc.Indicator indicator = incomingDoc.getIndicator();
        st.setString(6, indicator != null ? indicator.getIndicator() : null);
        st.setString(7, indicator != null && indicator.getWaarschuwingsniveau() != null
            ? indicator.getWaarschuwingsniveau().toString() : "0");
        st.setString(8, indicator != null ? indicator.getLabel() : null);
        st.setString(9, indicator != null ? indicator.getAanvullendeinfo() : null);

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

  public void cleanUpStatusResponse(Connection conn, IncomingDoc incomingDoc) {

    if (incomingDoc == null) {
      log.error("Missing incomingDoc from request.");
    } else {

      PreparedStatement st = null;

      try {
        String table = App.getProperty(Constants.StatusResponse.DB_TABLE);

        String sql = "DELETE FROM " + table + " WHERE incident_id = ?";

        st = conn.prepareStatement(sql);

        st.setString(1, incomingDoc.getINCIDENTID());
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
