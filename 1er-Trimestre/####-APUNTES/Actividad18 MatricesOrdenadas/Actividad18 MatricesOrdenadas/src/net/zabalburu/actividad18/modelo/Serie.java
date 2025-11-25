/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.zabalburu.actividad18.modelo;

/**
 *
 * @author daw1
 */
public class Serie {
    private String titulo;
    private String sinopsis;
    private String categoria;
    private int votos=0;
    private int valoracionTotal=0;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Serie(String titulo, String sinopsis, String Categoria) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.categoria = Categoria;
    }
    

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getVotos() {
        return votos;
    }

    public Serie() {
    }

    public Serie(String titulo, String sinopsis) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.categoria= "Sin Categoria";
    }
    public void votar(int valoracion){
        this.votos++;
        this.valoracionTotal+=valoracion;
    }
    public int getValoracion(){
        if(this.getVotos()==0){
            return 0;
        }else{
        return this.valoracionTotal/this.getVotos();
    }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
