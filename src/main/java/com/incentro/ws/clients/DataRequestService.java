package main.java.com.incentro.ws.clients;

import main.java.com.incentro.ws.services.DataRequest;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Arne Staphorsius.
 * @since 15-2-2016.
 */
@WebServiceClient(name = "DataRequest", targetNamespace = "http://veiligheidintelligence.nl:5080/city-alerts/DataRequest/", wsdlLocation = "http://veiligheidintelligence.nl:5080/city-alerts/DataRequest?wsdl")
public class DataRequestService extends Service {

  private final static URL DATAREQUEST_WSDL_LOCATION;
  private final static WebServiceException DATAREQUEST_EXCEPTION;
  private final static QName DATAREQUEST_QNAME = new QName("http://veiligheidintelligence.nl:5080/city-alerts/DataRequest/", "DataRequest");

  static {
    URL url = null;
    WebServiceException e = null;
    try {
      url = new URL("http://veiligheidintelligence.nl:5080/city-alerts/DataRequest?wsdl");
    } catch (MalformedURLException ex) {
      e = new WebServiceException(ex);
    }
    DATAREQUEST_WSDL_LOCATION = url;
    DATAREQUEST_EXCEPTION = e;
  }

  public DataRequestService() {
    super(__getWsdlLocation(), DATAREQUEST_QNAME);
  }

  public DataRequestService(WebServiceFeature... features) {
    super(__getWsdlLocation(), DATAREQUEST_QNAME, features);
  }

  public DataRequestService(URL wsdlLocation) {
    super(wsdlLocation, DATAREQUEST_QNAME);
  }

  public DataRequestService(URL wsdlLocation, WebServiceFeature... features) {
    super(wsdlLocation, DATAREQUEST_QNAME, features);
  }

  public DataRequestService(URL wsdlLocation, QName serviceName) {
    super(wsdlLocation, serviceName);
  }

  public DataRequestService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
    super(wsdlLocation, serviceName, features);
  }

  /**
   *
   * @return
   *     returns DataRequest
   */
  @WebEndpoint(name = "DataRequest")
  public DataRequest getDataRequest() {
    return super.getPort(new QName("http://veiligheidintelligence.nl:5080/city-alerts/DataRequest/", "DataRequest"), DataRequest.class);
  }

  /**
   *
   * @param features
   *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
   * @return
   *     returns DataRequest
   */
  @WebEndpoint(name = "DataRequest")
  public DataRequest getDataRequest(WebServiceFeature... features) {
    return super.getPort(new QName("http://veiligheidintelligence.nl:5080/city-alerts/DataRequest/", "DataRequest"), DataRequest.class, features);
  }

  private static URL __getWsdlLocation() {
    if (DATAREQUEST_EXCEPTION!= null) {
      throw DATAREQUEST_EXCEPTION;
    }
    return DATAREQUEST_WSDL_LOCATION;
  }
}
