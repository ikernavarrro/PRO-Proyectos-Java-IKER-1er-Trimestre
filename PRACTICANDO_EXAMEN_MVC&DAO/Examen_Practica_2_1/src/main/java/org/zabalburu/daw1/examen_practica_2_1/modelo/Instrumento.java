/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_2_1.modelo;

import java.util.Objects;

/**
 *
 * @author Iker Navarro Pérez
 */
public class Instrumento {

    private static int contadorInstrumentos;
    private static final String[] FAMILIAS = {"Viento", "Cuerda", "Percusión", "Teclado"};
    private Integer id;
    private String nombre;
    private String familia;
    private int añoFabricacion;

    public Instrumento(String nombre, String familia, int añoFabricacion) {
        if (!esFamiliaValido(familia)) { // Comprobamos si es válido, si no lanzamos excepcion.
            throw new IllegalArgumentException("Familia NO Válida " + "(" + familia + ")");
        }
        this.id = ++contadorInstrumentos;
        this.nombre = nombre;
        this.familia = familia;
        this.añoFabricacion = añoFabricacion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
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
        final Instrumento other = (Instrumento) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Instrumento{" + "id=" + id + ", nombre=" + nombre + ", familia=" + familia + ", a\u00f1oFabricacion=" + añoFabricacion + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private boolean esFamiliaValido(String familia) {
        boolean esValido = false;
        for (String string : FAMILIAS) { // Recorremos la matriz completa.
            if (string.equalsIgnoreCase(familia)) { // Si es igual cambiamos el valor a true, si no hay coincidendias, lo dejamos en false y finalmente devolvemos.
                    esValido = true;
                }
        }
        return esValido;
    }
    
    public static String[] getFamiliasValidas() {
        return FAMILIAS;
    }
    
    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public static int getContadorInstrumentos() {
        return contadorInstrumentos;
    }

    public Integer getId() {
        return id;
    }

}
