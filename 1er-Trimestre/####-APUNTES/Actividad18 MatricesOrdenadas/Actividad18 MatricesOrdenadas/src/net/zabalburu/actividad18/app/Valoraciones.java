/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.zabalburu.actividad18.app;

import javax.swing.JOptionPane;
import net.zabalburu.actividad18.modelo.Serie;

/**
 *
 * @author daw1
 */
public class Valoraciones {

    private static final Serie[] series = new Serie[100];
    private static int numSeries;
    
    
    public static void main(String[] args) {
        crearSeries();
        int menu=0;
        do{
            try{
            menu = Integer.parseInt(JOptionPane.showInputDialog("<html><h2>Seleccione una Opcion: </h2>"
                        + "<ol><li>Votar serie</li>"
                        + "<li>Buscar Series que el Titulo empiece por una palabra </li>"
                        + "<li>Buscar Series que el Titulo termine por una palabra</li>"
                        + "<li>Buscar Series que la Sinopsis contenga una palabra</li>"
                        + "<li>Insertar Nueva Serie</li>"
                        + "<li>Mostrar Series por una Categoria</li>"
                        + "<li>Mostrar todas las Series</li>"
                        + "<li>Salir</li></ol>"
                        + "<h2>Opción [1-8] </h2>"
                        + "</html>"));
            
            switch (menu) {
                case 1:
                    votarSerie();
                    break;
                case 2:
                    buscarSerieEmpiece();
                    break;
                case 3:
                    buscarSerieTermine();
                    break;
                case 4:
                    buscarSerieContenga();
                    break;
                case 5:
                    if(numSeries<series.length){
                       insertarSerie(); 
                    }else{
                        JOptionPane.showMessageDialog(null, "No hay mas Espacio para añadir series");
                    }
                    
                    break;
                case 6:
                    listadoAgrupado();
                    break;
                case 7:
                    JOptionPane.showMessageDialog(
                    null,
                    mostrarSeries(),
                    "Listado de Series",
                    JOptionPane.PLAIN_MESSAGE);
                    break;
                case 8:
                    listadoPorAbcedario();
                    JOptionPane.showMessageDialog(null,"Hasta Luego");
                    break;
                default:
                    JOptionPane.showMessageDialog(
                                null,
                                "Debe introducir una Opción entre [1-8]",
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
        } while (menu != 8);
        
    
        
    }
    private static void crearSeries(){
    series[0] = new Serie("After Amor y Odio","Comedia Rusa entre una pareja de Rusos nada normales","Romance");
    series[1] = new Serie("Brookling","Serie Americana ambientada en los años 80","Epoca");
    series[2] = new Serie("Cooking Fast Food","Vida del famoso cocinero de comida rapida James Disney","Comida");
    series[3] = new Serie("Day after","Animacion Japonesa sobre dias despues del fin del mundo");
    series[4] = new Serie("Day after dos","Animacion Japonesa sobre dias despues del fin del mundo");
    series[5] = new Serie("Day after tres","Animacion Japonesa sobre dias despues del fin del mundo");
    series[6] = new Serie("Goosip Girl after","Basada en historias de chicas reales","Romance");
    series[7] = new Serie("La Casa de Papel","Serie Española sobre el atraco al banco de España","Suspenso");
    series[8] = new Serie("Moon","Serie Documental sobre la luna");
    series[9] = new Serie("OA","Basada en Organizaciones de la mafia Americana","Romance");
    series[10] = new Serie("Pricipe de BellAir","Mitica serie del principe del rap","Novela");
    series[11] = new Serie("Riverdalle","Amor, sexo y violencia todo en una serie para adultos","Suspenso");
    series[12] = new Serie("Riverdalle 2","Amor, sexo y violencia todo en una serie para adultos","Suspenso");
    series[13] = new Serie("Riverdalle 3","Amor, sexo y violencia todo en una serie para adultos","Suspenso");
    series[14] = new Serie("Riverdalle 4","Amor, sexo y violencia todo en una serie para adultos","Suspenso");
    numSeries=15;
    }

    private static void votarSerie() {
       do{
        String titulo = JOptionPane.showInputDialog(null, "Introduzca el titulo a buscar: ");
        
        //metodo QuickSort de busqueda
        int menor = 0;
            int mayor = numSeries - 1;
            int medio = (menor + mayor) / 2;
            while (menor <= mayor && 
                !titulo.equalsIgnoreCase(series[medio].getTitulo())){
                if (titulo.compareToIgnoreCase(series[medio].getTitulo())>0){
                    // Está en la parte superior
                    menor = medio + 1;
                } else {
                    // Está en la parte inferior
                    mayor = medio - 1;
                }
                medio = (menor + mayor) / 2;
            }
            if (menor <= mayor) {
                // Encontrado (medio)
                int voto=0;
                do{
                voto = Integer.parseInt(JOptionPane.showInputDialog(null,"<html><h3>Serie Encontrada: </h3>"
                        + "<table><tr><td>Titulo : </td><td>"
                        + series[medio].getTitulo() + "</td></tr>"
                        + "<tr><td>Sinopsis : </td><td>" 
                        + series[medio].getSinopsis() + "</td></tr>"
                        + "<tr><td>Votos : </td><td>"
                        + series[medio].getVotos() + "</td></tr>"
                        + "<tr><td>Valoracion Media : </td><td>"
                        + series[medio].getValoracion() + " de 10 </td></tr>"
                        + "</table></html>"
                        + "<h3>Introduzca tu valoración de la serie [1-10]: </h3>"));
                
                if(voto<0 || voto>10){
                    JOptionPane.showMessageDialog(null," Debe introducir un valor entre 1 y 10");
                }
                }while(voto<0 || voto>10);
                series[medio].votar(voto);
                JOptionPane.showMessageDialog(null, "Muchas Gracias por tu Voto!");
            } else {
                // No Encontrado
                JOptionPane.showMessageDialog(
                        null,
                        "NO hay ningúna serie con ese titulo",
                        "NO Encontrado",
                        JOptionPane.WARNING_MESSAGE);
            }
       } while (JOptionPane.showConfirmDialog(
                null,
                "Desea votar otra Serie?",
                "Pregunta",
                JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION);
    }
    private static void buscarSerieEmpiece() {
        do {
            String texto = JOptionPane.showInputDialog("Introduzca la palabra a buscar: ");
            int i;
            for (i = 0; i < numSeries
                    && !series[i].getTitulo().toLowerCase().startsWith(texto.toLowerCase());
                    i++);
            
            if (i < numSeries){
                 
               int totalSeries = 0, totalValoraciones = 0;
               String listado= "<html><h1>Listado de todas las Series</h1>";
                listado += "<table border=1><tr><th>Titulo</th><th>Sinopsis</th><th>Categoria</th>"
                + "<th>Votos</th><th>Valoracion Media</th></tr>";
                
                for ( ; i < numSeries 
                        && series[i].getTitulo().toLowerCase().startsWith(texto.toLowerCase())
                        ; i++) {
                    totalSeries++;
                    totalValoraciones+=series[i].getValoracion();
                listado += "<tr><td>"+ series[i].getTitulo() + "</td>"
                    + "<td>"+ series[i].getSinopsis() + "</td>"
                    + "<td>"+ series[i].getCategoria() + "</td>"
                    + "<td>"+ series[i].getVotos() + "</td>"
                    + "<td>"+ series[i].getValoracion() + " de 10 </td></tr>";
                }
                listado+="</table>";
                listado += "<h4>Se han encontrado " + totalSeries +
                        " Series</h4>";
                listado += "<h4>Valoracion Media : " + totalValoraciones/totalSeries +"</h4>";
                listado += "</html>";
                JOptionPane.showMessageDialog(
                        null,
                        listado,
                        "Listado de Series",
                        JOptionPane.PLAIN_MESSAGE);

            } else {
                // No Encontrado
                JOptionPane.showMessageDialog(
                        null,
                        "NO hay ninguna serie que empiece con esa Palabra",
                        "NO Encontrado",
                        JOptionPane.WARNING_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(
                null,
                "Buscar Otra Serie",
                "Pregunta",
                JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION);
    }

    private static void buscarSerieTermine() {
        do {
            String texto = JOptionPane.showInputDialog("Introduzca la palabra a buscar");

            int i;
            for (i = 0; i < numSeries
                    && !series[i].getTitulo().toLowerCase().endsWith(texto.toLowerCase());
                    i++);
            if (i < numSeries) {
                // Hay alguna serie que contiene el texto
                int valoracion = 0;
                int seriesEncontradas = 0;
                 String listado= "<html><h1>Listado de Series que finalizan con la palabra: " + texto + " en el Titulo</h1>";
        listado += "<table border=1><tr><th>Titulo</th><th>Sinopsis</th><th>Categoria</th>"
                + "<th>Votos</th><th>Valoracion Media</th></tr>";
        
        for(; i < numSeries; i++) {
            if(series[i].getTitulo().toLowerCase().contains(texto.toLowerCase())){
            seriesEncontradas++;
            valoracion+=series[i].getValoracion();
            listado += "<tr><td>"+ series[i].getTitulo() + "</td>"
                    + "<td>"+ series[i].getSinopsis() + "</td>"
                    + "<td>"+ series[i].getCategoria() + "</td>"
                    + "<td>"+ series[i].getVotos() + "</td>"
                    + "<td>"+ series[i].getValoracion() + " de 10 </td></tr>";
            }
        }
        listado+="</table> <h3>Se encontraron un total de: " + seriesEncontradas + "</h3>"
                + "<h3>Con una valoracion media de: " + valoracion/seriesEncontradas + " de 10</h3></html>";
                JOptionPane.showMessageDialog(
                        null,
                        listado,
                        "Listado de Series que finalizan con la palabra: " + texto + " en el Titulo",
                        JOptionPane.PLAIN_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "NO hay ninguna serie que contenga ese texto",
                        "NO Encontrado",
                        JOptionPane.WARNING_MESSAGE);
            }

        } while (JOptionPane.showConfirmDialog(
                null,
                "Buscar Otra Serie",
                "Pregunta",
                JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION);
    }

    private static void buscarSerieContenga() {
        do {
            String texto = JOptionPane.showInputDialog("Introduzca la palabra a buscar");

            int i;
            for (i = 0; i < numSeries
                    && !series[i].getSinopsis().toLowerCase().contains(texto.toLowerCase());
                    i++);
            if (i < numSeries) {
                // Hay alguna serie que contiene el texto
                int valoracion = 0;
                int seriesEncontradas = 0;
                 String listado= "<html><h1>Listado de Series que contienen la palabra: " + texto + " en la Sinopsis</h1>";
        listado += "<table border=1><tr><th>Titulo</th><th>Sinopsis</th><th>Categoria</th>"
                + "<th>Votos</th><th>Valoracion Media</th></tr>";
        
        for(; i < numSeries; i++) {
            if(series[i].getSinopsis().toLowerCase().contains(texto.toLowerCase())){
            seriesEncontradas++;
            valoracion+=series[i].getValoracion();
            listado += "<tr><td>"+ series[i].getTitulo() + "</td>"
                    + "<td>"+ series[i].getSinopsis() + "</td>"
                    + "<td>"+ series[i].getCategoria() + "</td>"
                    + "<td>"+ series[i].getVotos() + "</td>"
                    + "<td>"+ series[i].getValoracion() + " de 10 </td></tr>";
            }
        }
        listado+="</table> <h3>Se encontraron un total de: " + seriesEncontradas + "</h3>"
                + "<h3>Con una valoracion media de: " + valoracion/seriesEncontradas + " de 10</h3></html>";
                JOptionPane.showMessageDialog(
                        null,
                        listado,
                        "Listado de Series que contienen la palabra: " + texto + " en la Sinopsis",
                        JOptionPane.PLAIN_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "NO hay ninguna serie que contenga ese texto",
                        "NO Encontrado",
                        JOptionPane.WARNING_MESSAGE);
            }

        } while (JOptionPane.showConfirmDialog(
                null,
                "Buscar Otra Serie",
                "Pregunta",
                JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION);
    }

    private static String mostrarSeries() {
        
        String listado= "<html><h1>Listado de todas las Series</h1>";
        listado += "<table border=1><tr><th>Titulo</th><th>Sinopsis</th><th>Categoria</th>"
                + "<th>Votos</th><th>Valoracion Media</th></tr>";
        
        for(int i=0; i < numSeries; i++) {
            
            listado += "<tr><td>"+ series[i].getTitulo() + "</td>"
                    + "<td>"+ series[i].getSinopsis() + "</td>"
                    + "<td>"+ series[i].getCategoria() + "</td>"
                    + "<td>"+ series[i].getVotos() + "</td>"
                    + "<td>"+ series[i].getValoracion() + " de 10 </td></tr>";
            }
        listado+="</table></html>";
            return listado;
    }

    private static void insertarSerie() {
       do {
            String titulo = JOptionPane.showInputDialog("Titulo: ");
            String sinopsis = JOptionPane.showInputDialog("Sinopsis: ");
            String categoria = JOptionPane.showInputDialog("Categoria: ");
            if (categoria.isEmpty()){
                categoria="Sin Categoria";
            }
            
            
            // Busqueda de manera ordenada
            
//inicializo la i fuera del for para poder guardar la posicion del elemento que estoy byscando si lo encuentro
            int i;
            
            // este for es mi busqueda ordenada
            for (i = 0;
                    i < numSeries
                    && titulo.toLowerCase().toLowerCase().compareToIgnoreCase(series[i].getTitulo().toLowerCase())>0;
                    i++);
 //verifico que la i sea menor que el tamañ de la matriz para saber si lo encontro y que el valor que encontre sea egual al que buscaba           
            if (i < numSeries
                && titulo.toLowerCase().toLowerCase().equalsIgnoreCase(series[i].getTitulo().toLowerCase())) {
                JOptionPane.showMessageDialog(
                    null,
                    "Ya existe una Serie con ese titulo",
                    "Existente",
                    JOptionPane.WARNING_MESSAGE);
            } else {
                
                
                // Hacemos hueco en la matriz arrimando una posicion adelante cada elemento de la matriz
                for(int pos=numSeries-1;pos>=i; pos--){
                    series[pos+1] = series[pos];
                }
                
                //introduzco la serie en la posicion liberada para que siga la matriz de manera ordenada
                series[i] = new Serie(titulo,sinopsis,categoria);
            }
            numSeries++;            
        } while (numSeries < series.length
            &&
            JOptionPane.showConfirmDialog(
            null,
            "Añadir otra Serie?",
            "Confirmar",
            JOptionPane.YES_NO_OPTION)
            == 
            JOptionPane.YES_OPTION);
    }

    private static void listadoAgrupado() {
        do {
            String texto = JOptionPane.showInputDialog("Introduzca la Categoria a buscar");

            int i;
            for (i = 0; i < numSeries
                    && !series[i].getCategoria().toLowerCase().contains(texto.toLowerCase());
                    i++);
            if (i < numSeries) {
                // Hay alguna serie que contiene el texto
                int valoracion = 0;
                int seriesEncontradas = 0;
                 String listado= "<html><h1>Listado de Series de la Categoria: " + texto + "</h1>";
        listado += "<table border=1><tr><th>Titulo</th><th>Sinopsis</th><th>Categoria</th>"
                + "<th>Votos</th><th>Valoracion Media</th></tr>";
        
        for(; i < numSeries; i++) {
            if(series[i].getCategoria().toLowerCase().contains(texto.toLowerCase())){
            seriesEncontradas++;
            valoracion+=series[i].getValoracion();
            listado += "<tr><td>"+ series[i].getTitulo() + "</td>"
                    + "<td>"+ series[i].getSinopsis() + "</td>"
                    + "<td>"+ series[i].getCategoria() + "</td>"
                    + "<td>"+ series[i].getVotos() + "</td>"
                    + "<td>"+ series[i].getValoracion() + " de 10 </td></tr>";
            }
        }
        listado+="</table> <h3>Se encontraron un total de: " + seriesEncontradas + "</h3>"
                + "<h3>Con una valoracion media de: " + valoracion/seriesEncontradas + " de 10</h3></html>";
                JOptionPane.showMessageDialog(
                        null,
                        listado,
                        "Listado de Series por categoria",
                        JOptionPane.PLAIN_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "NO hay ninguna serie que contenga esa Categoria",
                        "NO Encontrado",
                        JOptionPane.WARNING_MESSAGE);
            }

        } while (JOptionPane.showConfirmDialog(
                null,
                "Buscar Otra Serie",
                "Pregunta",
                JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION);
    }

    private static void listadoPorAbcedario() {
        
    }
}
