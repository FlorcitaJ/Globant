/*
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;


public class PersonaService {
    Scanner leer=new Scanner(System.in);
    Persona p=new Persona();
    
    public Persona crearPresona(){
        System.out.println("Ingrese el nombre");
        p.setNombre(leer.nextLine());
        System.out.println("Ingrese el día de nacimiento");
        int dia=leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        int mes=leer.nextInt();
        System.out.println("Ingrese el año de nacimiento");
        int anio=leer.nextInt();
        Date fecha=new Date(anio-1900,mes-1,dia);
        p.setFecha(fecha);
        return p;
    }
    
    public int calcularEdad(){
        Date fechaActual=new Date();
        int edad;
        if (p.getFecha().getMonth()<fechaActual.getMonth()){
          edad=fechaActual.getYear()-p.getFecha().getYear();  
        }else{
            edad=fechaActual.getYear()-p.getFecha().getYear()-1;
        }
        p.setEdad(edad);
        return edad;
    }
    
    public boolean menorQue(){
        boolean respuesta=false;
        int edad=p.getEdad();
        System.out.println("Ingrese la edad de la persona a comparar");
        int edad2=leer.nextInt();
        if(edad<edad2){
            respuesta=true;
        }
        return respuesta;
    }
    
    public void mostrarPersona(){
        System.out.println(p.toString());
    }
    
}
