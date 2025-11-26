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
    /*private int tipoEnvio;*/
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
    
    /*
    public int getTipoEnvio() {
        return tipoEnvio;
    }
    
    public void setTipoEnvio(int tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }
    */
    
    /**
     *  1 : TIPO_ENVIO_NORMAL
     *  2 : TIPO_ENVIO_EXPRESS
     *  3 : TIPO_ENVIO_24_HORAS
     *  4 : TIPO_ENVIO_8_HORAS
     * 
     * @return 
     */
    /*
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
    */
    
    public String getDescripcionTipo(int tipoEnvio) {
        String descripcionTipo = "";
        if (TIPO_ENVIO_NORMAL == tipoEnvio) {
            descripcionTipo = "Normal";
        } else if (TIPO_ENVIO_EXPRESS == tipoEnvio) {
            descripcionTipo = "Express";
        } else if (TIPO_ENVIO_24_HORAS == tipoEnvio) {
            descripcionTipo = "24 Horas";
        } else {
            descripcionTipo = "8 Horas";
        }
        return descripcionTipo;
    }
    
    /*
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
    */
    
    public int getCosteBase(int tipoEnvio) {
        int costeBase = 0;
        if (TIPO_ENVIO_NORMAL == tipoEnvio) {
            costeBase = 7;
        } else if (TIPO_ENVIO_EXPRESS == tipoEnvio) {
            costeBase = 10;
        } else if (TIPO_ENVIO_24_HORAS == tipoEnvio) {
            costeBase = 12;
        } else {
            costeBase = 15;
        }
        return costeBase;
    }
    
            
    public double getCoste200(int tipoEnvio) {
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

    public double getCostePeso(int tipoEnvio) {
        double costePeso = 0;
        if (pesoEnGramos % 200 == 0){
            costePeso = ((pesoEnGramos / 200) * this.getCoste200(tipoEnvio));
        }else{
            costePeso = (((pesoEnGramos / 200) + 1) * this.getCoste200(tipoEnvio));
        }
        return costePeso;
    }
    
    public double getCoste(int tipoEnvio){
        return this.getCosteBase(tipoEnvio) + this.getCostePeso(tipoEnvio);
    }
    
    /*
    public double getDescuento(int tipoEnvio) {
        double descuento;
        if (this.getCoste(tipoEnvio) < 50) {
            descuento = this.getCoste(tipoEnvio) * 0;
        } else if (this.getCoste(tipoEnvio) < 100) {
            descuento = this.getCoste(tipoEnvio) * 0.03;
        } else {
            descuento = this.getCoste(tipoEnvio) * 0.05;
        }
        return descuento;
    }
    
    public double getCosteConDescuento(int tipoEnvio) {
        return this.getCoste(tipoEnvio) - this.getDescuento(tipoEnvio);
    }
    */
}
