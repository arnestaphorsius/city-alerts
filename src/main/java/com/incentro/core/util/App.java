package main.java.com.incentro.core.util;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author Arne Staphorsius.
 * @since 3-2-2016.
 */
public class App {

  private static Logger log = LogManager.getLogger(App.class);

  private static Properties PROPERTIES = null;

  private static BasicDataSource DATA_REQUEST_CONNECTION_POOL = null;
  private static BasicDataSource STATUS_RESPONSE_CONNECTION_POOL = null;

  public static void init() {

    // Load all properties
    if (PROPERTIES == null) Props.init();

    // Set up connection to the databases
    DBConn.init();
  }

  public static String getProperty(String key) {
    return PROPERTIES.getProperty(key);
  }

  public static Connection getDataRequestConnection() throws SQLException {
    return DATA_REQUEST_CONNECTION_POOL.getConnection();
  }

  public static Connection getStatusResponseConnection() throws SQLException {
    return STATUS_RESPONSE_CONNECTION_POOL.getConnection();
  }

  private static class Props {

    protected static void init() {

      PROPERTIES = new Properties();
      InputStream input = null;

      try {
        input = App.class.getResourceAsStream(Constants.Properties.FILE_LOCATION);
        //input = new FileInputStream("src/main/resources/config.properties");

        PROPERTIES.load(input);

      } catch (IOException e) {
        e.printStackTrace();
      } finally {
        if (input != null) {
          try {
            input.close();
          } catch (IOException e) {
            e.printStackTrace();
          }
        }
      }
    }
  }

  private static class DBConn {

    protected static void init() {

      try {
        Class.forName(getProperty(Constants.Database.DB_DRIVER));
      } catch (ClassNotFoundException e) {
        log.error("PostgreSQL JDBC Driver not found.", e);
        return;
      }

      if (DATA_REQUEST_CONNECTION_POOL == null) {

        try {
          DATA_REQUEST_CONNECTION_POOL = new BasicDataSource();

          DATA_REQUEST_CONNECTION_POOL.setUsername(getProperty(Constants.DataRequest.DB_USER));
          DATA_REQUEST_CONNECTION_POOL.setPassword(getProperty(Constants.DataRequest.DB_PASSWORD));
          DATA_REQUEST_CONNECTION_POOL.setUrl(getProperty(Constants.DataRequest.DB_URL));
          DATA_REQUEST_CONNECTION_POOL.setDriverClassName(getProperty(Constants.Database.DB_DRIVER));

          DATA_REQUEST_CONNECTION_POOL.setInitialSize(3);

          // Retrieve and close a connection to test the configuration.
          Connection connection = getDataRequestConnection();
          connection.close();

        } catch (SQLException e) {
          log.error("Unable to connect to the DataRequest PostgreSQL database.");
        }
      }

      if (STATUS_RESPONSE_CONNECTION_POOL == null) {

        try {
          STATUS_RESPONSE_CONNECTION_POOL = new BasicDataSource();

          STATUS_RESPONSE_CONNECTION_POOL.setUsername(getProperty(Constants.StatusResponse.DB_USER));
          STATUS_RESPONSE_CONNECTION_POOL.setPassword(getProperty(Constants.StatusResponse.DB_PASSWORD));
          STATUS_RESPONSE_CONNECTION_POOL.setUrl(getProperty(Constants.StatusResponse.DB_URL));
          STATUS_RESPONSE_CONNECTION_POOL.setDriverClassName(getProperty(Constants.Database.DB_DRIVER));

          STATUS_RESPONSE_CONNECTION_POOL.setInitialSize(3);

          // Retrieve and close a connection to test the configuration.
          Connection connection = getStatusResponseConnection();
          connection.close();

        } catch (SQLException e) {
          log.error("Unable to connect to the StatusResponse PostgreSQL database.");
        }
      }
    }
  }

}
