/*
A continuación, se implementarán los siguientes métodos:
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
 */
package Servicio;

import Entidad.Curso;
import java.util.Arrays;
import java.util.Scanner;

public class CursoService {
    Curso c=new Curso();
    Scanner leer=new Scanner(System.in);
    
    public String[] cargarAlumnos(){
        String[] planillaAlumnos=new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno "+(i+1));
            planillaAlumnos[i]=leer.nextLine();
        }
        return planillaAlumnos;
    }
    
    public Curso crearCurso(){
        System.out.println("Ingrese el nombre del curso");
        c.setNombreCurso(leer.nextLine());
        System.out.println("Ingrese la cantidad de horas por día que se dictará el curso");
        c.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de días a la semana que se dictará el curso");
        c.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese el turno en que se dictará el curso");
        leer.next();
        c.setTurno(leer.nextLine());
        System.out.println("Ingrese el costo de la hora");
        c.setPrecioPorHora(leer.nextDouble());
        leer.nextLine();
        c.setAlumnos(cargarAlumnos());
        return c;
    }
    
    public Double calcularGananciaSemanal(){
        double ganancia=c.getCantidadHorasPorDia()*c.getPrecioPorHora()*c.getAlumnos().length*c.getCantidadDiasPorSemana();
        return ganancia;
    }
    
}
