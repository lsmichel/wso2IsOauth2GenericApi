//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.07.10 à 12:01:54 PM GMT 
//


package lsmichel.dev.wso2.oAuth2Generique.dto;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lsmichel.dev.wso2.oAuth2Generique.dto package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lsmichel.dev.wso2.oAuth2Generique.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GrantParameters }
     * 
     */
    public GrantParameters createGrantParameters() {
        return new GrantParameters();
    }

    /**
     * Create an instance of {@link GrantParameters.Parameters }
     * 
     */
    public GrantParameters.Parameters createGrantParametersParameters() {
        return new GrantParameters.Parameters();
    }

    /**
     * Create an instance of {@link GrantParameters.Parameters.Parameter }
     * 
     */
    public GrantParameters.Parameters.Parameter createGrantParametersParametersParameter() {
        return new GrantParameters.Parameters.Parameter();
    }

}
