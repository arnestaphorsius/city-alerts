package main.java.com.incentro.ws.models.dr;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for IncomingDoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncomingDoc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INCIDENT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PRIORITEIT_INCIDENT_BRANDWEER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DTG_START_INCIDENT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Locatie">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="STRAATNAAM_NEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="POSTCODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="HUIS_PAAL_NR" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="HUIS_NR_TOEV" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OBJECT_HUISNUMMERTOEVOEGING" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="T_X_COORD" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="T_Y_COORD" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Indicator_Risico_object">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Gevraagd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="ToegestaneKleurcode_Wit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="ToegestaneKleurcode_Blauw" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="ToegestaneKleurcode_Oranje" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="ToegestaneKleurcode_Rood" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Indicator_Milieuvergunning">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Gevraagd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="ToegestaneKleurcode_Wit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="ToegestaneKleurcode_Blauw" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="ToegestaneKleurcode_Oranje" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="ToegestaneKleurcode_Rood" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
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

    /**
     * Gets the value of the incidentid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINCIDENTID() {
        return incidentid;
    }

    /**
     * Sets the value of the incidentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINCIDENTID(String value) {
        this.incidentid = value;
    }

    /**
     * Gets the value of the prioriteitincident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRIORITEITINCIDENT() {
        return prioriteitincident;
    }

    /**
     * Sets the value of the prioriteitincident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRIORITEITINCIDENT(String value) {
        this.prioriteitincident = value;
    }

    /**
     * Gets the value of the dtgstartincident property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTGSTARTINCIDENT() {
        return dtgstartincident;
    }

    /**
     * Sets the value of the dtgstartincident property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTGSTARTINCIDENT(XMLGregorianCalendar value) {
        this.dtgstartincident = value;
    }

    /**
     * Gets the value of the locatie property.
     * 
     * @return
     *     possible object is
     *     {@link IncomingDoc.Locatie }
     *     
     */
    public IncomingDoc.Locatie getLocatie() {
        return locatie;
    }

    /**
     * Sets the value of the locatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomingDoc.Locatie }
     *     
     */
    public void setLocatie(IncomingDoc.Locatie value) {
        this.locatie = value;
    }

    /**
     * Gets the value of the indicatorRisicoObject property.
     * 
     * @return
     *     possible object is
     *     {@link IncomingDoc.Indicator }
     *     
     */
    public IncomingDoc.Indicator getIndicator() {
        return indicator;
    }

    /**
     * Sets the value of the indicatorRisicoObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomingDoc.Indicator }
     *     
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

        public static Locatie apply(Locatie locatie) {

            Locatie result = new Locatie();

            if (locatie != null) {
                if (locatie.adres != null) {
                    result.adres = new Adres();
                    result.adres.setHuisnrtoev(locatie.adres.getHuisnrtoev());
                    result.adres.setHuispaalnr(locatie.adres.getHuispaalnr());
                    result.adres.setObjecthuisnummertoevoeging(locatie.adres.getObjecthuisnummertoevoeging());
                    result.adres.setPostcode(locatie.adres.getPostcode());
                    result.adres.setStraatnaamnen(locatie.adres.getStraatnaamnen());
                }
                if (locatie.geolocatie != null) {
                    result.geolocatie = new Geolocatie();
                    result.geolocatie.setTxcoord(locatie.geolocatie.getTxcoord());
                    result.geolocatie.setTycoord(locatie.geolocatie.getTycoord());
                }
            }
            return result;
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
            protected BigDecimal bagid;
            @XmlElement(name = "BAG_versie", required = true)
            protected BigDecimal bagversie;

            public BigDecimal getBagid() {
                return bagid;
            }

            public void setBagid(BigDecimal bagid) {
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
        "maximaaltoegestaanwaarschuwingsniveau"
    })
    public static class Indicator {

        @XmlElement(name = "GevraagdeIndicator", required = true)
        protected String gevraagdeindicator;
        @XmlElement(name = "MaximaalToegestaanWaarschuwingsniveau", required = true)
        protected BigInteger maximaaltoegestaanwaarschuwingsniveau;

        public String getGevraagdeindicator() {
            return gevraagdeindicator;
        }

        public void setGevraagdeindicator(String gevraagdeindicator) {
            this.gevraagdeindicator = gevraagdeindicator;
        }

        public BigInteger getMaximaaltoegestaanwaarschuwingsniveau() {
            return maximaaltoegestaanwaarschuwingsniveau;
        }

        public void setMaximaaltoegestaanwaarschuwingsniveau(BigInteger maximaaltoegestaanwaarschuwingsniveau) {
            this.maximaaltoegestaanwaarschuwingsniveau = maximaaltoegestaanwaarschuwingsniveau;
        }
    }
}
