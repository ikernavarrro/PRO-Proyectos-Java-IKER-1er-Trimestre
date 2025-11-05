/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.zabalburu.daw1.piedra_papel_tijera;

import javax.swing.JOptionPane;

/**
 *
 * @author Iker Navarro Pérez
 */
public class Piedra_Papel_Tijera {

    /**
     * Estadísticas.
     */
    private static int estadisticasVictoriasJugador = 0;
    private static int estadisticasVictoriasMaquina = 0;
    private static int estadisticasEmpates = 0;

    /**
     * Opciones.
     */
    private static final int PIEDRA = 0;
    private static final int PAPEL = 1;
    private static final int TIJERA = 2;

    public static void main(String[] args) {

        Piedra_Papel_Tijera.menuPPT();

    }

    //========= MÉTODOS =========
    /**
     * Menú:
     */
    private static void menuPPT() {
        int menu = 0;
        boolean ok = false;
        do {
            do {
                String resp = JOptionPane.showInputDialog(null,
                        """
                    <html>                                        
                        <h1>Piedra, Papel o Tijera</h1>
                        <hr />
                            <ol>
                                <li>Jugar</li>
                                <li>Estadísticas</li>
                            </ol>    
                        <p>    
                            Para salir 🠆 [ 0 , Cancelar , X ]
                        </p>
                        <hr />
                    </html>
                    """);
                try {
                    ok = false;
                    if (resp == null || Integer.parseInt(resp) == 0) {
                        menu = 0;
                        ok = true;
                    } else if (Integer.parseInt(resp) >= 1 && Integer.parseInt(resp) <= 2) {
                        menu = Integer.parseInt(resp);
                        ok = true;
                    } else {
                        JOptionPane.showMessageDialog(null,
                                """
                        <html>
                            <h1>¡Introduzca una opción válida!</h1>
                        </html>
                        """, "Información", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,
                            """
                        <html>
                            <h1>¡Introduzca un valor válido!</h1>
                        </html>
                        """, "Información", JOptionPane.ERROR_MESSAGE);
                }

            } while (ok == false);

            switch (menu) {
                case 0:
                    JOptionPane.showMessageDialog(null,
                            """
                        <html>
                            <h1>¡Gracias por Jugar!</h1>
                            <h6>Desarrollado por Iker Navarro Pérez</h6>
                        </html>    
                        """);
                    break;
                case 1:
                    Piedra_Papel_Tijera.jugarPPT();
                    break;
                case 2:
                    Piedra_Papel_Tijera.estadisticasPPT();
                    break;
            }
        } while (menu != 0);
        //======
    }

    /**
     * Realiza la jugada con .
     */
    private static void jugarPPT() {
        int opcMaquina = getOpcMaquina();
        int opcJugador = getOpcJugador();
        
        /*
        switch (opcJugador) {
            case 3:
                break;
            case PIEDRA:
                if (opcMaquina == PAPEL) {
                    JOptionPane.showMessageDialog(null, 
                            """
                            <html>                            
                                <h1>[1] Jugar</h1>
                                <hr />
                                <h2>RESULTADO:</h2>
                                <h4>Jugador sacó PIEDRA | Maquina sacó PAPEL</h4>
                                <p>
                                    <b>¡Gana la Máquina!</b> <br />
                                    Papel gana a piedra.
                                </p>
                                <hr />
                            </html>
                            """);
                    estadisticasVictoriasMaquina++;
                } else if (opcMaquina == TIJERA) {
                    JOptionPane.showMessageDialog(null, 
                            """
                            <html>                            
                                <h1>[1] Jugar</h1>
                                <hr />
                                <h2>RESULTADO:</h2>
                                <h4>Jugador sacó PIEDRA | Maquina sacó TIJERA</h4>
                                <p>
                                    <b>¡Gana el Jugador!</b> <br />
                                    Piedra gana a tijera.
                                </p>
                                <hr />
                            </html>
                            """);
                    estadisticasVictoriasJugador++;
                } else {
                    JOptionPane.showMessageDialog(null, 
                            """
                            <html>                            
                                <h1>[1] Jugar</h1>
                                <hr />
                                <h2>RESULTADO:</h2>
                                <p>
                                    <b>¡EMPATE!</b>
                                </p>
                                <hr />
                            </html>
                            """);
                    estadisticasEmpates++;
                }
                break;
            case PAPEL:
                if (opcMaquina == TIJERA) {
                    JOptionPane.showMessageDialog(null, 
                            """
                            <html>                            
                                <h1>[1] Jugar</h1>
                                <hr />
                                <h2>RESULTADO:</h2>
                                <h4>Jugador sacó PAPEL | Maquina sacó TIJERA</h4>
                                <p>
                                    <b>¡Gana la Máquina!</b> <br />
                                    TIjera gana a papel.
                                </p>
                                <hr />
                            </html>
                            """);
                    estadisticasVictoriasMaquina++;
                } else if (opcMaquina == PIEDRA) {
                    JOptionPane.showMessageDialog(null, 
                            """
                            <html>                            
                                <h1>[1] Jugar</h1>
                                <hr />
                                <h2>RESULTADO:</h2>
                                <h4>Jugador sacó PAPEL | Maquina sacó PIEDRA</h4>
                                <p>
                                    <b>¡Gana el Jugador!</b> <br />
                                    Papel gana a piedra.
                                </p>
                                <hr />
                            </html>
                            """);
                    estadisticasVictoriasJugador++;
                } else {
                    JOptionPane.showMessageDialog(null, 
                            """
                            <html>                            
                                <h1>[1] Jugar</h1>
                                <hr />
                                <h2>RESULTADO:</h2>
                                <p>
                                    <b>¡EMPATE!</b>
                                </p>
                                <hr />
                            </html>
                            """);
                    estadisticasEmpates++;
                }
                break;
            case TIJERA:
                if (opcMaquina == PIEDRA) {
                    JOptionPane.showMessageDialog(null, 
                            """
                            <html>                            
                                <h1>[1] Jugar</h1>
                                <hr />
                                <h2>RESULTADO:</h2>
                                <h4>Jugador sacó TIJERA | Maquina sacó PIEDRA</h4>
                                <p>
                                    <b>¡Gana la Máquina!</b> <br />
                                    Piedra gana a tijera.
                                </p>
                                <hr />
                            </html>
                            """);
                    estadisticasVictoriasMaquina++;
                } else if (opcMaquina == PAPEL) {
                    JOptionPane.showMessageDialog(null, 
                            """
                            <html>                            
                                <h1>[1] Jugar</h1>
                                <hr />
                                <h2>RESULTADO:</h2>
                                <h4>Jugador sacó TIJERA | Maquina sacó PAPEL</h4>
                                <p>
                                    <b>¡Gana el Jugador!</b> <br />
                                    Tijera gana a papel.
                                </p>
                                <hr />
                            </html>
                            """);
                    estadisticasVictoriasJugador++;
                } else {
                    JOptionPane.showMessageDialog(null, 
                            """
                            <html>                            
                                <h1>[1] Jugar</h1>
                                <hr />
                                <h2>RESULTADO:</h2>
                                <p>
                                    <b>¡EMPATE!</b>
                                </p>
                                <hr />
                            </html>
                            """);
                    estadisticasEmpates++;
                }
                break;
        }
        */
    }

    private static int getOpcJugador() {
        int opcJugador = 0;
        boolean ok = false;
        do {
            String resp = JOptionPane.showInputDialog(null,
                    """
                    <html>                                        
                        <h1>[1] Jugar</h1>
                        <hr />
                        <p>   
                            0. Piedra <br />
                            1. Papel <br />
                            2. Tijera <br />
                        </p>
                        <hr />
                        <p>
                            Para salir 🠆 [Cancelar , X]
                        </p>
                        <hr />
                    </html>
                    """);
            try {
                ok = false;
                if (resp == null) {
                    opcJugador = 3;
                    ok = true;
                } else if (Integer.parseInt(resp) >= 0 && Integer.parseInt(resp) <= 2) {
                    opcJugador = Integer.parseInt(resp);
                    ok = true;
                } else {
                    JOptionPane.showMessageDialog(null,
                            """
                        <html>
                            <h1>¡Introduzca una opción válida!</h1>
                        </html>
                        """, "Información", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,
                        """
                        <html>
                            <h1>¡Introduzca un valor válido!</h1>
                        </html>
                        """, "Información", JOptionPane.ERROR_MESSAGE);
            }

        } while (ok == false);
        return opcJugador;
    }

    private static int getOpcMaquina() {
        int opcMaquina = (int) (Math.random() * 3);
        return opcMaquina;
    }
    
    private static void estadisticasPPT(){
        JOptionPane.showMessageDialog(null, 
                """
                <html>                            
                    <h1>[2] Estadísticas</h1>
                    <hr />
                    <p>
                        Victorias Jugador: %d <br />
                        Victorias Maquina: %d <br />
                        Empates: %d
                    </p>
                </html>
                """.formatted(estadisticasVictoriasJugador, estadisticasVictoriasMaquina, estadisticasEmpates));
    }
}
