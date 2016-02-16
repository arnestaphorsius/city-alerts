package main.java.com.incentro.ws.services.impl;

import main.java.com.incentro.core.util.App;
import main.java.com.incentro.ws.clients.DoorsturenAntwoordService;
import main.java.com.incentro.ws.models.dr.IncomingDoc;
import main.java.com.incentro.ws.models.dr.ResultDoc;
import main.java.com.incentro.ws.services.DataRequest;
import main.java.com.incentro.ws.services.DataResponse;

import javax.annotation.PostConstruct;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.concurrent.Executors;

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
  public ResultDoc cityAlertDataRequest(final IncomingDoc vraag) {

    Executors.newSingleThreadExecutor().execute(new Runnable() {

      @Override
      public void run() {
        DoorsturenAntwoordService service = new DoorsturenAntwoordService();
        DataResponse port = service.getDataResponse();

        main.java.com.incentro.ws.models.da.IncomingDoc in = new main.java.com.incentro.ws.models.da.IncomingDoc();
        in.setINCIDENTID(vraag.getINCIDENTID());
        in.setDTGSTARTINCIDENT(vraag.getDTGSTARTINCIDENT());
        in.setPRIORITEITINCIDENT(vraag.getPRIORITEITINCIDENT());

        main.java.com.incentro.ws.models.da.ResultDoc antwoord = port.cityAlertDataResponse(in);
      }
    });

    return ResultDoc.apply(vraag);
  }
}
