
package main.java.com.incentro.ws.models.baa;

import java.math.BigInteger;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ResultDoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultDoc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INCIDENT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Resultaatcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                   &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="Kleurcode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="AanvullendeInformatie" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "ResultDocBAA", propOrder = {
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
    protected ResultDoc.Indicator indicator;

    public ResultDoc() {}

    public static ResultDoc apply(IncomingDoc incomingDoc) {
        ResultDoc result = new ResultDoc();

        if (incomingDoc == null) return result;

        result.setINCIDENTID(incomingDoc.getINCIDENTID());
        result.setLocatie(IncomingDoc.Locatie.apply(incomingDoc.getLocatie()));

        return result;
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
     *     {@link ResultDoc.Indicator }
     *     
     */
    public ResultDoc.Indicator getIndicator() {
        return indicator;
    }

    /**
     * Sets the value of the indicatorRisicoObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultDoc.Indicator }
     *     
     */
    public void setIndicator(ResultDoc.Indicator value) {
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
        protected BigInteger status;

        public String getGevraagdeindicator() {
            return gevraagdeindicator;
        }

        public void setGevraagdeindicator(String gevraagdeindicator) {
            this.gevraagdeindicator = gevraagdeindicator;
        }

        public BigInteger getStatus() {
            return status;
        }

        public void setStatus(BigInteger status) {
            this.status = status;
        }
    }
}
