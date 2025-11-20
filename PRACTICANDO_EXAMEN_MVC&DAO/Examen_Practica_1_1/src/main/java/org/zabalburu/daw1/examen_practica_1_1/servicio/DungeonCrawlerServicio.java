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

    }

    public Mazmorra obtenerMazmorra(String nombre) {

    }

    public List<Mazmorra> listarMazmorras() {

    }

    public void actualizarMazmorra(Mazmorra mazmorra) {

    }

    public void eliminarMazmorra(String nombre) {

    }

    //=======Monstruos========
    public void crearMonstruo(String nombre, Integer vida, Integer ataque, Integer dificultad, Tesoro tesoro) {

    }

    public Monstruo obtenerMonstruo(String nombre) {

    }
    
    public List<Monstruo> listarMonstruo() {
    
    }
    
    public void agregarMonstruoMazmorra(String nombreMazmorra, Monstruo monstruo) {
    
    }

    //=======Tesoros==========
    
    public void crearTesoro(String nombre, Integer valor, String rareza) {
        
    }
    
    public Tesoro obtenerTesoro(String nombre) {
    
    }
    
    public List<Tesoro> listarTesoros(){
    
    }
}
