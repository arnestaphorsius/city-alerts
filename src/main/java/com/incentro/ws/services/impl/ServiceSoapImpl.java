package main.java.com.incentro.ws.services.impl;

import main.java.com.incentro.ws.models.baa.IncomingDoc;
import main.java.com.incentro.ws.models.baa.ResultDoc;
import main.java.com.incentro.ws.services.ServiceSoap;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * @author Arne Staphorsius.
 * @since 27-1-2016.
 */
@WebService(endpointInterface = "main.java.com.incentro.ws.services.ServiceSoap",
            targetNamespace = "http://localhost:8088/ServiceSoap/",
            portName = "ServiceSoap",
            serviceName = "CityAlerts")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class ServiceSoapImpl implements ServiceSoap {

  public ServiceSoapImpl() {}

  @Override
  public main.java.com.incentro.ws.models.mk.ResultDoc berichtMelding(main.java.com.incentro.ws.models.mk.IncomingDoc melding) {
    main.java.com.incentro.ws.models.mk.ResultDoc resultDoc = new main.java.com.incentro.ws.models.mk.ResultDoc();
    resultDoc.setKleurcode("Rood");
    return resultDoc;
  }

  @Override
  public ResultDoc cityAlertDataRequest(IncomingDoc request) {

    return ResultDoc.apply(request);
  }
}
