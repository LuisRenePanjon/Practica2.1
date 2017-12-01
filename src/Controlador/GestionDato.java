/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Archivo;
import Modelo.Directorio;
import java.util.List;

/**
 *
 * @author SVAIO
 */
public class GestionDato {
     private List<Archivo> listArchivo;
     private List<Directorio> listDirectorio;

    public GestionDato(List<Archivo> listArchivo, List<Directorio> listDirectorio) {
        this.listArchivo = listArchivo;
        this.listDirectorio = listDirectorio;
    }
     
    public boolean addArchivo(Archivo a){
        return this.listArchivo.add(a);
    } 
    public boolean arrDirectorio(Directorio d){
        return this.listDirectorio.add(d);
    }
}
