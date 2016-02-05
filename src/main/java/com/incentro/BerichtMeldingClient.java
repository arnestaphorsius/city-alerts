package main.java.com.incentro;

import main.java.com.incentro.ws.models.BerichtMeldingService;
import main.java.com.incentro.ws.models.mk.IncomingDoc;
import main.java.com.incentro.ws.models.mk.ResultDoc;
import main.java.com.incentro.ws.services.ServiceSoap;

import javax.xml.ws.WebServiceRef;

/**
 * @author Arne Staphorsius.
 * @since 29-1-2016.
 */
public class BerichtMeldingClient {

  @WebServiceRef(wsdlLocation = "http://localhost:8088/ServiceSoap?wsdl")
  static BerichtMeldingService service;

  /**
   * @param args arguments
   */
  public static void main(String[] args) {
    try {
      BerichtMeldingClient client = new BerichtMeldingClient();
      client.doTest(args);
      client.doTest2(args);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void doTest(String[] args) {
    try {
      service = new BerichtMeldingService();
      ServiceSoap port = service.getServiceSoap();
      String name;
      if (args.length > 0) {
        name = args[0];
      } else {
        name = "Incentro";
      }
      ResultDoc response = port.berichtMelding(new IncomingDoc(name));
      System.out.println("************************");
      System.out.println(response.getKleurcode());
      System.out.println("************************");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void doTest2(String[] args) {
    try {
      service = new BerichtMeldingService();
      ServiceSoap port = service.getServiceSoap();

      main.java.com.incentro.ws.models.baa.ResultDoc response = port.cityAlertDataRequest(new main.java.com.incentro.ws.models.baa.IncomingDoc());
      System.out.println("************************");
      System.out.println(response.getINCIDENTID());
      System.out.println("************************");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
