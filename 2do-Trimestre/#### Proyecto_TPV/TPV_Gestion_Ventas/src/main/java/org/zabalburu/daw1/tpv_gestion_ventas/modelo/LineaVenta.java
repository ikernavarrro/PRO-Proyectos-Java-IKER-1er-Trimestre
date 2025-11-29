/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.tpv_gestion_ventas.modelo;

/**
 *
 * @author Iker Navarro Pérez
 */
public class LineaVenta {

    private Producto producto;
    private Integer cantidad;

    //CONSTRUCTOR
    public LineaVenta(Producto producto, Integer cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public LineaVenta() {
    }

    // GETTERS y SETTERS
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSubTotal() {
        if (producto != null) {
            Double subTotal = this.producto.getPrecio() * this.cantidad;
            return subTotal;
        } else {
            return 0.0;
        }
    }

    public Double getSubTotalConIVA() {
        if (producto != null) {
            Double subTotalConIVA = this.producto.getPrecioConIVA() * this.cantidad;
            return subTotalConIVA;
        } else {
            return 0.0;
        }
    }

    //EQUALS y HASHCODE
    //NO NECESITAMOS
    //TOSTRING
    @Override
    public String toString() {
        return "LineaVenta{" + "producto=" + producto + ", cantidad=" + cantidad + '}';
    }
}
