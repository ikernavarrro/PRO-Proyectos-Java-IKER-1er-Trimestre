/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_2_1.modelo;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Iker Navarro Pérez
 */
public class Concierto {

    private static int contadorConciertos;
    private static final Double IVA = 0.21;
    private Integer id;
    private String nombre;
    private String descripcion;
    private int duracionEnHoras;
    private Date fechaYHoraInicio;
    private Date fechaYHoraFin;
    private Double precioEntrada;
    private int entradasDisponibles;
    private int entradasVendidas;
    private Double recaudacionTotal;
    private Integer idBanda;

    public Concierto(String nombre, String descripcion, int duracionEnHoras, Date fechaYHoraInicio, Double precioEntrada, int entradasDisponibles, Integer idBanda) {
        this.id = ++contadorConciertos;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracionEnHoras = duracionEnHoras;
        this.fechaYHoraInicio = fechaYHoraInicio;
        this.fechaYHoraFin = calculoFechaYHoraFin();
        this.precioEntrada = precioEntradaIVA(precioEntrada);
        this.entradasDisponibles = entradasDisponibles;
        this.entradasVendidas = 0;
        this.recaudacionTotal = 0.0;
        this.idBanda = idBanda;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final Concierto other = (Concierto) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Concierto{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", duracionEnHoras=" + duracionEnHoras + ", fechaYHoraInicio=" + fechaYHoraInicio + ", fechaYHoraFin=" + fechaYHoraFin + ", precioEntrada=" + precioEntrada + ", entradasDisponibles=" + entradasDisponibles + ", entradasVendidas=" + entradasVendidas + ", recaudacionTotal=" + recaudacionTotal + ", idBanda=" + idBanda + '}';
    }
    
    private Date calculoFechaYHoraFin() {
        //Calculamos la fecha fin.
        //Creamos un objeto de tipo calendar y le ponemos la fecha de hoy.
        Calendar calculoFechafin = Calendar.getInstance();
        //Actualizamos con la fecha de inicio.
        calculoFechafin.setTime(fechaYHoraInicio);
        //Le añadimos las horas.
        calculoFechafin.add(Calendar.HOUR_OF_DAY, duracionEnHoras);
        //Devolvemos el Calendar con el método getTime para que nos devuelva un objeto de tipo Date.
        return calculoFechafin.getTime();
    }

    private Double precioEntradaIVA(Double precio) {
        // Formula: Precio Total = Precio Base x (1 + Tipo de IVA con decimal(0,21)) (100€x1,21=121€)). 
        Double precioConIva = precio * (1 + IVA);
        return precioConIva;
    }

    public void venderEntradas(int numeroEntradas) {
        if (numeroEntradas < entradasDisponibles && numeroEntradas > 0) {
            // Solo si el número de entradas es menor a la disponibles Y mayor a 0.
            entradasDisponibles -= numeroEntradas;
            entradasVendidas += numeroEntradas;
            recaudacionTotal += numeroEntradas*precioEntrada;
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracionEnHoras() {
        return duracionEnHoras;
    }

    public void setDuracionEnHoras(int duracionEnHoras) {
        this.duracionEnHoras = duracionEnHoras;
    }

    public Date getFechaYHoraInicio() {
        return fechaYHoraInicio;
    }

    public void setFechaYHoraInicio(Date fechaYHoraInicio) {
        this.fechaYHoraInicio = fechaYHoraInicio;
    }

    public Double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(Double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public int getEntradasDisponibles() {
        return entradasDisponibles;
    }

    public void setEntradasDisponibles(int entradasDisponibles) {
        this.entradasDisponibles = entradasDisponibles;
    }

    public Integer getIdBanda() {
        return idBanda;
    }

    public void setIdBanda(Integer idBanda) {
        this.idBanda = idBanda;
    }

    public static int getContadorConciertos() {
        return contadorConciertos;
    }

    public static Double getIVA() {
        return IVA;
    }

    public Integer getId() {
        return id;
    }

    public Date getFechaYHoraFin() {
        return fechaYHoraFin;
    }

    public int getEntradasVendidas() {
        return entradasVendidas;
    }

    public Double getRecaudacionTotal() {
        return recaudacionTotal;
    }
}
