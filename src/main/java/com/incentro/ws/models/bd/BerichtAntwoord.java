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
@XmlType(name = "BerichtAntwoord", propOrder = {
    "antwoord"
})
public class BerichtAntwoord {

  @XmlElement(name = "Antwoord", required = true)
  protected ResultDoc antwoord;

  public ResultDoc getAntwoord() {
    return antwoord;
  }

  public void setAntwoord(ResultDoc antwoord) {
    this.antwoord = antwoord;
  }
}
