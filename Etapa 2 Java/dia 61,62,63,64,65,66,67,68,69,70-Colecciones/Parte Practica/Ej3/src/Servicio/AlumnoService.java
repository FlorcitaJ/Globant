/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {
    Scanner leer=new Scanner(System.in);
    Alumno a;
    ArrayList<Alumno>ListaDeAlumnos=new ArrayList();
    ArrayList<Integer> notas;
    
    public void crearAlumno(){
        String respuesta;
        do {         
            a=new Alumno();
            notas=new ArrayList();
            System.out.println("Ingrese el nombre del Alumno");
            a.setNombre(leer.nextLine());
            System.out.println("Ingrese la nota 1 del alumno");
            notas.add(leer.nextInt());
            System.out.println("Ingrese la nota 2 del alumno");
            notas.add(leer.nextInt());
            System.out.println("Ingrese la nota 3 del alumno");
            notas.add(leer.nextInt());
            a.setNotas(notas);
            leer.nextLine();
            ListaDeAlumnos.add(a);
            System.out.println("---------------------------------------------------------------");
            System.out.println("Desea ingresar otro alumno?(si/no)");
            respuesta=leer.nextLine();
            while (!respuesta.equalsIgnoreCase("si")&&!respuesta.equalsIgnoreCase("no")){
                 System.out.println("Respuesta inválida, ingrese una respuesta válida(si/no)"); 
                 respuesta=leer.nextLine();
            }
            System.out.println("---------------------------------------------------------------");
        } while (respuesta.equalsIgnoreCase("si"));
    }
    
    public double notaFinal(String alumno){
        double promedio=0;
        for (Alumno alumnos : ListaDeAlumnos) {
            if(alumnos.getNombre().equalsIgnoreCase(alumno)){
                notas=alumnos.getNotas();
                promedio=notas.get(0)+notas.get(1)+notas.get(2);
            }
        }
        promedio=promedio/3;
        return promedio;
    }
    
    public void mostrarLista(){
        for (Alumno alumnos : ListaDeAlumnos) {
            System.out.println(alumnos);
        }
    }
    
    public void buscarAlumno(){
        System.out.println("Ingrese el alumno que desea buscar");
        String alumno=leer.nextLine();
        int cont=0;
        for (Alumno alumnos : ListaDeAlumnos) {
            if(alumnos.getNombre().equalsIgnoreCase(alumno)){
                System.out.println("La nota final del alumno "+alumnos.getNombre()+" es: "+notaFinal(alumno));
                cont++;
            }
        }
        if(cont==0){
            System.out.println("El alumno no se encuentra en la lista");
        }
    }
}
