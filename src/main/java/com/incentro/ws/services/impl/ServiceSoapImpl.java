package main.java.com.incentro.ws.services.impl;

import main.java.com.incentro.ws.models.bd.IncomingDoc;
import main.java.com.incentro.ws.models.bd.ResultDoc;
import main.java.com.incentro.ws.services.ServiceSoap;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * @author Arne Staphorsius.
 * @since 29-3-2016.
 */
@WebService(endpointInterface = "main.java.com.incentro.ws.services.ServiceSoap",
            targetNamespace = "https://145.128.20.36/wsx/services/DataResponse_CityAlerts_WSProvider_Berichtendienst_Antwoord/",
            portName = "ServiceSoap",
            serviceName = "DataResponse_CityAlerts_WSProvider_Berichtendienst_Antwoord")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class ServiceSoapImpl implements ServiceSoap {

  @Override
  public ResultDoc berichtenDienstAntwoord(IncomingDoc vraag) {

    return null;
  }
}
