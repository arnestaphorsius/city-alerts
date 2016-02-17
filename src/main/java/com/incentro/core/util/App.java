package main.java.com.incentro.core.util;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

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

  private static Log log = LogFactory.getLog(App.class);

  private static Properties PROPERTIES = null;
  private static BasicDataSource CONNECTION_POOL = null;

  public static void init() {

    // Load all properties
    if (PROPERTIES == null) Props.init();

    // Set up connection to the database
    if (CONNECTION_POOL == null) DBConn.init();
  }

  public static String getProperty(String key) {
    return PROPERTIES.getProperty(key);
  }

  public static Connection getConnection() throws SQLException {
    return CONNECTION_POOL.getConnection();
  }

  private static class DBConn {

    protected static void init() {

      try {
        Class.forName(getProperty(Constants.Database.DB_DRIVER));
      } catch (ClassNotFoundException e) {
        log.error("PostgreSQL JDBC Driver not found.", e);
        return;
      }

      try {
        CONNECTION_POOL = new BasicDataSource();

        CONNECTION_POOL.setUsername(getProperty(Constants.Database.DB_USER));
        CONNECTION_POOL.setPassword(getProperty(Constants.Database.DB_PASSWORD));
        CONNECTION_POOL.setUrl(getProperty(Constants.Database.DB_URL));
        CONNECTION_POOL.setDriverClassName(getProperty(Constants.Database.DB_DRIVER));

        CONNECTION_POOL.setInitialSize(1);

        // Retrieve and close a connection to test the configuration.
        Connection connection = getConnection();
        connection.close();

      } catch (SQLException e) {
        log.error("Unable to connect to the PostgreSQL database.");
      }
    }
  }

  private static class Props {

    protected static void init() {

      PROPERTIES = new Properties();
      InputStream input = null;

      try {
        //input = App.class.getResourceAsStream(Constants.Properties.FILE_LOCATION);
        input = new FileInputStream("src/main/resources/config.properties");

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

}
