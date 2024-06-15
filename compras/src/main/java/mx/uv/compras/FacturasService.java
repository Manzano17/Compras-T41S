package mx.uv.compras;

import mx.uv.consumo.wsdl.*;

import java.math.BigDecimal;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@Service
public class FacturasService extends WebServiceGatewaySupport {

    public GetAllFacturasResponse obtenerfacturas(int id) {
        GetAllFacturasResponse obtener = new GetAllFacturasResponse();
        obtener.getGetAllFacturasResult();

        GetAllFacturasResponse obtenerF = (GetAllFacturasResponse) getWebServiceTemplate().marshalSendAndReceive(
                "https://soapfacturas.azurewebsites.net/Facturas.asmx?wsdl", obtener,
                new SoapActionCallback(""));
        return obtenerF;
    }
}
