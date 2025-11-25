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
public class ClaseArrays {

    private static int numEmpleados;
    private static NumberFormat nfMoneda = NumberFormat.getCurrencyInstance();
    private static DateFormat dfCorto = DateFormat.getDateInstance(DateFormat.SHORT);
    private static Empleado[] empleados = new Empleado[10];
    
    
    private static void crearEmpleados() {
        empleados[0] = new Empleado("11111111A", "Juan", "López", "Compras", 1234.45, new GregorianCalendar(2000, Calendar.JANUARY, 15).getTime());
        empleados[1] = new Empleado("44444444A", "Ana", "Sanz", "Administración", 1350.78, new GregorianCalendar(2000, Calendar.MARCH, 12).getTime());
        empleados[2] = new Empleado("22222222A", "Carlos", "Ginés", "Producción", 1985.5, new GregorianCalendar(2000, Calendar.APRIL, 1).getTime());
        empleados[3] = new Empleado("55555555A", "Miguel", "Andrés", "Compras", 1234.45, new GregorianCalendar(2001, Calendar.JANUARY, 4).getTime());
        empleados[4] = new Empleado("77777777A", "Luisa", "Jiménez", "Administración", 1350.78, new GregorianCalendar(2001, Calendar.JUNE, 4).getTime());
        empleados[5] = new Empleado("89898989A", "Eva", "Saez", "Compras", 1350.78, new GregorianCalendar(2005, Calendar.JUNE, 25).getTime());
        empleados[6] = new Empleado("00000000A", "Simón", "Andrés", "Producción", 1985.5, new GregorianCalendar(2010, Calendar.DECEMBER, 1).getTime());
        empleados[7] = new Empleado("66666666A", "Enrique", "Pérez", "Administración", 1234.45, new GregorianCalendar(2010, Calendar.FEBRUARY, 1).getTime());
        empleados[8] = new Empleado("01010101A", "María", "López", "Dirección", 2300.75, new GregorianCalendar(2015, Calendar.APRIL, 10).getTime());
        empleados[9] = new Empleado("02020202A", "Miren", "Sabina", "Producción", 1400.45, new GregorianCalendar(2020, Calendar.JANUARY, 5).getTime());
        numEmpleados = 10;
    }
    
    private static Integer[] numeros = { 4, 13, 21, 5, 12, 9};
    private static String[] nombres = { "Juan","Carlos", "Ana", "Pedro"};
    
    public static void main(String[] args) {
        crearEmpleados();
        listar(empleados);
        listar(numeros);
        listar(nombres);
        System.out.println("-------------");
        Arrays.sort(numeros);
        listar(numeros);
        System.out.println("-------------");
        Arrays.sort(nombres);
        listar(nombres);
        System.out.println("-------------");
        Arrays.sort(empleados);
        listar(empleados);
    }
    
    private static void listar(Object[] matriz){
        for(Object o : matriz){
            System.out.println(o);
        }
    }
    
}
