/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1.actividad02_2_2;

import javax.swing.JOptionPane;
import org.zabalburu.daw1.actividad02_2_2.modelo.Alumno;

/**
 *
 * @author Iker Navarro
 */
public class Actividad02_2_2 {

    public static void main(String[] args) {
        Alumno al1 = new Alumno();
        al1.nombre = JOptionPane.showInputDialog("Nombre Alumno 1:");
        al1.curso = JOptionPane.showInputDialog("Curso Alumno 1: [DAW1 o ASIR1]");
        
        /*String sección1 = JOptionPane.showInputDialog("Sección Alumno 1:  [A o B]"); // COMO PONER LA A SIN QUE SALTE ERROR¿?
        al1.sección = Integer.parseInt(sección1);*/
       
        al1.sección = JOptionPane.showInputDialog("Sección Alumno 1:  [A o B]");
        
        String repetidor1 = JOptionPane.showInputDialog("¿Es repetidor?");
        al1.repetidor = Boolean.parseBoolean(repetidor1);
        String nota1 = JOptionPane.showInputDialog("Nota 1: [0-10]");
        al1.nota1 = Double.parseDouble(nota1);
        String nota2 = JOptionPane.showInputDialog("Nota 2: [0-10]");
        al1.nota2 = Double.parseDouble(nota2);
        String nota3 = JOptionPane.showInputDialog("Nota 3: [0-10]");
        al1.nota3 = Double.parseDouble(nota3);
        
        System.out.println("----------------------------");
        System.out.println("Nombre: %s | Curso: %s | Sección: %s | Repetidor: %b | Nota1: %f | Nota2: %f | Nota3: %f".formatted(al1.nombre, al1.curso, al1.sección, !al1.repetidor, al1.nota1, al1.nota2, al1.nota3));
        System.out.println("----------------------------");
        System.out.printf("La nota media de %s es %.2f \n", al1.nombre, al1.media()); // La nota media de cada alumno
        System.out.println("¿"+ al1.nombre + " está aprobado? " + al1.aprobado()); // si el alumno está aprobado 
        
        /*System.out.println("¿El curso es DAW1 y la sección es A? " + (al1.sección == 'A' && al1.curso.equals("DAW1"))); // si el curso es DAW1 y la sección es A Sin ignore case
        System.out.println("¿El curso es DAW1 y la sección es A? " + (al1.sección == 'A' && al1.curso.equalsIgnoreCase("DAW1"))); // si el curso es DAW1 y la sección es A Con ignore case*/
        System.out.println("¿El curso es DAW1 y la sección es A? " + (al1.sección.equalsIgnoreCase("A") && al1.curso.equals("DAW1")));
        
        
        System.out.println("¿Es repetidor y ha suspendido la nota 1? " + (!al1.repetidor && (al1.nota1 < 5.0))); //si es repetidor y tiene suspendida la nota 1
        System.out.println("¿" + al1.nombre + " ha suspendido alguna asignatura? " + (al1.suspendeAlgo()? "Si" : "No")); //si ha suspendido alguna asignatura
        
        /*System.out.println("¿El curso es DAW1 o ASIR1 y la sección es A o B? " + ((al1.curso.equalsIgnoreCase("ASIR1") || al1.curso.equalsIgnoreCase("DAW1")) && (al1.sección == 'A' || al1.sección == 'B'))); //si su curso es DAW1 o ASIR1 y la sección es A o B*/
        System.out.println("¿El curso es DAW1 o ASIR1 y la sección es A o B? " + ((al1.curso.equalsIgnoreCase("ASIR1") || al1.curso.equalsIgnoreCase("DAW1")) && (al1.sección.equalsIgnoreCase("A") || al1.sección.equalsIgnoreCase("B") )));
        
        System.out.println("¿La nota 1 es la más alta de todas? " + ((al1.nota1 > al1.nota2)? (al1.nota1 > al1.nota3) : ((al1.nota2 > al1.nota3) ? false : false)));//si la nota1 es la más alta de todas
        
        double notaFinal= al1.nota1 *0.3 + al1.nota2 * 0.5 + al1.nota3 * 0.2;
        
        System.out.println("La nota final es %.2f".formatted(notaFinal)); //la nota final, asumiendo que la nota1 es un 30% de la nota final, la nota2 un 50% y la nota3 un 20%
        System.out.println("");//la nota más alta de las tres
        
    }
}
