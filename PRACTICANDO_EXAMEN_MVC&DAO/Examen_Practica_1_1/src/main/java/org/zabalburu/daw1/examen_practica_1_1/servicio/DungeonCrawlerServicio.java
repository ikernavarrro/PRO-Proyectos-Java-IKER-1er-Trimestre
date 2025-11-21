/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_1_1.servicio;

import java.util.List;
import org.zabalburu.daw1.examen_practica_1_1.dao.MazmorraDAO;
import org.zabalburu.daw1.examen_practica_1_1.dao.MonstruoDAO;
import org.zabalburu.daw1.examen_practica_1_1.dao.TesoroDAO;
import org.zabalburu.daw1.examen_practica_1_1.dao.impl.MazmorraDAOImpl;
import org.zabalburu.daw1.examen_practica_1_1.dao.impl.MonstruoDAOImpl;
import org.zabalburu.daw1.examen_practica_1_1.dao.impl.TesoroDAOImpl;
import org.zabalburu.daw1.examen_practica_1_1.modelo.Mazmorra;
import org.zabalburu.daw1.examen_practica_1_1.modelo.Monstruo;
import org.zabalburu.daw1.examen_practica_1_1.modelo.Tesoro;

/**
 *
 * @author Iker Navarro Pérez
 */
public class DungeonCrawlerServicio {

    private MazmorraDAO mazmorraDAO;
    private MonstruoDAO monstruoDAO;
    private TesoroDAO tesoroDAO;

    public DungeonCrawlerServicio() {
        mazmorraDAO = new MazmorraDAOImpl();
        monstruoDAO = new MonstruoDAOImpl();
        tesoroDAO = new TesoroDAOImpl();
    }

    //=======Mazmorra=========
    public void crearMazmorra(String nombre, Integer dificultad) {
        Mazmorra m = new Mazmorra(nombre, dificultad);
        mazmorraDAO.addMazmorra(m);
    }

    public Mazmorra obtenerMazmorra(String nombre) {
        return mazmorraDAO.getNombre(nombre);
    }

    public List<Mazmorra> listarMazmorras() {
        return mazmorraDAO.getMazmorras();
    }

    public void actualizarMazmorra(Mazmorra mazmorra) {
        mazmorraDAO.modifyMazmorra(mazmorra);
    }

    public void eliminarMazmorra(String nombre) {
        Mazmorra m = mazmorraDAO.getNombre(nombre);
        if (m != null) {
            mazmorraDAO.removeMazmorra(m);
        }
    }

    //=======Monstruos========
    public void crearMonstruo(String nombre, Integer vida, Integer ataque, Integer dificultad, Tesoro tesoro) {
        Monstruo m = new Monstruo(nombre, vida, ataque, dificultad, tesoro);
        monstruoDAO.addMonstruo(m);
    }

    public Monstruo obtenerMonstruo(String nombre) {
        return monstruoDAO.getNombre(nombre);
    }

    public List<Monstruo> listarMonstruos() {
        return monstruoDAO.getMonstruos();
    }

    public void agregarMonstruoMazmorra(String nombreMazmorra, Monstruo monstruo) {
        Mazmorra m = mazmorraDAO.getNombre(nombreMazmorra);
        if (m != null) {
            m.addMonstruo(monstruo);
        }
    }

    public void eliminarMonstruo(String nombre) {
        Monstruo m = monstruoDAO.getNombre(nombre);
        if (m != null) {
            monstruoDAO.removeMonstruo(m);
        }
    }

    //=======Tesoros==========
    public void crearTesoro(String nombre, Integer valor, String rareza) {
        Tesoro t = new Tesoro(nombre, valor, rareza);
        tesoroDAO.addTesoro(t);
    }

    public Tesoro obtenerTesoro(String nombre) {
        return tesoroDAO.getNombre(nombre);
    }

    public List<Tesoro> listarTesoros() {
        return tesoroDAO.getTesoros();
    }

    public void eliminarTesoro(String nombre) {
        Tesoro t = tesoroDAO.getNombre(nombre);
        if (t != null) {
            tesoroDAO.removeTesoro(t);
        }
    }
}
