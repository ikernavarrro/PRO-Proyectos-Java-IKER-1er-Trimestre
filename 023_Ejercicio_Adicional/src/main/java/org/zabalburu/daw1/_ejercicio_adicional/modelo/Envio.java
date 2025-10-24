/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1._ejercicio_adicional.modelo;

/**
 *
 * @author Iker Navarro Pérez
 */
public class Envio {

    private String destinatario;
    private String remitente;
    private int pesoEnGramos;
    private int tipoEnvio;
    final static int TIPO_ENVIO_NORMAL = 1;
    final static int TIPO_ENVIO_EXPRESS = 2;
    final static int TIPO_ENVIO_24_HORAS = 3;
    final static int TIPO_ENVIO_8_HORAS = 4;

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public int getPesoEnGramos() {
        return pesoEnGramos;
    }

    public void setPesoEnGramos(int pesoEnGramos) {
        this.pesoEnGramos = pesoEnGramos;
    }

    public int getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(int tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public String getDescripcionTipo() {
        String descripcionTipo = "";
        if (tipoEnvio >= 1 && tipoEnvio <= 4) {
            descripcionTipo = switch (tipoEnvio) {
                case TIPO_ENVIO_NORMAL ->
                    "Normal";
                case TIPO_ENVIO_EXPRESS ->
                    "Express";
                case TIPO_ENVIO_24_HORAS ->
                    "24 Horas";
                default ->
                    "8 Horas";
            };
        }
        return descripcionTipo;
    }

    public double getCosteBase() {
        double costeBase = 0;
        if (tipoEnvio >= 1 && tipoEnvio <= 4) {
            costeBase = switch (tipoEnvio) {
                case TIPO_ENVIO_NORMAL -> 7;
                case TIPO_ENVIO_EXPRESS -> 10;
                case TIPO_ENVIO_24_HORAS -> 12;
                default -> 15;
            };
        }
        return costeBase;
    }

    public double getCoste200() {
        double coste200 = 0;
        if (tipoEnvio >= 1 && tipoEnvio <= 4) {
            coste200 = switch (tipoEnvio) {
                case TIPO_ENVIO_NORMAL -> 0.5;
                case TIPO_ENVIO_EXPRESS -> 0.7;
                case TIPO_ENVIO_24_HORAS -> 0.8;
                default -> 0.9;
            };
        }
        return coste200;
    }

    public double getCostePeso() {
        double costePeso = 0;
        if (pesoEnGramos % 200 == 0){
            costePeso = ((pesoEnGramos / 200) * this.getCoste200());
        }else{
            costePeso = (((pesoEnGramos / 200) + 1) * this.getCoste200());
        }
        return costePeso;
    }
    
    public double getCoste(){
        return this.getCosteBase() + this.getCostePeso();
    }
    
    public double getDescuento() {
        double descuento;
        if (this.getCoste() < 50) {
            descuento = this.getCoste() * 0;
        } else if (this.getCoste() >= 50 && this.getCoste() < 100) {
            descuento = this.getCoste() * 0.03;
        } else {
            descuento = this.getCoste() * 0.05;
        }
        return descuento;
    }
    
    public double getCosteConDescuento() {
        return this.getCoste() + this.getDescuento();
    }
    
}
