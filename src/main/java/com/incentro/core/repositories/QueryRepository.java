package main.java.com.incentro.core.repositories;

import main.java.com.incentro.core.util.App;
import main.java.com.incentro.core.util.Constants;

/**
 * @author Arne Staphorsius.
 * @since 17/08/16.
 */
public class QueryRepository {

  private final static String DATAREQUEST_TABLE = App.getProperty(Constants.DataRequest.DB_TABLE);
  private final static String STATUSREPONSE_TABLE = App.getProperty(Constants.StatusResponse.DB_TABLE);
  private final static String STATUSREPONSE_ARCHIVE = App.getProperty(Constants.StatusResponse.DB_ARCHIVE);

  public static String getIndicatoren() {

    return "SELECT * FROM " + DATAREQUEST_TABLE + " WHERE bag_id = ?";
  }

  public static String insertStatusResponse() {

    return "INSERT INTO " + STATUSREPONSE_TABLE + "(log_time,incident_id,incident_prioriteit,incident_start_dtg,bag_id" +
        ",gevraagde_indicator,indicator_waarschuwingsniveau,indicator_label,indicator_aanvullende_informatie) " +
        "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
  }

  public static String deleteStatusResponse() {

    return "DELETE FROM " + STATUSREPONSE_TABLE + " WHERE incident_id = ?";
  }

  public static String findAllStatusResponses() {

    return "SELECT * FROM " + STATUSREPONSE_TABLE + " WHERE incident_id = ?";
  }

  public static String archiveStatusResponses() {

    return "INSERT INTO " + STATUSREPONSE_ARCHIVE + " (archived_time,log_time,incident_id,incident_prioriteit,incident_start_dtg," +
        "bag_id,gevraagde_indicator,indicator_waarschuwingsniveau,indicator_label,indicator_aanvullende_informatie)" +
        " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
  }
}
