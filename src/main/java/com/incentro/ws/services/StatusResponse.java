package main.java.com.incentro.ws.services;

import main.java.com.incentro.ws.models.ds.IncomingDoc;
import main.java.com.incentro.ws.models.ds.ResultDoc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * @author Arne Staphorsius.
 * @since 12-2-2016.
 */
@WebService(name = "StatusResponse", targetNamespace = "http://localhost:8088/StatusResponse/")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface StatusResponse {

  /**
   * @param vraag models.ds.IncomingDoc
   * @return models.ds.ResultDoc
   */
  @WebMethod(action = "http://localhost:8088/StatusResponse/CityAlertStatusResponse", operationName = "CityAlertStatusResponse")
  @WebResult(name = "Antwoord", targetNamespace = "http://localhost:8088/StatusResponse/")
  @RequestWrapper(localName = "BerichtVraag", targetNamespace = "http://localhost:8088/StatusResponse/", className = "models.ds.BerichtVraag", partName = "parameter")
  @ResponseWrapper(localName = "BerichtAntwoord", targetNamespace = "http://localhost:8088/StatusResponse/", className = "models.ds.BerichtAntwoord", partName = "parameter")
  ResultDoc cityAlertStatusResponse(
      @WebParam(name = "Vraag", targetNamespace = "http://localhost:8088/StatusResponse/")
      IncomingDoc vraag);

}
