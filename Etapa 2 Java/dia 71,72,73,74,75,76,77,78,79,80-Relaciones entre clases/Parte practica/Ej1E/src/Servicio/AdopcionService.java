/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package Servicio;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class AdopcionService {
    Scanner leer=new Scanner(System.in);
    Perro p;
    Persona pe;
    ArrayList<Perro>perros=new ArrayList();
    ArrayList<Persona>personas=new ArrayList();
    public Perro crearPerro(){
        System.out.println("Cuantos perros desea ingresar?");
        int cantidad=leer.nextInt();
        leer.nextLine();
        for (int i = 0; i < cantidad; i++) {
            p=new Perro();
            System.out.println("Ingrese los datos del perro "+(i+1));
            System.out.println("Nombre:");
            p.setNombre(leer.nextLine());
            System.out.println("Raza:");
            p.setRaza(leer.nextLine());
            System.out.println("Tamaño:");
            p.setTamano(leer.nextLine());
            System.out.println("Edad:");
            p.setEdad(leer.nextInt());
            leer.nextLine();
            p.setAdoptado(false);
            perros.add(p);
        }
        return p;
    }
    
    public Persona crearPersona(){
        System.out.println("Cuantas personas desea agregar?");
        int cant=leer.nextInt();
        leer.nextLine();
        for (int i = 0; i < cant; i++) {
            pe=new Persona();
            System.out.println("Ingrese los datos de la persona "+(i+1));
            System.out.println("Nombre:");
            pe.setNombre(leer.nextLine());
            System.out.println("Apellido:");
            pe.setApellido(leer.nextLine());
            System.out.println("Edad:");
            pe.setEdad(leer.nextInt());
            System.out.println("DNI:");
            pe.setDni(leer.nextInt());
            leer.nextLine();
            personas.add(pe);
        }
        return pe;
    }
    
    public void adopcion() {
        System.out.println(perros.toString());
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i).getNombre() + " ingrese el nombre de la mascota que desea adoptar");
            boolean encontrado = false;
            while (!encontrado) {
                String mascota = leer.nextLine();
                for (Perro perro : perros) {
                    if (perro.getNombre().equalsIgnoreCase(mascota) && perro.isAdoptado() == false) {
                        perro.setAdoptado(true);
                        personas.get(i).setPerro(perro);
                        encontrado = true;
                        System.out.println("Adopción exitosa");
                        break;
                    }
                }
                if(!encontrado){
                    System.out.println("Ese nombre no se encuentra en la lista o bien ya fue adoptado, por favor ingrese otro nombre");
                    System.out.println(perros.toString());
                } 
            }
        }
        System.out.println(personas.toString());
    }
}
