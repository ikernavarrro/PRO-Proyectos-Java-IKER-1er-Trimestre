/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.zabalburu.daw1.app_gestionentradasgranadafest;

import javax.swing.JOptionPane;
import org.zabalburu.daw1.app_gestionentradasgranadafest.modelo.Entradas;

/**
 *
 * @author Focus Mode
 */
public class APP_GestionEntradasConcierto {

    public static void main(String[] args) {

        Entradas grupo01 = new Entradas();
        grupo01.nombreGrupo = JOptionPane.showInputDialog(null, "Establece Nombre Del Grupo:");
        grupo01.entradasGeneralesDisponibles = Integer.parseInt(JOptionPane.showInputDialog(null, "Establece Entradas Generales Disponibles:", "1000"));
        grupo01.entradasVIPDisponibles = Integer.parseInt(JOptionPane.showInputDialog(null, "Establece Entradas VIP Disponibles:", "300"));
        grupo01.entradasVIPPlusDisponibles = Integer.parseInt(JOptionPane.showInputDialog(null, "Establece Entradas VIP Plus Disponibles:", "50"));

        int entradasGeneralesAComprar = Integer.parseInt(JOptionPane.showInputDialog(null, "Grupo %s | Precio Entrada General %,.2f€ | Disponibles %s | Comprar:".formatted(grupo01.nombreGrupo, Entradas.PRECIO_ENTRADA_GENERAL, grupo01.entradasGeneralesDisponibles), "0"));
        if (grupo01.comprarEntradasGenerales(entradasGeneralesAComprar) < 0) {
            JOptionPane.showMessageDialog(null, "No quedan entradas Generales Disponibles suficientes para %s".formatted(grupo01.nombreGrupo), "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "%d entradas Generales para %s. | Total: %,.2f€".formatted(entradasGeneralesAComprar, grupo01.nombreGrupo, grupo01.comprarEntradasGenerales(entradasGeneralesAComprar)));
        }

        int entradasVIPAComprar = Integer.parseInt(JOptionPane.showInputDialog(null, "Grupo %s | Precio Entrada VIP %,.2f€ | Disponibles %s | Comprar:".formatted(grupo01.nombreGrupo, Entradas.PRECIO_ENTRADA_VIP, grupo01.entradasVIPDisponibles), "0"));
        if (grupo01.comprarEntradasVIP(entradasVIPAComprar) < 0) {
            JOptionPane.showMessageDialog(null, "No quedan entradas VIP Disponibles suficientes para %s".formatted(grupo01.nombreGrupo), "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
        JOptionPane.showMessageDialog(null, "%d entradas VIP para %s. | Total: %,.2f€".formatted(entradasVIPAComprar, grupo01.nombreGrupo, grupo01.comprarEntradasVIP(entradasVIPAComprar)));
        }
        
        int entradasVIPPlusAComprar = Integer.parseInt(JOptionPane.showInputDialog(null, "Grupo %s | Precio Entrada VIP Plus %,.2f€ | Disponibles %s | Comprar:".formatted(grupo01.nombreGrupo, Entradas.PRECIO_ENTRADA_VIP_PLUS, grupo01.entradasVIPPlusDisponibles), "0"));
        if (grupo01.comprarEntradasVIPPlus(entradasVIPPlusAComprar) < 0) {
            JOptionPane.showMessageDialog(null, "No quedan entradas VIP Plus Disponibles suficientes para %s".formatted(grupo01.nombreGrupo), "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
        JOptionPane.showMessageDialog(null, "%d entradas VIP Plus para %s. | Total: %,.2f€".formatted(entradasVIPPlusAComprar, grupo01.nombreGrupo, grupo01.comprarEntradasVIPPlus(entradasVIPPlusAComprar)));
        }
        
        JOptionPane.showMessageDialog(null, """
                                            <html>
                                            <h1>Información</h1>
                                            Total Número Entradas Restantes: %d<br />
                                            Total Importe Entradas Restantes:%,.2f€<br />
                                            <hr />
                                            Total Número Entradas Vendidas:  %d<br />
                                            Total Importe Entradas Vendidas: %,.2f€<br />
                                            <hr />
                                            Porcentaje Entradas Restantes:%.2f%%<br />
                                            Porcentaje Entradas Vendidas: %.2f%%<br />
                                            </html>
                                            """.formatted(grupo01.totalNumeroEntradasDisponibles(), grupo01.totalImporteEntradasDisponibles(), grupo01.totalNumeroEntradasVendidas(), grupo01.totalImporteEntradasVendidas(), grupo01.porcentajeEntradasDisponibles(), grupo01.porcentajeEntradasVendidas()));
        // JOptionPane.showMessageDialog(null, "No hay entradas suficientes. | Entradas disponibles: " + this.entradasGeneralesDisponibles)
    }
}
