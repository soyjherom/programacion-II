package Services;

import java.util.Date;
import Entities.Factura;

public class Facturacion {
    private int facturasHechas = 0;
    private Factura factura;
    public double porcentajeDescuento; 
    public Facturacion(){
        this.porcentajeDescuento = 0.0d;
    }
    public Factura facturar(final Factura factura){
        this.factura = new Factura();
        this.factura.setId(this.facturasHechas);
        this.factura.setSubtotal(factura.getSubtotal());
        this.factura.setImpuestos(this.factura.getSubtotal() * 0.15);
        if(this.porcentajeDescuento > 0)
            this.factura.setDescuentos(this.factura.getSubtotal() * (this.porcentajeDescuento / 100));
        this.factura.setTotal(
            this.factura.getSubtotal() + 
            this.factura.getImpuestos() - 
            this.factura.getDescuentos()
        );
        this.facturasHechas += 1;
        return this.factura;
    }
}
