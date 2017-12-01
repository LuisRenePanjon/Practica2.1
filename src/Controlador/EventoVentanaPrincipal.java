/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author SVAIO
 */
public class EventoVentanaPrincipal implements ActionListener {
    private VentanaPrincipal ventana;
    private GestionDato gd;

    public EventoVentanaPrincipal(VentanaPrincipal ventana) {
        this.ventana = ventana;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.ventana.getBotonList().get(0))){
            
        }
        if(e.getSource().equals(this.ventana.getBotonList().get(1))){
            
        }
        
        if(e.getSource().equals(this.ventana.getBotonList().get(2))){
            
        }
    }
    
    
}
