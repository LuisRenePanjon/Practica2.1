/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.EventoVentanaPrincipal;
import Controlador.GestionDato;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
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
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author SVAIO
 */
public class VentanaPrincipal extends JFrame {

    private List<JLabel> etiquetaList;
    private List<JTextField> txtList;
    private List<JButton> botonList;
    private GestionDato gD;
    private DefaultTreeModel modeloarbol;
    private DefaultMutableTreeNode treenode;
    private JTree nodo;
    private JScrollPane scroll;
    private JPanel panelinicial;

    public VentanaPrincipal(String t, GestionDato gD) {
        this.setTitle(t);
        this.setSize(700, 400);
        this.setDefaultCloseOperation(3);
        this.gD = gD;
        IniciaComponente();
        this.getContentPane().setBackground(Color.red);

    }

    public void IniciaComponente() {

        this.panelinicial = new JPanel(new BorderLayout());

        this.etiquetaList = new ArrayList<JLabel>();
        this.etiquetaList.add(new JLabel("Software para la Gestión de Directorios y Archivos"));
        this.etiquetaList.add(new JLabel("      Destinatario: "));
        this.etiquetaList.add(new JLabel("      Nuevo Destinatario: "));
        this.etiquetaList.add(new JLabel(" "));
        

        this.txtList = new ArrayList<JTextField>();
        this.txtList.add(new JTextField(15));
        this.txtList.add(new JTextField(15));
        this.botonList = new ArrayList<JButton>();

        this.botonList.add(new JButton("Crear Archivo"));
        this.botonList.add(new JButton("Borrar"));
        this.botonList.add(new JButton("Renombrar"));
        this.botonList.add(new JButton("Crear Carpeta"));
        this.botonList.add(new JButton("MostrarTabla"));
        /*
        DefaultMutableTreeNode raiz = new DefaultMutableTreeNode(this.txtList.get(0).getText());
        DefaultMutableTreeNode rama = new DefaultMutableTreeNode(this.txtList.get(0) + "/");
        DefaultTreeModel model = new DefaultTreeModel(raiz);
        JTree arbol = new JTree(model);
        JScrollPane barra = new JScrollPane(arbol);*/

        LayoutManager disenio = new GridLayout(2, 2);
        LayoutManager disAccion = new GridLayout(2, 4);
        LayoutManager disTitulo = new FlowLayout();

        JPanel pDisenio = new JPanel(disenio);
        JPanel pTitulo = new JPanel(disTitulo);
        JPanel pAccion = new JPanel(disAccion);
        
        this.treenode = new DefaultMutableTreeNode("padre");
        this.modeloarbol=new DefaultTreeModel(treenode);
        this.nodo=new JTree(this.modeloarbol);
        this.scroll=new JScrollPane(this.nodo);
        DefaultMutableTreeNode hijo=new DefaultMutableTreeNode("padre");
        DefaultMutableTreeNode hijo1=new DefaultMutableTreeNode("hijo");
        DefaultMutableTreeNode hijo2=new DefaultMutableTreeNode("hijo2");
        DefaultMutableTreeNode hijo3=new DefaultMutableTreeNode("hijo3");
        DefaultMutableTreeNode hijo4=new DefaultMutableTreeNode("hijo4");
        this.modeloarbol.insertNodeInto(hijo, this.treenode, 0);
        this.modeloarbol.insertNodeInto(hijo3, this.treenode, 1);
        this.modeloarbol.insertNodeInto(hijo1, hijo, 0);
        this.modeloarbol.insertNodeInto(hijo2, hijo, 1);
        this.modeloarbol.insertNodeInto(hijo4, hijo, 2);

        this.botonList.get(0).addActionListener(new EventoVentanaPrincipal(this));
        this.botonList.get(1).addActionListener(new EventoVentanaPrincipal(this));
        this.botonList.get(2).addActionListener(new EventoVentanaPrincipal(this));
        this.botonList.get(3).addActionListener(new EventoVentanaPrincipal(this));

        pTitulo.add(this.etiquetaList.get(0));
        pAccion.add(this.etiquetaList.get(1));
        pAccion.add(this.txtList.get(0));
        pAccion.add(this.etiquetaList.get(2));
        pAccion.add(this.txtList.get(1));
        pAccion.add(this.etiquetaList.get(3));
        pAccion.add(this.botonList.get(0));
        pAccion.add(this.botonList.get(1));
        pAccion.add(this.botonList.get(2));
        pAccion.add(this.botonList.get(3));
        pAccion.add(this.botonList.get(4));
        
        pDisenio.add(pTitulo);
        pDisenio.add(pAccion);
        this.panelinicial.add(pDisenio, BorderLayout.NORTH);
        this.panelinicial.add(this.scroll,BorderLayout.CENTER);
        this.add(this.panelinicial);
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

    public DefaultTreeModel getModeloarbol() {
        return modeloarbol;
    }

    public void setModeloarbol(DefaultTreeModel modeloarbol) {
        this.modeloarbol = modeloarbol;
    }

    public DefaultMutableTreeNode getTreenode() {
        return treenode;
    }

    public void setTreenode(DefaultMutableTreeNode treenode) {
        this.treenode = treenode;
    }

    public JTree getNodo() {
        return nodo;
    }

    public void setNodo(JTree nodo) {
        this.nodo = nodo;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

}
