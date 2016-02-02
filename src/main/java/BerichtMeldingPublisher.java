package main.java;

import main.java.ws.services.impl.ServiceSoapImpl;

import javax.xml.ws.Endpoint;

/**
 * @author Arne Staphorsius.
 * @since 27-1-2016.
 */
public class BerichtMeldingPublisher {
  public static void main(String... args) {
    Endpoint.publish("http://127.0.0.1:8088/ServiceSoap", new ServiceSoapImpl());
  }
}
