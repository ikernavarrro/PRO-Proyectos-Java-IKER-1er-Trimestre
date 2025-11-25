/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.zabalburu.daw1.actividad10;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Iker Navarro Pérez
 */
public class Actividad10 {

    static String mostrar(GregorianCalendar gc) {
        int dia = gc.get(Calendar.DAY_OF_MONTH);
        int mes = gc.get(Calendar.MONTH) + 1;
        int año = gc.get(Calendar.YEAR);
        int diaSemana = gc.get(Calendar.DAY_OF_WEEK);
        String strDiaSemana = "";
        switch (diaSemana) {
            case Calendar.MONDAY ->
                strDiaSemana = "Lunes";
            case Calendar.TUESDAY ->
                strDiaSemana = "Martes";
            case Calendar.WEDNESDAY ->
                strDiaSemana = "Miércoles";
            case Calendar.THURSDAY ->
                strDiaSemana = "Jueves";
            case Calendar.FRIDAY ->
                strDiaSemana = "Viernes";
            case Calendar.SATURDAY ->
                strDiaSemana = "Sábado";
            case Calendar.SUNDAY ->
                strDiaSemana = "Domingo";
        }
        return "%02d-%02d-%04d (%s)".formatted(dia, mes, año, strDiaSemana);
    }

    public static void main(String[] args) {
        System.out.println("1. " + Actividad10.mostrar(new GregorianCalendar()));

        String fecha = JOptionPane.showInputDialog(null, "Introduzca la fecha en formato dd/mm/aaaa");
        int pr = fecha.indexOf("/");
        int ul = fecha.indexOf("/", pr + 1);
        //int ul = fecha.lastIndexOf("/");
        int dia = Integer.parseInt(fecha.substring(0, pr));
        int mes = Integer.parseInt(fecha.substring(pr + 1, ul)) - 1;
        int año = Integer.parseInt(fecha.substring(ul + 1, fecha.length()));
        GregorianCalendar gc = new GregorianCalendar();
        gc.set(año, mes, dia);
        System.out.println("2. " + Actividad10.mostrar(gc));

        gc.add(Calendar.DATE, 30);
        if (gc.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            gc.roll(Calendar.DAY_OF_WEEK, 2);
        } else if (gc.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            gc.roll(Calendar.DAY_OF_WEEK, 1);
        }
        System.out.println("3. " + Actividad10.mostrar(gc));

        if (gc.get(Calendar.DAY_OF_MONTH) <= 15) {
            gc.set(Calendar.DAY_OF_MONTH, 15);
        } else {
            gc.add(Calendar.MONTH, 1);
            gc.set(Calendar.DAY_OF_MONTH, 15);
        }
        System.out.println("4. " + Actividad10.mostrar(gc));

        int trimestre = (gc.get(Calendar.MONTH) / 3) + 1;
        boolean laborable;
        if ((gc.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) || (gc.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)) {
            laborable = false;
        } else {
            laborable = true;
        }
        int diasDesdePrincipioAño = gc.get(Calendar.DAY_OF_YEAR);
        int diasHastaFinDeAño = gc.getActualMaximum(Calendar.DAY_OF_YEAR) - gc.get(Calendar.DAY_OF_YEAR);
        int diashastaFinDeMes = gc.getActualMaximum(Calendar.DAY_OF_MONTH) - gc.get(Calendar.DAY_OF_MONTH);
        boolean bisiesto = gc.isLeapYear(gc.get(Calendar.YEAR));
        System.out.println(
                """
                Trimestre: %d
                Laborable: %s
                Días desde principio de año: %d
                Días hasta fin de año: %d
                Días hasta fin de mes: %d
                Bisiesto: %s
                """.formatted(trimestre, laborable ? "SI" : "NO", diasDesdePrincipioAño, diasHastaFinDeAño, diashastaFinDeMes, bisiesto ? "SI" : "NO"));

        if (gc.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
            int diasParaLunes = 0;
            switch (gc.get(Calendar.DAY_OF_WEEK)) {
                case Calendar.TUESDAY -> diasParaLunes = 6;
                case Calendar.WEDNESDAY -> diasParaLunes = 5;
                case Calendar.THURSDAY -> diasParaLunes = 4;
                case Calendar.FRIDAY -> diasParaLunes = 3;
                case Calendar.SATURDAY -> diasParaLunes = 2;
                case Calendar.SUNDAY -> diasParaLunes = 1;
            }
            gc.add(Calendar.DATE, diasParaLunes);
        }
        System.out.println("5. " + Actividad10.mostrar(gc));
        
        gc.set(2025, 10, 12);
        System.err.println("Próximo cumpleaños de Iker el " +  Actividad10.mostrar(gc));
        
        

    }
}
