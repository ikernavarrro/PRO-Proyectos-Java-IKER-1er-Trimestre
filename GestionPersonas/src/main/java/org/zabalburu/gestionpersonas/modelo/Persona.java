/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.gestionpersonas.modelo;

/**
 *
 * @author Iker Navarro
 */
public class Persona {
    public String nombre;
    public String apellidos;
    public int edad;
    public int sueldo;
    
    public void saludo(){
        System.out.println("Me llamo " + nombre);
        System.out.println("Me apellido " + apellidos);
        System.out.println("Y tengo " + edad + " años.");
    }
    public int getSueldoNeto(int porcIRPF){
        int irpf = this.sueldo * porcIRPF / 100;
        int sueldoNeto = this.sueldo - irpf;
        return sueldoNeto;
    }
    
    
}
