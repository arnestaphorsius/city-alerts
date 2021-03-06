package main.java.com.incentro.ws.models.ds;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * @author Arne Staphorsius.
 * @since 12-2-2016.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultDoc", propOrder = {
    "incidentid",
    "prioriteitincident",
    "dtgstartincident",
    "locatie",
    "indicator"
})
public class ResultDoc {

  @XmlElement(name = "INCIDENT_ID", required = true)
  protected String incidentid;
  @XmlElement(name = "PRIORITEIT_INCIDENT", required = true)
  protected String prioriteitincident;
  @XmlElement(name = "DTG_START_INCIDENT", required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar dtgstartincident;
  @XmlElement(name = "Locatie", required = true)
  protected IncomingDoc.Locatie locatie;
  @XmlElement(name = "Indicator", required = true)
  protected IncomingDoc.Indicator indicator;


  public static ResultDoc apply(IncomingDoc incomingDoc) {
    ResultDoc result = new ResultDoc();

    if (incomingDoc == null) return result;

    result.setINCIDENTID(incomingDoc.getINCIDENTID());
    result.setPRIORITEITINCIDENT(incomingDoc.getPRIORITEITINCIDENT());
    result.setDTGSTARTINCIDENT(incomingDoc.getDTGSTARTINCIDENT());
    result.setLocatie(incomingDoc.getLocatie());

    return result;
  }

  /**
   * Gets the value of the incidentid property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getINCIDENTID() {
    return incidentid;
  }

  /**
   * Sets the value of the incidentid property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setINCIDENTID(String value) {
    this.incidentid = value;
  }

  /**
   * Gets the value of the prioriteitincident property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getPRIORITEITINCIDENT() {
    return prioriteitincident;
  }

  /**
   * Sets the value of the prioriteitincident property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setPRIORITEITINCIDENT(String value) {
    this.prioriteitincident = value;
  }

  /**
   * Gets the value of the dtgstartincident property.
   *
   * @return possible object is
   * {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getDTGSTARTINCIDENT() {
    return dtgstartincident;
  }

  /**
   * Sets the value of the dtgstartincident property.
   *
   * @param value allowed object is
   *              {@link XMLGregorianCalendar }
   */
  public void setDTGSTARTINCIDENT(XMLGregorianCalendar value) {
    this.dtgstartincident = value;
  }

  /**
   * Gets the value of the locatie property.
   *
   * @return possible object is
   * {@link IncomingDoc.Locatie }
   */
  public IncomingDoc.Locatie getLocatie() {
    return locatie;
  }

  /**
   * Sets the value of the locatie property.
   *
   * @param value allowed object is
   *              {@link IncomingDoc.Locatie }
   */
  public void setLocatie(IncomingDoc.Locatie value) {
    this.locatie = value;
  }

  /**
   * Gets the value of the indicatorRisicoObject property.
   *
   * @return possible object is
   * {@link IncomingDoc.Indicator }
   */
  public IncomingDoc.Indicator getIndicator() {
    return indicator;
  }

  /**
   * Sets the value of the indicatorRisicoObject property.
   *
   * @param value allowed object is
   *              {@link IncomingDoc.Indicator }
   */
  public void setIndicator(IncomingDoc.Indicator value) {
    this.indicator = value;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name="", propOrder = {
      "gevraagdeindicator",
      "status"
  })
  public static class Indicator {

    @XmlElement(name = "GevraagdeIndicator", required = true)
    protected String gevraagdeindicator;
    @XmlElement(name = "Status", required = true)
    protected String status;

    public String getGevraagdeindicator() {
      return gevraagdeindicator;
    }

    public void setGevraagdeindicator(String gevraagdeindicator) {
      this.gevraagdeindicator= gevraagdeindicator;
    }

    public String getStatus() {
      return status;
    }

    public void setStatus(String status) {
      this.status = status;
    }
  }
}
