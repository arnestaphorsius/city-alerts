package main.java.com.incentro.ws.services.impl;

import main.java.com.incentro.core.util.App;
import main.java.com.incentro.core.util.Concurrency;
import main.java.com.incentro.core.util.Util;
import main.java.com.incentro.ws.controllers.DoorsturenAntwoord;
import main.java.com.incentro.ws.models.dr.IncomingDoc;
import main.java.com.incentro.ws.models.dr.ResultDoc;
import main.java.com.incentro.ws.services.DataRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.WebServiceContext;

/**
 * @author Arne Staphorsius.
 * @since 15-2-2016.
 */
@WebService(endpointInterface = "main.java.com.incentro.ws.services.DataRequest",
            targetNamespace = "http://veiligheidintelligence.nl:5080/city-alerts/DataRequest/",
            portName = "DataRequest",
            serviceName = "DataRequest")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class DataRequestImpl implements DataRequest {

  private static Logger log = LogManager.getLogger(DataRequestImpl.class);

  @Resource
  WebServiceContext wsContext;

  @PostConstruct
  private void init() {
    App.init();
  }

  @Override
  public ResultDoc cityAlertDataRequest(final IncomingDoc vraag) {

    final String remoteAddress = Util.getRemoteAddress(wsContext);

    log.trace("Received DataRequest request from " + remoteAddress);

    Concurrency.run(
        DoorsturenAntwoord.sendFromDataRequest(vraag)
    );

    return ResultDoc.apply(vraag);
  }
}
