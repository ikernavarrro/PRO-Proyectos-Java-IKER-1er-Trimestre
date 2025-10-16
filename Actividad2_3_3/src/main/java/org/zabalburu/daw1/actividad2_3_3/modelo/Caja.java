/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad2_3_3.modelo;

/**
 *
 * @author Focus Mode
 */
public class Caja {

    public double ingresos;
    public double gastos;

    public double ingresar(double cantidad) {    // Aquí asigamos a los ingresos la cantidad deseada.
        return ingresos = ingresos + cantidad;
    }

    public double gastar(double cantidad) {    // Aquí asignamos a gastos la cantidad deseada.
        return gastos = gastos + cantidad;
    }

    public double saldo() {
        return ingresos - gastos;
    }

    public String recibo() {          //Mostramos por la consola los datos formateados. 
        System.out.println("""
                           Ingresos : %.2f€
                           Gastos   : %.2f€
                           Saldo    : %.2f€
                           """.formatted(this.ingresos, this.gastos, this.saldo()));
        return null; 
    }
}
