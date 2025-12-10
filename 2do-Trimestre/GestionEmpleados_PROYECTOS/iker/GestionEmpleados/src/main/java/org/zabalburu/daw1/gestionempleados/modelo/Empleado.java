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
 * @author Iker
 */

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {
    @EqualsAndHashCode.Include
    private Integer id;
    private String nombre;
    private String apellidos;
    private Date fechaNacimiento;
    private Date fechaAlta;
    private String telefono;
    private String direccion;
    private String codifoPostal;
    private String poblacion;
    private String provincia;
    private String email;
    private String foto;
    private Double sueldo;
    private List<Proyecto> proyectosResponsable = new ArrayList<Proyecto>();
    private List<EmpleadoProyecto> proyectosTrabaja = new ArrayList<EmpleadoProyecto>();
    
    public Empleado(Integer id, String nombre, String apellidos, Date fechaNacimiento, Date fechaAlta, String telefono, String direccion, String codifoPostal, String poblacion, String provincia, String email, String foto, Double sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaAlta = fechaAlta;
        this.telefono = telefono;
        this.direccion = direccion;
        this.codifoPostal = codifoPostal;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.email = email;
        this.foto = foto;
        this.sueldo = sueldo;
    }
    
    
    
}
