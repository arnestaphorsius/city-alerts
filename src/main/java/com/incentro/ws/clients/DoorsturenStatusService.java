package main.java.com.incentro.ws.clients;

import main.java.com.incentro.ws.services.StatusResponse;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Arne Staphorsius.
 * @since 12-2-2016.
 */
@WebServiceClient(name = "DoorsturenStatus", targetNamespace = "http://veiligheidintelligence.nl:5080/city-alerts/StatusResponse/", wsdlLocation = "http://veiligheidintelligence.nl:5080/city-alerts/StatusResponse?wsdl")
public class DoorsturenStatusService extends Service {

  private final static URL DOORSTURENSTATUS_WSDL_LOCATION;
  private final static WebServiceException DOORSTURENSTATUS_EXCEPTION;
  private final static QName DOORSTURENSTATUS_QNAME = new QName("http://veiligheidintelligence.nl:5080/city-alerts/StatusResponse/", "DoorsturenStatus");

  static {
    URL url = null;
    WebServiceException e = null;
    try {
      url = new URL("http://veiligheidintelligence.nl:5080/city-alerts/StatusResponse?wsdl");
    } catch (MalformedURLException ex) {
      e = new WebServiceException(ex);
    }
    DOORSTURENSTATUS_WSDL_LOCATION = url;
    DOORSTURENSTATUS_EXCEPTION = e;
  }

  public DoorsturenStatusService() {
    super(__getWsdlLocation(), DOORSTURENSTATUS_QNAME);
  }

  public DoorsturenStatusService(WebServiceFeature... features) {
    super(__getWsdlLocation(), DOORSTURENSTATUS_QNAME, features);
  }

  public DoorsturenStatusService(URL wsdlLocation) {
    super(wsdlLocation, DOORSTURENSTATUS_QNAME);
  }

  public DoorsturenStatusService(URL wsdlLocation, WebServiceFeature... features) {
    super(wsdlLocation, DOORSTURENSTATUS_QNAME, features);
  }

  public DoorsturenStatusService(URL wsdlLocation, QName serviceName) {
    super(wsdlLocation, serviceName);
  }

  public DoorsturenStatusService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
    super(wsdlLocation, serviceName, features);
  }

  /**
   *
   * @return
   *     returns StatusResponse
   */
  @WebEndpoint(name = "StatusResponse")
  public StatusResponse getStatusResponse() {
    return super.getPort(new QName("http://veiligheidintelligence.nl:5080/city-alerts/StatusResponse/", "StatusResponse"), StatusResponse.class);
  }

  /**
   *
   * @param features
   *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
   * @return
   *     returns StatusResponse
   */
  @WebEndpoint(name = "StatusResponse")
  public StatusResponse getStatusResponse(WebServiceFeature... features) {
    return super.getPort(new QName("http://veiligheidintelligence.nl:5080/city-alerts/StatusResponse/", "StatusResponse"), StatusResponse.class, features);
  }

  private static URL __getWsdlLocation() {
    if (DOORSTURENSTATUS_EXCEPTION!= null) {
      throw DOORSTURENSTATUS_EXCEPTION;
    }
    return DOORSTURENSTATUS_WSDL_LOCATION;
  }
}
