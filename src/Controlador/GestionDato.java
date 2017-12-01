/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author SVAIO
 */
public class GestionDato {

    public File mostrar(File a) {

        if (a.isFile()) {
            System.out.println(a.getPath());
            return a;
        }
        if (a.isDirectory()) {
            System.out.println(a.getPath());
            for (File sA : a.listFiles()) {

                mostrar(sA);
            }
        }
        return a;
    }

    public File crear(String txt) {

        File fichero = new File(txt);
        try {
            if (fichero.createNewFile()) {
                System.out.println("El fichero se ha creado ");
            } else {
                System.out.println("Error");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return fichero;
    }

    public File borrar(String txt) {

        File fichero = new File(txt);

        if (fichero.delete()) {
            System.out.println("El fichero se ha borrado ");
        } else {
            System.out.println("Error");
        }

        return fichero;
    }

    public File cCarpeta(String txt) {

        File fichero = new File(txt);
        fichero.mkdir();
        if (fichero.exists()) {
            System.out.println("carpeta creada ");
        } else {
            System.out.println("Error");
        }

        return fichero;
    }

    public boolean renombrar(String txt, String txt2) {

        File fichero = new File(txt);
        File renombrafo = new File(txt2);
        boolean v = fichero.renameTo(renombrafo);
        if (v) {
            System.out.println("El fichero se ha renombrado ");
        } else {
            System.out.println("Error");
        }

        return v;
    }
}
