/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.zabalburu.daw1.actividad10;

import com.sun.source.tree.SwitchExpressionTree;
import java.util.Calendar;
import java.util.GregorianCalendar;

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
            case Calendar.MONDAY -> strDiaSemana = "Lunes";
            case Calendar.TUESDAY -> strDiaSemana = "Martes";
            case Calendar.WEDNESDAY -> strDiaSemana = "Miércoles";
            case Calendar.THURSDAY -> strDiaSemana = "Jueves";
            case Calendar.FRIDAY -> strDiaSemana = "Viernes";
            case Calendar.SATURDAY -> strDiaSemana = "Sábado";
            case Calendar.SUNDAY -> strDiaSemana = "Domingo";
        }   
        return "%02d-%02d-%04d (%s)".formatted(dia, mes, año, strDiaSemana);
    }

    public static void main(String[] args) {
        System.out.println(Actividad10.mostrar(new GregorianCalendar()));
    }
}
