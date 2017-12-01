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
    private VentanaPrincipal vPrincipal;
    private GestionDato gd;

    public EventoVentanaPrincipal(VentanaPrincipal vPrincipal) {
        this.vPrincipal = vPrincipal;
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
