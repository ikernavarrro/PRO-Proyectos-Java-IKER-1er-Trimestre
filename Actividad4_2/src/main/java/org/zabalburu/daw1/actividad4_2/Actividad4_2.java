/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.zabalburu.daw1.actividad4_2;

import javax.swing.JOptionPane;
import org.zabalburu.daw1.actividad4_2.modelo.Empleado;

/**
 *
 * @author Iker Navarro Pérez
 */
public class Actividad4_2 {

    public static void main(String[] args) {
        
        Empleado xx = new Empleado();
        String resp = "";
        
        do {
            xx.nombre = JOptionPane.showInputDialog(null, 
                    """
                    <html>
                        <h1>Introduzca el Nombre de un Nuevo Empleado:</h1> 
                    </html>
                    """);
            
            resp = JOptionPane.showInputDialog(null, 
                    """
                    <html>
                        <h1>Introduzca el Tipo del Nuevo Empleado:</h1> 
                        <hr />
                        <p>
                            1 : Operario <br />
                            2 : Obrero Especialista <br />
                            3 : Administrativo <br />
                            4 : Licenciado
                        </p>
                    </html>
                    """);
            xx.tipo = Integer.parseInt(resp);
            
            resp = JOptionPane.showInputDialog(null, 
                    """
                    <html>
                        <h1>Introduzca el Número de hijos del Nuevo Empleado:</h1> 
                    </html>
                    """);
            xx.hijos = Integer.parseInt(resp);
            
            JOptionPane.showMessageDialog(null, 
                    """
                    <html>
                        <hr />
                        <p>
                            Nombre: %s <br />
                            Tipo: %s <br />
                            Hijos: %d <br />
                            Sueldo Base: %.0f€
                        </p>
                        <hr />
                    </html>
                    """.formatted(xx.nombre, xx.getDescripción(), xx.hijos, xx.getSueldoBase()),
                    "Datos de %s".formatted(xx.nombre),
                    JOptionPane.INFORMATION_MESSAGE);
            
            do{
                resp = JOptionPane.showInputDialog(null, 
                    """
                    <html>
                        <h1>Introduzca la cantidad del PLUS para el Nuevo Empleado:</h1> 
                        <hr />
                        <p>
                            (Introduzca una cantidad IGUAL a 0 para CONTINUAR sin agregar nada más).
                        </p>
                    </html>
                    """);
                xx.nuevoPlus(Integer.parseInt(resp)); // Llamámos al método que suma automáticamente los pluses y Convertimos la respuesta del usuario a un Entero.
            }while (Integer.parseInt(resp) != 0); // Comparamos la respuesta, si no es 0 volvemos a pedir otro plus.
            
            JOptionPane.showMessageDialog(null, 
                    """
                    <html>
                        <hr />
                        <p>
                            Pluses: %.2f€ <br />
                            Sueldo Bruto: %.2f€ <br />
                            IRPF: %.1f%%     Importe IRPF: %.2f€ <br />
                            Sueldo Neto: %.2f€ <br />
                        </p>
                        <hr />
                    </html>
                    """.formatted(xx.pluses, xx.getSueldoBruto(), xx.getPorcIRPF(), xx.getImporteIRPF(), xx.getSueldoNeto()),
                    "Datos de %s".formatted(xx.nombre),
                    JOptionPane.INFORMATION_MESSAGE);
             
            resp = JOptionPane.showInputDialog(null, 
                    """
                    <html>
                        <h1>¿Desea Introducir un Nuevo Empleado?</h1>
                        <hr />
                        <p>
                            1 : SI <br />
                            2 : SALIR
                        </p>
                    </html>
                    """);
            
        }while (Integer.parseInt(resp) == 1);
    }
}
