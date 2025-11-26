/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad01.datos;

/**
 *
 * @author DAW1
 */
public class Producto {
   public String nombre;
   public int precio;

   
    public void mostrar() {
        System.out.println("---------------");
        System.out.println("Producto: " + this.nombre);
        System.out.println("Precio Sin IVA: " + precio);
        System.out.println("Precio Con IVA: " + this.getIva());

    }

    public int getImporte(int unidades) {
        return unidades * this.precio;  
    }
    
    public double getIva () {
        return this.precio + (0.21 * this.precio);
    }
    
    public double getImporteIVA(int unidades) {
        return unidades * this.getIva();
    }
    
    public double getDescuento50 (double precio) {
        return this.precio - (0.50 * this.precio);
    }
}
