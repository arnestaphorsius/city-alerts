package main.java.com.incentro.ws.services;

import main.java.com.incentro.ws.models.bd.IncomingDoc;
import main.java.com.incentro.ws.models.bd.ResultDoc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * @author Arne Staphorsius.
 * @since 29-3-2016.
 */
@WebService(name = "ServiceSoap", targetNamespace = "TNS")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface ServiceSoap {

  /**
   * @param vraag models.da.IncomingDoc
   * @return models.da.ResultDoc
   */
  @WebMethod(operationName = "CityAlertDataResponse")
  @WebResult(name = "Antwoord", targetNamespace = "TNS")
  @RequestWrapper(localName = "BerichtVraag", targetNamespace = "TNS", className = "models.bd.BerichtVraag", partName = "parameter")
  @ResponseWrapper(localName = "BerichtAntwoord", targetNamespace = "TNS", className = "models.bd.BerichtAntwoord", partName = "parameter")
  ResultDoc cityAlertDataResponse(
      @WebParam(name = "Vraag", targetNamespace = "TNS")
      IncomingDoc vraag);

}
