package main.java.com.incentro.core.services.impl;

import main.java.com.incentro.core.services.BrandweerService;
import main.java.com.incentro.core.util.App;
import main.java.com.incentro.core.util.Constants;
import main.java.com.incentro.ws.models.ds.IncomingDoc;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;

/**
 * @author Arne Staphorsius.
 * @since 16-2-2016.
 */
public class BrandweerServiceImpl implements BrandweerService {

  private static Logger log = LogManager.getLogger(BrandweerServiceImpl.class);

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

      String sql = "SELECT * FROM " + table + " WHERE \"bag_id\"=?;";

      st = conn.prepareStatement(sql);
      st.setString(1, bagID);

      rs = st.executeQuery(sql);

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

        String sql = "INSERT INTO " + table + "(id, bagid) VALUES(?, ?) ";

        st = conn.prepareStatement(sql);
        st.setString(1, incomingDoc.getINCIDENTID());
        st.setBigDecimal(2, incomingDoc.getLocatie().getBag().getBagid());

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
