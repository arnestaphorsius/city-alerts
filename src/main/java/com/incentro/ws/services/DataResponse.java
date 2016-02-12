package main.java.com.incentro.ws.services;

import main.java.com.incentro.ws.models.da.IncomingDoc;
import main.java.com.incentro.ws.models.da.ResultDoc;

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
@WebService(name = "DataResponse", targetNamespace = "http://localhost:8088/DataResponse/")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface DataResponse {

  /**
   * @param vraag models.da.IncomingDoc
   * @return models.da.ResultDoc
   */
  @WebMethod(action = "http://localhost:8088/DataResponse/CityAlertDataResponse", operationName = "CityAlertDataResponse")
  @WebResult(name = "Antwoord", targetNamespace = "http://localhost:8088/DataResponse/")
  @RequestWrapper(localName = "BerichtVraag", targetNamespace = "http://localhost:8088/DataResponse/", className = "models.da.BerichtVraag", partName = "parameter")
  @ResponseWrapper(localName = "BerichtAntwoord", targetNamespace = "http://localhost:8088/DataResponse/", className = "models.da.BerichtAntwoord", partName = "parameter")
  ResultDoc cityAlertDataResponse(
      @WebParam(name = "Vraag", targetNamespace = "http://localhost:8088/DataResponse/")
      IncomingDoc vraag);

}

