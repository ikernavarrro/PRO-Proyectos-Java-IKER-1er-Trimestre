/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_2_1.controlador;

import java.util.Date;
import org.zabalburu.daw1.examen_practica_2_1.servicio.GestorBandaServicio;
import org.zabalburu.daw1.examen_practica_2_1.vista.GestorBandaVista;

/**
 *
 * @author Iker Navarro Pérez
 */
public class GestorBandaControlador {

    public GestorBandaServicio servicio;
    public GestorBandaVista vista;

    public GestorBandaControlador() {
        this.servicio = new GestorBandaServicio();
        this.vista = new GestorBandaVista();
    }

    public void iniciar() {
        int opc;
        do {
            opc = vista.mostrarMenuPrincipal();
            switch (opc) {
                case 0:
                    vista.mostrarMensaje("Hasta Pronto!");
                    break;
                case 1:
                    gestionarBandas();
                    break;
                case 2:
                    gestionarMusicos();
                    break;
                case 3:
                    gestionarInstrumentos();
                    break;
            }
        } while (opc != 0);
    }

    //=====GESTIONAR-BANDAS===============================================================
    //---MENÚ-BANDAS------------------
    private void gestionarBandas() {
        int opc;
        do {
            opc = vista.mostrarMenuBandas();
            switch (opc) {
                case 0:
                    //SALIR
                    break;
                case 1:
                    crearBanda();
                    break;
                case 2:
                    buscarBanda();
                    break;
                case 3:
                    listarBandas();
                    break;
                case 4:
                    modificarBanda();
                    break;
                case 5:
                    eliminarBanda();
                    break;
                case 6:
                    asignarMusicoBanda();
                    break;
                case 7:
                    desAsignarMusicoBanda();
                    break;
            }
        } while (opc != 0);
    }

    //---OPCIONES-BANDAS------------------
    private void crearBanda() {
        String nombre = vista.pedirCadena("Introduzca el nombre de la Banda:");
        String genero = vista.pedirCadena("Introduzca el Género de la Banda:");
        Date fechaCreacion = vista.pedirFecha("Introduzca la Fecha de Creación de la Banda:\n Formato: dd/mm/aaaa \n (Para poner el día de hoy cancelar o x)");
        servicio.crearBanda(nombre, genero, fechaCreacion);
        vista.mostrarMensaje("Banda CREADA con ÉXITO!");
    }

    private void buscarBanda() {
        int buscar = vista.pedirEntero("Introduzca el ID de la Banda a Buscar:");
        if (servicio.obtenerBanda(buscar) != null) {
            vista.mostrarBanda(servicio.obtenerBanda(buscar));
        } else {
            vista.mostrarError("¡NO SE HA ENCONTRADO NINGUNA BANDA CON ESE ID!");
        }
    }

    private void listarBandas() {
        if (!servicio.listarBandas().isEmpty()) {
            vista.mostrarLista("Bandas", servicio.listarBandas());
        } else {
            vista.mostrarError("¡NO HAY NINGUNA BANDA!");
        }
    }

    private void modificarBanda() {
        int modificar = vista.pedirEntero("Introduzca el ID de la Banda a Modificar:");
        servicio.modificarBanda(servicio.listarBandas().get(modificar));
    }

    private void eliminarBanda() {
        int eliminar = vista.pedirEntero("Introduzca el ID de la Banda a Eliminar:");
        servicio.eliminarBanda(eliminar);
    }

    private void asignarMusicoBanda() {
        int bandaAsignar = vista.pedirEntero("Introduzca el ID de la Banda a Asignar el Músico:");
        int musicoAsignar = vista.pedirEntero("Introduzca el ID del Músico a Asignar a la Banda:");
        servicio.asignarMusicoBanda(bandaAsignar, musicoAsignar);
    }

    private void desAsignarMusicoBanda() {
        int bandaDesAsignar = vista.pedirEntero("Introduzca el ID de la Banda a Desasignar el Músico:");
        int musicoDesAsignar = vista.pedirEntero("Introduzca el ID del Músico a Desasignar de la Banda:");
        servicio.desAsignarMusicoBanda(bandaDesAsignar, musicoDesAsignar);
    }

    //=====GESTIONAR-MÚSICOS===============================================================
    //---MENÚ-MÚSICOSS------------------
    private void gestionarMusicos() {
        int opc;
        do {
            opc = vista.mostrarMenuMusicos();
            switch (opc) {
                case 0:
                    //SALIR
                    break;
                case 1:
                    crearMusico();
                    break;
                case 2:
                    buscarMusico();
                    break;
                case 3:
                    listarMusicos();
                    break;
                case 4:
                    modificarMusico();
                    break;
                case 5:
                    eliminarMusico();
                    break;
                case 6:
                    asignarInstrumentoMusico();
                    break;
                case 7:
                    desAsignarInstrumentoMusico();
                    break;
            }
        } while (opc != 0);
    }

    //---OPCIONES-MÚSICOS------------------
    private void crearMusico() {
        String nombre = vista.pedirCadena("Introduzca el nombre del Músico:");
        int edad = vista.pedirEntero("Introduzca la Edad del Músico:");
        Date fechaIncorporacion = vista.pedirFecha("Introduzca la Fecha de Incorporación a la Banda: \n Formato: dd/mm/aaaa \n (Para poner el día de hoy cancelar o x)");
        servicio.crearMusico(nombre, edad, fechaIncorporacion, null);
        vista.mostrarMensaje("Músico CREADO con ÉXITO!");
    }

    private void buscarMusico() {
        int buscar = vista.pedirEntero("Introduzca el ID del Músico a Buscar:");
        if (servicio.obtenerMusico(buscar) != null) {
            vista.mostrarMusico(servicio.obtenerMusico(buscar));
        } else {
            vista.mostrarError("¡NO SE HA ENCONTRADO NINGÚN MÚSICO CON ESE ID!");
        }
    }

    private void listarMusicos() {
        if (!servicio.listarMusicos().isEmpty()) {
            vista.mostrarLista("Músicos", servicio.listarMusicos());
        } else {
            vista.mostrarError("¡NO HAY NINGÚN MÚSICO!");
        }
    }

    private void modificarMusico() {
        int modificar = vista.pedirEntero("Introduzca el ID del Músico a Modificar:");
        servicio.modificarMusico(servicio.listarMusicos().get(modificar));
    }

    private void eliminarMusico() {
        int eliminar = vista.pedirEntero("Introduzca el ID del Músico a Eliminar:");
        servicio.eliminarMusico(eliminar);
    }
    
    private void asignarInstrumentoMusico() {
        int musicoAsignar = vista.pedirEntero("Introduzca el ID del Músico a Asignar el Instrumento:");
        int instrumentoAsignar = vista.pedirEntero("Introduzca el ID del Instrumento a Asignar al Músico:");
        servicio.asignarInstrumentoMusico(musicoAsignar, instrumentoAsignar);
    }

    private void desAsignarInstrumentoMusico() {
        int musicoDesAsignar = vista.pedirEntero("Introduzca el ID del Músico a Desasignarle el Instrumento:");
        servicio.desAsignarInstrumentoMusico(musicoDesAsignar);
    }

    //=====GESTIONAR-INSTRUMENTOS================================================================
    //---MENÚ-INSTRUMENTOS---
    private void gestionarInstrumentos() {
        int opc;
        do {
            opc = vista.mostrarMenuInstrumentos();
            switch (opc) {
                case 0:
                    //SALIR
                    break;
                case 1:
                    crearInstrumento();
                    break;
                case 2:
                    buscarInstrumento();
                    break;
                case 3:
                    listarInstrumentos();
                    break;
                case 4:
                    modificarInstrumento();
                    break;
                case 5:
                    eliminarInstrumento();
            }
        } while (opc != 0);
    }
    //---OPCIONES-INSTRUMENTOS------------

    private void crearInstrumento() {
        String nombre = vista.pedirCadena("Introduzca el nombre del Instrumento:");
        String familia = vista.pedirCadena("Introduzca la Familia del Instrumento:");
        int añoFabricacion = vista.pedirEntero("Introduzca el Año de Fabricación del Instrumento:");
        servicio.crearInstrumento(nombre, familia, añoFabricacion);
        vista.mostrarMensaje("Instrumento CREADO con ÉXITO!");
    }

    private void buscarInstrumento() {
        int buscar = vista.pedirEntero("Introduzca el ID del Instrumento a Buscar:");
        if (servicio.obtenerInstrumento(buscar) != null) {
            vista.mostrarInstrumento(servicio.obtenerInstrumento(buscar));
        } else {
            vista.mostrarError("¡NO SE HA ENCONTRADO NINGÚN INSTRUMENTO CON ESE ID!");
        }
    }

    private void listarInstrumentos() {
        if (!servicio.listarInstrumentos().isEmpty()) {
            vista.mostrarLista("Instrumentos", servicio.listarInstrumentos());
        } else {
            vista.mostrarError("¡NO HAY NINGÚN INSTRUMENTO!");
        }
    }

    private void modificarInstrumento() {
        int modificar = vista.pedirEntero("Introduzca el ID del Instrumento a Modificar:");
        servicio.modificarInstrumento(servicio.listarInstrumentos().get(modificar));
    }

    private void eliminarInstrumento() {
        int eliminar = vista.pedirEntero("Introduzca el ID del Instrumento a Eliminar:");
        servicio.eliminarInstrumento(eliminar);
    }
}
