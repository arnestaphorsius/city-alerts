
package main.java.com.incentro.ws.models.baa;

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
@XmlType(name = "IncomingDocBAA", propOrder = {
    "incidentid",
    "prioriteitincidentbrandweer",
    "dtgstartincident",
    "locatie",
    "indicatorRisicoObject",
    "indicatorMilieuvergunning"
})
public class IncomingDoc {

    @XmlElement(name = "INCIDENT_ID", required = true)
    protected String incidentid;
    @XmlElement(name = "PRIORITEIT_INCIDENT_BRANDWEER", required = true)
    protected String prioriteitincidentbrandweer;
    @XmlElement(name = "DTG_START_INCIDENT", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtgstartincident;
    @XmlElement(name = "Locatie", required = true)
    protected IncomingDoc.Locatie locatie;
    @XmlElement(name = "Indicator_Risico_object", required = true)
    protected IncomingDoc.IndicatorRisicoObject indicatorRisicoObject;
    @XmlElement(name = "Indicator_Milieuvergunning", required = true)
    protected IncomingDoc.IndicatorMilieuvergunning indicatorMilieuvergunning;

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
     * Gets the value of the prioriteitincidentbrandweer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRIORITEITINCIDENTBRANDWEER() {
        return prioriteitincidentbrandweer;
    }

    /**
     * Sets the value of the prioriteitincidentbrandweer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRIORITEITINCIDENTBRANDWEER(String value) {
        this.prioriteitincidentbrandweer = value;
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
     *     {@link IncomingDoc.IndicatorRisicoObject }
     *     
     */
    public IncomingDoc.IndicatorRisicoObject getIndicatorRisicoObject() {
        return indicatorRisicoObject;
    }

    /**
     * Sets the value of the indicatorRisicoObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomingDoc.IndicatorRisicoObject }
     *     
     */
    public void setIndicatorRisicoObject(IncomingDoc.IndicatorRisicoObject value) {
        this.indicatorRisicoObject = value;
    }

    /**
     * Gets the value of the indicatorMilieuvergunning property.
     * 
     * @return
     *     possible object is
     *     {@link IncomingDoc.IndicatorMilieuvergunning }
     *     
     */
    public IncomingDoc.IndicatorMilieuvergunning getIndicatorMilieuvergunning() {
        return indicatorMilieuvergunning;
    }

    /**
     * Sets the value of the indicatorMilieuvergunning property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomingDoc.IndicatorMilieuvergunning }
     *     
     */
    public void setIndicatorMilieuvergunning(IncomingDoc.IndicatorMilieuvergunning value) {
        this.indicatorMilieuvergunning = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Gevraagd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="ToegestaneKleurcode_Wit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="ToegestaneKleurcode_Blauw" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="ToegestaneKleurcode_Oranje" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="ToegestaneKleurcode_Rood" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gevraagd",
        "toegestaneKleurcodeWit",
        "toegestaneKleurcodeBlauw",
        "toegestaneKleurcodeOranje",
        "toegestaneKleurcodeRood"
    })
    public static class IndicatorMilieuvergunning {

        @XmlElement(name = "Gevraagd")
        protected boolean gevraagd;
        @XmlElement(name = "ToegestaneKleurcode_Wit")
        protected boolean toegestaneKleurcodeWit;
        @XmlElement(name = "ToegestaneKleurcode_Blauw")
        protected boolean toegestaneKleurcodeBlauw;
        @XmlElement(name = "ToegestaneKleurcode_Oranje")
        protected boolean toegestaneKleurcodeOranje;
        @XmlElement(name = "ToegestaneKleurcode_Rood")
        protected boolean toegestaneKleurcodeRood;

        /**
         * Gets the value of the gevraagd property.
         * 
         */
        public boolean isGevraagd() {
            return gevraagd;
        }

        /**
         * Sets the value of the gevraagd property.
         * 
         */
        public void setGevraagd(boolean value) {
            this.gevraagd = value;
        }

        /**
         * Gets the value of the toegestaneKleurcodeWit property.
         * 
         */
        public boolean isToegestaneKleurcodeWit() {
            return toegestaneKleurcodeWit;
        }

        /**
         * Sets the value of the toegestaneKleurcodeWit property.
         * 
         */
        public void setToegestaneKleurcodeWit(boolean value) {
            this.toegestaneKleurcodeWit = value;
        }

        /**
         * Gets the value of the toegestaneKleurcodeBlauw property.
         * 
         */
        public boolean isToegestaneKleurcodeBlauw() {
            return toegestaneKleurcodeBlauw;
        }

        /**
         * Sets the value of the toegestaneKleurcodeBlauw property.
         * 
         */
        public void setToegestaneKleurcodeBlauw(boolean value) {
            this.toegestaneKleurcodeBlauw = value;
        }

        /**
         * Gets the value of the toegestaneKleurcodeOranje property.
         * 
         */
        public boolean isToegestaneKleurcodeOranje() {
            return toegestaneKleurcodeOranje;
        }

        /**
         * Sets the value of the toegestaneKleurcodeOranje property.
         * 
         */
        public void setToegestaneKleurcodeOranje(boolean value) {
            this.toegestaneKleurcodeOranje = value;
        }

        /**
         * Gets the value of the toegestaneKleurcodeRood property.
         * 
         */
        public boolean isToegestaneKleurcodeRood() {
            return toegestaneKleurcodeRood;
        }

        /**
         * Sets the value of the toegestaneKleurcodeRood property.
         * 
         */
        public void setToegestaneKleurcodeRood(boolean value) {
            this.toegestaneKleurcodeRood = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Gevraagd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="ToegestaneKleurcode_Wit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="ToegestaneKleurcode_Blauw" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="ToegestaneKleurcode_Oranje" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="ToegestaneKleurcode_Rood" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gevraagd",
        "toegestaneKleurcodeWit",
        "toegestaneKleurcodeBlauw",
        "toegestaneKleurcodeOranje",
        "toegestaneKleurcodeRood"
    })
    public static class IndicatorRisicoObject {

        @XmlElement(name = "Gevraagd")
        protected boolean gevraagd;
        @XmlElement(name = "ToegestaneKleurcode_Wit")
        protected boolean toegestaneKleurcodeWit;
        @XmlElement(name = "ToegestaneKleurcode_Blauw")
        protected boolean toegestaneKleurcodeBlauw;
        @XmlElement(name = "ToegestaneKleurcode_Oranje")
        protected boolean toegestaneKleurcodeOranje;
        @XmlElement(name = "ToegestaneKleurcode_Rood")
        protected boolean toegestaneKleurcodeRood;

        /**
         * Gets the value of the gevraagd property.
         * 
         */
        public boolean isGevraagd() {
            return gevraagd;
        }

        /**
         * Sets the value of the gevraagd property.
         * 
         */
        public void setGevraagd(boolean value) {
            this.gevraagd = value;
        }

        /**
         * Gets the value of the toegestaneKleurcodeWit property.
         * 
         */
        public boolean isToegestaneKleurcodeWit() {
            return toegestaneKleurcodeWit;
        }

        /**
         * Sets the value of the toegestaneKleurcodeWit property.
         * 
         */
        public void setToegestaneKleurcodeWit(boolean value) {
            this.toegestaneKleurcodeWit = value;
        }

        /**
         * Gets the value of the toegestaneKleurcodeBlauw property.
         * 
         */
        public boolean isToegestaneKleurcodeBlauw() {
            return toegestaneKleurcodeBlauw;
        }

        /**
         * Sets the value of the toegestaneKleurcodeBlauw property.
         * 
         */
        public void setToegestaneKleurcodeBlauw(boolean value) {
            this.toegestaneKleurcodeBlauw = value;
        }

        /**
         * Gets the value of the toegestaneKleurcodeOranje property.
         * 
         */
        public boolean isToegestaneKleurcodeOranje() {
            return toegestaneKleurcodeOranje;
        }

        /**
         * Sets the value of the toegestaneKleurcodeOranje property.
         * 
         */
        public void setToegestaneKleurcodeOranje(boolean value) {
            this.toegestaneKleurcodeOranje = value;
        }

        /**
         * Gets the value of the toegestaneKleurcodeRood property.
         * 
         */
        public boolean isToegestaneKleurcodeRood() {
            return toegestaneKleurcodeRood;
        }

        /**
         * Sets the value of the toegestaneKleurcodeRood property.
         * 
         */
        public void setToegestaneKleurcodeRood(boolean value) {
            this.toegestaneKleurcodeRood = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="STRAATNAAM_NEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="POSTCODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="HUIS_PAAL_NR" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="HUIS_NR_TOEV" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OBJECT_HUISNUMMERTOEVOEGING" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="T_X_COORD" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="T_Y_COORD" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "LocatieBAA", propOrder = {
        "straatnaamnen",
        "postcode",
        "huispaalnr",
        "huisnrtoev",
        "objecthuisnummertoevoeging",
        "txcoord",
        "tycoord"
    })
    public static class Locatie {

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
        @XmlElement(name = "T_X_COORD", required = true)
        protected BigDecimal txcoord;
        @XmlElement(name = "T_Y_COORD", required = true)
        protected BigDecimal tycoord;

        /**
         * Gets the value of the straatnaamnen property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTRAATNAAMNEN() {
            return straatnaamnen;
        }

        /**
         * Sets the value of the straatnaamnen property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTRAATNAAMNEN(String value) {
            this.straatnaamnen = value;
        }

        /**
         * Gets the value of the postcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPOSTCODE() {
            return postcode;
        }

        /**
         * Sets the value of the postcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPOSTCODE(String value) {
            this.postcode = value;
        }

        /**
         * Gets the value of the huispaalnr property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getHUISPAALNR() {
            return huispaalnr;
        }

        /**
         * Sets the value of the huispaalnr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setHUISPAALNR(BigInteger value) {
            this.huispaalnr = value;
        }

        /**
         * Gets the value of the huisnrtoev property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHUISNRTOEV() {
            return huisnrtoev;
        }

        /**
         * Sets the value of the huisnrtoev property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHUISNRTOEV(String value) {
            this.huisnrtoev = value;
        }

        /**
         * Gets the value of the objecthuisnummertoevoeging property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOBJECTHUISNUMMERTOEVOEGING() {
            return objecthuisnummertoevoeging;
        }

        /**
         * Sets the value of the objecthuisnummertoevoeging property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOBJECTHUISNUMMERTOEVOEGING(String value) {
            this.objecthuisnummertoevoeging = value;
        }

        /**
         * Gets the value of the txcoord property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTXCOORD() {
            return txcoord;
        }

        /**
         * Sets the value of the txcoord property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTXCOORD(BigDecimal value) {
            this.txcoord = value;
        }

        /**
         * Gets the value of the tycoord property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTYCOORD() {
            return tycoord;
        }

        /**
         * Sets the value of the tycoord property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTYCOORD(BigDecimal value) {
            this.tycoord = value;
        }

    }

}
