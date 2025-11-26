
package clasearrays;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Inigo
 */
public class EmpleadoMIComparable implements MIComparable<EmpleadoMIComparable>{
    private String dni;
    private String apellidos;
    private String nombre;
    private String departamento;
    private double sueldo;
    private Date fechaAlta;

    public EmpleadoMIComparable() {
    }

    public EmpleadoMIComparable(String dni, String nombre, String apellidos, String departamento, double sueldo, Date fechaAlta) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.departamento = departamento;
        this.sueldo = sueldo;
        this.fechaAlta = fechaAlta;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final EmpleadoMIComparable other = (EmpleadoMIComparable) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Empleado{" + "dni=" + dni + ", apellidos=" + apellidos + ", nombre=" + nombre + ", departamento=" + departamento + ", sueldo=" + sueldo + ", fechaAlta=" + fechaAlta + '}';
    }

    @Override
    public int comparar(EmpleadoMIComparable otro) {
        return this.apellidos.compareToIgnoreCase(otro.apellidos);
    }

    
    
}
