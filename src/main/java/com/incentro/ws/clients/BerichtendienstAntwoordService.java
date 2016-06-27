package main.java.com.incentro.ws.clients;

import main.java.com.incentro.ws.services.ServiceSoap;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Arne Staphorsius.
 * @since 29-3-2016.
 */
@WebServiceClient(name = "DataResponse_CityAlerts_WSProvider_Berichtendienst_Antwoord_CityAlerts_WSProvider_Berichtendienst_Antwoord", targetNamespace = "TNS", wsdlLocation = "https://145.128.20.36:8443/wsx/services/DataResponse_CityAlerts_WSProvider_Berichtendienst_Antwoord_CityAlerts_WSProvider_Berichtendienst_Antwoord?wsdl")
public class BerichtendienstAntwoordService extends Service {

  private final static URL BERICHTENDIENST_WSDL_LOCATION;
  private final static WebServiceException BERICHTENDIENST_EXCEPTION;
  private final static QName BERICHTENDIENST_QNAME = new QName("TNS", "DataResponse_CityAlerts_WSProvider_Berichtendienst_Antwoord_CityAlerts_WSProvider_Berichtendienst_Antwoord");

  static {
    URL url = null;
    WebServiceException e = null;
    try {
      url = new URL("https://145.128.20.36:8443/wsx/services/DataResponse_CityAlerts_WSProvider_Berichtendienst_Antwoord_CityAlerts_WSProvider_Berichtendienst_Antwoord?wsdl");
    } catch (MalformedURLException ex) {
      e = new WebServiceException(ex);
    }
    BERICHTENDIENST_WSDL_LOCATION = url;
    BERICHTENDIENST_EXCEPTION = e;
  }

  public BerichtendienstAntwoordService() {
    super(__getWsdlLocation(), BERICHTENDIENST_QNAME);
  }

  public BerichtendienstAntwoordService(WebServiceFeature... features) {
    super(__getWsdlLocation(), BERICHTENDIENST_QNAME, features);
  }

  public BerichtendienstAntwoordService(URL wsdlLocation) {
    super(wsdlLocation, BERICHTENDIENST_QNAME);
  }

  public BerichtendienstAntwoordService(URL wsdlLocation, WebServiceFeature... features) {
    super(wsdlLocation, BERICHTENDIENST_QNAME, features);
  }

  public BerichtendienstAntwoordService(URL wsdlLocation, QName serviceName) {
    super(wsdlLocation, serviceName);
  }

  public BerichtendienstAntwoordService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
    super(wsdlLocation, serviceName, features);
  }

  /**
   *
   * @return ServiceSoap
   */
  @WebEndpoint(name = "ServiceSoap")
  public ServiceSoap getServiceSoap() {
    return super.getPort(new QName("TNS", "ServiceSoap"), ServiceSoap.class);
  }

  /**
   *
   * @param features A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.
   *                 Supported features not in the <code>features</code> parameter will have their default values.
   * @return ServiceSoap
   */
  @WebEndpoint(name = "ServiceSoap")
  public ServiceSoap getServiceSoap(WebServiceFeature... features) {
    return super.getPort(new QName("TNS", "ServiceSoap"), ServiceSoap.class, features);
  }

  private static URL __getWsdlLocation() {
    if (BERICHTENDIENST_EXCEPTION != null) {
      throw BERICHTENDIENST_EXCEPTION;
    }
    return BERICHTENDIENST_WSDL_LOCATION;
  }
}
