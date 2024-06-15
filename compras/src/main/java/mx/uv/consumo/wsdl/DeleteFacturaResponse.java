
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
 *         &lt;element name="DeleteFacturaResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "deleteFacturaResult"
})
@XmlRootElement(name = "DeleteFacturaResponse")
public class DeleteFacturaResponse {

    @XmlElement(name = "DeleteFacturaResult")
    protected boolean deleteFacturaResult;

    /**
     * Obtiene el valor de la propiedad deleteFacturaResult.
     * 
     */
    public boolean isDeleteFacturaResult() {
        return deleteFacturaResult;
    }

    /**
     * Define el valor de la propiedad deleteFacturaResult.
     * 
     */
    public void setDeleteFacturaResult(boolean value) {
        this.deleteFacturaResult = value;
    }

}
