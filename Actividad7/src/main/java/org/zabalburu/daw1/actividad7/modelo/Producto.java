/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad7.modelo;

import java.util.Objects;

/**
 *
 * @author Iker Navarro Pérez
 */
public class Producto {
    public String nombre = null;
    public int unidadesAlmacen = 0;
    public double precio = 0;
    public int unidadesVendidas = 0;
    public double ventasProducto = 0.0;
    public static final int IVA = 21;
    public static double descuento = 5.0;
    public static double importeMinimoDto = 100.0;
    public static double ventasTotales = 0.0;

    public Producto() {
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", unidadesAlmacen=" + unidadesAlmacen + ", precio=" + precio + ", unidadesVendidas=" + unidadesVendidas + ", ventasProducto=" + ventasProducto + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        return Objects.equals(this.nombre, other.nombre);
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidadesAlmacen() {
        return unidadesAlmacen;
    }

    public void setUnidadesAlmacen(int unidadesAlmacen) {
        this.unidadesAlmacen = unidadesAlmacen;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public void setUnidadesVendidas(int unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }

    public double getVentasProducto() {
        return ventasProducto;
    }

    public void setVentasProducto(double ventasProducto) {
        this.ventasProducto = ventasProducto;
    }

    public static double getDescuento() {
        return descuento;
    }

    public static void setDescuento(double descuento) {
        Producto.descuento = descuento;
    }

    public static double getImporteMinimoDto() {
        return importeMinimoDto;
    }

    public static void setImporteMinimoDto(double importeMinimoDto) {
        Producto.importeMinimoDto = importeMinimoDto;
    }

    public static double getVentasTotales() {
        return ventasTotales;
    }

    public static void setVentasTotales(double ventasTotales) {
        Producto.ventasTotales = ventasTotales;
    }
    
    public void aumentarUnidades(int unidades) {
        unidadesAlmacen += unidades;
    }
    
    private double importe(int unidades) {
        double importeSinIva = unidades * this.getPrecio();
        double iva = (importeSinIva * Producto.IVA) / 100;
        double importeConIva = importeSinIva + iva;
        return importeConIva;
    }
    
    public static double descuento(double importe) {
        double descuento = 0;
        if (importe < Producto.importeMinimoDto) {
            descuento = 0;
        } else {
            descuento += (importe * Producto.descuento) / 100;
        }
        return descuento;
    }
    
    public double vender(int unidades) {
        double venta = 0;
        if (unidades > this.getUnidadesAlmacen()) {
            venta = -1;
        } else if (unidades > 0) {
            double importeConIva = this.importe(unidades);
            double descuento = Producto.descuento(importeConIva);
            venta = importeConIva - descuento;
            this.unidadesVendidas += unidades;
            this.unidadesAlmacen -= unidades;
            this.ventasProducto += venta;
            Producto.ventasTotales += venta;
        }
        return venta;
    }
}
