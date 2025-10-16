/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.gestionflotavehiculos.modelo;

/**
 *
 * @author Iker Navarro
 */
public class Vehiculo {

    public String modelo;
    public int velocidadMaxima;
    public int consumo;
    public int capacidadTanque;

    public void mostrarInfo() {
        System.out.println("Vehículo: " + modelo + " - Velocidad Máxima: " + velocidadMaxima + "km/h - Consumo: " + consumo + "L/100km - Capacidad del tanque: " + capacidadTanque + " Litros.");
    }

    public int calcularTiempoViaje(int distancia) {
        return distancia / this.velocidadMaxima;
    }

    // He tenido que poner double porque no lo calculaba. ######################
    public double calcularConsumoViaje(int distancia) {
        return distancia * (this.consumo / 100.0);
    }

    public int calcularAutonomia() {
        return (this.capacidadTanque * 100) / this.consumo;
    }

}
