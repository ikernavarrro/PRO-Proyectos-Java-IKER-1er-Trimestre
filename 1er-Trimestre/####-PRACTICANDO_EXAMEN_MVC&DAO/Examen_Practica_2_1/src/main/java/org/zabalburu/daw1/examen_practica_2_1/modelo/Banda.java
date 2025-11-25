/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_2_1.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Iker Navarro Pérez
 */
public class Banda {

    private static int contadorBandas;
    private static final String[] GENEROS = {"Rock", "Pop", "Jazz", "Clasico", "Metal", "Reggaeton"};
    private Integer id;
    private String nombre;
    private String genero;
    private Date fechaCreacion;
    private Musico coordinador;
    private List<Musico> musicos;
    
    public Banda(String nombre, String genero, Date fechaCreacion) {
        if (!esGeneroValido(genero)) { // Comprobamos si es válido, si no lanzamos excepcion.
            throw new IllegalArgumentException("Género NO Válido " + "(" + genero + ")");
        }
        this.id = ++contadorBandas;
        this.nombre = nombre;
        this.genero = genero;
        this.fechaCreacion = fechaCreacion;
        this.coordinador = null;
        this.musicos = new ArrayList<>();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Banda other = (Banda) obj;
        return Objects.equals(this.id, other.id);
    }
    
    

    @Override
    public String toString() {
        return "Banda{" + "id=" + id + ", nombre=" + nombre + ", genero=" + genero + ", fechaCreacion=" + fechaCreacion + ", coordinador=" + coordinador + ", musicos=" + musicos + '}';
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    private boolean esGeneroValido(String genero) {
        boolean esValido = false;
        for (String string : GENEROS) { // Recorremos la matriz completa.
            if (string.equalsIgnoreCase(genero)) { // Si es igual cambiamos el valor a true, si no hay coincidendias, lo dejamos en false y finalmente devolvemos.
                    esValido = true;
                }
        }
        return esValido;
    }
    
    public static String[] getGenerosValidos() {
        return GENEROS;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public void setGenero(String genero) {
        if (!esGeneroValido(genero)) { // Comprobamos si es válido, si no lanzamos excepcion.
            throw new IllegalArgumentException("Género NO Válido " + genero);
        }
        this.genero = genero;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public List<Musico> getMusicos() {
        return musicos;
    }

    public void setMusicos(List<Musico> musicos) {
        this.musicos = musicos;
    }

    public Integer getId() {
        return id;
    }

    public void assignMusico(Musico musico) {
        musicos.add(musico);
    }
    
    public void unAssignMusico(Musico musico) {
        musicos.remove(musico);
    }

    public Musico getCoordinador() {
        return coordinador;
    }

    public void assignCoordinador(Musico coordinador) {
        this.coordinador = coordinador;
    }
    
    public void unAssignCoordinador(Musico coordinador) {
        this.coordinador = null;
    }
    
}
