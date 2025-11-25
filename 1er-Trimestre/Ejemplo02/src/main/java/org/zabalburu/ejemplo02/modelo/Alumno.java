/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.ejemplo02.modelo;

import java.util.Date;

/**
 *
 * @IKER DAW1
 */
public class Alumno {

    // Campos / Propiedades / Atributos...
    public String nombre;
    public int edad;
    public double notaPRO;
    public double notaBD;
    public Date fechaAlta;

    // Método
    // Acceso retorno nombreMetodo ([tipo param1, tipo param2...]) {
    // instrucciones;
    // [return [expr];]
    // }
    //   public double getMediaMayorQue(double mayor){
    // Objeto.método
    // this.
    public double mediaAlumnos;

    public double getMedia() {
        return (notaPRO + notaBD) / 2;
    }

    public double getNotaMedia() {
        double media = (notaBD + notaPRO) / 2;
        return media;

    }

    public double getMediaClase(Alumno otro){
        double mediaClase = (this.getNotaMedia() + otro.getNotaMedia()) / 2;
        return mediaClase;
    }
    
    public void enviarEmail(String email, String asunto, String texto){
        System.out.println("===============");
        System.out.println("De: iker.navarro.perez");
        System.out.println("Para: " + this.nombre + "@zabalburu.org");
        System.out.println("Asunto: Prueba de email");
        System.out.println("===============");
        
    }
    
  
}
