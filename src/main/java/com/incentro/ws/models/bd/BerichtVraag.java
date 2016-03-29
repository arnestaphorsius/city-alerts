package main.java.com.incentro.ws.models.bd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Arne Staphorsius.
 * @since 29-3-2016.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BerichtVraag", propOrder = {
    "vraag"
})
public class BerichtVraag {

  @XmlElement(name = "Vraag", required = true)
  protected IncomingDoc vraag;

  public IncomingDoc getVraag() {
    return vraag;
  }

  public void setVraag(IncomingDoc vraag) {
    this.vraag = vraag;
  }
}
