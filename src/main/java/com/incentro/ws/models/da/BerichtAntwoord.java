package main.java.com.incentro.ws.models.da;

import javax.xml.bind.annotation.*;

/**
 * @author Arne Staphorsius.
 * @since 11-2-2016.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BerichtAntwoord", propOrder = {
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
   *     {@link main.java.com.incentro.ws.models.da.ResultDoc }
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
   *     {@link main.java.com.incentro.ws.models.da.ResultDoc }
   *
   */
  public void setAntwoord(ResultDoc value) {
    this.antwoord = value;
  }

}
