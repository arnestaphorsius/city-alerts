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
@WebService(name = "ServiceSoap", targetNamespace = "https://145.128.20.36/wsx/services/DataResponse_CityAlerts_WSProvider_Berichtendienst_Antwoord/")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface ServiceSoap {

  /**
   * @param vraag models.da.IncomingDoc
   * @return models.da.ResultDoc
   */
  @WebMethod(action = "https://145.128.20.36/wsx/services/DataResponse_CityAlerts_WSProvider_Berichtendienst_Antwoord/CityAlertDataResponse", operationName = "CityAlertDataResponse")
  @WebResult(name = "Antwoord", targetNamespace = "https://145.128.20.36/wsx/services/DataResponse_CityAlerts_WSProvider_Berichtendienst_Antwoord/")
  @RequestWrapper(localName = "BerichtVraag", targetNamespace = "https://145.128.20.36/wsx/services/DataResponse_CityAlerts_WSProvider_Berichtendienst_Antwoord/", className = "models.bd.BerichtVraag", partName = "parameter")
  @ResponseWrapper(localName = "BerichtAntwoord", targetNamespace = "https://145.128.20.36/wsx/services/DataResponse_CityAlerts_WSProvider_Berichtendienst_Antwoord/", className = "models.bd.BerichtAntwoord", partName = "parameter")
  ResultDoc berichtenDienstAntwoord(
      @WebParam(name = "Vraag", targetNamespace = "https://145.128.20.36/wsx/services/DataResponse_CityAlerts_WSProvider_Berichtendienst_Antwoord/")
      IncomingDoc vraag);

}
