
package main.java.ws.models;

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
    "prioriteitincidentbrandweer",
    "dtgstartincident",
    "straatnaamnen",
    "postcode",
    "huispaalnr",
    "huisnrtoev",
    "objecthuisnummertoevoeging",
    "txcoord",
    "tycoord",
    "codevoertuigsoort"
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
    @XmlElement(name = "PRIORITEIT_INCIDENT_BRANDWEER", required = true)
    protected String prioriteitincidentbrandweer;
    @XmlElement(name = "DTG_START_INCIDENT", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtgstartincident;
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
    @XmlElement(name = "CODE_VOERTUIGSOORT", required = true)
    protected String codevoertuigsoort;

    public IncomingDoc() {}

    public IncomingDoc(String codevoertuigsoort) {
        this.codevoertuigsoort = codevoertuigsoort;
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

    /**
     * Gets the value of the codevoertuigsoort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODEVOERTUIGSOORT() {
        return codevoertuigsoort;
    }

    /**
     * Sets the value of the codevoertuigsoort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODEVOERTUIGSOORT(String value) {
        this.codevoertuigsoort = value;
    }

}
