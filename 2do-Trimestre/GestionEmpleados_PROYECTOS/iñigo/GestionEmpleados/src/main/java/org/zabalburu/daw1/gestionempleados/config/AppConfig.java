/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.gestionempleados.config;

import java.awt.Font;
import org.zabalburu.daw1.gestionempleados.modelo.Empleado;
import org.zabalburu.daw1.gestionempleados.modelo.Usuario;

/**
 *
 * @author ichueca
 */
public class AppConfig {
    private static Usuario usuario;
    public static final Font FNT_TITULO = new Font("Calibri", Font.PLAIN, 32);
    public static final Font FNT_TEXTO = new Font("Calibri", Font.PLAIN, 16);
    public static final Font FNT_ETIQUETA = new Font("Calibri", Font.BOLD, 16);

    public static Usuario getUsuario() {
        return usuario;
    }

    public static void setUsuario(Usuario usuario) {
        AppConfig.usuario = usuario;
    }

    
    
    
}
