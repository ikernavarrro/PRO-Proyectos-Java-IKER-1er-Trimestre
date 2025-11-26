/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.zabalburu.daw1.actividad4_1y2;

import javax.swing.JOptionPane;

/**
 *
 * @author Iker Navarro Pérez
 */
public class Actividad4_1y2 {

    public static void main(String[] args) {

        int seleccionTabla;
        int tablaDelNumero = 0;
        int tablaDel = 0; //Contador
        int tablaDelNumeroPerso = 0;
        int tablaDelPerso = 0; //Contador

        seleccionTabla = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                            <html>
                                                                            <h1>Aplicación Tablas de Multiplicar</h1>
                                                                            <hr />
                                                                            <h3>1 : Tabla Personalizada</h3>
                                                                            <h3>2 : Tablas del 1 al 10</h3>
                                                                            <h3>3 : SALIR</h3>
                                                                            </html>
                                                                            """));

        if (seleccionTabla == 1) {
            do {
                tablaDelNumeroPerso = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                                <html>
                                                                                <h1>Tabla de Multiplicar Personalizada</h1>
                                                                                <hr />
                                                                                <p>Introduzca el número de la tabla que quiere obtener.</p>
                                                                                </html>
                                                                                """, "Número entero sin decimales."));

            } while (JOptionPane.showConfirmDialog(null, """
                                                    <html>
                                                    <h1>Confirmación Tabla del %d</h1>
                                                    <hr />
                                                    <p><big>¿</big>Estás seguro que quieres obtener la tabla de multiplicar de <b>%d</b><big>?</big></p>
                                                    </html>
                                                    """.formatted(tablaDelNumeroPerso, tablaDelNumeroPerso), "Confirmación Tabla del %d".formatted(tablaDelNumeroPerso), JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION);

            for (int seleccionSalida = 0; seleccionSalida != 3;) {

                seleccionSalida = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                                     <html>
                                                                                     <h1>¿Cómo desea mostrar la Tabla De Multiplicar?</h1>
                                                                                     <hr />
                                                                                     <h3>1 : Ventana Emergente</h3>
                                                                                     <h3>2 : Salida Consola</h3>
                                                                                     <h3>3 : SALIR</h3>
                                                                                     </html>
                                                                                     """));

                if (seleccionSalida == 1) {
                    JOptionPane.showMessageDialog(null, """
                                            <html>
                                            <h1>Tabla del %d</h1>
                                            <hr />
                                            %d x 1 = %d <br />
                                            %d x 2 = %d <br />
                                            %d x 3 = %d <br />
                                            %d x 4 = %d <br />
                                            %d x 5 = %d <br />
                                            %d x 6 = %d <br />
                                            %d x 7 = %d <br />
                                            %d x 8 = %d <br />
                                            %d x 9 = %d <br />
                                            %d x 10 = %d 
                                            </html>
                                            """.formatted(tablaDelNumeroPerso,
                            tablaDelNumeroPerso, tablaDelNumeroPerso * 1,
                            tablaDelNumeroPerso, tablaDelNumeroPerso * 2,
                            tablaDelNumeroPerso, tablaDelNumeroPerso * 3,
                            tablaDelNumeroPerso, tablaDelNumeroPerso * 4,
                            tablaDelNumeroPerso, tablaDelNumeroPerso * 5,
                            tablaDelNumeroPerso, tablaDelNumeroPerso * 6,
                            tablaDelNumeroPerso, tablaDelNumeroPerso * 7,
                            tablaDelNumeroPerso, tablaDelNumeroPerso * 8,
                            tablaDelNumeroPerso, tablaDelNumeroPerso * 9,
                            tablaDelNumeroPerso, tablaDelNumeroPerso * 10
                    ), "Tabla del %d".formatted(tablaDelNumeroPerso), JOptionPane.INFORMATION_MESSAGE);

                } else if (seleccionSalida == 2) {
                    /*MEJORABLE CON REPETITIVA
                    System.out.printf("""
                                  ------------------
                                  == Tabla del %d ==
                                  ------------------
                                  %d x 1 = %d 
                                  %d x 2 = %d 
                                  %d x 3 = %d 
                                  %d x 4 = %d 
                                  %d x 5 = %d 
                                  %d x 6 = %d 
                                  %d x 7 = %d 
                                  %d x 8 = %d 
                                  %d x 9 = %d 
                                  %d x 10 = %d 
                                  ------------------
                                  """,
                            tablaDelNumeroPerso,
                            tablaDelNumeroPerso, tablaDelNumeroPerso * 1,
                            tablaDelNumeroPerso, tablaDelNumeroPerso * 2,
                            tablaDelNumeroPerso, tablaDelNumeroPerso * 3,
                            tablaDelNumeroPerso, tablaDelNumeroPerso * 4,
                            tablaDelNumeroPerso, tablaDelNumeroPerso * 5,
                            tablaDelNumeroPerso, tablaDelNumeroPerso * 6,
                            tablaDelNumeroPerso, tablaDelNumeroPerso * 7,
                            tablaDelNumeroPerso, tablaDelNumeroPerso * 8,
                            tablaDelNumeroPerso, tablaDelNumeroPerso * 9,
                            tablaDelNumeroPerso, tablaDelNumeroPerso * 10); */

                    System.out.printf("""
                                  ------------------
                                  == Tabla del %d ==
                                  ------------------
                                           """, tablaDelNumeroPerso);

                    while (tablaDelPerso <= 10) {
                        System.out.printf("""
                                              %d x %d = %d 
                                              """, tablaDelNumeroPerso, tablaDelPerso, tablaDelNumeroPerso * tablaDelPerso);
                        tablaDelPerso++;
                    }
                    System.out.printf("""
                                  ------------------
                                          """);

                }
            }
        } else if (seleccionTabla == 2) {
            for (int seleccionSalida = 0; seleccionSalida != 3;) {

                seleccionSalida = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                                     <html>
                                                                                     <h1>¿Cómo desea mostrar las Tablas De Multiplicar?</h1>
                                                                                     <hr />
                                                                                     <h3>1 : Ventana Emergente</h3>
                                                                                     <h3>2 : Salida Consola</h3>
                                                                                     <h3>3 : SALIR</h3>
                                                                                     </html>
                                                                                     """));

                if (seleccionSalida == 1) {
                    while (tablaDelNumero <= 10) {
                        JOptionPane.showMessageDialog(null, """
                                            <html>
                                            <h1>Tabla del %d</h1>
                                            <hr />
                                            %d x 1 = %d <br />
                                            %d x 2 = %d <br />
                                            %d x 3 = %d <br />
                                            %d x 4 = %d <br />
                                            %d x 5 = %d <br />
                                            %d x 6 = %d <br />
                                            %d x 7 = %d <br />
                                            %d x 8 = %d <br />
                                            %d x 9 = %d <br />
                                            %d x 10 = %d 
                                            </html>
                                            """.formatted(tablaDelNumero,
                                tablaDelNumero, tablaDelNumero * 1,
                                tablaDelNumero, tablaDelNumero * 2,
                                tablaDelNumero, tablaDelNumero * 3,
                                tablaDelNumero, tablaDelNumero * 4,
                                tablaDelNumero, tablaDelNumero * 5,
                                tablaDelNumero, tablaDelNumero * 6,
                                tablaDelNumero, tablaDelNumero * 7,
                                tablaDelNumero, tablaDelNumero * 8,
                                tablaDelNumero, tablaDelNumero * 9,
                                tablaDelNumero, tablaDelNumero * 10
                        ), "Tabla del %d".formatted(tablaDelNumero), JOptionPane.INFORMATION_MESSAGE);
                        tablaDelNumero++;
                    }
                } else if (seleccionSalida == 2) {
                    int almacenarTablaDelNumero = tablaDelNumero;
                    while (tablaDel <= 10) {
                        System.out.printf("""
                                  ------------------
                                  == Tabla del %d ==
                                  ------------------
                                              """, tablaDel);
                        tablaDelNumero = almacenarTablaDelNumero;

                        while (tablaDelNumero <= 10) {
                            System.out.printf("""
                                              %d x %d = %d 
                                              """, tablaDelNumero, tablaDel, tablaDelNumero * tablaDel);

                            tablaDelNumero++;
                        }
                        System.out.printf("""
                                  ------------------
                                          """);

                        tablaDel++;
                    }
                }
            }
        }
    }
}
