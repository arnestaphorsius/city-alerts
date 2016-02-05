package main.java.util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Arne Staphorsius.
 * @since 3-2-2016.
 */
public class App {

  private static Properties PROPERTIES = null;
  public static BasicDataSource CONNECTION_POOL = null;

  public static void init() {

    // Load all properties
    Props.init();

    // Set up connection to the database
    DBConn.init();
  }

  public static String getProperty(String key) {
    return PROPERTIES.getProperty(key);
  }

  private static class DBConn {

    protected static void init() {

      try {
        Class.forName("org.postgresql.Driver");
      } catch (ClassNotFoundException e) {
        System.out.println("PostgreSQL JDBC Driver not found.");
        e.printStackTrace();
        return;
      }

      CONNECTION_POOL = new BasicDataSource();

      CONNECTION_POOL.setUsername(Constants.Database.DB_USER);
      CONNECTION_POOL.setPassword(Constants.Database.DB_PASSWORD);
      CONNECTION_POOL.setUrl(Constants.Database.DB_URL);
      CONNECTION_POOL.setDriverClassName("org.postgresql.Driver");

      CONNECTION_POOL.setInitialSize(3);
    }
  }

  private static class Props {

    protected static void init() {

      PROPERTIES = new Properties();
      InputStream input = null;

      try {
        input = new FileInputStream(Constants.Properties.FILE_LOCATION);

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
