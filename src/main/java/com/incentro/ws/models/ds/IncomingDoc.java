package main.java.com.incentro.ws.models.ds;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author Arne Staphorsius.
 * @since 12-2-2016.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncomingDoc", propOrder = {
    "incidentid",
    "prioriteitincident",
    "dtgstartincident",
    "dtgsluitincident",
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
  @XmlElement(name = "DTG_SLUIT_INCIDENT", required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar dtgsluitincident;
  @XmlElement(name = "Locatie", required = true)
  protected IncomingDoc.Locatie locatie;
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

  public XMLGregorianCalendar getDTGSLUITINCIDENT() {
    return dtgsluitincident;
  }

  public void setDTGSLUITINCIDENT(XMLGregorianCalendar dtgsluitincident) {
    this.dtgsluitincident = dtgsluitincident;
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
  @XmlType(name = "Locatie", propOrder = {
      "adres",
      "geolocatie",
      "bag"
  })
  public static class Locatie {

    @XmlElement(name = "Adres", required = true)
    protected Locatie.Adres adres;
    @XmlElement(name = "Geolocatie", required = true)
    protected Locatie.Geolocatie geolocatie;
    @XmlElement(name = "BAG", required = true)
    protected Locatie.BAG bag;

    public Locatie() { }

    public Adres getAdres() {
      return adres;
    }

    public void setAdres(Adres adres) {
      this.adres = adres;
    }

    public Geolocatie getGeolocatie() {
      return geolocatie;
    }

    public void setGeolocatie(Geolocatie geolocatie) {
      this.geolocatie = geolocatie;
    }

    public BAG getBag() {
      return bag;
    }

    public void setBag(BAG bag) {
      this.bag = bag;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "straatnaamnen",
        "postcode",
        "huispaalnr",
        "huisnrtoev",
        "objecthuisnummertoevoeging"
    })
    public static class Adres {

      @XmlElement(name = "STRAATNAAM_NEN", required = true)
      protected String straatnaamnen;
      @XmlElement(name = "POSTCODE", required = true)
      protected String postcode;
      @XmlElement(name = "HUIS_PAAL_NR", required = true)
      protected BigInteger huispaalnr;
      @XmlElement(name = "HUIS_NR_TOEV", required = true)
      protected String huisnrtoev;
      @XmlElement(name = "OBJECT_HUISNUMMERTOEVOEGING", required = true)
      protected String objecthuisnummertoevoeging;

      public String getStraatnaamnen() {
        return straatnaamnen;
      }

      public void setStraatnaamnen(String straatnaamnen) {
        this.straatnaamnen = straatnaamnen;
      }

      public String getPostcode() {
        return postcode;
      }

      public void setPostcode(String postcode) {
        this.postcode = postcode;
      }

      public BigInteger getHuispaalnr() {
        return huispaalnr;
      }

      public void setHuispaalnr(BigInteger huispaalnr) {
        this.huispaalnr = huispaalnr;
      }

      public String getHuisnrtoev() {
        return huisnrtoev;
      }

      public void setHuisnrtoev(String huisnrtoev) {
        this.huisnrtoev = huisnrtoev;
      }

      public String getObjecthuisnummertoevoeging() {
        return objecthuisnummertoevoeging;
      }

      public void setObjecthuisnummertoevoeging(String objecthuisnummertoevoeging) {
        this.objecthuisnummertoevoeging = objecthuisnummertoevoeging;
      }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "txcoord",
        "tycoord"
    })
    public static class Geolocatie {

      @XmlElement(name = "T_X_COORD", required = true)
      protected BigDecimal txcoord;
      @XmlElement(name = "T_Y_COORD", required = true)
      protected BigDecimal tycoord;

      public BigDecimal getTxcoord() {
        return txcoord;
      }

      public void setTxcoord(BigDecimal txcoord) {
        this.txcoord = txcoord;
      }

      public BigDecimal getTycoord() {
        return tycoord;
      }

      public void setTycoord(BigDecimal tycoord) {
        this.tycoord = tycoord;
      }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bagid",
        "bagversie"
    })
    public static class BAG {

      @XmlElement(name = "BAG_ID", required = true)
      protected String bagid;
      @XmlElement(name = "BAG_versie", required = true)
      protected BigDecimal bagversie;

      public String getBagid() {
        return bagid;
      }

      public void setBagid(String bagid) {
        this.bagid = bagid;
      }

      public BigDecimal getBagversie() {
        return bagversie;
      }

      public void setBagversie(BigDecimal bagversie) {
        this.bagversie = bagversie;
      }
    }
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
