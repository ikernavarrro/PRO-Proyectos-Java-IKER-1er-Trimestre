/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.gestionempleados.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author ichueca
 */
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
public class Proyecto {
    @EqualsAndHashCode.Include
    private Integer id;
    private Empleado responsable;
    private Date fechaInicio;
    private Date fechaFin;
    private String titulo;
    private String descripción;
    private Double coste;
    
    private List<EmpleadoProyecto> empleadosProyecto = new ArrayList();

    public Proyecto(Integer id, Empleado responsable, Date fechaInicio, Date fechaFin, String titulo, String descripción, Double coste) {
        this.id = id;
        this.responsable = responsable;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.titulo = titulo;
        this.descripción = descripción;
        this.coste = coste;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "id=" + id + ", responsable=" + responsable + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", titulo=" + titulo + ", descripci\u00f3n=" + descripción + ", coste=" + coste + '}';
    }
    
}
