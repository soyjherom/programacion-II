package test.Services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;
import Entities.Factura;
import Services.Facturacion;

public class FaturacionTest {
    @Test
    public void facturarConDescuentoTest(){
        Factura miFactura = new Factura();
        miFactura.setSubtotal(300);
        Facturacion facturador = new Facturacion();
        miFactura = facturador.facturar(miFactura);
        assertTrue(150.0d == miFactura.getDescuentos());
    }
    @Test
    public void fechaFacturacionTest(){
        Factura miFactura = new Factura();
        miFactura.setSubtotal(100);
        Facturacion facturador = new Facturacion();
        miFactura = facturador.facturar(miFactura);
        assertEquals(new Date(), miFactura.getFecha());
    }
    @Test
    public void impuestosTestTest(){
        Factura miFactura = new Factura();
        miFactura.setSubtotal(100);
        Facturacion facturador = new Facturacion();
        miFactura = facturador.facturar(miFactura);
        assertEquals(Double.toString(20.0d), Double.toString(miFactura.getImpuestos()));
    }
    
}
