package mx.uv.compras;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import mx.uv.compras.FacturasService;
import mx.uv.compras.InventarioService;
import mx.uv.consumo.wsdl.CreateFactura;
import mx.uv.consumo.wsdl.CreateFacturaResponse;
import mx.uv.consumo.wsdl.GetAllFacturasResponse;
import mx.uv.consumo.wsdl.VerificarProductoResponse;

@SpringBootApplication
public class ComprasApplication {
    @Primary
    @Bean
    public CommandLineRunner inventario(InventarioService inventario) {
        return x -> {
            VerificarProductoResponse verificarProducto = inventario.VerificarProducto(1);
            System.err.println("El nombre del producto es: " + verificarProducto.getNombre() + "\nDescripcion: " + verificarProducto.getDescripcion() + "\nPrecio: " + verificarProducto.getPrecio() + "\nStock: " + verificarProducto.getStock());
        };
    }
    //  @Primary
    //  @Bean
    //  public CommandLineRunner factura(FacturasService factura){
    //      return x -> {
    //          GetAllFacturasResponse obtenerfactura = factura.obtenerfacturas(1);
    //          System.err.println("Facturas del usuario: " + obtenerfactura.getGetAllFacturasResult());
    //     };
    //  }

    public static void main(String[] args) {
        SpringApplication.run(ComprasApplication.class, args);
    }

}
