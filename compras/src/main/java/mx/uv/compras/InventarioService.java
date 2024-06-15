package mx.uv.compras;

import mx.uv.consumo.wsdl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@Service
public class InventarioService extends WebServiceGatewaySupport {

    public VerificarProductoResponse VerificarProducto(int id) {
        VerificarProductoRequest verificar = new VerificarProductoRequest();
        verificar.setId(id);

        VerificarProductoResponse respuesta = (VerificarProductoResponse) getWebServiceTemplate().marshalSendAndReceive(
                "https://servicio-inventario-production.up.railway.app/ws/inventario.wsdl", verificar,
                new SoapActionCallback("https://servicio-inventario-production.up.railway.app/ws/inventario.wsdl"));

        return respuesta;
    }

}

