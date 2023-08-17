/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package ej2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {
        ArrayList<String> razas=new ArrayList();
        Scanner leer=new Scanner(System.in);
        String respuesta;
        do {            
            System.out.println("Ingrese la raza del perro");
            String raza=leer.nextLine();
            razas.add(raza);
            System.out.println("Desea ingresar otra raza?(si/no)");
            respuesta=leer.nextLine();
            while (!respuesta.equalsIgnoreCase("si")&& !respuesta.equalsIgnoreCase("no")){
                System.out.println("La respuesta ingresada no es válida, ingrese una opción válida(si/no)");
                respuesta=leer.nextLine();
            } 
        } while (respuesta.equalsIgnoreCase("si"));
        System.out.println("--------------------------------------------------");
        if(respuesta.equalsIgnoreCase("no")){
            razas.forEach((raza) -> {
                System.out.println(raza);
            });
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Ingrese la raza que desea remover de la lista");
        String quitarRaza=leer.nextLine();
        System.out.println("--------------------------------------------------");
        Iterator<String> it=razas.iterator();
        
        int cont=0;
        while (it.hasNext()) {
            String raza = it.next();
            if(raza.equalsIgnoreCase(quitarRaza)){
                it.remove();
                cont++;
            }
        }
        if(cont==0){
            System.out.println("La raza no se encuentra en la lista");
        }
        Collections.sort(razas);
        razas.forEach((raza)->{
        System.out.println(raza);
        });
    }
    
}
