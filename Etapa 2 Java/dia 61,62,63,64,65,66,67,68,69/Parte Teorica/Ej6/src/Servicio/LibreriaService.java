/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libreria;
import java.util.ArrayList;
import java.util.Scanner;

public class LibreriaService {
    Scanner leer=new Scanner(System.in);
    ArrayList<Libreria> libros=new ArrayList();
    public void crearLibro(){
        System.out.println("Ingrese el título del libro");
        String titulo=leer.nextLine();
        System.out.println("Ingrese el autor del libro");
        String autor=leer.nextLine();
        libros.add(new Libreria(titulo,autor));
    }
    
    public void fabricaDeLibros(){
        System.out.println("Ingrese la cantidad de libros que desea agregar");
        int cantidad=leer.nextInt();
        leer.nextLine();
        for (int i = 0; i < cantidad; i++) {
            crearLibro();
        }
    }
    
    public void mostrarLibros(){
        for (Libreria libro1 : libros) {
            System.out.println(libro1.toString());
        }
    }
}
