package main.java.com.incentro.ws.services.impl;

import main.java.com.incentro.core.controllers.Brandweer;
import main.java.com.incentro.core.util.App;
import main.java.com.incentro.ws.models.da.IncomingDoc;
import main.java.com.incentro.ws.models.da.ResultDoc;
import main.java.com.incentro.ws.services.DataResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * @author Arne Staphorsius.
 * @since 12-2-2016.
 */
@WebService(endpointInterface = "main.java.com.incentro.ws.services.DataResponse",
            targetNamespace = "http://veiligheidintelligence.nl:5080/city-alerts/DataResponse/",
            portName = "DataResponse",
            serviceName = "DoorsturenAntwoord")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class DataResponseImpl implements DataResponse {

  private static Logger log = LogManager.getLogger(DataResponseImpl.class);

  public DataResponseImpl() {
    App.init();
  }

  @Override
  public ResultDoc cityAlertDataResponse(IncomingDoc vraag) {

    ResultDoc resultDoc = ResultDoc.apply(vraag);

    String bagID = null;

    try {
      bagID = vraag.getLocatie().getBag().getBagid();
    } catch (NullPointerException npe) {
      log.warn("BagID could not be retrieved from the request.");
    }

    String kleurCode = Brandweer.getKleurcode(bagID);
    resultDoc.setResultaatcode(kleurCode != null ? kleurCode : "wit");

    return resultDoc;
  }
}
