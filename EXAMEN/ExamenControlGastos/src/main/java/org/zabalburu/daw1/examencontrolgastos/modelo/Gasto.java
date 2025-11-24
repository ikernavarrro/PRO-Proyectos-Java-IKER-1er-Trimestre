/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examencontrolgastos.modelo;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Iker
 */
public class Gasto {
    private Integer id;
    private TipoGasto tipoGasto;
    private Date fechaGasto;
    private Double importe;
    private Comercial comercial; // Quien ha hecho el gasto.
    //Constructores
    public Gasto() {
    }

    public Gasto(Integer id, TipoGasto tipoGasto, Date fechaGasto, Double importe, Comercial comercial) {
        this.id = id;
        this.tipoGasto = tipoGasto;
        this.fechaGasto = fechaGasto;
        this.importe = importe;
        this.comercial = comercial;
    }
    //Setters-Gettes
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoGasto getTipoGasto() {
        return tipoGasto;
    }

    public void setTipoGasto(TipoGasto tipoGasto) {
        this.tipoGasto = tipoGasto;
    }

    public Date getFechaGasto() {
        return fechaGasto;
    }

    public void setFechaGasto(Date fechaGasto) {
        this.fechaGasto = fechaGasto;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Comercial getComercial() {
        return comercial;
    }

    public void setComercial(Comercial comercial) {
        this.comercial = comercial;
    }
    //Equals, hashcode y toString
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.id);
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
        final Gasto other = (Gasto) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Gasto{" + "id=" + id + ", tipoGasto=" + tipoGasto + ", fechaGasto=" + fechaGasto + ", importe=" + importe + ", comercial=" + comercial + '}';
    }
    
    
}
