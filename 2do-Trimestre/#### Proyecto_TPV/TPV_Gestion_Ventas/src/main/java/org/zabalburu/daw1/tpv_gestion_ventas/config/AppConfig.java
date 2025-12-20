/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.tpv_gestion_ventas.config;

import java.awt.Font;
import org.zabalburu.daw1.tpv_gestion_ventas.modelo.Usuario;

/**
 *
 * @author Iker Navarro Pérez
 */
public class AppConfig {
    
    //Fuentes de Texto
    public static final Font FNT_TITULO = new Font("Franklin Gothic", Font.BOLD, 24);
    public static final Font FNT_TEXTO = new Font("Franklin Gothic", Font.PLAIN, 12);
    public static final Font FNT_ETIQUETA = new Font("Calibri", Font.BOLD, 12);
    
    //Configuración Usuario
    private static Usuario usuario;
    
    public static Usuario getUsuario() {
        return usuario;
    }

    public static void setUsuario(Usuario usuario) {
        AppConfig.usuario = usuario;
    }

}
