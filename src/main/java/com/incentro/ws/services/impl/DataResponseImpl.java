package main.java.com.incentro.ws.services.impl;

import main.java.com.incentro.core.util.App;
import main.java.com.incentro.core.util.Util;
import main.java.com.incentro.ws.models.da.IncomingDoc;
import main.java.com.incentro.ws.models.da.ResultDoc;
import main.java.com.incentro.ws.services.DataResponse;
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
@WebService(endpointInterface = "main.java.com.incentro.ws.services.DataResponse",
            targetNamespace = "http://172.21.8.11:8080/city-alerts/DataResponse/",
            portName = "DataResponse",
            serviceName = "DoorsturenAntwoord")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class DataResponseImpl implements DataResponse {

  private static Logger log = LogManager.getLogger(DataResponseImpl.class);

  @Resource
  WebServiceContext wsContext;

  @PostConstruct
  private void init() {
    App.init();
  }

  @Override
  public ResultDoc cityAlertDataResponse(IncomingDoc vraag) {

    final String remoteAddress = Util.getRemoteAddress(wsContext);

    log.trace("Received DataResponse request from " + remoteAddress);

    return ResultDoc.apply(vraag);
  }
}
