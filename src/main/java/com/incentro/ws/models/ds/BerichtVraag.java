package main.java.com.incentro.ws.models.ds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Arne Staphorsius.
 * @since 12-2-2016.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BerichtVraag", namespace = "http://veiligheidintelligence.nl:5080/city-alerts/StatusResponse/", propOrder = {
    "vraag"
})
public class BerichtVraag {

  @XmlElement(name = "Vraag", required = true)
  protected IncomingDoc vraag;

  /**
   * Gets the value of the vraag property.
   *
   * @return
   *     possible object is
   *     {@link main.java.com.incentro.ws.models.ds.IncomingDoc }
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
   *     {@link main.java.com.incentro.ws.models.ds.IncomingDoc }
   *
   */
  public void setVraag(IncomingDoc value) {
    this.vraag = value;
  }

}

