/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaArchivo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author SVAIO
 */
public class EventoVentanaArchivo implements ActionListener {
    private VentanaArchivo ventana;
    private GestionDato gd;

    public EventoVentanaArchivo(VentanaArchivo ventana) {
        this.ventana = ventana;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource().equals(this.ventana.getBotonList().get(0))){
           
       }
    }
    
    
    
}
