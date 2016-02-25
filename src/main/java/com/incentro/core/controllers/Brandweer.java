package main.java.com.incentro.core.controllers;

import main.java.com.incentro.core.services.impl.BrandweerServiceImpl;
import main.java.com.incentro.core.util.App;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Arne Staphorsius.
 * @since 17-2-2016.
 */
public class Brandweer {

  private static Logger log = LogManager.getLogger(Brandweer.class);

  private static BrandweerServiceImpl BRANDWEER_SERVICE = new BrandweerServiceImpl();

  /**
   * Retrieves the color code for an object based on BAG ID.
   *
   * @param bagID the BAG ID
   * @return the color code
   */
  public static String getKleurcode(String bagID) {

    Connection conn = null;
    String kleurCode = null;

    try {
      conn = App.getConnection();

      kleurCode = BRANDWEER_SERVICE.getIndicatoren(conn, bagID);

    } catch (SQLException e) {
      log.error("Unable to connect to the PostgreSQL database.", e);
    } finally {
      try {
        if (conn != null) conn.close();
      } catch (SQLException e) {
        log.warn("An error occurred while trying to close database connection.");
      }
    }

    return kleurCode;
  }
}
