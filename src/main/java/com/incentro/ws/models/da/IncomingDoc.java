package main.java.com.incentro.ws.models.da;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import main.java.com.incentro.ws.models.baa.IncomingDoc.Locatie;

/**
 * @author Arne Staphorsius.
 * @since 11-2-2016.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncomingDocDA", propOrder = {
    "incidentid",
    "prioriteitincident",
    "dtgstartincident",
    "locatie",
    "indicator"
})
public class IncomingDoc {

  @XmlElement(name = "INCIDENT_ID", required = true)
  protected String incidentid;
  @XmlElement(name = "PRIORITEIT_INCIDENT", required = true)
  protected String prioriteitincident;
  @XmlElement(name = "DTG_START_INCIDENT", required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar dtgstartincident;
  @XmlElement(name = "Locatie", required = true)
  protected Locatie locatie;
  @XmlElement(name = "Indicator", required = true)
  protected IncomingDoc.Indicator indicator;

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
   * {@link Locatie }
   */
  public Locatie getLocatie() {
    return locatie;
  }

  /**
   * Sets the value of the locatie property.
   *
   * @param value allowed object is
   *              {@link Locatie }
   */
  public void setLocatie(Locatie value) {
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
      "indicator",
      "label",
      "waarschuwingsniveau",
      "aanvullendeinfo"
  })
  public static class Indicator {

    @XmlElement(name = "Indicator", required = true)
    protected String indicator;
    @XmlElement(name = "Label", required = true)
    protected String label;
    @XmlElement(name = "Waarschuwingsniveau", required = true)
    protected BigInteger waarschuwingsniveau;
    @XmlElement(name = "AanvullendeInformatie", required = true)
    protected String aanvullendeinfo;

    public String getIndicator() {
      return indicator;
    }

    public void setIndicator(String indicator) {
      this.indicator = indicator;
    }

    public String getLabel() {
      return label;
    }

    public void setLabel(String label) {
      this.label = label;
    }

    public BigInteger getWaarschuwingsniveau() {
      return waarschuwingsniveau;
    }

    public void setWaarschuwingsniveau(BigInteger waarschuwingsniveau) {
      this.waarschuwingsniveau = waarschuwingsniveau;
    }

    public String getAanvullendeinfo() {
      return aanvullendeinfo;
    }

    public void setAanvullendeinfo(String aanvullendeinfo) {
      this.aanvullendeinfo = aanvullendeinfo;
    }
  }
}
