
package mx.uv.consumo.wsdl;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.uv.consumo.wsdl package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.uv.consumo.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AgregarProductoRequest }
     * 
     */
    public AgregarProductoRequest createAgregarProductoRequest() {
        return new AgregarProductoRequest();
    }

    /**
     * Create an instance of {@link AgregarProductoResponse }
     * 
     */
    public AgregarProductoResponse createAgregarProductoResponse() {
        return new AgregarProductoResponse();
    }

    /**
     * Create an instance of {@link VerificarProductoRequest }
     * 
     */
    public VerificarProductoRequest createVerificarProductoRequest() {
        return new VerificarProductoRequest();
    }

    /**
     * Create an instance of {@link VerificarProductoResponse }
     * 
     */
    public VerificarProductoResponse createVerificarProductoResponse() {
        return new VerificarProductoResponse();
    }

}
