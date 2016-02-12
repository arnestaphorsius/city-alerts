package main.java.com.incentro;

import main.java.com.incentro.core.util.App;
import main.java.com.incentro.ws.services.impl.ServiceSoapImpl;
import main.java.com.incentro.ws.services.impl.StatusResponseImpl;

import javax.xml.ws.Endpoint;

/**
 * @author Arne Staphorsius.
 * @since 27-1-2016.
 */
public class BerichtMeldingPublisher {

  static {
    App.init();
  }

  public static void main(String... args) {
    Endpoint.publish("http://127.0.0.1:8088/ServiceSoap", new ServiceSoapImpl());
    Endpoint.publish("http://127.0.0.1:8088/StatusResponse", new StatusResponseImpl());
  }
}
