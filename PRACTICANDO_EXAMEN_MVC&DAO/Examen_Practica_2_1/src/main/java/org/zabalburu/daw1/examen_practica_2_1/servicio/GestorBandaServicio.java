/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_2_1.servicio;

import java.util.Date;
import java.util.List;
import org.zabalburu.daw1.examen_practica_2_1.dao.BandaDAO;
import org.zabalburu.daw1.examen_practica_2_1.dao.InstrumentoDAO;
import org.zabalburu.daw1.examen_practica_2_1.dao.MusicoDAO;
import org.zabalburu.daw1.examen_practica_2_1.dao.impl.BandaDAOImpl;
import org.zabalburu.daw1.examen_practica_2_1.dao.impl.InstrumentoDAOImpl;
import org.zabalburu.daw1.examen_practica_2_1.dao.impl.MusicoDAOImpl;
import org.zabalburu.daw1.examen_practica_2_1.modelo.Banda;
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

    public GestorBandaServicio() {
        this.bandaDAO = new BandaDAOImpl();
        this.musicoDAO = new MusicoDAOImpl();
        this.instrumentoDAO = new InstrumentoDAOImpl();
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
        Musico musicoAsignar = musicoDAO.getMusico(idMusico);
        if (musicoAsignar != null) {
            bandaDAO.assignMusico(idBanda, musicoAsignar);
        }
    }

    public void desAsignarMusicoBanda(int idBanda, int idMusico) {
        Musico musicoDesAsignar = musicoDAO.getMusico(idMusico);
        if (musicoDesAsignar != null) {
            bandaDAO.unAssignMusico(idBanda, musicoDesAsignar);
        }
    }

    //=========================GESTIÓN-MÚSICOS=============================
    public void crearMusico(String nombre, int edad, Date fechaIncorporacion, Instrumento instrumento) {
        Musico musico = new Musico(nombre, edad, fechaIncorporacion, instrumento);
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
            musicoDAO.assignInstrumento(idMusico, instrumentoAsignar);
        }
    }

    public void desAsignarInstrumentoMusico(int idMusico) {
        musicoDAO.unAssignInstrumento(idMusico);
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
    
    public void modificarInstrumento (Instrumento instrumento) {
        instrumentoDAO.modifyInstrumento(instrumento);
    }
    
    public void eliminarInstrumento(int id) {
        instrumentoDAO.removeInstrumento(id);
    }
}
