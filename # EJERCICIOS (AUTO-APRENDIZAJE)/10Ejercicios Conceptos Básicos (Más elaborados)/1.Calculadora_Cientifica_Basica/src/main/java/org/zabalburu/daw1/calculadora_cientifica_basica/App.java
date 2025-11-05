/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.zabalburu.daw1.calculadora_cientifica_basica;

import javax.swing.JOptionPane;

/**
 * 1. Calculadora científica básica. 31/10/2025
 *
 * @author Iker Navarro Pérez
 */
public class App {

    public static void main(String[] args) {
        App.menuCalculadora(); // Accedemos a la calculadora.
        
    }

    //============| Métodos |===============
    /**
     * [Menú Calculadora] 1 - Suma, 2 - Resta, 3 - Multiplicación, 4 - División, 5 -
     * Potencia, 6 - Raíz Cuadrada, 7 - Factorial
     */
    private static void menuCalculadora() {
        int menu = -1; //Nos permitirá mas adelante elegir la opciones del menú.
        String resp = "";
        do {
            boolean ok = false; //Esta variable booleana nos sirve para mantenernos en bucle hasta que pase el filtro de try/catch.
            do {
                resp = JOptionPane.showInputDialog(null, //Pedimos la opción.
                        """
                     <html>
                        <h1>Menú Calculadora Científica Básica</h1>
                        <hr />
                        <ol>
                            <li>Suma</li>
                            <li>Resta</li>
                            <li>Multiplicación</li>
                            <li>División</li>
                            <li>Potencia</li>
                            <li>Raiz Cuadrada</li>
                            <li>Factorial</li>
                        </ol>
                        <hr />  
                        <p>
                            Para salir 🠆 [ 0 / Cancelar / X ]
                        </p>    
                     </html>
                    """);

                try {
                    ok = false;
                    if (resp == null || Integer.parseInt(resp) == 0) { //Si el usuario le da a la x, cancela o introduce un 0 salimos.
                        menu = 0;
                        ok = true;
                    } else { //Si no entramos aquí.
                        if (Integer.parseInt(resp) >= 0 && Integer.parseInt(resp) <= 7) { //Comprobamos que la opción introducida esté entre el 0 y el 7 ambos incluidos. SI LA OPCIÓN O TIPO NO ES VÁLIDO VAMOS AL CATCH.
                            menu = Integer.parseInt(resp); 
                            ok = true; //Solo si asigna el menu correctamente, entonces salimos de la repetitiva.
                        } else { // Si no está lanzamos un aviso y volvemos a pedirlo.
                            JOptionPane.showMessageDialog(null,
                                    """
                            <html>
                                <h1>¡Introduzca una opción válida!</h1>
                            </html>
                            """, "Información", JOptionPane.ERROR_MESSAGE);
                        }
                        
                    }
                    
                } catch (Exception ex) { // En caso de que la opción introducida no sea del tipo que esperamos lanzamos el aviso y volvemos a pedirlo. 
                    JOptionPane.showMessageDialog(null,
                            """
                            <html>
                                <h1>¡Introduzca una opción válida!</h1>
                                <hr />
                                <h3>%s] %s</h3>
                            </html>
                            """.formatted(ex.getStackTrace().toString(), ex.getMessage()), "Información", JOptionPane.ERROR_MESSAGE);
                }
            } while (ok == false);
            switch (menu) { //Sencillo, dependiendo del valor ejecutamos un método u otro.
                case 0:
                    JOptionPane.showMessageDialog(null,
                            """
                            <html>                            
                                <h1>¡Gracias por usar la Calculadora!</h1>
                                <hr />
                                <h5>Desarrollado por Iker Navarro Pérez | 31/10/2025</h5>
                            </html>
                            """);
                    break;
                case 1:
                    App.suma();
                    break;
                case 2:
                    App.resta();
                    break;
                case 3:
                    App.multiplicacion();
                    break;
                case 4:
                    App.division();
                    break;
                case 5:
                    App.potencia();
                    break;
                case 6:
                    App.raizCuadrada();
                    break;
                case 7:
                    App.factorial();
                    break;
            }
        } while (menu != 0); //Repetimos mientras la opción no sea 0 (es decir mientras no quiera salir.)
    }

    /**
     * 1 - Suma
     */
    private static void suma() {
        int num1 = 0;
        int num2 = 0;
        int resultado = 0;
        String resp = "";
        boolean ok = false;
        
        //======= Asignación número 1.
        do {
            resp = JOptionPane.showInputDialog(null,
                    """
                     <html>
                        <h1>[1] Suma</h1>   
                        <hr />    
                        <h3>Número 1:</h3>
                        <h3>🠆𓂸🠘 + 𓂸 = 𓂸</h3>
                     </html>
                    """);

            try {
                ok = false;
                if (resp == null || Integer.parseInt(resp) == 0) {
                    // NO HACEMOS NADA Y CERRAMOS LA VENTANA
                    ok = true;
                } else {
                    num1 = Integer.parseInt(resp);
                    ok = true;
                }
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,
                            """
                            <html>
                                <h1>¡Introduzca un valor válido!</h1>
                                <hr />
                                <h3>%s] %s</h3>
                            </html>
                            """.formatted(ex.getStackTrace().toString(), ex.getMessage()), "Información", JOptionPane.ERROR_MESSAGE);
            }
        } while (ok == false);
        
        //======= Asignación número 2.
        do {
            resp = JOptionPane.showInputDialog(null,
                    """
                     <html>
                        <h1>[1] Suma</h1>   
                        <hr />    
                        <h3>Número 2:</h3>
                        <h3>%d + 🠆𓂸🠘 = 𓂸</h3>
                     </html>
                    """.formatted(num1));

            try {
                ok = false;
                if (resp == null || Integer.parseInt(resp) == 0) {
                    // NO HACEMOS NADA Y CERRAMOS LA VENTANA
                    ok = true;
                } else {
                    num2 = Integer.parseInt(resp);
                    ok = true;
                }
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,
                            """
                            <html>
                                <h1>¡Introduzca un valor válido!</h1>
                                <hr />
                                <h3>%s] %s</h3>
                            </html>
                            """.formatted(ex.getStackTrace().toString(), ex.getMessage()), "Información", JOptionPane.ERROR_MESSAGE);
                
            }
        } while (ok == false);
        
        resultado = num1 + num2; // Realizamos la operación.
        
        JOptionPane.showMessageDialog(null,
                    """
                     <html>
                        <h1>[1] Suma</h1>   
                        <hr />    
                        <h3>%d + %d = %d</h3>    
                     </html>
                    """.formatted(num1, num2, resultado));
    }
        
    /**
     * 2 - Resta
     */

    private static void resta() {
        int num1 = 0;
        int num2 = 0;
        int resultado = 0;
        String resp = "";
        boolean ok = false;
        
        //======= Asignación número 1.
        do {
            resp = JOptionPane.showInputDialog(null,
                    """
                     <html>
                        <h1>[2] Resta</h1>   
                        <hr />    
                        <h3>Número 1:</h3> 
                        <h3>🠆𓂸🠘 - 𓂸 = 𓂸</h3>
                     </html>
                    """);

            try {
                ok = false;
                if (resp == null || Integer.parseInt(resp) == 0) {
                    // NO HACEMOS NADA Y CERRAMOS LA VENTANA
                    ok = true;
                } else {
                    num1 = Integer.parseInt(resp);
                    ok = true;
                }
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,
                            """
                            <html>
                                <h1>¡Introduzca un valor válido!</h1>
                                <hr />
                                <h3>%s] %s</h3>
                            </html>
                            """.formatted(ex.getStackTrace().toString(), ex.getMessage()), "Información", JOptionPane.ERROR_MESSAGE);
            }
        } while (ok == false);
        
        //======= Asignación número 2.
        do {
            resp = JOptionPane.showInputDialog(null,
                    """
                     <html>
                        <h1>[2] Resta</h1>   
                        <hr />    
                        <h3>Número 2:</h3>
                        <h3>%d - 🠆𓂸🠘 = 𓂸</h3>
                     </html>
                    """.formatted(num1));

            try {
                ok = false;
                if (resp == null || Integer.parseInt(resp) == 0) {
                    // NO HACEMOS NADA Y CERRAMOS LA VENTANA
                    ok = true;
                } else {
                    num2 = Integer.parseInt(resp);
                    ok = true;
                }
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,
                            """
                            <html>
                                <h1>¡Introduzca un valor válido!</h1>
                                <hr />
                                <h3>%s] %s</h3>
                            </html>
                            """.formatted(ex.getStackTrace().toString(), ex.getMessage()), "Información", JOptionPane.ERROR_MESSAGE);
                
            }
        } while (ok == false);
        
        resultado = num1 - num2; // Realizamos la operación.
        
        JOptionPane.showMessageDialog(null,
                    """
                     <html>
                        <h1>[2] Resta</h1>   
                        <hr />    
                        <h3>%d - %d = %d</h3>    
                     </html>
                    """.formatted(num1, num2, resultado));
    }

    /**
     * 3 - Multiplicación
     */
    private static void multiplicacion() {
        int num1 = 0;
        int num2 = 0;
        int resultado = 0;
        String resp = "";
        boolean ok = false;
        
        //======= Asignación número 1.
        do {
            resp = JOptionPane.showInputDialog(null,
                    """
                     <html>
                        <h1>[3] Multiplicación</h1>   
                        <hr />    
                        <h3>Número 1:</h3>    
                        <h3>🠆𓂸🠘 x 𓂸 = 𓂸</h3>
                     </html>
                    """);

            try {
                ok = false;
                if (resp == null || Integer.parseInt(resp) == 0) {
                    // NO HACEMOS NADA Y CERRAMOS LA VENTANA
                    ok = true;
                } else {
                    num1 = Integer.parseInt(resp);
                    ok = true;
                }
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,
                            """
                            <html>
                                <h1>¡Introduzca un valor válido!</h1>
                                <hr />
                                <h3>%s] %s</h3>
                            </html>
                            """.formatted(ex.getStackTrace().toString(), ex.getMessage()), "Información", JOptionPane.ERROR_MESSAGE);
            }
        } while (ok == false);
        
        //======= Asignación número 2.
        do {
            resp = JOptionPane.showInputDialog(null,
                    """
                     <html>
                        <h1>[3] Multiplicación</h1>   
                        <hr />    
                        <h3>Número 2:</h3>
                        <h3>%d x 🠆𓂸🠘 = 𓂸</h3>
                     </html>
                    """.formatted(num1));

            try {
                ok = false;
                if (resp == null || Integer.parseInt(resp) == 0) {
                    // NO HACEMOS NADA Y CERRAMOS LA VENTANA
                    ok = true;
                } else {
                    num2 = Integer.parseInt(resp);
                    ok = true;
                }
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,
                            """
                            <html>
                                <h1>¡Introduzca un valor válido!</h1>
                                <hr />
                                <h3>%s] %s</h3>
                            </html>
                            """.formatted(ex.getStackTrace().toString(), ex.getMessage()), "Información", JOptionPane.ERROR_MESSAGE);
                
            }
        } while (ok == false);
        
        resultado = num1 * num2; // Realizamos la operación.
        
        JOptionPane.showMessageDialog(null,
                    """
                     <html>
                        <h1>[3] Multiplicación</h1>   
                        <hr />    
                        <h3>%d x %d = %d</h3>    
                     </html>
                    """.formatted(num1, num2, resultado));
    }

    /**
     * 4 -División
     */
    private static void division() {
        int num1 = 0;
        int num2 = 0;
        double resultado = 0.0;
        String resp = "";
        boolean ok = false;
        
        //======= Asignación número 1.
        do {
            resp = JOptionPane.showInputDialog(null,
                    """
                     <html>
                        <h1>[4] División</h1>   
                        <hr />    
                        <h3>Número 1:</h3>
                        <h3>🠆𓂸🠘 / 𓂸 = 𓂸</h3>
                     </html>
                    """);

            try {
                ok = false;
                if (resp == null || Integer.parseInt(resp) == 0) {
                    // NO HACEMOS NADA Y CERRAMOS LA VENTANA
                    ok = true;
                } else {
                    num1 = Integer.parseInt(resp);
                    ok = true;
                }
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,
                            """
                            <html>
                                <h1>¡Introduzca un valor válido!</h1>
                                <hr />
                                <h3>%s] %s</h3>
                            </html>
                            """.formatted(ex.getStackTrace().toString(), ex.getMessage()), "Información", JOptionPane.ERROR_MESSAGE);
            }
        } while (ok == false);
        
        //======= Asignación número 2.
        do {
            resp = JOptionPane.showInputDialog(null,
                    """
                     <html>
                        <h1>[4] División</h1>   
                        <hr />    
                        <h3>Número 2:</h3>
                        <h3>%d / 🠆𓂸🠘 = 𓂸</h3>
                     </html>
                    """.formatted(num1));

            try {
                ok = false;
                if (resp == null || Integer.parseInt(resp) == 0) {
                    // NO HACEMOS NADA Y CERRAMOS LA VENTANA
                    ok = true;
                } else {
                    num2 = Integer.parseInt(resp);
                    ok = true;
                }
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,
                            """
                            <html>
                                <h1>¡Introduzca un valor válido!</h1>
                                <hr />
                                <h3>%s] %s</h3>
                            </html>
                            """.formatted(ex.getStackTrace().toString(), ex.getMessage()), "Información", JOptionPane.ERROR_MESSAGE);
                
            }
        } while (ok == false);
        
        resultado = (double)num1 / num2; // Realizamos la operación.
        
        JOptionPane.showMessageDialog(null,
                    """
                     <html>
                        <h1>[4] División</h1>   
                        <hr />    
                        <h3>%d / %d = %f</h3>    
                     </html>
                    """.formatted(num1, num2, resultado));
    }

    /**
     * 5 - Potencia
     */
    private static void potencia() {
        int base = 0;
        int exponente = 0;
        double resultado = 0;
        String resp = "";
        boolean ok = false;
        
        //======= Asignación BASE.
        do {
            resp = JOptionPane.showInputDialog(null,
                    """
                     <html>
                        <h1>[5] Potencia</h1>   
                        <hr />    
                        <h3>Base:</h3>
                        <h3>🠆𓂸<sup>𓂸</sup></h3>
                     </html>
                    """);

            try {
                ok = false;
                if (resp == null || Integer.parseInt(resp) == 0) {
                    // NO HACEMOS NADA Y CERRAMOS LA VENTANA
                    ok = true;
                } else {
                    base = Integer.parseInt(resp);
                    ok = true;
                }
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,
                            """
                            <html>
                                <h1>¡Introduzca un valor válido!</h1>
                                <hr />
                                <h3>%s] %s</h3>
                            </html>
                            """.formatted(ex.getStackTrace().toString(), ex.getMessage()), "Información", JOptionPane.ERROR_MESSAGE);
            }
        } while (ok == false);
        
        //======= Asignación EXPONENTE.
        do {
            resp = JOptionPane.showInputDialog(null,
                    """
                     <html>
                        <h1>[5] Potencia</h1>   
                        <hr />    
                        <h3>Exponente:</h3>
                        <h3>%d<sup>𓂸🠘</sup></h3>
                     </html>
                    """.formatted(base));

            try {
                ok = false;
                if (resp == null || Integer.parseInt(resp) == 0) {
                    // NO HACEMOS NADA Y CERRAMOS LA VENTANA
                    ok = true;
                } else {
                    exponente = Integer.parseInt(resp);
                    ok = true;
                }
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,
                            """
                            <html>
                                <h1>¡Introduzca un valor válido!</h1>
                                <hr />
                                <h3>%s] %s</h3>
                            </html>
                            """.formatted(ex.getStackTrace().toString(), ex.getMessage()), "Información", JOptionPane.ERROR_MESSAGE);
                
            }
        } while (ok == false);
        
        resultado = Math.pow(base, exponente);
        
        JOptionPane.showMessageDialog(null,
                    """
                     <html>
                        <h1>[5] Potencia</h1>   
                        <hr />    
                        <h3>%d<sup>%d</sup> = %f</h3>    
                     </html>
                    """.formatted(base, exponente, resultado));  
        
    }

    /**
     * 6 - Raíz Cuadrada
     */
    private static void raizCuadrada() {
        int num1 = 0;
        double resultado = 0;
        String resp = "";
        boolean ok = false;
        
        //======= Asignación número 1.
        do {
            resp = JOptionPane.showInputDialog(null,
                    """
                     <html>
                        <h1>[6] Raíz Cuadrada</h1>   
                        <hr />    
                        <h3>Número:</h3>
                        <h3>√𓂸🠘</h3>
                     </html>
                    """);

            try {
                ok = false;
                if (resp == null || Integer.parseInt(resp) == 0) {
                    // NO HACEMOS NADA Y CERRAMOS LA VENTANA
                    ok = true;
                } else {
                    num1 = Integer.parseInt(resp);
                    ok = true;
                }
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,
                            """
                            <html>
                                <h1>¡Introduzca un valor válido!</h1>
                                <hr />
                                <h3>%s] %s</h3>
                            </html>
                            """.formatted(ex.getStackTrace().toString(), ex.getMessage()), "Información", JOptionPane.ERROR_MESSAGE);
            }
        } while (ok == false);
        
        resultado += Math.sqrt(num1);
        
        JOptionPane.showMessageDialog(null,
                    """
                     <html>
                        <h1>[6] Raíz Cuadrada</h1>   
                        <hr />    
                        <h3>√%d = %f</h3>    
                     </html>
                    """.formatted(num1, resultado)); 
    }

    /**
     * 7 - Factorial
     */
    private static void factorial() {
        long num1 = 0L;
        String resp = "";
        boolean ok = false;
        
        //======= Asignación número 1.
        do {
            resp = JOptionPane.showInputDialog(null,
                    """
                     <html>
                        <h1>[7] Factorial</h1>   
                        <hr />    
                        <h3>Número:</h3>
                        <h3>𓂸🠘</h3>
                     </html>
                    """);

            try {
                ok = false;
                if (resp == null || Integer.parseInt(resp) == 0) {
                    // NO HACEMOS NADA Y CERRAMOS LA VENTANA
                    ok = true;
                } else {
                    num1 = Long.parseLong(resp); 
                    ok = true;
                }
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,
                            """
                            <html>
                                <h1>¡Introduzca un valor válido!</h1>
                                <hr />
                                <h3>%s] %s</h3>
                            </html>
                            """.formatted(ex.getStackTrace().toString(), ex.getMessage()), "Información", JOptionPane.ERROR_MESSAGE);
            }
        } while (ok == false);
        
        long factorialDe = num1;
        
        for (int i = 1; i < factorialDe; i++) {
            num1 *= i;
        }
        
        JOptionPane.showMessageDialog(null,
                    """
                     <html>
                        <h1>[7] Factorial</h1>   
                        <hr />    
                        <h3>%d! = %d</h3>    
                     </html>
                    """.formatted(factorialDe, num1)); 
    }

}
