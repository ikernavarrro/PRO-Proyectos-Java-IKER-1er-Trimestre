/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.zabalburu.actividad15.modelo;

import java.util.Date;


public class Prestamo {
    private double cantidad;
    private double interes;
    private int años;
    private Date fecha;

    public Prestamo() {
    }

    public Prestamo(double cantidad, double interes, int años, Date fecha) {
        this.cantidad = cantidad;
        this.interes = interes;
        this.años = años;
        this.fecha = fecha;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public double pago(){
        double pago = this.cantidad * this.interes / 12;
        pago /= (1 - Math.pow(1+ this.interes / 12, -this.años*12));
        return pago;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "cantidad=" + cantidad + ", interes=" + interes + ", a\u00f1os=" + años + ", fecha=" + fecha + '}';
    }
    
}
