/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.zabalburu.daw1.actividad01;

import org.zabalburu.daw1.actividad01.datos.Producto;

/**
 *
 * @author DAW1
 */
public class Actividad01 {

    public static void main(String[] args) {
        Producto producto1 = new Producto();
        producto1.nombre = "Galletas";
        producto1.precio = 2;
        double iva1 = producto1.getIva();
        int unidades1 = 1000;
        // int unidades = 1000; 
        int importe1 = producto1.getImporte(1000);
        double importeIVA1 = producto1.getImporteIVA(1000);
        double descuento1 = producto1.getDescuento50(1000);
        
        Producto producto2 = new Producto();
        producto2.nombre = "Brick de Leche";
        producto2.precio = 4;
        double iva2 = producto2.getIva();
        int unidades2 = 500;
        // int unidades = 500; 
        int importe2 = producto2.getImporte(unidades2);
        double importeIVA2 = producto2.getImporteIVA(unidades2);
        
        producto1.mostrar();
        producto2.mostrar();
        
        System.out.println("---------------");
        System.out.println("Vendidas " + unidades1 + " unidades de " + producto1.nombre + "(Precio Sin IVA: " + producto1.precio + "€) (Precio Con IVA: " + iva1 + " €). Importe Total Sin IVA: " + importe1 + "€. Importe Total Con IVA: " + importeIVA1 + "€.");
        System.out.println("Vendidas " + unidades2 + " unidades de " + producto2.nombre + "(Precio Sin IVA: " + producto2.precio + "€) (Precio Con IVA: " + iva2 + " €). Importe Total Sin IVA: " + importe2 + "€. Importe Total Con IVA: " + importeIVA2 + "€.");
        System.out.println("Descuento en " + producto1.nombre + " del 50% antes a " + producto1.precio + "€, ahora salen a " + descuento1 + "€.");
    }
}
