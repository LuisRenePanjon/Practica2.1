/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaArchivo;
import Vista.VentanaDirectorio;
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
        if(e.getSource().equals(this.vPrincipal.getMenuItemList().get(0)))
            
        {
            VentanaArchivo vA= new VentanaArchivo(this.vPrincipal.getgD());
            vA.setVisible(true);
            this.vPrincipal.getEscritorio().add(vA);
        }
        if(e.getSource().equals(this.vPrincipal.getMenuItemList().get(1)))
            
        {
            VentanaDirectorio vD= new VentanaDirectorio(this.vPrincipal.getgD());
            vD.setVisible(true);            
            this.vPrincipal.add(vD);
        }
    }
}
