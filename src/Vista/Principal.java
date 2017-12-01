/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.GestionDato;
import Modelo.Archivo;
import Modelo.Directorio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Abuelito
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Archivo> aL=new ArrayList<Archivo>();
        List<Directorio> dL=new ArrayList<Directorio>();
        
        GestionDato gD=new GestionDato(aL, dL);
        VentanaPrincipal vp=new VentanaPrincipal("Gestion de Directorios y Archivos",gD);
        vp.setVisible(true);
    }
    
    
}
