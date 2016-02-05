
package main.java.com.incentro.ws.models.mk;

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
 *         &lt;element name="Melding" type="{TNS}IncomingDoc"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"melding"})
@XmlRootElement(name = "BerichtMelding")
public class BerichtMelding {

    @XmlElement(name = "Melding", required = true)
    protected IncomingDoc melding;

    /**
     * Gets the value of the melding property.
     * 
     * @return possible object is {@link IncomingDoc }
     */
    public IncomingDoc getMelding() {
        return melding;
    }

    /**
     * Sets the value of the melding property.
     * 
     * @param value allowed object is {@link IncomingDoc }
     */
    public void setMelding(IncomingDoc value) {
        this.melding = value;
    }

}
