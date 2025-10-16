/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1.gestionflotavehiculos;

import org.zabalburu.daw1.gestionflotavehiculos.modelo.Vehiculo;

/**
 *
 * @author Iker Navarro
 */
public class GestionFlotaVehiculos {

    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.modelo = "Porsche Cayenne TurboGT";
        vehiculo1.velocidadMaxima = 305;
        vehiculo1.consumo = 14;
        vehiculo1.capacidadTanque = 90;
        vehiculo1.mostrarInfo();
        
        Vehiculo vehiculo2 = new Vehiculo();
        vehiculo2.modelo = "Audi RSQ8";
        vehiculo2.velocidadMaxima = 250;
        vehiculo2.consumo = 12;
        vehiculo2.capacidadTanque = 85;
        vehiculo2.mostrarInfo();
        
        int distancia = 500;
        System.out.println("");
        System.out.println("INFORMACIÓN PARA " + vehiculo1.modelo);
        System.out.println("El tiempo de viaje para " + vehiculo1.modelo + " de " + distancia + "km es de " + vehiculo1.calcularTiempoViaje(distancia) + "Hora/s.");
        System.out.println("El consumo de combustible del " + vehiculo1.modelo + " para una distancia de " + distancia + "km es de " + vehiculo1.calcularConsumoViaje(distancia) + " Litros.");
        System.out.println("La autonomía del " + vehiculo1.modelo + " es de " + vehiculo1.calcularAutonomia() + "kms.");
        System.out.println("");
        System.out.println("INFORMACIÓN PARA " + vehiculo2.modelo);
        System.out.println("El tiempo de viaje para " + vehiculo2.modelo + " de " + distancia + "km es de " + vehiculo2.calcularTiempoViaje(distancia) + "Hora/s.");
        System.out.println("El consumo de combustible del " + vehiculo2.modelo + " para una distancia de " + distancia + "km es de " + vehiculo2.calcularConsumoViaje(distancia) + " Litros.");
        System.out.println("La autonomía del " + vehiculo2.modelo + " es de " + vehiculo2.calcularAutonomia() + "kms.");
        
        
        
        
    }
}
