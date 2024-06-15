package mx.uv.compras;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

@Configuration
public class ComprasConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("mx.uv.consumo.wsdl");
        return marshaller;
    }

    @Bean
    public WebServiceTemplate webServiceTemplate(Jaxb2Marshaller marshaller) {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setMarshaller(marshaller);
        webServiceTemplate.setUnmarshaller(marshaller);
        webServiceTemplate.setDefaultUri("https://soapfacturas.azurewebsites.net/Facturas.asmx");
        return webServiceTemplate;
    }
    @Primary
    @Bean
    public InventarioService inventarioConsulta(Jaxb2Marshaller marshaller) {
        InventarioService service = new InventarioService();
        service.setDefaultUri("https://servicio-inventario-production.up.railway.app/ws/inventario.wsdl");
        service.setMarshaller(marshaller);
        service.setUnmarshaller(marshaller);
        return service;
    }

    @Bean
    public FacturasService crearFactura(Jaxb2Marshaller marshaller) {
        FacturasService service = new FacturasService();
        service.setDefaultUri("https://soapfacturas.azurewebsites.net/Facturas.asmx?wsdl");
        service.setMarshaller(marshaller);
        service.setUnmarshaller(marshaller);
        return service;
    }
}

