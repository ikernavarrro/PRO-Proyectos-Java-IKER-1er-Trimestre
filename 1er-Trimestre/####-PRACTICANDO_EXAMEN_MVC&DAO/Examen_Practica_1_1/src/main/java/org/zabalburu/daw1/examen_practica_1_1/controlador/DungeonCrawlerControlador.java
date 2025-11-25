/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_1_1.controlador;

import org.zabalburu.daw1.examen_practica_1_1.modelo.Mazmorra;
import org.zabalburu.daw1.examen_practica_1_1.servicio.DungeonCrawlerServicio;
import org.zabalburu.daw1.examen_practica_1_1.vista.DungeonCrawlerVista;

/**
 *
 * @author Iker Navarro Pérez
 */
public class DungeonCrawlerControlador {

    private DungeonCrawlerVista vista;
    private DungeonCrawlerServicio servicio;

    public DungeonCrawlerControlador() {
        vista = new DungeonCrawlerVista();
        servicio = new DungeonCrawlerServicio();
    }

    public void iniciar() {
        int opc;
        do {
            opc = vista.mostrarMenuPrincipal();

            switch (opc) {
                case -1:
                    vista.mostrarMensaje("Desarrollado Por Iker Navarro Pérez - ;P");
                    break;
                case 1:
                    gestionarMazmorras();
                    break;
                case 2:
                    gestionarMonstruos();
                    break;
                case 3:
                    gestionarTesoros();
                    break;
            }
        } while (opc != -1);
    }

    private void gestionarMazmorras() {
        int opc;
        do {
            opc = vista.mostrarMenuMazmorras();

            switch (opc) {
                case -1:
                    // No hacemos nada.
                    break;
                case 1:
                    String nombre = vista.pedirString("Introduzca un nombre para la Mazmorra:");
                    int nivelDificultad = vista.pedirInt("Introduzca el Nivel de Dificultad de la Mazmorra:");
                    servicio.crearMazmorra(nombre, nivelDificultad);
                    vista.mostrarMensaje("Mazmorra CREADA con ÉXITO: %s".formatted(servicio.obtenerMazmorra(nombre).toString()));
                    break;
                case 2:
                    String buscar = vista.pedirString("Introduzca un nombre para buscar Mazmorra:");
                    vista.mostrarMazmorra(servicio.obtenerMazmorra(buscar));
                    break;
                case 3:
                    vista.mostrarLista(servicio.listarMazmorras());
                    break;
                case 4:
                    String eliminar = vista.pedirString("Introduzca el nombre de la Mazmorra a ELIMINAR:");
                    if (servicio.obtenerMazmorra(eliminar) != null) {
                        servicio.eliminarMazmorra(eliminar);
                        vista.mostrarMensaje("Mazmorra ELIMINADA con ÉXITO");
                    } else {
                        vista.mostrarError("NO SE HA ENCONTRADO LA MAZMORRA A ELIMINAR");
                    }
            }
        } while (opc != -1);
    }

    private void gestionarMonstruos() {
        int opc;
        do {
            opc = vista.mostrarMenuMonstruos();

            switch (opc) {
                case -1:
                    // No hacemos nada.
                    break;
                case 1:
                    String nombre = vista.pedirString("Introduzca un nombre para el Monstruo:");
                    int dificultad = vista.pedirInt("Introduzca la Dificultad del Monstruo:");
                    int vida = vista.pedirInt("Introduzca la Vida del Monstruo:");
                    int ataque = vista.pedirInt("Introduzca el Ataque del Monstruo:");
                    String nombreTesoro = vista.pedirString("Introduzca el Tesoro del Monstruo: \n + %s".formatted(servicio.listarTesoros().toString()));
                    servicio.crearMonstruo(nombre, vida, ataque, dificultad, servicio.obtenerTesoro(nombreTesoro));
                    vista.mostrarMensaje("Monstruo CREADO con ÉXITO: %s".formatted(servicio.obtenerMonstruo(nombre).toString()));
                    break;
                case 2:
                    String buscar = vista.pedirString("Introduzca un nombre para buscar el Monstruo:");
                    vista.mostrarMonstruo(servicio.obtenerMonstruo(buscar));
                    break;
                case 3:
                    vista.mostrarLista(servicio.listarMonstruos());
                    break;
                case 4:
                    String eliminar = vista.pedirString("Introduzca el nombre del Monstruo a ELIMINAR:");
                    if (servicio.obtenerMonstruo(eliminar) != null) {
                        servicio.eliminarMonstruo(eliminar);
                        vista.mostrarMensaje("Monstruo ELIMINADO con ÉXITO");
                    } else {
                        vista.mostrarError("NO SE HA ENCONTRADO EL MONSTRUO A ELIMINAR");
                    }
                    break;
            }
        } while (opc != -1);
    }

    private void gestionarTesoros() {
        int opc;
        do {
            opc = vista.mostrarMenuTesoros();

            switch (opc) {
                case -1:
                    // No hacemos nada.
                    break;
                case 1:
                    String nombre = vista.pedirString("Introduzca un nombre para el Tesoro:");
                    int valor = vista.pedirInt("Introduzca el Valor del Tesoro:");
                    String rareza = vista.pedirString("Introduzca una Rareza para el Tesoro:");
                    servicio.crearTesoro(nombre, valor, rareza);
                    vista.mostrarMensaje("Tesoro CREADO con ÉXITO: %s".formatted(servicio.obtenerTesoro(nombre).toString()));
                    break;
                case 2:
                    String buscar = vista.pedirString("Introduzca un nombre para buscar el Tesoro:");
                    vista.mostrarTesoro(servicio.obtenerTesoro(buscar));
                    break;
                case 3:
                    vista.mostrarLista(servicio.listarTesoros());
                    break;
                case 4:
                    String eliminar = vista.pedirString("Introduzca el nombre del Tesoro a ELIMINAR:");
                    if (servicio.obtenerTesoro(eliminar) != null) {
                        servicio.eliminarTesoro(eliminar);
                        vista.mostrarMensaje("Tesoro ELIMINADO con ÉXITO");
                    } else {
                        vista.mostrarError("NO SE HA ENCONTRADO EL TESORO A ELIMINAR");
                    }
                    break;
            }
        } while (opc != -1);
    }

}
