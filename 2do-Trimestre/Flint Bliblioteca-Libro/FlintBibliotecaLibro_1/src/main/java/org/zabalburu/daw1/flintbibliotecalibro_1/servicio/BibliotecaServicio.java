/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.flintbibliotecalibro_1.servicio;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.zabalburu.daw1.flintbibliotecalibro_1.dao.BibliotecaDAO;
import org.zabalburu.daw1.flintbibliotecalibro_1.dao.LibroDAO;
import org.zabalburu.daw1.flintbibliotecalibro_1.dao.impl.BibliotecaIMPL;
import org.zabalburu.daw1.flintbibliotecalibro_1.dao.impl.LibroIMPL;
import org.zabalburu.daw1.flintbibliotecalibro_1.modelo.Biblioteca;
import org.zabalburu.daw1.flintbibliotecalibro_1.modelo.Libro;
import org.zabalburu.daw1.flintbibliotecalibro_1.util.Categoria;

/**
 *
 * @author Iker Navarro Pérez
 */
public class BibliotecaServicio {

    private BibliotecaDAO bibliotecaDAO;
    private LibroDAO libroDAO;

    public BibliotecaServicio() {
        this.bibliotecaDAO = new BibliotecaIMPL();
        this.libroDAO = new LibroIMPL();
        inicializarDatos();
    }

    private void inicializarDatos() {
        // Bibliotecas
        Biblioteca bibCentral = new Biblioteca(null, "Biblioteca Central de Bilbao", "Calle Autonomía 3, Bilbao", "944 794 060");
        Biblioteca bibSantander = new Biblioteca(null, "Biblioteca Pública de Santander", "Avenida Reina Victoria 8, Santander", "942 203 564");

        // Añadir bibliotecas (el DAO asignará los IDs)
        bibliotecaDAO.addBiblioteca(bibCentral);
        bibliotecaDAO.addBiblioteca(bibSantander);

        // Obtener las bibliotecas para asignarlas a los libros
        bibCentral = bibliotecaDAO.getBiblioteca(1);
        bibSantander = bibliotecaDAO.getBiblioteca(2);

        // Libros
        SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");

        try {
            // BIBLIOTECA CENTRAL - 10 libros
            libroDAO.addLibro(new Libro(null, Categoria.FICCION, "Cien años de soledad",
                    "Una novela que narra la historia de la familia Buendía en Macondo.",
                    "Gabriel García Márquez", "Editorial Sudamericana", sdf.parse("30/05/1967"), "978-8439702017", bibCentral));

            libroDAO.addLibro(new Libro(null, Categoria.FICCION, "Don Quijote de la Mancha",
                    "Las aventuras de un hidalgo que se cree caballero andante.",
                    "Miguel de Cervantes", "Francisco de Robles", sdf.parse("16/01/1605"), "978-8408086994", bibCentral));

            libroDAO.addLibro(new Libro(null, Categoria.NO_FICCION, "Sapiens",
                    "Una historia breve de la humanidad desde el Homo sapiens hasta hoy.",
                    "Yuval Noah Harari", "Harvill Secker", sdf.parse("01/09/2011"), "978-0062316097", bibCentral));

            libroDAO.addLibro(new Libro(null, Categoria.LITERATURA_JUVENIL, "Harry Potter y la piedra filosofal",
                    "Las aventuras de un joven mago en su primer año en Hogwarts.",
                    "J.K. Rowling", "Bloomsbury", sdf.parse("26/06/1997"), "978-0747532699", bibCentral));

            libroDAO.addLibro(new Libro(null, Categoria.POESIA, "Veinte poemas de amor y una canción de desesperación",
                    "Colección de poemas románticos y melancólicos.",
                    "Pablo Neruda", "Editorial Nascimento", sdf.parse("01/01/1924"), "978-8408086994", bibCentral));

            libroDAO.addLibro(new Libro(null, Categoria.TEATRO, "La casa de Bernarda Alba",
                    "Drama que retrata la opresión en una familia andaluza.",
                    "Federico García Lorca", "Ediciones Ulises", sdf.parse("01/01/1945"), "978-8408086994", bibCentral));

            libroDAO.addLibro(new Libro(null, Categoria.CUENTOS, "El Quijote de bolsillo",
                    "Adaptación de cuentos clásicos en formato reducido.",
                    "Varios autores", "Ediciones Bolsillo", sdf.parse("15/03/2010"), "978-8408086994", bibCentral));

            libroDAO.addLibro(new Libro(null, Categoria.AUTOAYUDA, "Hábitos atómicos",
                    "Guía práctica para construir buenos hábitos y eliminar los malos.",
                    "James Clear", "Avery", sdf.parse("16/10/2018"), "978-0735211292", bibCentral));

            libroDAO.addLibro(new Libro(null, Categoria.CIENCIA_Y_TECNOLOGIA, "El universo en una cáscara de nuez",
                    "Explicación de conceptos de física y cosmología de forma accesible.",
                    "Stephen Hawking", "Bantam Books", sdf.parse("01/10/2001"), "978-0553802023", bibCentral));

            libroDAO.addLibro(new Libro(null, Categoria.ARTE, "Historia del arte",
                    "Recorrido por los movimientos artísticos desde la antigüedad hasta la modernidad.",
                    "E.H. Gombrich", "Phaidon Press", sdf.parse("01/01/1950"), "978-0714832470", bibCentral));

            // BIBLIOTECA SANTANDER - 10 libros
            libroDAO.addLibro(new Libro(null, Categoria.FICCION, "1984",
                    "Novela distópica sobre un régimen totalitario y la lucha por la libertad.",
                    "George Orwell", "Secker & Warburg", sdf.parse("08/06/1949"), "978-0451524935", bibSantander));

            libroDAO.addLibro(new Libro(null, Categoria.FICCION, "Orgullo y prejuicio",
                    "Romance que explora temas de clase social, matrimonio y amor.",
                    "Jane Austen", "T. Egerton", sdf.parse("28/01/1813"), "978-0141439518", bibSantander));

            libroDAO.addLibro(new Libro(null, Categoria.NO_FICCION, "Una breve historia del tiempo",
                    "Introducción a conceptos de cosmología y física cuántica.",
                    "Stephen Hawking", "Bantam Books", sdf.parse("01/04/1988"), "978-0553380163", bibSantander));

            libroDAO.addLibro(new Libro(null, Categoria.LITERATURA_JUVENIL, "El Hobbit",
                    "La aventura de un hobbit en la Tierra Media.",
                    "J.R.R. Tolkien", "Allen & Unwin", sdf.parse("21/09/1937"), "978-0547928227", bibSantander));

            libroDAO.addLibro(new Libro(null, Categoria.POESIA, "Rimas y leyendas",
                    "Colección de poesías y leyendas románticas españolas.",
                    "Gustavo Adolfo Bécquer", "Imprenta de Fortanet", sdf.parse("01/01/1871"), "978-8408086994", bibSantander));

            libroDAO.addLibro(new Libro(null, Categoria.TEATRO, "Hamlet",
                    "Tragedia sobre el príncipe de Dinamarca y su venganza.",
                    "William Shakespeare", "First Folio", sdf.parse("01/01/1603"), "978-0743477116", bibSantander));

            libroDAO.addLibro(new Libro(null, Categoria.CUENTOS, "Cuentos de hadas",
                    "Recopilación de cuentos tradicionales europeos.",
                    "Hans Christian Andersen", "Varios editores", sdf.parse("01/01/1835"), "978-8408086994", bibSantander));

            libroDAO.addLibro(new Libro(null, Categoria.AUTOAYUDA, "El poder del ahora",
                    "Guía para vivir en el presente y alcanzar la paz interior.",
                    "Eckhart Tolle", "Namaste Publishing", sdf.parse("01/09/1997"), "978-0340733509", bibSantander));

            libroDAO.addLibro(new Libro(null, Categoria.RELIGION_Y_ESPIRITUALIDAD, "El Bhagavad Gita",
                    "Texto sagrado hindú con enseñanzas sobre la vida y el deber.",
                    "Vyasa", "Varios editores", sdf.parse("01/01/1500"), "978-0140447392", bibSantander));

            libroDAO.addLibro(new Libro(null, Categoria.COCINA, "Cocina española tradicional",
                    "Recetas auténticas de la gastronomía española.",
                    "Simone Ortega", "Ediciones Espasa", sdf.parse("01/01/1972"), "978-8423992935", bibSantander));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Gestión Biblioteca
    public Biblioteca addBiblioteca(String nombre, String ubicacion, String telefono) {
        Biblioteca b = new Biblioteca(null, nombre, ubicacion, telefono);
        return bibliotecaDAO.addBiblioteca(b);
    }

    public Biblioteca getBiblioteca(Integer id) {
        return bibliotecaDAO.getBiblioteca(id);
    }

    public List<Biblioteca> getBibliotecas() {
        return bibliotecaDAO.getBibliotecas();
    }

    public Biblioteca modifyBiblioteca(Biblioteca modificar) {
        return bibliotecaDAO.modifyBiblioteca(modificar);
    }

    public Biblioteca deleteBiblioteca(Integer id) {
        return bibliotecaDAO.deleteBiblioteca(id);
    }

    // Gestión Libro
    public Libro addLibro(Categoria categoria, String titulo, String descripcion, String autor, String editorial, Date fechaPublicacion, String codigoISBN, Biblioteca biblioteca) {
        Libro lbr = new Libro(null, categoria, titulo, descripcion, autor, editorial, fechaPublicacion, codigoISBN, biblioteca);
        return libroDAO.addLibro(lbr);
    }

    public Libro getLibro(Integer id) {
        return libroDAO.getLibro(id);
    }

    public List<Libro> getLibros() {
        return libroDAO.getLibros();
    }

    public List<Libro> getLibrosBiblioteca(Integer idBiblioteca) {
        return libroDAO.getLibrosBiblioteca(idBiblioteca);
    }

    public Libro modifyLibro(Libro modificar) {
        return libroDAO.modifyLibro(modificar);
    }

    public Libro deleteLibro(Integer id) {
        return libroDAO.deleteLibro(id);
    }
}
