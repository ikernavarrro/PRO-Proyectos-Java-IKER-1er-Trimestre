/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad14;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Inigo
 */
public class Actividad14 {
    private static String mostrar(GregorianCalendar gc){
        String resp = "";
        resp += gc.get(Calendar.DATE) + "-" +
                (gc.get(Calendar.MONTH) + 1) + "-" +
                gc.get(Calendar.YEAR);
        resp += " ( ";
        switch (gc.get(Calendar.DAY_OF_WEEK)){
            case Calendar.MONDAY:
                resp += "Lunes";
                break;
            case Calendar.TUESDAY:
                resp += "Martes";
                break;
            case Calendar.WEDNESDAY:
                resp += "Miércoles";
                break;
            case Calendar.THURSDAY:
                resp += "Jueves";
                break;
            case Calendar.FRIDAY:
                resp += "Viernes";
                break;
            case Calendar.SATURDAY:
                resp += "Sábado";
                break;
            case Calendar.SUNDAY:
                resp += "Domingo";
                break;
        }
        resp += " )";
        return resp;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strFecha = JOptionPane.showInputDialog("Fecha (dd/mm/aaaa):");
        int pos1 = strFecha.indexOf("/");
        //int pos2 = strFecha.lastIndexOf("/");
        int pos2 = strFecha.indexOf("/",pos1+1);
        int dia = Integer.parseInt(strFecha.substring(0,pos1));
        int mes = Integer.parseInt(strFecha.substring(pos1+1,pos2));
        int año = Integer.parseInt(strFecha.substring(pos2+1));
        if (año< 100){
            año += 2000;
        }
        GregorianCalendar fecha = new GregorianCalendar(año, mes-1, dia);
        System.out.println("Fecha : " + mostrar(fecha));
        /*fecha.add(Calendar.DATE, 30);
        System.out.println(mostrar(fecha));
        if (fecha.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
            fecha.add(Calendar.DATE, 2);
        } else if (fecha.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
            fecha.add(Calendar.DATE, 1);
        } 
        System.out.println("En 30 días : " + mostrar(fecha));
        if (fecha.get(Calendar.DATE)<=15){
            fecha.set(Calendar.DATE, 15);
        } else {
            fecha.set(Calendar.DATE, 15);
            fecha.roll(Calendar.MONTH, true);
        }
        System.out.println("El próximo día 15 : " +
                mostrar(fecha));
        int trimestre = fecha.get(Calendar.MONTH) / 3 + 1;
        if (fecha.get(Calendar.MONTH)<=Calendar.MARCH){
            trimestre = 1;
        } else if (fecha.get(Calendar.MONTH)<=Calendar.JUNE){
            trimestre = 2;
        } else if (fecha.get(Calendar.MONTH)<=Calendar.SEPTEMBER){
            trimestre = 3;
        } else {
            trimestre = 4;
        }
        switch (fecha.get(Calendar.MONTH)){
            case Calendar.JANUARY:
            case Calendar.FEBRUARY:
            case Calendar.MARCH:
                trimestre = 1;
                break;
            case Calendar.APRIL:
            case Calendar.MAY:
            case Calendar.JUNE:
                trimestre = 2;
                break;
            case Calendar.JULY:
            case Calendar.AUGUST:
            case Calendar.SEPTEMBER:
                trimestre = 3;
                break;
            default:
                trimestre = 4;
                break;
        }
        System.out.println("Trimestre : " + trimestre);
        if (fecha.get(Calendar.DAY_OF_WEEK) == 
            Calendar.SATURDAY ||
            fecha.get(Calendar.DAY_OF_WEEK) == 
            Calendar.SUNDAY ){
            System.out.println("Es FESTIVO!!");
        } else {
            System.out.println("Es laborable");
        }
        System.out.println("Han pasado " +
            fecha.get(Calendar.DAY_OF_YEAR) + " días");
        int dias = 365 - fecha.get(Calendar.DAY_OF_YEAR);
        if (fecha.isLeapYear(fecha.get(Calendar.YEAR))){
            dias++;
        }
        int dias = fecha.getActualMaximum(Calendar.DAY_OF_YEAR) -
                fecha.get(Calendar.DAY_OF_YEAR);
        System.out.println("Quedan " + dias + " días hasta fin de año");
        dias = fecha.getActualMaximum(Calendar.DAY_OF_MONTH) -
                fecha.get(Calendar.DAY_OF_MONTH);
        System.out.println("Quedan " + dias + " días hasta fin de mes");
        System.out.println((fecha.isLeapYear(fecha.get(Calendar.YEAR))?"Es ":"No es ")+ "bisiesto");
        if (fecha.get(Calendar.DAY_OF_WEEK)!= Calendar.MONDAY){
            fecha.add(Calendar.WEEK_OF_YEAR, 1);
            fecha.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        }
        System.out.println("Siguiente Lunes " + mostrar(fecha));*/
        int diaCumple = 29;
        int mesCumple = 07;
        GregorianCalendar hoy = new GregorianCalendar();
        GregorianCalendar cumple = new GregorianCalendar(
            hoy.get(Calendar.YEAR),
            mesCumple - 1,
            diaCumple);
        if (cumple.before(hoy)){
            cumple.add(Calendar.YEAR,1);
        }
        System.out.println("El próximo cumpleaños será el "
            + mostrar(cumple));
        hoy.set(Calendar.HOUR, 0);
        hoy.set(Calendar.HOUR_OF_DAY, 0);
        hoy.set(Calendar.MINUTE, 0);
        hoy.set(Calendar.SECOND, 0);
        hoy.set(Calendar.MILLISECOND, 0);
        /*int dias = 0;
        if (fecha.before(hoy)){
            while (fecha.before(hoy)){
                fecha.add(Calendar.DATE, 1);
                dias++;
            }
            System.out.println("Han pasado " + dias + " dias hasta hoy ");
        } else {
            while (fecha.after(hoy)){
                dias++;
                fecha.add(Calendar.DATE, -1);
            }
            System.out.println("Quedan " + dias + " hasta la fecha");
        }*/
        long ms = hoy.getTimeInMillis() - fecha.getTimeInMillis();
        int dias = (int) ( ms / (24*3600*1000));
        if (dias > 0){
            System.out.println("Faltan " + dias + " dias hasta hoy");
        } else {
            System.out.println("Quedan " + (-dias) + " dias hasta la fecha");
        }
        
    }
    
}
