/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasearrays;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Inigo
 */
public class ClaseArraysMIComparable {

    private static int numEmpleadoMIComparables;
    private static NumberFormat nfMoneda = NumberFormat.getCurrencyInstance();
    private static DateFormat dfCorto = DateFormat.getDateInstance(DateFormat.SHORT);
    private static EmpleadoMIComparable[] empleados = new EmpleadoMIComparable[10];
    
    private static void crearEmpleadoMIComparables() {
        empleados[0] = new EmpleadoMIComparable("11111111A", "Juan", "López", "Compras", 1234.45, new GregorianCalendar(2000, Calendar.JANUARY, 15).getTime());
        empleados[1] = new EmpleadoMIComparable("44444444A", "Ana", "Sanz", "Administración", 1350.78, new GregorianCalendar(2000, Calendar.MARCH, 12).getTime());
        empleados[2] = new EmpleadoMIComparable("22222222A", "Carlos", "Ginés", "Producción", 1985.5, new GregorianCalendar(2000, Calendar.APRIL, 1).getTime());
        empleados[3] = new EmpleadoMIComparable("55555555A", "Miguel", "Andrés", "Compras", 1234.45, new GregorianCalendar(2001, Calendar.JANUARY, 4).getTime());
        empleados[4] = new EmpleadoMIComparable("77777777A", "Luisa", "Jiménez", "Administración", 1350.78, new GregorianCalendar(2001, Calendar.JUNE, 4).getTime());
        empleados[5] = new EmpleadoMIComparable("89898989A", "Eva", "Saez", "Compras", 1350.78, new GregorianCalendar(2005, Calendar.JUNE, 25).getTime());
        empleados[6] = new EmpleadoMIComparable("00000000A", "Simón", "Andrés", "Producción", 1985.5, new GregorianCalendar(2010, Calendar.DECEMBER, 1).getTime());
        empleados[7] = new EmpleadoMIComparable("66666666A", "Enrique", "Pérez", "Administración", 1234.45, new GregorianCalendar(2010, Calendar.FEBRUARY, 1).getTime());
        empleados[8] = new EmpleadoMIComparable("01010101A", "María", "López", "Dirección", 2300.75, new GregorianCalendar(2015, Calendar.APRIL, 10).getTime());
        empleados[9] = new EmpleadoMIComparable("02020202A", "Miren", "Sabina", "Producción", 1400.45, new GregorianCalendar(2020, Calendar.JANUARY, 5).getTime());
        numEmpleadoMIComparables = 10;
    }
    
    private static Integer[] numeros = { 4, 13, 21, 5, 12, 9};
    private static String[] nombres = { "Juan","Carlos", "Ana", "Pedro"};
    
    public static void main(String[] args) {
        crearEmpleadoMIComparables();
        MiClaseArrays.ordenarAsc(empleados);
        listar(empleados);
        System.out.println("=============================");
        MiClaseArrays.ordenarDesc(empleados);
        listar(empleados);
    }
    
    private static void listar(Object[] matriz){
        for(Object o : matriz){
            System.out.println(o);
        }
    }
    
}
