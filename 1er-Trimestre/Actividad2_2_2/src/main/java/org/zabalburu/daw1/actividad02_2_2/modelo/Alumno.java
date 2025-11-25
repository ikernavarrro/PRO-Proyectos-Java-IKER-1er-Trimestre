/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad02_2_2.modelo;

/**
 *
 * @author Focus Mode
 */
public class Alumno {
    public String nombre;
    public String curso;
    
    //public int sección;
    public String sección; //Creado por duda pendiente.
    
    public double nota1;
    public double nota2;
    public double nota3;
    public boolean repetidor;
    
    public double media(){
        return ((this.nota1 + this.nota2 + this.nota3) / 3.0);
    }
    
    public boolean aprobado(){
        return ((this.nota1 >= 5.0) &&
               (this.nota2 >= 5.0) &&
               (this.nota3 >= 5.0));
    }
    
    public boolean mediaSuperiorA(double media){
        return media() > media;
    }
    
    public boolean suspendeAlgo(){
        return aprobado()? false : true;
    }

}

