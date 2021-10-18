package Entities;

import java.util.Date;

public class Factura{
    private int id = 0;
    private Date fecha;
    private String nombreCliente;
    private double subtotal;
    private double impuestos;
    private double descuentos;
    private double total;
    public Factura(){}
    public int getId() {
        return id;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public double getDescuentos() {
        return descuentos;
    }
    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }
    public double getImpuestos() {
        return impuestos;
    }
    public void setImpuestos(double impuestos) {
        this.impuestos = impuestos;
    }
    public double getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public void setId(int id) {
        this.id = id;
    }
}