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
  public main.java.com.incentro.ws.models.bm.ResultDoc berichtMelding(main.java.com.incentro.ws.models.bm.IncomingDoc melding) {

    return main.java.com.incentro.ws.models.bm.ResultDoc.apply(melding);
  }

  @Override
  public ResultDoc cityAlertDataRequest(IncomingDoc request) {

    return ResultDoc.apply(request);
  }

  @Override
  public main.java.com.incentro.ws.models.da.ResultDoc cityAlertDataResponse(main.java.com.incentro.ws.models.da.IncomingDoc melding) {

    return main.java.com.incentro.ws.models.da.ResultDoc.apply(melding);
  }
}
