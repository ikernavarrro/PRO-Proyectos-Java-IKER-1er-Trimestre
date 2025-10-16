/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad3_3.modelo;

/**
 *
 * @author DAW1
 */
public class Pintxo {
    public double precio;
    
    public int porcDto(int cantidad){
        if (cantidad <=0){
            return -1;
        }else if (cantidad < 5){
            return 0;
        }else if (cantidad < 10){ 
            return 5;
        }else {
            return 10;
        }     
    }
    
    public double importe(int cantidad){
        return  ((double)cantidad * this.precio) - (((double)cantidad * this.precio) * ((double)this.porcDto(cantidad) / 100.0)) ; 
    }
}
