package main.java.com.incentro.ws.services.impl;

import main.java.com.incentro.core.controllers.Brandweer;
import main.java.com.incentro.core.util.App;
import main.java.com.incentro.ws.models.ds.IncomingDoc;
import main.java.com.incentro.ws.models.ds.ResultDoc;
import main.java.com.incentro.ws.services.StatusResponse;

import javax.annotation.PostConstruct;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * @author Arne Staphorsius.
 * @since 12-2-2016.
 */
@WebService(endpointInterface = "main.java.com.incentro.ws.services.StatusResponse",
            targetNamespace = "http://localhost:8088/StatusResponse/",
            portName = "StatusResponse",
            serviceName = "DoorsturenStatus")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class StatusResponseImpl implements StatusResponse {

  @PostConstruct
  private void init() {
    App.init();
  }

  @Override
  public ResultDoc cityAlertStatusResponse(IncomingDoc vraag) {

    Brandweer.insertStatusResponse(vraag);

    return ResultDoc.apply(vraag);
  }
}
