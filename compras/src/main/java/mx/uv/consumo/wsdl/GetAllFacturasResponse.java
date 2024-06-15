
package mx.uv.consumo.wsdl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetAllFacturasResult" type="{http://tempuri.org/}ArrayOfFactura" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getAllFacturasResult"
})
@XmlRootElement(name = "GetAllFacturasResponse")
public class GetAllFacturasResponse {

    @XmlElementRef(name = "GetAllFacturasResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFactura> getAllFacturasResult;

    /**
     * Obtiene el valor de la propiedad getAllFacturasResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFactura }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFactura> getGetAllFacturasResult() {
        return getAllFacturasResult;
    }

    /**
     * Define el valor de la propiedad getAllFacturasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFactura }{@code >}
     *     
     */
    public void setGetAllFacturasResult(JAXBElement<ArrayOfFactura> value) {
        this.getAllFacturasResult = value;
    }

}
