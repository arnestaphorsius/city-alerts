package main.java.com.incentro.core.services;

import main.java.com.incentro.ws.models.ds.IncomingDoc;

import java.sql.Connection;

/**
 * @author Arne Staphorsius.
 * @since 16-2-2016.
 */
public interface BrandweerService {

  String getIndicatoren(Connection conn, String bagID);

  void insertStatusResponse(Connection conn, IncomingDoc inc);
}
