package main.java.com.incentro.ws.models.da;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * @author Arne Staphorsius.
 * @since 11-2-2016.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultDocDA", propOrder = {
    "incidentid",
    "dtgstartincident",
    "resultaatcode",
    "indicator",
    "berichtstatus"
})
public class ResultDoc {

  @XmlElement(name = "INCIDENT_ID", required = true)
  protected String incidentid;
  @XmlElement(name = "DTG_START_INCIDENT", required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar dtgstartincident;
  @XmlElement(name = "Resultaatcode", required = true)
  protected String resultaatcode;
  @XmlElement(name = "Indicator", required = true)
  protected String indicator;
  @XmlElement(name = "BerichtStatus", required = true)
  protected String berichtstatus;

  public static ResultDoc apply(IncomingDoc incomingDoc) {
    ResultDoc result = new ResultDoc();

    if (incomingDoc == null) return result;

    result.setIncidentid(incomingDoc.getINCIDENTID());
    result.setDtgstartincident(incomingDoc.getDTGSTARTINCIDENT());

    return result;
  }

  public String getIncidentid() {
    return incidentid;
  }

  public void setIncidentid(String incidentid) {
    this.incidentid = incidentid;
  }

  public XMLGregorianCalendar getDtgstartincident() {
    return dtgstartincident;
  }

  public void setDtgstartincident(XMLGregorianCalendar dtgstartincident) {
    this.dtgstartincident = dtgstartincident;
  }

  public String getResultaatcode() {
    return resultaatcode;
  }

  public void setResultaatcode(String resultaatcode) {
    this.resultaatcode = resultaatcode;
  }

  public String getIndicator() {
    return indicator;
  }

  public void setIndicator(String indicator) {
    this.indicator = indicator;
  }

  public String getBerichtstatus() {
    return berichtstatus;
  }

  public void setBerichtstatus(String berichtstatus) {
    this.berichtstatus = berichtstatus;
  }
}
