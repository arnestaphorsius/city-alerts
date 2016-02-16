package main.java.com.incentro.ws.services.impl;

import main.java.com.incentro.core.util.App;
import main.java.com.incentro.ws.models.bm.IncomingDoc;
import main.java.com.incentro.ws.models.bm.ResultDoc;
import main.java.com.incentro.ws.services.ServiceSoap;

import javax.annotation.PostConstruct;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * @author Arne Staphorsius.
 * @since 27-1-2016.
 */
@WebService(endpointInterface = "main.java.com.incentro.ws.services.ServiceSoap",
            targetNamespace = "http://localhost:8088/ServiceSoap/",
            portName = "ServiceSoap",
            serviceName = "BerichtMelding")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class ServiceSoapImpl implements ServiceSoap {

  @PostConstruct
  private void init() {
    App.init();
  }

  @Override
  public ResultDoc berichtMelding(IncomingDoc melding) {

    return ResultDoc.apply(melding);
  }

}
