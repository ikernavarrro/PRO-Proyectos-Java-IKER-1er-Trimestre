/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.gestionempleados.modelo;

import java.util.Date;
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
    
}
