/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.coleccionvidojuegos.actividad02_2.modelo;

/**
 *
 * @author Iker Navarro
 */
public class Trabajo {
    public String cliente;
    public double precioHora;
    public double precioKm;
    public double horas;
    public double km;
    public static final double IVA = 0.21;
    public static final int SALIDA = 50;
    
    public double importeHoras(){
        return (this.horas * this.precioHora);
    }
    
    public double importeKm(){
        return ((this.km - 10) * this.precioKm); 
        /*
         SI QUISIERA MÍNIMO 100km para que sea ((this.km >= 100? this.km - 10 : this.km) * this.precioKm);
        */
    }
    
    public double importeTotal(){
        return Trabajo.SALIDA + importeHoras() + importeKm();
    }
    
    double iva(){
        return this.importeTotal() * Trabajo.IVA;
    }
    
    public double importeTotalIva(){
        return this.importeTotal() + this.iva();
    }
    
    public void factura(){
        System.out.println("---------------------------");
        System.out.println("Cliente: " + this.cliente);
        System.out.print("Horas Trabajadas: " + this.horas + " | ");
        System.out.print("Precio Hora: " + this.precioHora + "€" + " | ");
        System.out.println("Importe: " + this.importeHoras() + "€");
        System.out.print("Km. Desplazamiento: " + this.km + "Km" + " | ");
        System.out.print("Precio Km.: " + this.precioKm + "€" + " | ");
        System.out.println("Importe: " + this.importeKm() + "€");
        System.out.println("Total Factura: " + this.importeTotal() + "€");
        System.out.println("I.V.A. (IVA%): " + this.iva() + "€");
        System.out.println("Total Factura (IVA Incluído): " + this.importeTotalIva() + "€");
        System.out.println("---------------------------");
    }
}
