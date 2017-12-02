/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JOptionPane;

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

        if (e.getSource().equals(this.vPrincipal.getBotonList().get(0))) {
            File archivo = this.vPrincipal.getgD().crear(this.vPrincipal.getTxtList().get(0).getText());

        }
        if (e.getSource().equals(this.vPrincipal.getBotonList().get(1))) {
            File delet = this.vPrincipal.getgD().borrar(this.vPrincipal.getTxtList().get(0).getText());

        }
        if (e.getSource().equals(this.vPrincipal.getBotonList().get(2))) {
            boolean rename = this.vPrincipal.getgD().renombrar(this.vPrincipal.getTxtList().get(0).getText(), this.vPrincipal.getTxtList().get(1).getText());
        }
        if (e.getSource().equals(this.vPrincipal.getBotonList().get(3))) {
            File carpeta = this.vPrincipal.getgD().cCarpeta(this.vPrincipal.getTxtList().get(0).getText());

        }
        if (e.getSource().equals(this.vPrincipal.getBotonList().get(4))) {
            if (this.vPrincipal.getTxtList().get(0).getText().equals("")) {
                JOptionPane.showMessageDialog(this.vPrincipal, "debe llenar el campo directorio raiz o carpeta ", "Warning", JOptionPane.INFORMATION_MESSAGE);
            } else {
                File archivo = new File(this.vPrincipal.getTxtList().get(0).getText().toString());

                File[] list = archivo.listFiles();
                for (File a : list) {
                    this.vPrincipal.validar(a);
                }
            }
        }

    }
}
