package main.java.com.incentro.ws.services.impl;

import main.java.com.incentro.core.util.App;
import main.java.com.incentro.ws.models.dr.IncomingDoc;
import main.java.com.incentro.ws.models.dr.ResultDoc;
import main.java.com.incentro.ws.services.DataRequest;

import javax.annotation.PostConstruct;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * @author Arne Staphorsius.
 * @since 15-2-2016.
 */
@WebService(endpointInterface = "main.java.com.incentro.ws.services.DataRequest",
            targetNamespace = "http://localhost:8088/DataRequest/",
            portName = "DataRequest",
            serviceName = "CityAlerts")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class DataRequestImpl implements DataRequest {

  @PostConstruct
  private void init() {
    App.init();
  }

  @Override
  public ResultDoc cityAlertDataRequest(IncomingDoc vraag) {

    return ResultDoc.apply(vraag);
  }
}
