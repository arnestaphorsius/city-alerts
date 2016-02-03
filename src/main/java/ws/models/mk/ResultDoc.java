
package main.java.ws.models.mk;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="STRAATNAAM_NEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="POSTCODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HUIS_PAAL_NR" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="HUIS_NR_TOEV" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OBJECT_HUISNUMMERTOEVOEGING" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="T_X_COORD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="T_Y_COORD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Indicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Kleurcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AanvullendeInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultDoc", propOrder = {
    "incidentid",
    "resultaatcode",
    "straatnaamnen",
    "postcode",
    "huispaalnr",
    "huisnrtoev",
    "objecthuisnummertoevoeging",
    "txcoord",
    "tycoord",
    "indicator",
    "label",
    "kleurcode",
    "aanvullendeInfo"
})
public class ResultDoc {

    @XmlElement(name = "INCIDENT_ID", required = true)
    protected String incidentid;
    @XmlElement(name = "Resultaatcode", required = true)
    protected String resultaatcode;
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
    protected String txcoord;
    @XmlElement(name = "T_Y_COORD", required = true)
    protected String tycoord;
    @XmlElement(name = "Indicator", required = true)
    protected String indicator;
    @XmlElement(name = "Label", required = true)
    protected String label;
    @XmlElement(name = "Kleurcode", required = true)
    protected String kleurcode;
    @XmlElement(name = "AanvullendeInfo", required = true)
    protected String aanvullendeInfo;

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
     * Gets the value of the resultaatcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultaatcode() {
        return resultaatcode;
    }

    /**
     * Sets the value of the resultaatcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultaatcode(String value) {
        this.resultaatcode = value;
    }

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
     *     {@link String }
     *     
     */
    public String getTXCOORD() {
        return txcoord;
    }

    /**
     * Sets the value of the txcoord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXCOORD(String value) {
        this.txcoord = value;
    }

    /**
     * Gets the value of the tycoord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYCOORD() {
        return tycoord;
    }

    /**
     * Sets the value of the tycoord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYCOORD(String value) {
        this.tycoord = value;
    }

    /**
     * Gets the value of the indicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicator() {
        return indicator;
    }

    /**
     * Sets the value of the indicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicator(String value) {
        this.indicator = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the kleurcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKleurcode() {
        return kleurcode;
    }

    /**
     * Sets the value of the kleurcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKleurcode(String value) {
        this.kleurcode = value;
    }

    /**
     * Gets the value of the aanvullendeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAanvullendeInfo() {
        return aanvullendeInfo;
    }

    /**
     * Sets the value of the aanvullendeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAanvullendeInfo(String value) {
        this.aanvullendeInfo = value;
    }

}
