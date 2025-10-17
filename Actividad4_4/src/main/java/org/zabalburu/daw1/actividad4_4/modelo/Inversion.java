/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad4_4.modelo;

/**
 *
 * @author Iker Navarro Pérez
 */
public class Inversion {

    public double capital;
    public double porcentajeInteresAnual;
    public int añosInversion;
    public double beneficioDelMes;
    public double beneficioTotal = 0; // Acumulador

    public double beneficioMensual() {
        beneficioDelMes = capital * ((porcentajeInteresAnual / 100) / 12);
        beneficioTotal += beneficioDelMes;
        capital += beneficioDelMes;
        //capital += 300; Si quisieramos añadir aportes mensuales --> capital += aporteMensualExtra;(tendríamos que crear un dato double y almacenarle el aporte mensual.)
        return beneficioDelMes;
    }

    public String calculoInversonPorMeses() {
        for (int i = 1; i <= (añosInversion * 12); i++) {
            System.out.println("Mes: " + i + " | Beneficio: " + beneficioMensual() + "€ | Capital: " + (beneficioTotal + capital) + "€");
        }
        return null;
    }
}
