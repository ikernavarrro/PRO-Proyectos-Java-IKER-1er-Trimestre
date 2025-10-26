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
        
        int totalEnviosDia = 0;
        double sumaImporteTotalDia = 0;
        double sumaDescuentosTotalDia = 0;
        double sumaImporteTotalDescuentosDia = 0;
        
        int totalEnviosSemana = 0;
        double sumaImporteTotalSemana = 0;
        double sumaDescuentosTotalSemana = 0;
        double sumaImporteTotalDescuentosSemana = 0;
        double totalPesoSemanaGramos = 0;
        
        int contadorImporteSuperior200Dia = 0;
        int contadorImporteSuperior200Semana = 0;
        

        for (diaSemana = 1; diaSemana <= 5; diaSemana++) {
            String nombreDia = "";
            nombreDia = switch (diaSemana) {
                case 1 -> "Lunes";
                case 2 -> "Martes";
                case 3 -> "Miércoles";
                case 4 -> "Jueves";
                default -> "Viernes";
            };
            totalEnviosDia = 0;
            sumaImporteTotalDia = 0;
            sumaDescuentosTotalDia = 0;
            sumaImporteTotalDescuentosDia = 0;     
            contadorImporteSuperior200Dia = 0;
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
                            Introduzca <b>0</b> para continuar con un NUEVO día.
                        </p>
                    </html>    
                    """.formatted(nombreDia), JOptionPane.PLAIN_MESSAGE);
                tipoEnvio = Integer.parseInt(resp);
                if (tipoEnvio != 0) {
                    nuevoEnvio = new Envio();
                    totalEnviosSemana++;
                    totalEnviosDia++;
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
                    
                    if (contadorImporteSuperior200Dia == 0 && nuevoEnvio.getCoste(tipoEnvio) > 200) {
                        contadorImporteSuperior200Dia++;
                    }
                    
                    sumaImporteTotalSemana += nuevoEnvio.getCoste(tipoEnvio);
                    sumaDescuentosTotalSemana += descuento;
                    sumaImporteTotalDescuentosSemana += costeConDescuento;
                    totalPesoSemanaGramos += nuevoEnvio.getPesoEnGramos();
                    
                    sumaImporteTotalDia += nuevoEnvio.getCoste(tipoEnvio);
                    sumaDescuentosTotalDia += descuento;
                    sumaImporteTotalDescuentosDia += costeConDescuento;
                    
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
             
            if (contadorImporteSuperior200Dia != 0) {
                contadorImporteSuperior200Semana++;
            }
            
            JOptionPane.showMessageDialog(null, 
                    """
                    <html>
                        <h1>Resúmen del %s</h1>
                        <hr />
                        <p>
                            Total Pedidos: %d <br />
                            Suma Importe Total: %,.2f€ <br />
                            Suma Descuentos: %,.2f€ <br />
                            Suma Importe Con Descuentos: %,.2f€
                        </p>
                        <hr />
                    </html>
                    """.formatted(nombreDia, totalEnviosDia, sumaImporteTotalDia, sumaDescuentosTotalDia, sumaImporteTotalDescuentosDia));
        }
        
        double totalPesoSemanaKilos = totalPesoSemanaGramos / 1000;
        
        JOptionPane.showMessageDialog(null, 
                """
                <html>
                    <h1>Resúmen de la semana</h1>
                    <hr />
                    <p>
                        Total Envíos: %d <br />
                        Importes Totales: %,.2f€ <br />
                        Descuentos Totales: %,.2f€ <br />
                        Importe Con Descuentos Totales: %,.2f€ <br />
                        Peso Total Semana: %,.2fKg 
                    </p>
                    <hr />
                    <p>
                        Días con Importes Totales superiores a 200€: %d
                    </p>
                </html>    
                """.formatted(totalEnviosSemana, sumaImporteTotalSemana, sumaDescuentosTotalSemana, sumaImporteTotalDescuentosSemana, totalPesoSemanaKilos, contadorImporteSuperior200Semana));
    }
}
