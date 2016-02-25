
package main.java.com.incentro.ws.models.dr;

import java.math.BigInteger;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * @author Arne Staphorsius.
 * @since 2-2-2016
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
    protected ResultDoc.Indicator indicator;

    public ResultDoc() {}

    public static ResultDoc apply(IncomingDoc incomingDoc) {
        ResultDoc result = new ResultDoc();

        if (incomingDoc == null) return result;

        result.setINCIDENTID(incomingDoc.getINCIDENTID());
        result.setPrioriteitincident(incomingDoc.getPRIORITEITINCIDENT());
        result.setDtgstartincident(incomingDoc.getDTGSTARTINCIDENT());
        result.setLocatie(incomingDoc.getLocatie());
        result.setIndicator(Indicator.apply(incomingDoc.getIndicator()));

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

        public static Indicator apply(main.java.com.incentro.ws.models.dr.IncomingDoc.Indicator indicator) {
            Indicator ind = new Indicator();

            if (indicator != null) {
                ind.setGevraagdeindicator(indicator.getGevraagdeindicator());
            }

            ind.setStatus(BigInteger.valueOf(1));

            return ind;
        }

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
