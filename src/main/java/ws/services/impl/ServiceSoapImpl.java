package main.java.ws.services.impl;

import main.java.ws.models.mk.IncomingDoc;
import main.java.ws.models.mk.ResultDoc;
import main.java.ws.services.ServiceSoap;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * @author Arne Staphorsius.
 * @since 27-1-2016.
 */
@WebService(endpointInterface = "main.java.ws.services.ServiceSoap",
            targetNamespace = "http://localhost:8088/ServiceSoap/",
            portName = "ServiceSoap",
            serviceName = "CityAlerts")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class ServiceSoapImpl implements ServiceSoap {

  public ServiceSoapImpl() {}

  @Override
  public ResultDoc berichtMelding(IncomingDoc melding) {
    ResultDoc resultDoc = new ResultDoc();
    resultDoc.setKleurcode("Rood");
    return resultDoc;
  }

  @Override
  public ResultDoc cityAlertDataRequest(main.java.ws.models.baa.IncomingDoc request) {
    ResultDoc resultDoc = new ResultDoc();
    resultDoc.setKleurcode("Wit");
    return resultDoc;
  }
}
