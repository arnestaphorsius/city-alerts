package main.java.com.incentro.ws.controllers;

import main.java.com.incentro.core.controllers.Brandweer;
import main.java.com.incentro.ws.clients.DoorsturenAntwoordService;
import main.java.com.incentro.ws.models.da.IncomingDoc;
import main.java.com.incentro.ws.services.DataResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Arne Staphorsius.
 * @since 17-2-2016.
 */
public class DoorsturenAntwoord {


  private static Logger log = LogManager.getLogger(DoorsturenAntwoord.class);
  private static DoorsturenAntwoordService DOORSTURENANTWOORD_SERVICE = new DoorsturenAntwoordService();

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
        DataResponse port = DOORSTURENANTWOORD_SERVICE.getDataResponse();

        IncomingDoc in = new IncomingDoc();

        if (vraag != null) {

          String bagID = null;

          try {
            bagID = vraag.getLocatie().getBag().getBagid();
          } catch (NullPointerException npe) {
            log.warn("BagID could not be retrieved from the request.");
          }

          String kleurCode = Brandweer.getKleurcode(bagID);
          in.setIndicator(IncomingDoc.Indicator.apply(kleurCode));

          in.setINCIDENTID(vraag.getINCIDENTID());
          in.setDTGSTARTINCIDENT(vraag.getDTGSTARTINCIDENT());
          in.setPRIORITEITINCIDENT(vraag.getPRIORITEITINCIDENT());
          in.setLocatie(IncomingDoc.Locatie.apply(vraag.getLocatie()));
        }

        port.cityAlertDataResponse(in);
      }
    };
  }
}
