/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.zabalburu.daw1.cajero_automatico;

import javax.swing.JOptionPane;
import org.zabalburu.daw1.cajero_automatico.modelo.CuentaCorriente;

/**
 * 2. Simulación de cajero automático. 05/11/2025
 *
 * @author Iker Navarro Pérez
 */
public class App {

    private static CuentaCorriente cuenta1 = new CuentaCorriente("Iker Navarro Pérez");

    public static void main(String[] args) {
        System.out.println(cuenta1);
        int intentos = 3;
        boolean ok = false;
        String resp = "";
        do {
            if (intentos >= 0) {
                resp = JOptionPane.showInputDialog(null,
                        """
                <html>
                    <h1>Banco Santander</h1>
                    <hr />
                    <p>
                        ¡Hola de nuevo %s! <br />
                        IBAN: %s <br />
                    </p>    
                    <hr />
                    <p>            
                        Introduzca su pin:
                    </p> 
                </html>    
                """.formatted(cuenta1.getTitularCuenta(), cuenta1.getNumCuenta()));
                try {
                    if (resp == null) {
                        ok = true;
                    } else if (cuenta1.getPin() == Integer.parseInt(resp)) {
                        App.menuOperaciones();
                        ok = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "<html><h1>¡CONTRASEÑA INCORRECTA! Intentos restantes: %d</h1></html>".formatted(intentos), "ERROR", JOptionPane.ERROR_MESSAGE);
                        intentos--;
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "<html><h1>¡INTRODUZCA UN VALOR VÁLIDO! (Número entero entre el 0000 y el 9999.)</h1></html>", "Dato NO Válido", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "<html><h1>¡CUENTA BLOQUEADA PERMANENTEMENTE!</h1></html>", "Banco Santander Informa...", JOptionPane.ERROR_MESSAGE);
                ok = true;
            }

        } while (ok != true);

    }

    // ==== MÉTODOS ====
    private static void menuOperaciones() {
        int menu = 0;
        String resp = "";
        do {
            boolean ok = false;
            do {
                resp = JOptionPane.showInputDialog(null,
                        """
                        <html>
                            <h1>Menú Operaciones</h1>
                            <hr />
                            <ol>
                                <li>Saldo</li>
                                <li>Datos</li>
                                <li>Ingresar</li>
                                <li>Retirar</li>
                                <li>Cambiar PIN</li>
                            </ol>
                            <hr />
                            <p>
                                0 , x , cancelar 🠆 SALIR
                            </p>
                            <hr />
                        </html>
                        """, "Cajero Automático", JOptionPane.PLAIN_MESSAGE);
                try {
                    if (resp == null || Integer.parseInt(resp) == 0) {
                        menu = 0;
                        ok = true;
                    } else if (Integer.parseInt(resp) >= 1 && Integer.parseInt(resp) <= 5) {
                        menu = Integer.parseInt(resp);
                        ok = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "<html><h1>¡INTRODUZCA UNA OPCIÓN VÁLIDA! (Entre el 0 y el 5.)</h1></html>", "Dato NO Válido", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "<html><h1>¡INTRODUZCA UN VALOR VÁLIDO! (Número entero entre el 0 y el 5.)</h1></html>", "Dato NO Válido", JOptionPane.ERROR_MESSAGE);
                }
            } while (ok != true);

            // ==== Dependiendo de la opción elegida se ejecutará su correspondiente método. ====
            switch (menu) {
                case 0:
                    // SALIMOS
                    break;
                case 1:
                    App.consultarSaldo();
                    break;
                case 2:
                    App.consultarDatos();
                    break;
                case 3:
                    App.ingresarSaldo();
                    break;
                case 4:
                    App.retirarSaldo();
                    break;
                case 5:
                    App.cambiarPin();
                    break;
            }
        } while (menu != 0);
    }

    private static void consultarSaldo() {
        JOptionPane.showMessageDialog(null,
                """
                <html>                            
                    <h1>[1] Saldo</h1>
                    <hr />
                    <p>
                        Saldo de la cuenta: %,.2f€
                    </p>
                    <hr />
                </html>
                """.formatted(cuenta1.getSaldo()));
    }

    private static void consultarDatos() {
        JOptionPane.showMessageDialog(null,
                """
                <html>                            
                    <h1>[2] Datos</h1>
                    <hr />
                    <p>
                        Titular: %s <br />
                        IBAN: %s <br />
                        PIN: %d 
                    </p>
                    <hr />
                </html>
                """.formatted(App.cuenta1.getTitularCuenta(), App.cuenta1.getNumCuenta(), App.cuenta1.getPin()));
    }

    private static void ingresarSaldo() {
        boolean ok = false;
        do {
            String resp = JOptionPane.showInputDialog(null,
                    """
                        <html>
                            <h1>[3] Ingresar</h1>
                            <hr />
                            <p>
                                Cantidad a ingresar:
                            </p>
                            <hr />
                        </html>
                        """, "Cajero Automático", JOptionPane.PLAIN_MESSAGE);
            try {
                if (resp == null) {
                    ok = true;
                } else if (Double.parseDouble(resp) > 0) {
                    cuenta1.ingresarSaldo(Double.parseDouble(resp));
                    ok = true;
                } else {
                    JOptionPane.showMessageDialog(null, "<html><h1>¡INTRODUZCA UNA CANTIDAD VÁLIDA!</h1></html>", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "<html><h1>¡INTRODUZCA UN VALOR VÁLIDO!</h1></html>", "Dato NO Válido", JOptionPane.ERROR_MESSAGE);
            }
        } while (ok != true);
    }

    private static void retirarSaldo() {
        boolean ok = false;
        do {
            String resp = JOptionPane.showInputDialog(null,
                    """
                        <html>
                            <h1>[4] Retirar</h1>
                            <hr />
                            <p>
                                Cantidad a retirar:
                            </p>
                            <hr />
                        </html>
                        """, "Cajero Automático", JOptionPane.PLAIN_MESSAGE);
            try {
                if (resp == null) {
                    ok = true;
                } else if (Double.parseDouble(resp) > 0) {
                    if (Double.parseDouble(resp) <= cuenta1.getSaldo()) {
                        cuenta1.retirarSaldo(Double.parseDouble(resp));
                        ok = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "<html><h1>¡INTRODUZCA UNA CANTIDAD VÁLIDA!</h1></html>", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "<html><h1>¡INTRODUZCA UNA CANTIDAD VÁLIDA!</h1></html>", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "<html><h1>¡INTRODUZCA UN VALOR VÁLIDO!</h1></html>", "Dato NO Válido", JOptionPane.ERROR_MESSAGE);
            }
        } while (ok != true);
    }

    private static void cambiarPin() {
        while (JOptionPane.showConfirmDialog(null,
                """
                        <html>
                            <h1>[5] Cambiar PIN</h1>
                            <hr />
                            <p>
                                ¿ESTÁ SEGURO DE QUE QUIERE CAMBIAR SU PIN?
                            </p>
                            <hr />
                        </html>
                        """, "Cajero Automático", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            cuenta1.setPin();
            JOptionPane.showMessageDialog(null, "PIN ACTUALIZADO A %d".formatted(cuenta1.getPin()));
        }
    }
}
