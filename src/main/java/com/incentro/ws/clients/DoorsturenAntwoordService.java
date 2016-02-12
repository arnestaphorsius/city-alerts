package main.java.com.incentro.ws.clients;

import main.java.com.incentro.ws.services.DataResponse;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Arne Staphorsius.
 * @since 12-2-2016.
 */
@WebServiceClient(name = "DoorsturenAntwoord", targetNamespace = "http://localhost:8088/DataResponse/", wsdlLocation = "http://localhost:8088/DataResponse?wsdl")
public class DoorsturenAntwoordService extends Service {

  private final static URL DOORSTURENANTWOORD_WSDL_LOCATION;
  private final static WebServiceException DOORSTURENANTWOORD_EXCEPTION;
  private final static QName DOORSTURENANTWOORD_QNAME = new QName("http://localhost:8088/DataResponse/", "DoorsturenAntwoord");

  static {
    URL url = null;
    WebServiceException e = null;
    try {
      url = new URL("http://localhost:8088/DataResponse?wsdl");
    } catch (MalformedURLException ex) {
      e = new WebServiceException(ex);
    }
    DOORSTURENANTWOORD_WSDL_LOCATION = url;
    DOORSTURENANTWOORD_EXCEPTION = e;
  }

  public DoorsturenAntwoordService() {
    super(__getWsdlLocation(), DOORSTURENANTWOORD_QNAME);
  }

  public DoorsturenAntwoordService(WebServiceFeature... features) {
    super(__getWsdlLocation(), DOORSTURENANTWOORD_QNAME, features);
  }

  public DoorsturenAntwoordService(URL wsdlLocation) {
    super(wsdlLocation, DOORSTURENANTWOORD_QNAME);
  }

  public DoorsturenAntwoordService(URL wsdlLocation, WebServiceFeature... features) {
    super(wsdlLocation, DOORSTURENANTWOORD_QNAME, features);
  }

  public DoorsturenAntwoordService(URL wsdlLocation, QName serviceName) {
    super(wsdlLocation, serviceName);
  }

  public DoorsturenAntwoordService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
    super(wsdlLocation, serviceName, features);
  }

  /**
   *
   * @return
   *     returns DataResponse
   */
  @WebEndpoint(name = "DataResponse")
  public DataResponse getDataResponse() {
    return super.getPort(new QName("http://localhost:8088/DataResponse/", "DataResponse"), DataResponse.class);
  }

  /**
   *
   * @param features
   *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
   * @return
   *     returns DataResponse
   */
  @WebEndpoint(name = "DataResponse")
  public DataResponse getDataResponse(WebServiceFeature... features) {
    return super.getPort(new QName("http://localhost:8088/DataResponse/", "DataResponse"), DataResponse.class, features);
  }

  private static URL __getWsdlLocation() {
    if (DOORSTURENANTWOORD_EXCEPTION!= null) {
      throw DOORSTURENANTWOORD_EXCEPTION;
    }
    return DOORSTURENANTWOORD_WSDL_LOCATION;
  }
}
