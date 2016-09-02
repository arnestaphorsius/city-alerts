package main.java.com.incentro.core.controllers;

import main.java.com.incentro.core.services.impl.BrandweerServiceImpl;
import main.java.com.incentro.core.util.App;
import main.java.com.incentro.ws.models.dr.IncomingDoc;
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
   * @param indicator the requested Indicator
   * @return the color code
   */
  public static main.java.com.incentro.ws.models.bd.IncomingDoc.Indicator getKleurIndicator(String bagID,
                                                                                            IncomingDoc.Indicator indicator) {

    main.java.com.incentro.ws.models.bd.IncomingDoc.Indicator kleurCode = null;

    try (Connection conn = App.getDataRequestConnection()) {

      kleurCode = BRANDWEER_SERVICE.getIndicatoren(conn, bagID, indicator);

    } catch (SQLException e) {
      log.error("Unable to get a connection to the PostgreSQL database.", e);
    }

    return kleurCode;
  }

  /**
   * Inserts the status response into the logging database.
   *
   * @param incomingDoc the {@link IncomingDoc} from the request.
   */
  public static void insertStatusResponse(main.java.com.incentro.ws.models.bd.IncomingDoc incomingDoc) {

    try (Connection conn = App.getStatusResponseConnection()) {

      BRANDWEER_SERVICE.insertStatusResponse(conn, incomingDoc);

    } catch (SQLException e) {
      log.error("Unable to get a connection to the PostgreSQL database.", e);
    }
  }

  /**
   * Clean up status responses when the incident is closed.
   *
   * @param incomingDoc the {@link IncomingDoc} from the request.
   */
  public static void cleanUpStatusResponse(IncomingDoc incomingDoc) {

    try (Connection conn = App.getStatusResponseConnection()) {

      BRANDWEER_SERVICE.cleanUpStatusResponse(conn, incomingDoc);

    } catch (SQLException e) {
      log.error("Unable to get a connection to the PostgreSQL database.", e);
    }
  }

}
