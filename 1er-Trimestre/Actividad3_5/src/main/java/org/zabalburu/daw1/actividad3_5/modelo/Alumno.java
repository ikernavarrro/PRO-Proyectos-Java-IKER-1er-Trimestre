/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad3_5.modelo;

/**
 *
 * @author DAW1
 */
public class Alumno {
    public String nombre;
    public int notaENT;
    public int notaFOL;
    public int notaSI;
    public int notaBD;
    public int notaPRO;
    public int notaIT;
    public int notaLM;
    
    public double notaMedia(){
        return (double)(notaENT + notaFOL + notaSI + notaBD + notaPRO + notaIT + notaLM) / 7;
    }
    
    public int modulosAprobados(){
        int aprobados = 0;
        if (notaENT >= 5){
            ++aprobados;
        }
        if (notaFOL >= 5){
            ++aprobados;
        }
        if (notaSI >= 5){
            ++aprobados;
        }
        if (notaBD >= 5){
            ++aprobados;
        }
        if (notaPRO >= 5){
            ++aprobados;
        }
        if (notaIT >= 5){
            ++aprobados;
        }
        if (notaLM >= 5){
            ++aprobados;
        }
        return aprobados;
    }
     
    /* public int modulosSuspendidos(){
        int suspendidos = 0;
        if (notaENT < 5){
            ++suspendidos;
        }
        if (notaFOL < 5){
            ++suspendidos;
        }
        if (notaSI < 5){
            ++suspendidos;
        }
        if (notaBD < 5){
            ++suspendidos;
        }
        if (notaPRO < 5){
            ++suspendidos;
        }
        if (notaIT < 5){
            ++suspendidos;
        }
        if (notaLM < 5){
            ++suspendidos;
        }
        return suspendidos;
    } */
    public int modulosSuspendidos(){
        return 7 - this.modulosAprobados();
    }
    
    
    
    public boolean pasaCurso(){
        int horasBasicasSuspensas =0;
        if (notaENT < 5){
            horasBasicasSuspensas += 99;
        }
        if (notaFOL < 5){
            horasBasicasSuspensas += 99;
        }
        if (notaSI < 5){
            horasBasicasSuspensas += 165;
        }
        if (notaBD < 5){
            horasBasicasSuspensas += 198;
        }
        if (notaPRO < 5){
            horasBasicasSuspensas += 264;
        }
        if (notaIT < 5){
            horasBasicasSuspensas += 33;
        }
        if (notaLM < 5){
            horasBasicasSuspensas += 132;
        }
        /*if (modulosSuspendidos() > 2 || horasBasicasSuspensas > 300){
            return false;
        }else{
            return true;
        }*/
        return !(modulosSuspendidos() > 2 || horasBasicasSuspensas > 300);
        
        }
            
    }

