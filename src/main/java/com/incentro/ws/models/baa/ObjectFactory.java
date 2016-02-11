
package main.java.com.incentro.ws.models.baa;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the models.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: models.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IncomingDoc }
     * 
     */
    public IncomingDoc createIncomingDoc() {
        return new IncomingDoc();
    }

    /**
     * Create an instance of {@link ResultDoc }
     * 
     */
    public ResultDoc createResultDoc() {
        return new ResultDoc();
    }

    /**
     * Create an instance of {@link BerichtAntwoord }
     * 
     */
    public BerichtAntwoord createBerichtAntwoord() {
        return new BerichtAntwoord();
    }

    /**
     * Create an instance of {@link BerichtVraag }
     * 
     */
    public BerichtVraag createBerichtVraag() {
        return new BerichtVraag();
    }

    /**
     * Create an instance of {@link IncomingDoc.Locatie }
     * 
     */
    public IncomingDoc.Locatie createIncomingDocLocatie() {
        return new IncomingDoc.Locatie();
    }

    /**
     * Create an instance of {@link IncomingDoc.Indicator }
     * 
     */
    public IncomingDoc.Indicator createIncomingDocIndicator() {
        return new IncomingDoc.Indicator();
    }

}
