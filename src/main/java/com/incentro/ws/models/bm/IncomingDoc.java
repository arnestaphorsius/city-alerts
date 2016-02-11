
package main.java.com.incentro.ws.models.bm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;


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
 *         &lt;element name="WAARDE_MELD_CLASS_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WAARDE_MELD_CLASS_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WAARDE_MELD_CLASS_3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PRIORITEIT_INCIDENT_BRANDWEER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DTG_START_INCIDENT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="STRAATNAAM_NEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="POSTCODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HUIS_PAAL_NR" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="HUIS_NR_TOEV" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OBJECT_HUISNUMMERTOEVOEGING" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="T_X_COORD" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="T_Y_COORD" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CODE_VOERTUIGSOORT" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "waardemeldclass1",
    "waardemeldclass2",
    "waardemeldclass3",
    "prioriteitincident",
    "dtgstartincident",
    "locatie",
    "betrokkenhulpdiensten"
})
public class IncomingDoc {

    @XmlElement(name = "INCIDENT_ID", required = true)
    protected String incidentid;
    @XmlElement(name = "WAARDE_MELD_CLASS_1", required = true)
    protected String waardemeldclass1;
    @XmlElement(name = "WAARDE_MELD_CLASS_2", required = true)
    protected String waardemeldclass2;
    @XmlElement(name = "WAARDE_MELD_CLASS_3", required = true)
    protected String waardemeldclass3;
    @XmlElement(name = "PRIORITEIT_INCIDENT", required = true)
    protected String prioriteitincident;
    @XmlElement(name = "DTG_START_INCIDENT", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtgstartincident;
    @XmlElement(name = "Locatie", required = true)
    protected IncomingDoc.Locatie locatie;
    @XmlElement(name = "Betrokken_Hulpdiensten", required = true)
    protected String betrokkenhulpdiensten;

    public IncomingDoc() {}

    public IncomingDoc(String betrokkenhulpdiensten) {
        this.betrokkenhulpdiensten = betrokkenhulpdiensten;
    }
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
     * Gets the value of the waardemeldclass1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAARDEMELDCLASS1() {
        return waardemeldclass1;
    }

    /**
     * Sets the value of the waardemeldclass1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAARDEMELDCLASS1(String value) {
        this.waardemeldclass1 = value;
    }

    /**
     * Gets the value of the waardemeldclass2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAARDEMELDCLASS2() {
        return waardemeldclass2;
    }

    /**
     * Sets the value of the waardemeldclass2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAARDEMELDCLASS2(String value) {
        this.waardemeldclass2 = value;
    }

    /**
     * Gets the value of the waardemeldclass3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAARDEMELDCLASS3() {
        return waardemeldclass3;
    }

    /**
     * Sets the value of the waardemeldclass3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAARDEMELDCLASS3(String value) {
        this.waardemeldclass3 = value;
    }

    /**
     * Gets the value of the prioriteitincidentbrandweer property.
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
     * Sets the value of the prioriteitincidentbrandweer property.
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
     *     {@link Locatie }
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
     *     {@link Locatie }
     *     
     */
    public void setLocatie(IncomingDoc.Locatie value) {
        this.locatie = value;
    }

    /**
     * Gets the value of the betrokkenhulpdiensten property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBetrokkenHulpdiensten() {
        return this.betrokkenhulpdiensten;
    }

    /**
     * Sets the value of the betrokkenhulpdiensten property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBetrokkenhulpdiensten(String value) {
        this.betrokkenhulpdiensten = value;
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
}
