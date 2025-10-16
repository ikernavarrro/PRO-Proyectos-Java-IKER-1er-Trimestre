/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.app_gestionentradasgranadafest.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Focus Mode
 */
public class Entradas {

    public String nombreGrupo;
    public int entradasGeneralesDisponibles;
    public int entradasVIPDisponibles;
    public int entradasVIPPlusDisponibles;
    public int entradasGeneralesVendidas;
    public int entradasVIPVendidas;
    public int entradasVIPPlusVendidas;

    public static final double PRECIO_ENTRADA_GENERAL = 37.99;
    public static final double PRECIO_ENTRADA_VIP = 120.99;
    public static final double PRECIO_ENTRADA_VIP_PLUS = 189.99;

    public double comprarEntradasGenerales(int cantidad) {
        if (cantidad <= this.entradasGeneralesDisponibles) {
            this.entradasGeneralesVendidas += cantidad;
            this.entradasGeneralesDisponibles -= cantidad;
            return cantidad * Entradas.PRECIO_ENTRADA_GENERAL;
        } else {
            return -1.0;
        }
    }

    public double comprarEntradasVIP(int cantidad) {
        if (cantidad <= this.entradasVIPDisponibles) {
            this.entradasVIPVendidas += cantidad;
            this.entradasVIPDisponibles -= cantidad;
            return cantidad * Entradas.PRECIO_ENTRADA_VIP;
        } else {
            return -1.0;
        }
    }

    public double comprarEntradasVIPPlus(int cantidad) {
        if (cantidad <= this.entradasVIPPlusDisponibles) {
            this.entradasVIPPlusVendidas += cantidad;
            this.entradasVIPPlusDisponibles -= cantidad;
            return cantidad * Entradas.PRECIO_ENTRADA_VIP_PLUS;
        } else {
            return -1.0;
        }
    }

    public double totalImporteEntradasDisponibles() {
        return (this.entradasGeneralesDisponibles * Entradas.PRECIO_ENTRADA_GENERAL) + (this.entradasVIPDisponibles * Entradas.PRECIO_ENTRADA_VIP) + (this.entradasVIPPlusDisponibles * Entradas.PRECIO_ENTRADA_VIP_PLUS);
    }

    public int totalNumeroEntradasDisponibles() {
        return (this.entradasGeneralesDisponibles) + (this.entradasVIPDisponibles) + (this.entradasVIPPlusDisponibles);
    }

    public double totalImporteEntradasVendidas() {
        return (this.entradasGeneralesVendidas * Entradas.PRECIO_ENTRADA_GENERAL) + (this.entradasVIPVendidas * Entradas.PRECIO_ENTRADA_VIP) + (this.entradasVIPPlusVendidas * Entradas.PRECIO_ENTRADA_VIP_PLUS);
    }

    public int totalNumeroEntradasVendidas() {
        return (this.entradasGeneralesVendidas) + (this.entradasVIPVendidas) + (this.entradasVIPPlusVendidas);
    }

    public double porcentajeEntradasVendidas() {
        return ((double) this.totalNumeroEntradasVendidas() / ((double) this.totalNumeroEntradasVendidas() + (double) this.totalNumeroEntradasDisponibles())) * 100;
    }
    
    public double porcentajeEntradasDisponibles(){
        return 100.0 - this.porcentajeEntradasVendidas();
    }
}
