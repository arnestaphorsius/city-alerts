package main.java.com.incentro.ws.services.impl;

import main.java.com.incentro.ws.models.ds.IncomingDoc;
import main.java.com.incentro.ws.models.ds.ResultDoc;
import main.java.com.incentro.ws.services.StatusResponse;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * @author Arne Staphorsius.
 * @since 12-2-2016.
 */
@WebService(endpointInterface = "main.java.com.incentro.ws.services.StatusResponse",
            targetNamespace = "http://localhost:8088/StatusResponse/",
            portName = "StatusResponse",
            serviceName = "CityAlerts")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class StatusResponseImpl implements StatusResponse {

  @Override
  public ResultDoc cityAlertStatusResponse(IncomingDoc vraag) {

    return ResultDoc.apply(vraag);
  }
}
