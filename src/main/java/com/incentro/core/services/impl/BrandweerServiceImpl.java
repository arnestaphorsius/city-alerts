package main.java.com.incentro.core.services.impl;

import main.java.com.incentro.core.services.BrandweerService;
import main.java.com.incentro.core.util.App;
import main.java.com.incentro.core.util.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Arne Staphorsius.
 * @since 16-2-2016.
 */
public class BrandweerServiceImpl implements BrandweerService {

  private static Logger log = LogManager.getLogger(BrandweerServiceImpl.class);

  @Override
  public String getIndicatoren(Connection conn, String bagID) {

    Statement st = null;
    ResultSet rs = null;

    String kleurcode = null;

    try {
      st = conn.createStatement();

      String table = App.getProperty(Constants.Database.DB_TABLE);

      String sql = "SELECT * FROM " + table + " WHERE \"bag_id\"='" + bagID + "';";
      rs = st.executeQuery(sql);

      if (rs.next()) kleurcode = rs.getString("risicovol_kleurcode");
      else log.info("No database entry found for BAG ID " + bagID);

    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if (st != null) st.close();
        if (rs != null) rs.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }

    return kleurcode;
  }
}
