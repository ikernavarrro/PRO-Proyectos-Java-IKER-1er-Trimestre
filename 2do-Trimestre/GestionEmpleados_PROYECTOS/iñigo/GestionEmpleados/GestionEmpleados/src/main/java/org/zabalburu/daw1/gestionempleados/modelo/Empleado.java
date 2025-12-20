/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.gestionempleados.modelo;

import java.util.AbstractList;
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
public class Empleado {
    @EqualsAndHashCode.Include
    private Integer id;
    private String nombre;
    private String apellidos;
    private Date fechaNacimiento;
    private Date fechaAlta;
    private String telefono;
    private String direccion;
    private String codigoPostal;
    private String poblacion;
    private String provincia;
    private String email;
    private String foto;
    private Double sueldo;
    private int hijos;
    
    private List<Proyecto> proyectosResponsable = new ArrayList<>();
    private List<EmpleadoProyecto> proyectosTrabaja = new ArrayList<EmpleadoProyecto>();

    public Empleado(Integer id, String nombre, String apellidos, Date fechaNacimiento, Date fechaAlta, String telefono, String direccion, String codigoPostal, String poblacion, String provincia, String email, String foto, Double sueldo, int hijos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaAlta = fechaAlta;
        this.telefono = telefono;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.email = email;
        this.foto = foto;
        this.sueldo = sueldo;
        this.hijos = hijos;
    }
    
    
    
    public double getPorcIrpf(){
        double porcIrpf = 0;
        switch (this.hijos) {
            case 0 -> {
                if (this.getSueldo() < 1350){
                    porcIrpf = 13;
                } else if (this.getSueldo() < 1450){
                    porcIrpf =14;
                } else {
                    porcIrpf = 17;
                }
            }
            case 1 -> {
                if (this.getSueldo() < 1350){
                    porcIrpf = 12.5;
                } else if (this.getSueldo() < 1450){
                    porcIrpf = 13;
                } else {
                    porcIrpf = 16;
                }
            }
            case 2 -> {
                if (this.getSueldo() < 1350){
                    porcIrpf = 11;
                } else if (this.getSueldo() < 1450){
                    porcIrpf = 12;
                } else {
                    porcIrpf = 15;
                }
            }
            default -> {
                if (this.getSueldo() < 1350){
                    porcIrpf = 10;
                } else if (this.getSueldo() < 1450){
                    porcIrpf = 11.5;
                } else {
                    porcIrpf = 14.5;
                }
            }
        }
        return porcIrpf / 100;
    }
    
    public double getImporteIrpf(){
        return this.getPorcIrpf() * this.getSueldo();
    }
    
    public double getSueldoNeto(){
        return this.getSueldo() - this.getImporteIrpf();
    }

    @Override
    public String toString() {
        //return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento + ", fechaAlta=" + fechaAlta + ", telefono=" + telefono + ", direccion=" + direccion + ", codigoPostal=" + codigoPostal + ", poblacion=" + poblacion + ", provincia=" + provincia + ", email=" + email + ", foto=" + foto + ", sueldo=" + sueldo + ", hijos=" + hijos + '}';
        return "%s, %s".formatted(apellidos, nombre);
    }
    
}
