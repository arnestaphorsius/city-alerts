package main.java.com.incentro.core.services;

import main.java.com.incentro.ws.models.dr.IncomingDoc;

import java.sql.Connection;

/**
 * @author Arne Staphorsius.
 * @since 16-2-2016.
 */
public interface BrandweerService {

  main.java.com.incentro.ws.models.bd.IncomingDoc.Indicator getIndicatoren(Connection conn, String bagID, IncomingDoc.Indicator indicator);

  void insertStatusResponse(Connection conn,  main.java.com.incentro.ws.models.bd.IncomingDoc inc);

  void cleanUpStatusResponse(Connection conn, IncomingDoc incomingDoc);
}
