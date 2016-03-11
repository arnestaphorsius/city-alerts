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
@XmlType(name = "BerichtAntwoord", namespace = "http://veiligheidintelligence.nl:5080/city-alerts/StatusResponse/", propOrder = {
    "antwoord"
})
public class BerichtAntwoord {

  @XmlElement(name = "Antwoord", required = true)
  protected ResultDoc antwoord;

  /**
   * Gets the value of the antwoord property.
   *
   * @return
   *     possible object is
   *     {@link main.java.com.incentro.ws.models.ds.ResultDoc }
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
   *     {@link main.java.com.incentro.ws.models.ds.ResultDoc }
   *
   */
  public void setAntwoord(ResultDoc value) {
    this.antwoord = value;
  }

}
