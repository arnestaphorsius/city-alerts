package main.java.com.incentro.ws.services.impl;

import main.java.com.incentro.ws.models.da.IncomingDoc;
import main.java.com.incentro.ws.models.da.ResultDoc;
import main.java.com.incentro.ws.services.DataResponse;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * @author Arne Staphorsius.
 * @since 12-2-2016.
 */
@WebService(endpointInterface = "main.java.com.incentro.ws.services.DataResponse",
            targetNamespace = "http://localhost:8088/DataResponse/",
            portName = "DataResponse",
            serviceName = "CityAlerts")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class DataResponseImpl implements DataResponse {

  @Override
  public ResultDoc cityAlertDataResponse(IncomingDoc vraag) {

    return ResultDoc.apply(vraag);
  }
}
