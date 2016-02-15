package main.java.com.incentro.ws.services;

import main.java.com.incentro.ws.models.dr.IncomingDoc;
import main.java.com.incentro.ws.models.dr.ResultDoc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * @author Arne Staphorsius.
 * @since 15-2-2016.
 */
@WebService(name = "DataRequest", targetNamespace = "http://localhost:8088/DataRequest/")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface DataRequest {

  /**
   * @param vraag models.dr.IncomingDoc
   * @return models.dr.ResultDoc
   */
  @WebMethod(action = "http://localhost:8088/DataRequest/CityAlertDataRequest", operationName = "CityAlertDataRequest")
  @WebResult(name = "Antwoord", targetNamespace = "http://localhost:8088/DataRequest/")
  @RequestWrapper(localName = "BerichtVraag", targetNamespace = "http://localhost:8088/DataRequest/", className = "models.dr.BerichtVraag", partName = "parameter")
  @ResponseWrapper(localName = "BerichtAntwoord", targetNamespace = "http://localhost:8088/DataRequest/", className = "models.dr.BerichtAntwoord", partName = "parameter")
  ResultDoc cityAlertDataRequest(
      @WebParam(name = "Vraag", targetNamespace = "http://localhost:8088/DataRequest/")
      IncomingDoc vraag);
}
