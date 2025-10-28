/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.zabalburu.daw1._actividad5.programacionmodular;

import javax.swing.JOptionPane;

/**
 *
 * @author Iker Navarro Pérez
 *
 */
public class App {

    private static int amigos = 0;
    private static double bote = 0.0;
    private static final int BOTE_PERSONA = 10;

    public static void main(String[] args) {
        String menu = null;
        do {
            menu = JOptionPane.showInputDialog(null,
                    """
                    <html>
                        <h1>Menú BOTE CUADRILLA</h1>
                        <h1>====================</h1>
                        <ol>
                            <li>Añadir Amigos</li>
                            <li>Nueva Aportación</li>
                            <li>Pagar Ronda</li>
                            <li>Quitar Amigos</li>
                            <li>SALIR</li>
                        </ol>
                        <ul>
                            <li>Amigos: %d | Bote: %,.2f€<</li>
                        </ul>
                        <h1>====================</h1>
                    </html>
                    """.formatted(App.amigos, App.bote), "Un valor del 1 al 5.");
            /**
             *  x o caoncelar - SALIR (Si se cierra la ventana o se cancela,
             *  salimos.)
             *  1 - Añadir Amigos
             *  2 - Nueva Aportación
             *  3 - Pagar Ronda
             *  4 - Quitar Amigos
             *  5 - SALIR
             */
            switch (Integer.parseInt(menu)) {
                case 1 -> App.añadirAmigos();
                case 2 -> App.nuevaAportacion();
                case 3 -> App.pagarRonda(); 
                case 4 -> App.quitarAmigos();
            }
           
        } while (Integer.parseInt(menu) != 5);
        
    }

    //===============MÉTODOS====================
    /**
     * 1 - Método Añadir Amigos
     */
    private static void añadirAmigos() {
        int añadidos = 0;
        añadidos = Integer.parseInt(JOptionPane.showInputDialog(null,
                """
                     <html>
                        <h2>[1] Añadir Amigos<h2>
                        <hr />
                        <h4>¿Cuántos amigos desea añadir?</h4>
                     </html>
                     """));

        if (App.bote == 0) {
            App.bote += (añadidos * App.BOTE_PERSONA) + (App.amigos * App.BOTE_PERSONA);
            JOptionPane.showMessageDialog(null, "<html><h1>NO HABÍA DINERO EN EL BOTE Y SE HA REALIZADO UNA NUEVA APORTACIÓN DE TODOS LOS AMIGOS</h1></html>", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            double dividirBote;
            dividirBote = App.bote / App.amigos;
            App.bote += (añadidos * dividirBote);
        }

        App.amigos += añadidos;

        JOptionPane.showMessageDialog(null,
                """
                     <html>
                        <h2>Resúmen - [1] Añadir Amigos<h2>
                        <hr />
                        <h4>Amigos Añadidos: %d | Bote Actual: %,.2f€ | Total Amigos: %d</h4>
                     </html>
                     """.formatted(añadidos, App.bote, App.amigos));
    }
    //======================================

    /**
     * 2 - Nueva Aportación
     */
    private static void nuevaAportacion() {
        App.bote += (App.amigos * App.BOTE_PERSONA);
        JOptionPane.showMessageDialog(null,
                """
                     <html>
                        <h2>Resúmen - [2] Nueva Aportación<h2>
                        <hr />
                        <h4>Bote Actual: %,.2f€ | Total Amigos: %d</h4>
                     </html>
                     """.formatted(App.bote, App.amigos));
    }
    //======================================

    /**
     * 3 - Pagar Ronda
     */
    private static void pagarRonda() {
        double importe = 0;
        importe = Double.parseDouble(JOptionPane.showInputDialog(null,
                """
                <html>
                    <h2>[3] Pagar Ronda<h2>
                    <hr />
                    <h4>¿Cuánto vale la ronda?</h4>
                </html>                                                       
                """, "€"));
        if (importe > App.bote) {
            JOptionPane.showMessageDialog(null, "<html><h1>¡NO HAY SUFICIENTE DINERO EN EL BOTE PARA PAGAR LA RONDA!</h1></html>", "Error de Pago", JOptionPane.ERROR_MESSAGE);
        } else {
            bote -= importe;
            JOptionPane.showMessageDialog(null,
                    """
                     <html>
                        <h2>Resúmen - [3] Pagar Ronda<h2>
                        <hr />
                        <h4>Pagado: %,.2f€ | Bote Restante: %,.2f€ | Total Amigos: %d</h4>
                     </html>
                     """.formatted(importe, App.bote, App.amigos));
        }
    }
    //======================================

    /**
     * 4 - Quitar Amigos
     */
    private static void quitarAmigos() {
        int quitados = 0;
        quitados = Integer.parseInt(JOptionPane.showInputDialog(null,
                """
                     <html>
                        <h2>[4] Quitar Amigos<h2>
                        <hr />
                        <h4>¿Cuántos amigos desea quitar?</h4>
                     </html>
                     """));

        if (App.bote != 0 && quitados <= App.amigos) {
            double dividirBote;
            dividirBote = App.bote / App.amigos;
            App.bote -= (quitados * dividirBote);
            JOptionPane.showMessageDialog(null,
                    """
                     <html>
                        <h2>Resúmen - [4] Quitar Amigos<h2>
                        <hr />
                        <h4>A devolver: %,.2f€ x %d Amigos Quitados  | Bote Restante: %,.2f€ | Amigos Restantes: %d</h4>
                     </html>
                     """.formatted(dividirBote, quitados, App.bote, App.amigos));
        } else {
            JOptionPane.showMessageDialog(null, "<html><h1>NO HAY DINERO EN EL BOTE PARA REPARTIR</h1></html>", "Información de Pago", JOptionPane.INFORMATION_MESSAGE);
        }
        if (quitados <= App.amigos) {
        App.amigos -= quitados;
        }
    }
    //======================================
}
