/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.cajero_automatico.modelo;

import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author Iker Navarro Pérez
 */
public class CuentaCorriente {

    private static int contadorNumCuentas; //Contará el número de cuentas. | También se le asigna al número de cuenta este número único.
    private String titularCuenta; // Titular de la cuenta.
    private String numCuenta; // Número de cuenta único.
    private double saldo; // Saldo de la cuenta.
    private int pin; // El pin de la cuenta. | Sin este pin no podremos acceder a su información.    

    //======== CONSTRUCTORS ==========
    public CuentaCorriente(String titularCuenta) {
        this.titularCuenta = titularCuenta; // No hay cuenta sin titular. 
        this.numCuenta = "ES95" + " " + ((int) (Math.random() * 9000) + 1000) + " " + ((int) (Math.random() * 9000) + 1000) + " " + ((int) (Math.random() * 9000) + 1000) + " " + CuentaCorriente.contadorNumCuentas++; //Le asignamos un número de cuenta, gracias al contador lo hacemos único, los demás números son para hacerlo más "real".
        this.saldo = 0; //Inicializamos el saldo a 0.
        this.pin = ((int) (Math.random() * 9000) + 1000); // ASIGNAMOS UN PIN TOTALMENTE ALEATORIO DE 4 DIGITOS.
    }

    //======== SETTERS ==========
    /**
     * Asignamos un titular de cuenta.
     *
     * @param titularCuenta
     */
    public void setTitularCuenta(String titularCuenta) {
        this.titularCuenta = titularCuenta;
    }

    /**
     * Modificamos el pin. Tiene que ser un valor entre 0000 y 9999. (Ambos
     * incluidos.)
     * SOLO SE MODIFICARÁ SI SE INTRODUCE CORRECTAMENTE EL PIN ANTERIOR.
     *
     * @param pinAnterior El pin anterior.
     * @param nuevoPin El pin a asignar.
     */
    /*public void setPin(int pinAnterior, int nuevoPin) {
        if (this.pin == pinAnterior) {
            if (nuevoPin <= 9999 && nuevoPin >= 0000) {
                this.pin = nuevoPin;
            }
        }
    }*/
    
    public void setPin() {
       this.pin = ((int) (Math.random() * 9000) + 1000); // ASIGNAMOS UN PIN TOTALMENTE ALEATORIO DE 4 DIGITOS.
    }
    
    //======== GETTERS ==========

    public static int getContadorNumCuentas() {
        return contadorNumCuentas;
    }

    public String getTitularCuenta() {
        return titularCuenta;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getPin() {
        return pin;
    }

    //======== toString() ========
    @Override
    public String toString() {
        return "CuentaCorriente{" + "titularCuenta=" + titularCuenta + ", numCuenta=" + numCuenta + ", saldo=" + saldo + ", pin=" + pin + '}';
    }
    //======== equals() ==========

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.titularCuenta);
        hash = 53 * hash + Objects.hashCode(this.numCuenta);
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
        final CuentaCorriente other = (CuentaCorriente) obj;
        if (!Objects.equals(this.titularCuenta, other.titularCuenta)) {
            return false;
        }
        return Objects.equals(this.numCuenta, other.numCuenta);
    }
    
    // ================
    public void ingresarSaldo(double saldoIngresar) {
        this.saldo += saldoIngresar;
    }
    
    public void retirarSaldo(double saldoRetirar) {
        this.saldo -= saldoRetirar;
    }

}
