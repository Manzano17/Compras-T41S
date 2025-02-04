
package mx.uv.consumo.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "inventarioPortService", targetNamespace = "https://inventario.mx.uv/inventario", wsdlLocation = "https://servicio-inventario-production.up.railway.app/ws/inventario.wsdl")
public class InventarioPortService
    extends Service
{

    private final static URL INVENTARIOPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException INVENTARIOPORTSERVICE_EXCEPTION;
    private final static QName INVENTARIOPORTSERVICE_QNAME = new QName("https://inventario.mx.uv/inventario", "inventarioPortService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://servicio-inventario-production.up.railway.app/ws/inventario.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INVENTARIOPORTSERVICE_WSDL_LOCATION = url;
        INVENTARIOPORTSERVICE_EXCEPTION = e;
    }

    public InventarioPortService() {
        super(__getWsdlLocation(), INVENTARIOPORTSERVICE_QNAME);
    }

    public InventarioPortService(WebServiceFeature... features) {
        super(__getWsdlLocation(), INVENTARIOPORTSERVICE_QNAME, features);
    }

    public InventarioPortService(URL wsdlLocation) {
        super(wsdlLocation, INVENTARIOPORTSERVICE_QNAME);
    }

    public InventarioPortService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, INVENTARIOPORTSERVICE_QNAME, features);
    }

    public InventarioPortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InventarioPortService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns InventarioPort
     */
    @WebEndpoint(name = "inventarioPortSoap11")
    public InventarioPort getInventarioPortSoap11() {
        return super.getPort(new QName("https://inventario.mx.uv/inventario", "inventarioPortSoap11"), InventarioPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InventarioPort
     */
    @WebEndpoint(name = "inventarioPortSoap11")
    public InventarioPort getInventarioPortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("https://inventario.mx.uv/inventario", "inventarioPortSoap11"), InventarioPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INVENTARIOPORTSERVICE_EXCEPTION!= null) {
            throw INVENTARIOPORTSERVICE_EXCEPTION;
        }
        return INVENTARIOPORTSERVICE_WSDL_LOCATION;
    }

}
