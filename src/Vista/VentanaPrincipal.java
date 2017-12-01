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

    private JMenuBar menu;
    private JDesktopPane escritorio;
    private List<JMenu> menuList;
    private List<JMenuItem> menuItemList; 
    private GestionDato gD;
    

    public VentanaPrincipal(String t, GestionDato gD) {
        this.setTitle(t);
        this.setSize(600, 400);
        this.setDefaultCloseOperation(3);
        this.gD = gD;
        IniciaComponente();
    }

    public void IniciaComponente(){
        this.menu= new JMenuBar();
        this.escritorio = new JDesktopPane();
        this.menuList= new ArrayList<JMenu>();
        this.menuList.add(new JMenu("Archivo"));
        this.menuList.add(new JMenu("Directorio"));
        
        this.menuItemList=new ArrayList<JMenuItem>();
        this.menuItemList.add(new JMenuItem("Ingresar Archivo"));
        this.menuItemList.add(new JMenuItem("Ingresar Directorio"));
        
        
        this.setContentPane(this.escritorio);
        this.setJMenuBar(menu);
        this.menu.add(this.menuList.get(0));
        this.menu.add(this.menuList.get(1));
        this.menuList.get(0).add(this.menuItemList.get(0));
        this.menuList.get(1).add(this.menuItemList.get(1));
        
        this.menuItemList.get(0).addActionListener(new EventoVentanaPrincipal(this));
        this.menuItemList.get(1).addActionListener(new EventoVentanaPrincipal(this));
    }

    public JMenuBar getMenu() {
        return menu;
    }

    public void setMenu(JMenuBar menu) {
        this.menu = menu;
    }

    public JDesktopPane getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(JDesktopPane escritorio) {
        this.escritorio = escritorio;
    }

    public List<JMenu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<JMenu> menuList) {
        this.menuList = menuList;
    }

    public List<JMenuItem> getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(List<JMenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
    }

    

    
}
