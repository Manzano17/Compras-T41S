
package mx.uv.consumo.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GetFacturaByIdResult" type="{http://tempuri.org/}Factura" minOccurs="0"/&gt;
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
    "getFacturaByIdResult"
})
@XmlRootElement(name = "GetFacturaByIdResponse")
public class GetFacturaByIdResponse {

    @XmlElement(name = "GetFacturaByIdResult")
    protected Factura getFacturaByIdResult;

    /**
     * Obtiene el valor de la propiedad getFacturaByIdResult.
     * 
     * @return
     *     possible object is
     *     {@link Factura }
     *     
     */
    public Factura getGetFacturaByIdResult() {
        return getFacturaByIdResult;
    }

    /**
     * Define el valor de la propiedad getFacturaByIdResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Factura }
     *     
     */
    public void setGetFacturaByIdResult(Factura value) {
        this.getFacturaByIdResult = value;
    }

}
