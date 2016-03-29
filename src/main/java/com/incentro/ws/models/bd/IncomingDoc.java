package main.java.com.incentro.ws.models.bd;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author Arne Staphorsius.
 * @since 29-3-2016.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncomingDoc", propOrder = {
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
  protected IncomingDoc.Locatie locatie;
  @XmlElement(name = "Indicator", required = true)
  protected IncomingDoc.Indicator indicator;

  public String getIncidentid() {
    return incidentid;
  }

  public void setIncidentid(String incidentid) {
    this.incidentid = incidentid;
  }

  public String getPrioriteitincident() {
    return prioriteitincident;
  }

  public void setPrioriteitincident(String prioriteitincident) {
    this.prioriteitincident = prioriteitincident;
  }

  public XMLGregorianCalendar getDtgstartincident() {
    return dtgstartincident;
  }

  public void setDtgstartincident(XMLGregorianCalendar dtgstartincident) {
    this.dtgstartincident = dtgstartincident;
  }

  public Locatie getLocatie() {
    return locatie;
  }

  public void setLocatie(Locatie locatie) {
    this.locatie = locatie;
  }

  public IncomingDoc.Indicator getIndicator() {
    return indicator;
  }

  public void setIndicator(IncomingDoc.Indicator indicator) {
    this.indicator = indicator;
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

    public static Locatie apply(main.java.com.incentro.ws.models.dr.IncomingDoc.Locatie input) {
      Locatie output = new Locatie();

      if (input != null) {
        if (input.getAdres() != null) {
          output.adres = new Adres();
          output.adres.setHuisnrtoev(input.getAdres().getHuisnrtoev());
          output.adres.setHuispaalnr(input.getAdres().getHuispaalnr());
          output.adres.setObjecthuisnummertoevoeging(input.getAdres().getObjecthuisnummertoevoeging());
          output.adres.setPostcode(input.getAdres().getPostcode());
          output.adres.setStraatnaamnen(input.getAdres().getStraatnaamnen());
        }
        if (input.getGeolocatie() != null) {
          output.geolocatie = new Geolocatie();
          output.geolocatie.setTxcoord(input.getGeolocatie().getTxcoord());
          output.geolocatie.setTycoord(input.getGeolocatie().getTycoord());
        }
        if (input.getBag() != null) {
          output.bag = new BAG();
          output.bag.setBagid(input.getBag().getBagid());
          output.bag.setBagversie(input.getBag().getBagversie());
        }
      }

      return output;
    }

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

    public static Indicator apply(String kleurcode) {
      Indicator result = new Indicator();
      result.setIndicator(kleurcode != null ? kleurcode : "wit");
      result.setLabel(kleurcode != null ? kleurcode : "wit");

      return result;
    }

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
