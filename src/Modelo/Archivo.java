/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Xbbc
 */
public class Archivo {
    private String nombre;
    private String tipo;
    private Directorio directorio;

    public Archivo(String nombre, String tipo, Directorio directorio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.directorio = directorio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Directorio getDirectorio() {
        return directorio;
    }

    public void setDirectorio(Directorio directorio) {
        this.directorio = directorio;
    }
    
    
}
