package main.java.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Arne Staphorsius.
 * @since 3-2-2016.
 */
public class App {

  private static Properties properties = null;

  public static void init() {

    properties = new Properties();
    InputStream input = null;

    try {
      input = new FileInputStream("src/main/resources/config.properties");

      properties.load(input);

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

  public static String getTNS() {
    return properties.getProperty(Constants.Properties.TARGET_NAMESPACE);
  }

  public static String getWSDL() {
    return properties.getProperty(Constants.Properties.WSDL_LOCATION);
  }
}
