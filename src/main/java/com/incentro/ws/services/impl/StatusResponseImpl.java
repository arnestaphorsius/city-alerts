package main.java.com.incentro.ws.services.impl;

import main.java.com.incentro.core.controllers.Brandweer;
import main.java.com.incentro.core.util.App;
import main.java.com.incentro.core.util.Util;
import main.java.com.incentro.ws.models.ds.IncomingDoc;
import main.java.com.incentro.ws.models.ds.ResultDoc;
import main.java.com.incentro.ws.services.StatusResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.WebServiceContext;

/**
 * @author Arne Staphorsius.
 * @since 12-2-2016.
 */
@WebService(endpointInterface = "main.java.com.incentro.ws.services.StatusResponse",
            targetNamespace = "http://veiligheidintelligence.nl:5080/city-alerts/StatusResponse/",
            portName = "StatusResponse",
            serviceName = "DoorsturenStatus")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class StatusResponseImpl implements StatusResponse {

  private static Logger log = LogManager.getLogger(StatusResponseImpl.class);

  @Resource
  WebServiceContext wsContext;

  @PostConstruct
  private void init() {
    App.init();
  }

  @Override
  public ResultDoc cityAlertStatusResponse(IncomingDoc vraag) {

    final String remoteAddress = Util.getRemoteAddress(wsContext);

    log.trace("Received StatusResponse request from " + remoteAddress);

    Brandweer.insertStatusResponse(vraag);

    return ResultDoc.apply(vraag);
  }
}
