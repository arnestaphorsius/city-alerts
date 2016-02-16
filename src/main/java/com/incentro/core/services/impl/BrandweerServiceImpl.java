package main.java.com.incentro.core.services.impl;

import main.java.com.incentro.core.services.BrandweerService;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Arne Staphorsius.
 * @since 16-2-2016.
 */
public class BrandweerServiceImpl implements BrandweerService {

  @Override
  public String getIndicatoren(Connection conn, String bagID) {

    Statement st = null;
    ResultSet rs = null;

    String kleurcode = null;

    try {
      st = conn.createStatement();

      String sql = "SELECT * FROM dm_berichtenservice WHERE \"bag_id\"='" + bagID + "';";
      rs = st.executeQuery(sql);

      rs.next();
      kleurcode = rs.getString("risicovol_kleurcode");

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
