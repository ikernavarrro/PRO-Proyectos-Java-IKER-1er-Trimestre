/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.actividad3_6;

import javax.swing.JOptionPane;

/**
 *
 * @author lucia
 */
public class Actividad3_6 {

    public static void main(String[] args) {
        
        int año;
        año = Integer.parseInt(JOptionPane.showInputDialog(null, "Año:", "Introduzca Año"));
        int numeroMes;
        numeroMes = Integer.parseInt(JOptionPane.showInputDialog(null, "Mes:", "Introduzca un número del 1-12 en relación al mes."));
        int dias = 0;
        
        switch (numeroMes) {
            case 1:
                dias = 31;
                break;
            case 2:
                if (((año % 4) == 0) && ((año % 100) != 0) || (año % 400 == 0)){
                    dias = 29;
                }else{
                    dias = 28;
                };
                break;
            case 3:
                dias = 31;
                break;
            case 4:
                dias = 30;
                break; 
            case 5:
                dias = 31;
                break;
            case 6:
                dias = 30;
                break;
            case 7:
                dias = 31;
                break;
            case 8:
                dias = 31;
                break;
            case 9:
                dias = 30;
                break;
            case 10:
                dias = 31;
                break;
            case 11:
                dias = 30;
                break;                
            default:
                dias = 31;
        }
        
        String nombreMes;
        if (numeroMes == 1){
            nombreMes = "Enero";
        }else if (numeroMes == 2){
            nombreMes = "Febrero";  
        }else if (numeroMes == 3){
            nombreMes = "Marzo";
        }else if (numeroMes == 4){
            nombreMes = "Abril";
        }else if (numeroMes == 5){
            nombreMes = "Mayo";    
        }else if (numeroMes == 6){
            nombreMes = "Junio";
        }else if (numeroMes == 7){
            nombreMes = "Julio";    
        }else if (numeroMes == 8){
            nombreMes = "Agosto";    
        }else if (numeroMes == 9){
            nombreMes = "Septiembre";    
        }else if (numeroMes == 10){
            nombreMes = "Octubre";    
        }else if (numeroMes == 11){
            nombreMes = "Noviembre";
        }else{ nombreMes = "Diciembre";}    
        
        JOptionPane.showMessageDialog(null, """
                                            <html>
                                            <b>Año:</b> %d <br />
                                            <b>Mes:</b> %s <br />
                                            <b>Días:</b> %d 
                                            </html>
                                            """.formatted(año, nombreMes, dias), "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }   
        
}
