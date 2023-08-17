/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6;

import Servicio.LibreriaService;

/**
 *
 * @author flopy
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibreriaService ls=new LibreriaService();
        ls.fabricaDeLibros();
        ls.mostrarLibros();
    }
    
}
