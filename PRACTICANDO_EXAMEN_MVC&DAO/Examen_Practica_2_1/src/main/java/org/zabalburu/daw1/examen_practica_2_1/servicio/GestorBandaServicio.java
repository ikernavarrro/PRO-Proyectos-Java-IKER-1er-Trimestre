/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_2_1.servicio;

import java.util.Date;
import java.util.List;
import org.zabalburu.daw1.examen_practica_2_1.dao.BandaDAO;
import org.zabalburu.daw1.examen_practica_2_1.dao.ConciertoDAO;
import org.zabalburu.daw1.examen_practica_2_1.dao.InstrumentoDAO;
import org.zabalburu.daw1.examen_practica_2_1.dao.MusicoDAO;
import org.zabalburu.daw1.examen_practica_2_1.dao.impl.BandaDAOImpl;
import org.zabalburu.daw1.examen_practica_2_1.dao.impl.ConciertoDAOImpl;
import org.zabalburu.daw1.examen_practica_2_1.dao.impl.InstrumentoDAOImpl;
import org.zabalburu.daw1.examen_practica_2_1.dao.impl.MusicoDAOImpl;
import org.zabalburu.daw1.examen_practica_2_1.modelo.Banda;
import org.zabalburu.daw1.examen_practica_2_1.modelo.Concierto;
import org.zabalburu.daw1.examen_practica_2_1.modelo.Instrumento;
import org.zabalburu.daw1.examen_practica_2_1.modelo.Musico;

/**
 *
 * @author Iker Navarro Pérez
 */
public class GestorBandaServicio {

    private BandaDAO bandaDAO;
    private MusicoDAO musicoDAO;
    private InstrumentoDAO instrumentoDAO;
    private ConciertoDAO conciertoDAO;

    public GestorBandaServicio() {
        this.instrumentoDAO = new InstrumentoDAOImpl();
        this.conciertoDAO = new ConciertoDAOImpl();
        this.musicoDAO = new MusicoDAOImpl(instrumentoDAO);
        this.bandaDAO = new BandaDAOImpl(musicoDAO); 
        
    }

    //=========================GESTIÓN-CONCIERTOS==========================
    public void crearConcierto(String nombre, String descripcion, int duracionEnHoras, Date fechaYHoraInicio, Double precioEntrada, int entradasDisponibles, Integer idBanda) {
        Concierto concierto = new Concierto(nombre, descripcion, duracionEnHoras, fechaYHoraInicio, precioEntrada, entradasDisponibles, idBanda);
        conciertoDAO.addConcierto(concierto);
    }

    public Concierto obtenerConcierto(int id) {
        return conciertoDAO.getConcierto(id);
    }

    public List<Concierto> listarConciertos() {
        return conciertoDAO.getConciertos();
    }

    public void modificarConcierto(Concierto concierto) {
        conciertoDAO.modifyConcierto(concierto);
    }

    public void eliminarConcierto(int id) {
        conciertoDAO.removeConcierto(id);
    }

    public void asignarBandaConcierto(int idConcierto, int idBanda) {
        Banda banda = bandaDAO.getBanda(idBanda);
        Concierto concierto = conciertoDAO.getConcierto(idConcierto);
        if (banda != null && concierto != null) {
            conciertoDAO.assignBanda(idConcierto, idBanda);
        }
    }

    public void desAsignarBandaConcierto(int idConcierto) {
        Concierto concierto = conciertoDAO.getConcierto(idConcierto);
        if (concierto != null) {
            conciertoDAO.unAssignBanda(idConcierto);
        }
    }

    //=========================GESTIÓN-BANDAS==============================
    public void crearBanda(String nombre, String genero, Date fechaCreacion) {
        Banda banda = new Banda(nombre, genero, fechaCreacion);
        bandaDAO.addBanda(banda);
    }

    public Banda obtenerBanda(int id) {
        return bandaDAO.getBanda(id);
    }

    public List<Banda> listarBandas() {
        return bandaDAO.getBandas();
    }

    public void modificarBanda(Banda banda) {
        bandaDAO.modifyBanda(banda);
    }

    public void eliminarBanda(int id) {
        bandaDAO.removeBanda(id);
    }

    public void asignarMusicoBanda(int idBanda, int idMusico) {
        Banda banda = bandaDAO.getBanda(idBanda);
        Musico musico = musicoDAO.getMusico(idMusico);
        if (banda != null && musico != null) {
            bandaDAO.assignMusico(idBanda, idMusico);
        }
    }

    public void desAsignarMusicoBanda(int idBanda, int idMusico) {
        Banda banda = bandaDAO.getBanda(idBanda);
        Musico musico = musicoDAO.getMusico(idMusico);
        if (banda != null && musico != null) {
            bandaDAO.unAssignMusico(idBanda, idMusico);
        }
    }

    public void asignarCoordinadorBanda(int idBanda, int idMusico) {
        Banda banda = bandaDAO.getBanda(idBanda);
        Musico musico = musicoDAO.getMusico(idMusico);
        if (banda != null && musico != null) {
            bandaDAO.assignCoordinador(idBanda, idMusico);
        }
    }

    public void desAsignarCoordinadorBanda(int idBanda) {
        Banda banda = bandaDAO.getBanda(idBanda);
        if (banda != null) {
            bandaDAO.unAssignCoordinador(idBanda);
        }
    }

    //=========================GESTIÓN-MÚSICOS=============================
    public void crearMusico(String nombre, int edad, int añosExperiencia, Instrumento instrumento) {
        Musico musico = new Musico(nombre, edad, añosExperiencia, instrumento);
        musicoDAO.addMusico(musico);
    }

    public Musico obtenerMusico(int id) {
        return musicoDAO.getMusico(id);
    }

    public List<Musico> listarMusicos() {
        return musicoDAO.getMusicos();
    }

    public void modificarMusico(Musico musico) {
        musicoDAO.modifyMusico(musico);
    }

    public void eliminarMusico(int id) {
        musicoDAO.removeMusico(id);
    }

    public void asignarInstrumentoMusico(int idMusico, int idInstrumento) {
        Instrumento instrumentoAsignar = instrumentoDAO.getInstrumento(idInstrumento);
        if (instrumentoAsignar != null) {
            musicoDAO.assignInstrumento(idMusico, idInstrumento);
        }
    }

    public void desAsignarInstrumentoMusico(int idMusico) {
        Musico musico = musicoDAO.getMusico(idMusico);
        if (musico != null) {
            musicoDAO.unAssignInstrumento(idMusico);
        }
    }

    //=========================GESTIÓN-INSTRUMENTOS========================
    public void crearInstrumento(String nombre, String familia, int añoFabricacion) {
        Instrumento instrumento = new Instrumento(nombre, familia, añoFabricacion);
        instrumentoDAO.addInstrumento(instrumento);
    }

    public Instrumento obtenerInstrumento(int id) {
        return instrumentoDAO.getInstrumento(id);
    }

    public List<Instrumento> listarInstrumentos() {
        return instrumentoDAO.getInstrumentos();
    }

    public void modificarInstrumento(Instrumento instrumento) {
        instrumentoDAO.modifyInstrumento(instrumento);
    }

    public void eliminarInstrumento(int id) {
        instrumentoDAO.removeInstrumento(id);
    }
}
