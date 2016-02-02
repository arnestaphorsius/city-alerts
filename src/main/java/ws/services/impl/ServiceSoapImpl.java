package main.java.ws.services.impl;

import main.java.ws.models.IncomingDoc;
import main.java.ws.models.ResultDoc;
import main.java.ws.services.ServiceSoap;

import javax.jws.WebService;

/**
 * @author Arne Staphorsius.
 * @since 27-1-2016.
 */
@WebService(endpointInterface = "main.java.ws.services.ServiceSoap",
            targetNamespace = "http://localhost:8088/ServiceSoap/",
            portName = "ServiceSoap",
            serviceName = "BerichtMelding")
public class ServiceSoapImpl implements ServiceSoap {

  public ServiceSoapImpl() {}

  @Override
  public ResultDoc berichtMelding(IncomingDoc melding) {
    ResultDoc resultDoc = new ResultDoc();
    resultDoc.setKleurcode("Rood");
    return resultDoc;
  }

  @Override
  public ResultDoc cityAlertDataRequest(IncomingDoc request) {
    ResultDoc resultDoc = new ResultDoc();
    resultDoc.setKleurcode("Wit");
    return resultDoc;
  }
}
