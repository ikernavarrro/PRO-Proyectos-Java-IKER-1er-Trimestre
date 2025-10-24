/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad4_2.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Iker Navarro Pérez
 */
public class Empleado {

    public String nombre;
    public int tipo;
    public int hijos;
    public double pluses;

    public String getDescripción() {

        int x = 0; //Contador que hará que se repita el WHILE hasta que realize el IF.
        String tipoText = "";

        while (x == 0) { //Como x es igual a 0 entramos en el bucle, y dependiendo del tipo se repetirá o saldremos de la repetitiva.
            if (tipo <= 4 && tipo >= 1) {
                switch (tipo) {
                    case 1:
                        tipoText = "Operario";
                        break;
                    case 2:
                        tipoText = "Obrero Especialista";
                        break;                                     // Asignamos una descripción dependiendo del TIPO.
                    case 3:
                        tipoText = "Administrativo";
                        break;
                    default:
                        tipoText = "Licenciado";
                }
                x++; // Suma 1 a x y sale de la repetitiva.
            } else { // Entramos en caso de que el TIPO no sea el esperado en el IF
                String resp = JOptionPane.showInputDialog(null, //Pedimos nuevamente el TIPO
                        """
                    <html>
                        <h1>Tipo de Empleado No Válido</h1>
                        <hr />
                        <p>
                            1 : Operario <br />
                            2 : Obrero Especialista <br />
                            3 : Administrativo <br />
                            4 : Licenciado <br />
                        </p> 
                    </html>
                    """);
                tipo = Integer.parseInt(resp); // Se lo asignamos y volvemos a la repetitiva a comprobar si está dentro de los parámetros.
            }
        }
        return tipoText; // Devolvemos la descripción.
    }

    public double getSueldoBase() {

        int x = 0; //Contador que hará que se repita el WHILE hasta que realize el IF.
        double sueldoBase = 0;

        while (x == 0) { //Como x es igual a 0 entramos en el bucle, y dependiendo del tipo se repetirá o saldremos de la repetitiva.
            if (tipo <= 4 && tipo >= 1) {

                switch (tipo) {
                    case 1:
                        sueldoBase = 1200;
                        break;
                    case 2:
                        sueldoBase = 1450;
                        break;                                     // Asignamos un Sueldo Base dependiendo del TIPO.
                    case 3:
                        sueldoBase = 1300;
                        break;
                    default:
                        sueldoBase = 1450;
                }
                x++; // Suma 1 a x y sale de la repetitiva.
            } else { // Entramos en caso de que el TIPO no sea el esperado en el IF
                String resp = JOptionPane.showInputDialog(null, //Pedimos nuevamente el TIPO
                        """
                    <html>
                        <h1>Tipo de Empleado No Válido</h1>
                        <hr />
                        <p>
                            1 : Operario <br />
                            2 : Obrero Especialista <br />
                            3 : Administrativo <br />
                            4 : Licenciado <br />
                        </p>
                    </html>
                    """);
                tipo = Integer.parseInt(resp); // Se lo asignamos y volvemos a la repetitiva a comprobar si está dentro de los parámetros.
            }
        }
        return sueldoBase; // Devolvemos el sueldo base.
    }

    public void nuevoPlus(double plus) {
        pluses += plus; // Sumamos y asignamos el nuevo plus a los pluses existentes.
    }

    public double getSueldoBruto() {
        return getSueldoBase() + pluses; // Devolvemos el Sueldo base con los pluses.
    }

    public double getPorcIRPF() {

        double porcIRPF = 0; //Aquí asignaremos un valor dependiendo de los siguintes factores...

        switch (hijos) { // Primero revisamos cuantos hijos tiene, y dependiendo de cuantos tenga y el sueldo bruto asignaremos al porcentaje de IRPF un valor u otro.
            case 0: // CON 0 HIJOS
                if (getSueldoBruto() < 1350) {
                    porcIRPF = 13;
                } else if (getSueldoBruto() < 1450) {
                    porcIRPF = 14;
                } else {
                    porcIRPF = 17;
                }
                break;
            case 1: // CON 1 HIJO
                if (getSueldoBruto() < 1350) {
                    porcIRPF = 12.5;
                } else if (getSueldoBruto() < 1450) {
                    porcIRPF = 13;
                } else {
                    porcIRPF = 16;
                }
                break;
            case 2: // CON 2 HIJOS
                if (getSueldoBruto() < 1350) {
                    porcIRPF = 11;
                } else if (getSueldoBruto() < 1450) {
                    porcIRPF = 12;
                } else {
                    porcIRPF = 15;
                }
                break;
            default: // Por defecto, es decir que no sean ni 0 ni 1 ni 2 hijos, 3 o +.
                if (getSueldoBruto() < 1350) {
                    porcIRPF = 10;
                } else if (getSueldoBruto() < 1450) {
                    porcIRPF = 11.5;
                } else {
                    porcIRPF = 14.5;
                }
        }
        return porcIRPF; // Devolvemos el porcentaje.
    }

    public double getImporteIRPF() {
        return getSueldoBruto() * (getPorcIRPF() / 100); //Sacamos el importe de IRPF.
    }

    public double getSueldoNeto() {
        return getSueldoBruto() - getImporteIRPF(); // sacamos el Sueldo Neto.
    }

}
