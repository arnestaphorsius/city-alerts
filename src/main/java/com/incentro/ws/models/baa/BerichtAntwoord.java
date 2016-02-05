
package main.java.com.incentro.ws.models.baa;

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
 *         &lt;element name="Antwoord" type="{TNS}ResultDoc"/>
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
    "antwoord"
})
@XmlRootElement(name = "BerichtAntwoord")
public class BerichtAntwoord {

    @XmlElement(name = "Antwoord", required = true)
    protected main.java.com.incentro.ws.models.baa.ResultDoc antwoord;

    /**
     * Gets the value of the antwoord property.
     * 
     * @return
     *     possible object is
     *     {@link ResultDoc }
     *     
     */
    public ResultDoc getAntwoord() {
        return antwoord;
    }

    /**
     * Sets the value of the antwoord property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultDoc }
     *     
     */
    public void setAntwoord(ResultDoc value) {
        this.antwoord = value;
    }

}
