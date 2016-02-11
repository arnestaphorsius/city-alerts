
package main.java.com.incentro.ws.models.bm;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the models package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: models
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BerichtMelding }
     * 
     */
    public BerichtMelding createBerichtMelding() {
        return new BerichtMelding();
    }

    /**
     * Create an instance of {@link IncomingDoc }
     * 
     */
    public IncomingDoc createIncomingDoc() {
        return new IncomingDoc();
    }

    /**
     * Create an instance of {@link BerichtendienstAntwoord }
     * 
     */
    public BerichtendienstAntwoord createBerichtendienstAntwoord() {
        return new BerichtendienstAntwoord();
    }

    /**
     * Create an instance of {@link ResultDoc }
     * 
     */
    public ResultDoc createResultDoc() {
        return new ResultDoc();
    }



}
