/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.gestionempleados.dao.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import org.zabalburu.daw1.gestionempleados.dao.EmpleadoDAO;
import org.zabalburu.daw1.gestionempleados.modelo.Empleado;

/**
 *
 * @author Iker
 */
public class EmpleadoList implements EmpleadoDAO {

    private static List<Empleado> empleados = new ArrayList<>();

    public EmpleadoList() {
        empleados.add(new Empleado(1, "Juan", "Pérez López",
                new GregorianCalendar(1985, Calendar.MARCH, 12).getTime(),
                new GregorianCalendar(2010, Calendar.JANUARY, 5).getTime(),
                "600111111", "Calle Mayor 1", "28001", "Madrid", "Madrid",
                "juan.perez@example.com", "1.jpg", 25000.0));

        empleados.add(new Empleado(2, "María", "García Gómez",
                new GregorianCalendar(1990, Calendar.JULY, 22).getTime(),
                new GregorianCalendar(2012, Calendar.FEBRUARY, 10).getTime(),
                "600222222", "Avenida Sol 21", "28002", "Madrid", "Madrid",
                "maria.garcia@example.com", "2.jpg", 27000.0));

        empleados.add(new Empleado(3, "Luis", "Martín Santos",
                new GregorianCalendar(1982, Calendar.JANUARY, 5).getTime(),
                new GregorianCalendar(2009, Calendar.MARCH, 15).getTime(),
                "600333333", "Calle Luna 3", "41001", "Sevilla", "Sevilla",
                "luis.martin@example.com", "3.jpg", 30000.0));

        empleados.add(new Empleado(4, "Ana", "Ruiz Fernández",
                new GregorianCalendar(1995, Calendar.SEPTEMBER, 14).getTime(),
                new GregorianCalendar(2020, Calendar.JUNE, 1).getTime(),
                "600444444", "Calle Verde 12", "46001", "Valencia", "Valencia",
                "ana.ruiz@example.com", "4.jpg", 22000.0));

        empleados.add(new Empleado(5, "Carlos", "Sánchez Mora",
                new GregorianCalendar(1988, Calendar.NOVEMBER, 30).getTime(),
                new GregorianCalendar(2015, Calendar.APRIL, 18).getTime(),
                "600555555", "Calle Río 6", "29001", "Málaga", "Málaga",
                "carlos.sanchez@example.com", "5.jpg", 28000.0));

        empleados.add(new Empleado(6, "Laura", "Díaz Torres",
                new GregorianCalendar(1993, Calendar.AUGUST, 7).getTime(),
                new GregorianCalendar(2018, Calendar.JULY, 20).getTime(),
                "600666666", "Calle Nieve 8", "08001", "Barcelona", "Barcelona",
                "laura.diaz@example.com", "6.jpg", 26000.0));

        empleados.add(new Empleado(7, "Javier", "Romero García",
                new GregorianCalendar(1980, Calendar.MAY, 25).getTime(),
                new GregorianCalendar(2005, Calendar.SEPTEMBER, 10).getTime(),
                "600777777", "Gran Vía 20", "28003", "Madrid", "Madrid",
                "javier.romero@example.com", "7.jpg", 32000.0));

        empleados.add(new Empleado(8, "Sara", "Hernández Pardo",
                new GregorianCalendar(1994, Calendar.APRIL, 1).getTime(),
                new GregorianCalendar(2019, Calendar.DECEMBER, 12).getTime(),
                "600888888", "Calle Trigo 9", "50001", "Zaragoza", "Zaragoza",
                "sara.hernandez@example.com", "8.jpg", 24000.0));

        empleados.add(new Empleado(9, "Miguel", "Navarro Ruiz",
                new GregorianCalendar(1987, Calendar.DECEMBER, 18).getTime(),
                new GregorianCalendar(2013, Calendar.MAY, 9).getTime(),
                "600999999", "Calle Olivo 10", "47001", "Valladolid", "Valladolid",
                "miguel.navarro@example.com", "9.jpg", 29000.0));

        empleados.add(new Empleado(10, "Elena", "Serrano López",
                new GregorianCalendar(1992, Calendar.OCTOBER, 3).getTime(),
                new GregorianCalendar(2017, Calendar.AUGUST, 4).getTime(),
                "601000000", "Calle Paz 15", "03001", "Alicante", "Alicante",
                "elena.serrano@example.com", "10.jpg", 25000.0));

        empleados.add(new Empleado(11, "Pedro", "López García",
                new GregorianCalendar(1981, Calendar.MARCH, 9).getTime(),
                new GregorianCalendar(2008, Calendar.JANUARY, 22).getTime(),
                "601111111", "Calle Cobre 5", "35001", "Las Palmas", "Canarias",
                "pedro.lopez@example.com", "11.jpg", 31000.0));

        empleados.add(new Empleado(12, "Lucía", "Ortega Ramos",
                new GregorianCalendar(1996, Calendar.JUNE, 11).getTime(),
                new GregorianCalendar(2021, Calendar.MARCH, 14).getTime(),
                "601222222", "Calle Sal 18", "15001", "A Coruña", "Galicia",
                "lucia.ortega@example.com", "12.jpg", 23000.0));

        empleados.add(new Empleado(13, "Diego", "Vega Martín",
                new GregorianCalendar(1989, Calendar.JULY, 27).getTime(),
                new GregorianCalendar(2014, Calendar.JUNE, 30).getTime(),
                "601333333", "Calle Azul 2", "33001", "Oviedo", "Asturias",
                "diego.vega@example.com", "13.jpg", 27000.0));

        empleados.add(new Empleado(14, "Isabel", "Campos Pérez",
                new GregorianCalendar(1991, Calendar.APRIL, 6).getTime(),
                new GregorianCalendar(2016, Calendar.SEPTEMBER, 7).getTime(),
                "601444444", "Calle Oro 7", "24001", "León", "Castilla y León",
                "isabel.campos@example.com", "14.jpg", 26000.0));

        empleados.add(new Empleado(15, "Hugo", "Santos Molina",
                new GregorianCalendar(1984, Calendar.FEBRUARY, 20).getTime(),
                new GregorianCalendar(2007, Calendar.OCTOBER, 3).getTime(),
                "601555555", "Calle Norte 4", "20001", "San Sebastián", "País Vasco",
                "hugo.santos@example.com", "15.jpg", 33000.0));

        empleados.add(new Empleado(16, "Paula", "Rey Castro",
                new GregorianCalendar(1997, Calendar.AUGUST, 15).getTime(),
                new GregorianCalendar(2022, Calendar.JANUARY, 10).getTime(),
                "601666666", "Calle Mar 14", "36201", "Vigo", "Galicia",
                "paula.rey@example.com", "16.jpg", 21000.0));

        empleados.add(new Empleado(17, "Alberto", "Soto Gil",
                new GregorianCalendar(1986, Calendar.MAY, 2).getTime(),
                new GregorianCalendar(2011, Calendar.APRIL, 25).getTime(),
                "601777777", "Calle Sur 16", "26001", "Logroño", "La Rioja",
                "alberto.soto@example.com", "17.jpg", 30000.0));

        empleados.add(new Empleado(18, "Natalia", "Iglesias Robles",
                new GregorianCalendar(1993, Calendar.JANUARY, 28).getTime(),
                new GregorianCalendar(2018, Calendar.NOVEMBER, 13).getTime(),
                "601888888", "Calle Valle 23", "49001", "Zamora", "Castilla y León",
                "natalia.iglesias@example.com", "18.jpg", 25000.0));

        empleados.add(new Empleado(19, "Sergio", "Cano Blanco",
                new GregorianCalendar(1983, Calendar.OCTOBER, 17).getTime(),
                new GregorianCalendar(2006, Calendar.MAY, 16).getTime(),
                "601999999", "Calle Roble 19", "03002", "Alicante", "Alicante",
                "sergio.cano@example.com", "19.jpg", 34000.0));

        empleados.add(new Empleado(20, "Eva", "Mendoza Sáez",
                new GregorianCalendar(1998, Calendar.DECEMBER, 9).getTime(),
                new GregorianCalendar(2023, Calendar.FEBRUARY, 20).getTime(),
                "602000000", "Calle Flor 11", "41002", "Sevilla", "Sevilla",
                "eva.mendoza@example.com", "20.jpg", 22000.0));

    }

    @Override
    public List<Empleado> getEmpleados() {
        return empleados;
    }

    @Override
    public Empleado newEmpleado(Empleado e) {
        int id = 1;
        if (!empleados.isEmpty()) {
            //id = empleados.getLast().getId()+1; //
            Integer max = empleados.get(0).getId();
            for (int i = 1; i < empleados.size(); i++) {
                if (empleados.get(i).getId() > max) {
                    max = empleados.get(i).getId();
                }
            }
            id = max + 1;
        }
        e.setId(id);
        empleados.add(e);
        return e;
    }

    @Override
    public void removeEmpleado(Integer id) {
        Empleado eliminar = new Empleado();
        eliminar.setId(id);
        empleados.remove(eliminar);
    }

    @Override
    public void modifyEmpleado(Empleado e) {
        // int pos = empleados.indexOf(e); Si no lo encuentra devuelve -1!
        int i;
        for (i = 0; i < empleados.size() && !e.equals(empleados.get(i)); i++);
        if (i < empleados.size()) {
            empleados.set(i, e);
        }
    }

    @Override
    public Empleado getEmpleado(Integer id) {
        Empleado buscar = new Empleado();
        buscar.setId(id);
        int pos = empleados.indexOf(buscar);
        if (pos != -1) {
            return empleados.get(pos);
        } else {
            return null;
        }
    }
}
