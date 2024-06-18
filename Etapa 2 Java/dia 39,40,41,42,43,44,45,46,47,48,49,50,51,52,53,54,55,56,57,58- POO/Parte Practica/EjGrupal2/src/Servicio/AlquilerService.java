/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alquiler;
import java.util.Scanner;

/**
 *
 * @author flopy
 */
public class AlquilerService {
    private Alquiler a;
    public AlquilerService(){
        this.a=new Alquiler();
    }
    Scanner leer=new Scanner(System.in);
    
    /*public void crearAlquiler(){
        System.out.println("Ingrese el título de la película alquilada");
        a.set(leer.nextLine());
        System.out.println("Ingrese el género de la película");
        a.setGenero(leer.nextLine());
        System.out.println("Ingrese el año de la película");
        a.setAnio(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingrese la duración en minutos");
        a.setDuracion(leer.nextInt());
    }*/
}
