package main.java.com.incentro.ws.controllers;

import main.java.com.incentro.core.controllers.Brandweer;
import main.java.com.incentro.ws.clients.BerichtendienstAntwoordService;
import main.java.com.incentro.ws.models.bd.IncomingDoc;
import main.java.com.incentro.ws.services.ServiceSoap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Arne Staphorsius.
 * @since 17-2-2016.
 */
public class DoorsturenAntwoord {

  private static Logger log = LogManager.getLogger(DoorsturenAntwoord.class);
  private static BerichtendienstAntwoordService BERICHTENDIENST_SERVICE = new BerichtendienstAntwoordService();

  /**
   * Create a Runnable that will send a CityAlertDataResponse.
   *
   * @param vraag {@link IncomingDoc}
   * @return a Runnable to be executed concurrently.
   */
  public static Runnable sendFromDataRequest(final main.java.com.incentro.ws.models.dr.IncomingDoc vraag) {

    return new Runnable() {

      @Override
      public void run() {
        ServiceSoap port = BERICHTENDIENST_SERVICE.getServiceSoap();

        IncomingDoc in = new IncomingDoc();

        if (vraag != null) {

          String bagID = null;

          try {
            bagID = vraag.getLocatie().getBag().getBagid();
          } catch (NullPointerException npe) {
            log.warn("BagID could not be retrieved from the request.");
          }

          IncomingDoc.Indicator kleurIndicator = Brandweer.getKleurIndicator(bagID, vraag.getIndicator());
          in.setIndicator(kleurIndicator);

          in.setIncidentid(vraag.getINCIDENTID());
          in.setDtgstartincident(vraag.getDTGSTARTINCIDENT());
          in.setPrioriteitincident(vraag.getPRIORITEITINCIDENT());
          in.setLocatie(IncomingDoc.Locatie.apply(vraag.getLocatie()));
        }

        if (vraag != null && vraag.getDTGSLUITINCIDENT() != null) {
          Brandweer.cleanUpStatusResponse(vraag);
        } else {
          Brandweer.insertStatusResponse(in);
        }

        log.trace("Sending CityAlert DataResponse.");

        port.cityAlertDataResponse(in);
      }
    };
  }
}
