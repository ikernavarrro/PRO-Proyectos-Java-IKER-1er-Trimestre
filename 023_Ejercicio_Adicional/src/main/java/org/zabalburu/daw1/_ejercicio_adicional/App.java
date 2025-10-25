/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.zabalburu.daw1._ejercicio_adicional;

import javax.swing.JOptionPane;
import org.zabalburu.daw1._ejercicio_adicional.modelo.Envio;

/**
 *
 * @author Iker Navarro Pérez
 *
 */
public class App {

    public static void main(String[] args) {
        Envio nuevoEnvio;
        int tipoEnvio = 0;
        int diaSemana = 0;

        for (diaSemana = 1; diaSemana <= 5; diaSemana++) {
            String nombreDia = "";
            nombreDia = switch (diaSemana) {
                case 1 -> "Lunes";
                case 2 -> "Martes";
                case 3 -> "Miércoles";
                case 4 -> "Jueves";
                default -> "Viernes";
            };
            do {
                String resp = JOptionPane.showInputDialog(null,
                        """
                    <html>                                        
                        <h1>Servicio a utilizar el %s.</h1>
                        <hr />
                        <ol>
                            <li>Normal</li>
                            <li>Express</li>
                            <li>24 Horas</li>
                            <li>8 Horas</li>    
                        </ol>
                        <hr />
                        <p>
                            Introduzca un tipo de servicio. 1-4
                        </p>
                    </html>    
                    """.formatted(nombreDia), JOptionPane.PLAIN_MESSAGE);
                tipoEnvio = Integer.parseInt(resp);
                if (tipoEnvio != 0) {
                    nuevoEnvio = new Envio();
                    resp = JOptionPane.showInputDialog(null,
                            """
                        <html>
                            <h1>Introduzca el Destinatario:</h1>
                        </html>
                        """);
                    nuevoEnvio.setDestinatario(resp);

                    resp = JOptionPane.showInputDialog(null,
                            """
                        <html>
                            <h1>Introduzca el Remitente:</h1>
                        </html>
                        """);
                    nuevoEnvio.setRemitente(resp);

                    resp = JOptionPane.showInputDialog(null,
                            """
                        <html>
                            <h1>Introduzca el Peso en Gramos:</h1>
                        </html>
                        """);
                    nuevoEnvio.setPesoEnGramos(Integer.parseInt(resp));

                    while (nuevoEnvio.getPesoEnGramos() < 0 || nuevoEnvio.getPesoEnGramos() > 1000000) {
                        JOptionPane.showMessageDialog(null, "<html><h1>PESO NO VÁLIDO</h1></html>", "ERROR EN PESO", JOptionPane.ERROR_MESSAGE);
                        resp = JOptionPane.showInputDialog(null,
                                """
                        <html>
                            <h1>Introduzca el Peso en Gramos:</h1>
                        </html>
                        """);
                        nuevoEnvio.setPesoEnGramos(Integer.parseInt(resp));
                    }
                    
                    double descuento = 0;
                    if (nuevoEnvio.getCoste(tipoEnvio) > 50 && nuevoEnvio.getCoste(tipoEnvio) < 100) {
                        descuento = nuevoEnvio.getCoste(tipoEnvio) * 0.03;
                    } else if (nuevoEnvio.getCoste(tipoEnvio) >= 100) {
                        descuento = nuevoEnvio.getCoste(tipoEnvio) * 0.05;
                    }
                    
                    double costeConDescuento = nuevoEnvio.getCoste(tipoEnvio);
                    if (descuento != 0) {
                        costeConDescuento = nuevoEnvio.getCoste(tipoEnvio) - descuento;
                    }

                    if (descuento != 0) {
                        JOptionPane.showMessageDialog(null,
                            """
                            <html>
                                <h1>INFORMACIÓN DEL ENVÍO</h1>
                                <hr />
                                <p>
                                    <b>Remitente</b>: %s <br />
                                    <b>Destinatario</b>: %s <br />
                                    <b>Descripción</b>: %s <br />
                                    <b>Coste Base</b>: %d€ <br />
                                    <b>Coste/200 gramos</b>: %.1f€ <br />
                                    <b>Importe Total(Sin Descuento)</b>: %,.2f€  <br />
                                    <b>Descuento</b>: -%,.2f€ <br />
                                    <b>Importe Total (Con Descuento)</b>: %,.2f€ <br />
                                </p>
                                <hr />
                            </html>
                            """.formatted(nuevoEnvio.getRemitente(), nuevoEnvio.getDestinatario(), nuevoEnvio.getDescripcionTipo(tipoEnvio), nuevoEnvio.getCosteBase(tipoEnvio), nuevoEnvio.getCoste200(tipoEnvio), nuevoEnvio.getCoste(tipoEnvio), descuento, costeConDescuento));
                    } else {
                        JOptionPane.showMessageDialog(null,
                            """
                            <html>
                                <h1>INFORMACIÓN DEL ENVÍO</h1>
                                <hr />
                                <p>
                                    <b>Remitente</b>: %s <br />
                                    <b>Destinatario</b>: %s <br />
                                    <b>Descripción</b>: %s <br />
                                    <b>Coste Base</b>: %d€ <br />
                                    <b>Coste/200 gramos</b>: %.1f€ <br />
                                    <b>Importe Total</b>: %,.2f€  
                                </p>
                                <hr />
                            </html>
                            """.formatted(nuevoEnvio.getRemitente(), nuevoEnvio.getDestinatario(), nuevoEnvio.getDescripcionTipo(tipoEnvio), nuevoEnvio.getCosteBase(tipoEnvio), nuevoEnvio.getCoste200(tipoEnvio),nuevoEnvio.getCoste(tipoEnvio)));
                    }
                }
            } while (tipoEnvio != 0);
        }
    }
}
