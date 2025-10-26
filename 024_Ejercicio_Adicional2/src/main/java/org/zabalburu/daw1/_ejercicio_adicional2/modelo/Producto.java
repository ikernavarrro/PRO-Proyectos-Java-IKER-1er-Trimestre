/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1._ejercicio_adicional2.modelo;

/**
 *
 * @author Iker Navarro Pérez
 */
public class Producto {
    
    private String nombre;
    private int categoria;
    private double precioUnitario;
    private int stock;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public String getDescripcionCategoria() {
        String descripcion = "";
        descripcion = switch (categoria) {
            case 1 -> "Electrónica";
            case 2 -> "Ropa";    
            case 3 -> "Alimentos";
            default -> "Hogar";        
        };
        return descripcion;
    }
    
    public double getPrecioStock() {
        return precioUnitario * stock;
    }
    
    public void agregarStock(int cantidad) {
        stock += cantidad;
    }
    
    public void reducirStock(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
        }
    }
    
    public boolean hayStockSuficiente(int cantidad) {
        boolean stockSuficiente = false; 
        if (cantidad <= stock) {
            stockSuficiente = true;
        }
        return stockSuficiente;
    }
    
    
    
    
}
