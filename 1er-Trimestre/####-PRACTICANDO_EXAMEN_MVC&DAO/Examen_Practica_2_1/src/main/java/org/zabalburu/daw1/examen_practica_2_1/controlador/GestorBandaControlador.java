/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_2_1.controlador;

import java.util.Date;
import java.util.NoSuchElementException;
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
                    gestionarConciertos();
                    break;
                case 2:
                    gestionarBandas();
                    break;
                case 3:
                    gestionarMusicos();
                    break;
                case 4:
                    gestionarInstrumentos();
                    break;
            }
        } while (opc != 0);
    }

    //=====GESTIONAR-CONCIERTOS===============================================================
    //---MENÚ-CONCIERTOS------------------
    private void gestionarConciertos() {
        int opc;
        do {
            opc = vista.mostrarMenuConciertos();
            switch (opc) {
                case 0:
                    //SALIR
                    break;
                case 1:
                    crearConcierto();
                    break;
                case 2:
                    buscarConcierto();
                    break;
                case 3:
                    listarConciertos();
                    break;
                case 4:
                    modificarConcierto();
                    break;
                case 5:
                    eliminarConcierto();
                    break;
                case 6:
                    asignarBandaConcierto();
                    break;
                case 7:
                    desAsignarBandaConcierto();
                    break;
                case 8:
                    venderEntradas();
                    break;
            }
        } while (opc != 0);
    }

    //---OPCIONES-CONCIERTOS--------------
    private void crearConcierto() {
        String nombre = vista.pedirCadena("Introduzca el Nombre del Concierto:");
        String descripcion = vista.pedirCadena("Introduzca la Descripcion del Concierto:");
        int duracionEnHoras = vista.pedirEntero("Introduzca la Duración del Concierto En Horas:");
        Date fechaYHoraInicio = vista.pedirFecha("Introduzca la Fecha de Inicio de la Banda:\n Formato: dd/mm/aaaa \n (Para poner el día de hoy cancelar o x)");
        Double precioEntrada = vista.pedirDouble("Introduzca el Precio de Entrada al Concierto:");
        int entradasDisponibles = vista.pedirEntero("Introduzca el Número de Entradas del Concierto:");
        Integer idBanda = vista.pedirEntero("Introduzca el ID de la Banda del Concierto:");
        servicio.crearConcierto(nombre, descripcion, duracionEnHoras, fechaYHoraInicio, precioEntrada, entradasDisponibles, idBanda);
        vista.mostrarMensaje("Concierto CREADO con ÉXITO!");
    }

    private void buscarConcierto() {
        int buscar = vista.pedirEntero("Introduzca el ID del Concierto a Buscar:");
        if (servicio.obtenerConcierto(buscar) != null) {
            vista.mostrarConcierto(servicio.obtenerConcierto(buscar));
        } else {
            vista.mostrarError("¡NO SE HA ENCONTRADO NINGÚN CONCIERTO CON ESE ID!");
        }
    }

    private void listarConciertos() {
        if (!servicio.listarConciertos().isEmpty()) {
            vista.mostrarLista("Conciertos", servicio.listarConciertos());
        } else {
            vista.mostrarError("¡NO HAY NINGÚN CONCIERTO!");
        }
    }

    private void modificarConcierto() {
        int modificar = vista.pedirEntero("Introduzca el ID del Concierto a Modificar:");
        try {
            servicio.modificarConcierto(servicio.listarConciertos().get(modificar));
        } catch (NoSuchElementException ex) {
            vista.mostrarError("NO se ha encontrado el CONCIERTO");
        }
    }

    private void eliminarConcierto() {
        int eliminar = vista.pedirEntero("Introduzca el ID del Concierto a Eliminar:");
        try {
            servicio.eliminarConcierto(eliminar);
        } catch (IllegalArgumentException ex) {
            vista.mostrarError("ID_CONCIERTO NO Encontrado " + "(" + eliminar + ")");
        }
    }

    private void asignarBandaConcierto() {
        int bandaAsignar = vista.pedirEntero("Introduzca el ID de la Banda a Asignar al Concierto:");
        int conciertoAsignar = vista.pedirEntero("Introduzca el ID del Concierto a Asignar a la Banda:");
        // EN NUESTRO CASO ASUMIMOS QUE EL USUARIO NO ES TONTO Y ASIGNA UN ID DE BANDA EXISTENTE
        try {
            servicio.asignarBandaConcierto(conciertoAsignar, bandaAsignar);
        } catch (IllegalArgumentException ex) {
            vista.mostrarError("ID_CONCIERTO NO Encontrado " + "(" + conciertoAsignar + ")");
        }
    }

    private void desAsignarBandaConcierto() {
        int conciertoDesAsignar = vista.pedirEntero("Introduzca el ID del Concierto a Desasignar de la Banda:");
        try {
            servicio.desAsignarBandaConcierto(conciertoDesAsignar);
        } catch (IllegalArgumentException ex) {
            vista.mostrarError("ID_CONCIERTO NO Encontrado " + "(" + conciertoDesAsignar + ")");
        }
    }

    private void venderEntradas() {
        int buscar = vista.pedirEntero("Introduzca el ID del Concierto a Vender Entradas:");
        if (servicio.obtenerConcierto(buscar) != null) {
            vista.mostrarConcierto(servicio.obtenerConcierto(buscar));
            int entradasVendidas = vista.pedirEntero("Introduzca el número de Entradas a Vender:");
            servicio.obtenerConcierto(buscar).venderEntradas(entradasVendidas);
        } else {
            vista.mostrarError("¡NO SE HA ENCONTRADO NINGÚN CONCIERTO CON ESE ID!");
        }
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
                case 8:
                    asignarCoordinador();
                    break;
                case 9:
                    desAsignarCoordinador();
                    break;
            }
        } while (opc != 0);
    }

    //---OPCIONES-BANDAS------------------
    private void crearBanda() {
        String nombre = vista.pedirCadena("Introduzca el nombre de la Banda:");
        String genero = vista.pedirCadena("Introduzca el Género de la Banda: \n Rock, Pop, Jazz, Clasico, Metal, Reggaeton");
        Date fechaCreacion = vista.pedirFecha("Introduzca la Fecha de Creación de la Banda:\n Formato: dd/mm/aaaa \n (Para poner el día de hoy cancelar o x)");
        try {
            servicio.crearBanda(nombre, genero, fechaCreacion);
            vista.mostrarMensaje("Banda CREADA con ÉXITO!");
        } catch (IllegalArgumentException ex) {
            vista.mostrarError("BANDA NO CREADA! - Género NO Válido " + "(" + genero + ")");
        }
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
        try {
            servicio.modificarBanda(servicio.listarBandas().get(modificar));
        } catch (IllegalArgumentException ex) {
            vista.mostrarError("NO se ha encontrado la BANDA");
        }
    }

    private void eliminarBanda() {
        int eliminar = vista.pedirEntero("Introduzca el ID de la Banda a Eliminar:");
        try {
            servicio.eliminarBanda(eliminar);
        } catch (IllegalArgumentException ex) {
            vista.mostrarError("ID_BANDA NO Encontrado " + "(" + eliminar + ")");
        }
    }

    private void asignarMusicoBanda() {
        int bandaAsignar = vista.pedirEntero("Introduzca el ID de la Banda a Asignar el Músico:");
        int musicoAsignar = vista.pedirEntero("Introduzca el ID del Músico a Asignar a la Banda:");
        try {
            servicio.asignarMusicoBanda(bandaAsignar, musicoAsignar);
        } catch (IllegalArgumentException ex) {
            vista.mostrarError("BANDA o MÚSICO NO Encontrado");
        }
    }

    private void desAsignarMusicoBanda() {
        int bandaDesAsignar = vista.pedirEntero("Introduzca el ID de la Banda a Desasignar el Músico:");
        int musicoDesAsignar = vista.pedirEntero("Introduzca el ID del Músico a Desasignar de la Banda:");
        try {
            servicio.desAsignarMusicoBanda(bandaDesAsignar, musicoDesAsignar);
        } catch (IllegalArgumentException ex) {
            vista.mostrarError("BANDA o MÚSICO NO Encontrado");
        }
    }

    private void asignarCoordinador() {
        int bandaAsignar = vista.pedirEntero("Introduzca el ID de la Banda a Asignar el Coordinador:");
        int musicoAsignar = vista.pedirEntero("Introduzca el ID del Coordinador(Músico) a Asignar a la Banda:");
        try {
            servicio.asignarCoordinadorBanda(bandaAsignar, musicoAsignar);
        } catch (IllegalArgumentException ex) {
            vista.mostrarError("BANDA o MÚSICO NO Encontrado");
        }
    }

    private void desAsignarCoordinador() {
        int bandaDesAsignar = vista.pedirEntero("Introduzca el ID de la Banda a Desasignar el Coordinador:");
        try {
            servicio.desAsignarCoordinadorBanda(bandaDesAsignar);
        } catch (IllegalArgumentException ex) {
            vista.mostrarError("ID_BANDA NO Encontrado " + "(" + bandaDesAsignar + ")");
        }
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
        int añosExperiencia = vista.pedirEntero("Introduzca los Años de Experiencia cómo Músico:");
        servicio.crearMusico(nombre, edad, añosExperiencia, null);
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
        try {
            servicio.modificarMusico(servicio.listarMusicos().get(modificar));
        } catch (NoSuchElementException ex) {
            vista.mostrarError("NO se ha encontrado el MÚSICO");
        }
    }

    private void eliminarMusico() {
        int eliminar = vista.pedirEntero("Introduzca el ID del Músico a Eliminar:");
        try {
            servicio.eliminarMusico(eliminar);
        } catch (IllegalArgumentException ex) {
            vista.mostrarError("ID_MÚSICO NO Encontrado " + "(" + eliminar + ")");
        }
    }

    private void asignarInstrumentoMusico() {
        int musicoAsignar = vista.pedirEntero("Introduzca el ID del Músico a Asignar el Instrumento:");
        int instrumentoAsignar = vista.pedirEntero("Introduzca el ID del Instrumento a Asignar al Músico:");
        try {
            servicio.asignarInstrumentoMusico(musicoAsignar, instrumentoAsignar);
        } catch (IllegalArgumentException ex) {
            vista.mostrarError("MÚSICO o INSTRUMENTO NO Encontrado");
        }
    }

    private void desAsignarInstrumentoMusico() {
        int musicoDesAsignar = vista.pedirEntero("Introduzca el ID del Músico a Desasignarle el Instrumento:");
        try {
            servicio.desAsignarInstrumentoMusico(musicoDesAsignar);
        } catch (IllegalArgumentException ex) {
            vista.mostrarError("ID_MÚSICO NO Encontrado " + "(" + musicoDesAsignar + ")");
        }
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
        String familia = vista.pedirCadena("Introduzca la Familia del Instrumento: \n Viento, Cuerda, Percusion, Teclado");
        int añoFabricacion = vista.pedirEntero("Introduzca el Año de Fabricación del Instrumento:");
        try {
            servicio.crearInstrumento(nombre, familia, añoFabricacion);
            vista.mostrarMensaje("Instrumento CREADO con ÉXITO!");
        } catch (IllegalArgumentException ex) {
            vista.mostrarError("INSTRUMENTO NO CREADO! - Familia NO Válida " + "(" + familia + ")");
        }
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
        try {
            servicio.modificarInstrumento(servicio.listarInstrumentos().get(modificar));
        } catch (NoSuchElementException ex) {
            vista.mostrarError("NO se ha encontrado el INSTRUMENTO");
        }
    }

    private void eliminarInstrumento() {
        int eliminar = vista.pedirEntero("Introduzca el ID del Instrumento a Eliminar:");
        try {
        servicio.eliminarInstrumento(eliminar);
        } catch (IllegalArgumentException ex) {
            vista.mostrarError("ID_INSTRUMENTO NO Encontrado " + "(" + eliminar + ")");
        }
    }
}
