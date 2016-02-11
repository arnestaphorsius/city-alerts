package main.java.com.incentro.ws.models.da;

import javax.xml.bind.annotation.*;

/**
 * @author Arne Staphorsius.
 * @since 11-2-2016.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BerichtVraagDA", propOrder = {
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
