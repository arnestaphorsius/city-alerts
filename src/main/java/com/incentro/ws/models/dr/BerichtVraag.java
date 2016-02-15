package main.java.com.incentro.ws.models.dr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Vraag" type="{TNS}IncomingDoc"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BerichtVraag", namespace = "http://localhost:8088/DataRequest/", propOrder = {
    "vraag"
})
@XmlRootElement(name = "BerichtVraag")
public class BerichtVraag {

    @XmlElement(name = "Vraag", required = true)
    protected IncomingDoc vraag;

    /**
     * Gets the value of the vraag property.
     * 
     * @return
     *     possible object is
     *     {@link IncomingDoc }
     *     
     */
    public IncomingDoc getVraag() {
        return vraag;
    }

    /**
     * Sets the value of the vraag property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomingDoc }
     *     
     */
    public void setVraag(IncomingDoc value) {
        this.vraag = value;
    }

}
