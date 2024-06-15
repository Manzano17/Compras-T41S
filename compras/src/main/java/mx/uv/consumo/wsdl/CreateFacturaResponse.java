
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
 *         &lt;element name="CreateFacturaResult" type="{http://tempuri.org/}Factura" minOccurs="0"/&gt;
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
    "createFacturaResult"
})
@XmlRootElement(name = "CreateFacturaResponse")
public class CreateFacturaResponse {

    @XmlElement(name = "CreateFacturaResult")
    protected Factura createFacturaResult;

    /**
     * Obtiene el valor de la propiedad createFacturaResult.
     * 
     * @return
     *     possible object is
     *     {@link Factura }
     *     
     */
    public Factura getCreateFacturaResult() {
        return createFacturaResult;
    }

    /**
     * Define el valor de la propiedad createFacturaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Factura }
     *     
     */
    public void setCreateFacturaResult(Factura value) {
        this.createFacturaResult = value;
    }

}
