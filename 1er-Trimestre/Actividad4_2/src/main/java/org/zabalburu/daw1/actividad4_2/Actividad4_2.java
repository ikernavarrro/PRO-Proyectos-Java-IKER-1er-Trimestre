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
        
        Empleado empleado;
        String resp = "";
        int numEmpleados = 0;
        int cobraMasDe200 = 0;
        do {
            empleado = new Empleado();
            numEmpleados++;
            empleado.nombre = JOptionPane.showInputDialog(null, 
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
            empleado.tipo = Integer.parseInt(resp);
            
            resp = JOptionPane.showInputDialog(null, 
                    """
                    <html>
                        <h1>Introduzca el Número de hijos del Nuevo Empleado:</h1> 
                    </html>
                    """);
            empleado.hijos = Integer.parseInt(resp);
            
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
                    """.formatted(empleado.nombre, empleado.getDescripción(), empleado.hijos, empleado.getSueldoBase()),
                    "Datos de %s".formatted(empleado.nombre),
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
                empleado.nuevoPlus(Integer.parseInt(resp)); // Llamámos al método que suma automáticamente los pluses y Convertimos la respuesta del usuario a un Entero.
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
                    """.formatted(empleado.pluses, empleado.getSueldoBruto(), empleado.getPorcIRPF(), empleado.getImporteIRPF(), empleado.getSueldoNeto()),
                    "Datos de %s".formatted(empleado.nombre),
                    JOptionPane.INFORMATION_MESSAGE);
             if (empleado.getSueldoNeto() >= 2000) {
                 cobraMasDe200++;
             }
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
