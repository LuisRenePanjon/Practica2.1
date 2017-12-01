/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.EventoVentanaPrincipal;
import Controlador.GestionDato;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author SVAIO
 */
public class VentanaPrincipal extends JFrame {
    
    private List<JLabel> etiquetaList;
    private List<JTextField> txtList;
    private List<JButton> botonList;
    private GestionDato gD;
    

    public VentanaPrincipal(String t, GestionDato gD) {
        this.setTitle(t);
        this.setSize(600, 400);
        this.setDefaultCloseOperation(3);
        this.gD = gD;
        IniciaComponente();
    }

    public void IniciaComponente() {
        
        this.etiquetaList = new ArrayList<JLabel>();
        this.etiquetaList.add(new JLabel("Destinatario: "));
        this.txtList = new ArrayList<JTextField>();
        this.txtList.add(new JTextField(15));
        this.botonList = new ArrayList<JButton>();
        this.botonList.add(new JButton("Crear"));
        this.botonList.add(new JButton("Borrar"));
        this.botonList.add(new JButton("Renombrar"));
        JPanel panel = new JPanel();
        panel.add(this.etiquetaList.get(0));
        panel.add(this.txtList.get(0));
        panel.add(this.botonList.get(0));
        panel.add(this.botonList.get(1));
        panel.add(this.botonList.get(2));
        this.add(panel);
    }

    public List<JLabel> getEtiquetaList() {
        return etiquetaList;
    }

    public void setEtiquetaList(List<JLabel> etiquetaList) {
        this.etiquetaList = etiquetaList;
    }

    public List<JTextField> getTxtList() {
        return txtList;
    }

    public void setTxtList(List<JTextField> txtList) {
        this.txtList = txtList;
    }

    public List<JButton> getBotonList() {
        return botonList;
    }

    public void setBotonList(List<JButton> botonList) {
        this.botonList = botonList;
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
    }

    
}
