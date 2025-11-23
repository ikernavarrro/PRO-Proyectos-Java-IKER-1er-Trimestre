/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.zabalburu.actividad20.app;

import java.text.NumberFormat;
import java.text.ParseException;
import javax.swing.JOptionPane;
import net.zabalburu.actividad20.modelo.Libro;

/**
 *
 * @author daw1
 */
public class Libreria {

    private static Libro[] libros = new Libro[50];
    private static int numLibros;
    private static String resumenVentas = null;
    private static double importeTotal = 0;
    private static int totalUnidades = 0, unidadesVendidas = 0;
    private static final NumberFormat nfMoneda = NumberFormat.getCurrencyInstance();
    private static final NumberFormat nf = NumberFormat.getInstance();
        

    public static void main(String[] args) {
        
        crearLibros();
        int menu = 0;
            
        do {
            try {
                menu = Integer.parseInt(JOptionPane.showInputDialog("<html><h2>Seleccione una Opcion: </h2>"
                        + "<ol><li>Listar Libros Alfabéticamente</li>"
                        + "<li>Mostrar Libros de un Tema</li>"
                        + "<li>Listar Libros por Temas</li>"
                        + "<li>Listar Libros por Precio</li>"
                        + "<li>Salir</li></ol>"
                        + "<h2>Opción [1-5] </h2>"
                        + "</html>"));
                switch (menu) {
                    case 1:
                        listarAlfabeticamente();
                        break;
                    case 2:
                        mostrarTema();
                        break;
                    case 3:
                       listarTema();
                        break;
                    case 4:
                        listarPorPrecio(0,numLibros-1);
                        listar();
                        listarPrecioMax();
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(
                                null,
                                "Hasta Luego!",
                                "Adios",
                                JOptionPane.INFORMATION_MESSAGE);
                        break; 
                    default:
                        JOptionPane.showMessageDialog(
                                null,
                                "Debe introducir una Opción entre [1-5]",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(
                        null,
                        "Debe especificar un valor numérico",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } while (menu != 5);

    }
    
    private static void crearLibros(){
    libros[0] = new Libro("Aprenda Java Ya", "Programación", 75.12, 5);
    libros[1] = new Libro("Aprenda C Ya", "Programación", 80.12, 25);
    libros[2] = new Libro("Microsoft Office", "Ofimática", 58.6, 12);
    libros[3] = new Libro("Windows 10", "Sistemas Operativos", 45, 8);
    libros[4] = new Libro("C Avanzado", "Programación", 90, 3);
    libros[5] = new Libro("Word Básico", "Ofimática", 64.6, 10);
    libros[6] = new Libro("Windows 2015 Server", "Sistemas Operativos", 52.3, 7);
    libros[7] = new Libro("Access 2015", "Ofimática", 32.45, 5);
    libros[8] = new Libro("Diseño de Algoritmos", "Programación", 90.15, 10);
    libros[9] = new Libro("Excel 2015", "Ofimática", 52.58, 4);
    numLibros=10;
    }
    
    private static void buscarTema() {
        do {
            String tema = JOptionPane.showInputDialog(null, "Introduzca el tema a buscar: ");
            int i;
            // busqueda ordenada
            for (i = 0; i < numLibros && libros[i].getTema().compareToIgnoreCase(tema)<0; i++);
            
            //busqueda ordenada
            if (i < numLibros && libros[i].getTema().equalsIgnoreCase(tema) ) {
                int librosEncontrados = 0;
                String listado = "<html><h3>Listado de Libros con el tema: "
                        + libros[i].getTema() + "</h3>";
                listado += "<table border=1><tr align='center'><th>Titulo</th>"
                        + "<th>Precio</th><th>Unidades</th></tr>";
                for (; i < numLibros && libros[i].getTema()
                            .equalsIgnoreCase(tema) ; i++) {
                        librosEncontrados++;
                        listado += "<tr align='center'><td>" + libros[i].getTitulo()
                                + "</td><td>" + nfMoneda.format(libros[i].getPrecio())
                                + "</td><td>" + libros[i].getUnidades()
                                + "</td></tr>";
                }
                listado += "</table>";
                listado += "<h4>Se han encontrado " + librosEncontrados
                        + " Libros del tema</h4>";
                listado += "</html>";
                JOptionPane.showMessageDialog(
                        null,
                        listado,
                        "Listado de libros",
                        JOptionPane.PLAIN_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "NO hay ningún libro con ese tema",
                        "NO Encontrado",
                        JOptionPane.WARNING_MESSAGE);
            }

        } while (JOptionPane.showConfirmDialog(
                null,
                "Desea buscar otro libro?",
                "Pregunta",
                JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION);
    }

    private static void listarAlfabeticamente() {
        // Ordenación por Inserción
        // Ordenar por Sueldo en ASCENDENTE
        for (int i = 0; i < numLibros-1; i++) {
            for(int j=i+1;j<numLibros; j++){
                // Están mal ordenados i y j??
                if (libros[i].getTitulo().compareToIgnoreCase(libros[j].getTitulo())
                    > 0){
                   // Intercambiarlos
                   Libro temp = libros[i];
                   libros[i] = libros[j];
                   libros[j] = temp;
                }
            }
        }
        listar();
    }

    private static void listar() {
        String listado = "<html><h1>Listado de Libros</h1>";
        listado +="<table border=1><tr><th>Titulo</th>"+
                "<th>Tema</th><th>Precio</th>"+
                "<th>Unidades</th></tr>";
        int totalUnidades=0;
        double precioTotal=0;
        
        for (int i = 0; i < numLibros; i++) {
            listado +="<tr><td>" + libros[i].getTitulo() +
                "</td><td>" + libros[i].getTema() +
                "</td><td>" + nfMoneda.format(libros[i].getPrecio()) +
                "</td><td>" + libros[i].getUnidades() +
                "</td></tr>";
            totalUnidades+=libros[i].getUnidades();
            precioTotal+=libros[i].getPrecio();
        }
        listado+="<tr><td colspan=2>Totales:</td><td>"+ nfMoneda.format(precioTotal) +"</td><td>"+ totalUnidades +"</td></tr>";
        listado +="</table></html>";
        JOptionPane.showMessageDialog(
            null,
            listado,
            "Listado de Empleados",
            JOptionPane.PLAIN_MESSAGE);
    }

    private static void mostrarTema() {
       // Ordenación por Seleccion
        // Ordenar ASCENDENTE
        for (int i = 0; i < numLibros-1; i++) {
            // De momento i es el MENOR
            int menor = i;
            for(int j=i+1;j<numLibros; j++){
                // Es el elemento j MENOR que el menor?
                if (libros[menor].getTema().compareToIgnoreCase(libros[j].getTema())
                    > 0)
                {
                   // El menor hasta ahora es j
                   menor = j;
                }
            }
            // Es el menor desde i al final el propio i?
            if (i!=menor){
                // Si no, los intercambiamos
                // El menor debe estar en la posición i
                Libro temp = libros[i];
                libros[i] = libros[menor];
                libros[menor] = temp;
            }
        }
        buscarTema();
    }
    
    private static void listarTema() {
        // Ordenación Burbuja
        // Ordenar por Apellido en ASCENDENTE
        for (int i = 0; i < numLibros-1; i++) {
            for(int j=0;j<numLibros-i-1; j++){
                
                if (libros[j].getTema().compareToIgnoreCase(libros[j+1].getTema())>0){
                    Libro temp = libros[j];
                    libros[j] = libros[j+1];
                    libros[j+1] = temp;    
                        
                }
            }
        }
        
        
        String listado = "<html><h1>Listado de Libros</h1>";
        int i=0;
        
        for(int j=0; j<numLibros; j=i){
        int totalUnidades=0;
        double precioTotal=0;
            listado += "<h2>Tema: "+ libros[j].getTema() +"</h2>";
            listado +="<table border=1><tr><th>Titulo</th>"+
                "<th>Tema</th><th>Precio</th>"+
                "<th>Unidades</th></tr>";
            for (i = j; i < numLibros && libros[j].getTema().equalsIgnoreCase(libros[i].getTema()); i++) {
                listado +="<tr><td>" + libros[i].getTitulo() +
                    "</td><td>" + libros[i].getTema() +
                    "</td><td>" + nfMoneda.format(libros[i].getPrecio()) +
                    "</td><td>" + libros[i].getUnidades() +
                    "</td></tr>";
                totalUnidades+=libros[i].getUnidades();
                precioTotal+=libros[i].getPrecio();
            }
            listado+="<tr><td colspan=2>Totales:</td><td>"+ precioTotal +"</td><td>"+ totalUnidades +"</td></tr></table>";
        }
        
        listado +="</html>";
        JOptionPane.showMessageDialog(
            null,
            listado,
            "Listado de Empleados",
            JOptionPane.PLAIN_MESSAGE);
        
    }

    private static void listarPorPrecio( int menor,int mayor) {
        int i=menor;
        int j=mayor-1;
        int pivote=mayor;
        double precioP= libros[pivote].getPrecio();
        do{
            for( ; i<mayor && libros[i].getPrecio()>precioP ; i++ );
            for( ; j>i && libros[j].getPrecio()<precioP ; j-- );
            if(i<j){
                Libro temp=libros[i];
                libros[i]= libros[j];
                libros[j]=temp;
                i++;
            }
            
        }while(i<j);
        Libro temp=libros[i];
        libros[i]= libros[pivote];
        libros[pivote]=temp;
        if(menor<i-1)listarPorPrecio(menor,i-1);
        if(i+1<mayor)listarPorPrecio(i+1,mayor);
        
    }
private static void listarPrecioMax() {
        
        int totalUnidades=0,totalLibros=0;
        double precioTotal=0;
        boolean ok=false;
        double precio=0;
        do{
        String resp = JOptionPane.showInputDialog(null, "Precio Maximo a Listar: ");        
                try {
                    Number n = nf.parse(resp);
                    precio = n.doubleValue();
                    ok = true;
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Debe especificar un valor numérico con decimales",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                }
        }while(!ok);
        
        if(precio>libros[numLibros-1].getPrecio()){
                
            
            String listado = "<html><h1>Listado de Libros cuyo precio es menor que: "+ nfMoneda.format(precio)+"</h1>";
            listado +="<table border=1><tr><th>Titulo</th>"+
                "<th>Tema</th><th>Precio</th>"+
                "<th>Unidades</th></tr>";
            int i;
            
        for (i = 0; precio<libros[i].getPrecio(); i++);
            for (; i < numLibros; i++) {
            System.out.println(precio+">"+libros[i].getPrecio());
            listado +="<tr><td>" + libros[i].getTitulo() +
                "</td><td>" + libros[i].getTema() +
                "</td><td>" + nfMoneda.format(libros[i].getPrecio()) +
                "</td><td>" + libros[i].getUnidades() +
                "</td></tr>";
            totalUnidades+=libros[i].getUnidades();
            precioTotal+=libros[i].getPrecio();
            totalLibros++;
        }
        listado+="<tr><td colspan=2>Totales:</td><td>"+ nfMoneda.format(precioTotal )+"</td><td>"+ totalUnidades +"</td></tr>";
        listado +="</table><h3>Se han encontrado: "+ totalLibros +" Libros</h3></html>";
        JOptionPane.showMessageDialog(
            null,
            listado,
            "Listado de Empleados",
            JOptionPane.PLAIN_MESSAGE);
        }else{
           JOptionPane.showMessageDialog(
            null,
            " El precio Maximo no debe ser menor a: "+ nfMoneda.format(libros[numLibros-1].getPrecio()),
            "Advertencia",
            JOptionPane.PLAIN_MESSAGE); 
        }
    }
}
