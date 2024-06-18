/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por
trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
 */
package ej21e;

import java.util.Scanner;

public class Ej21E {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int cantidadAlumnos=10;
        double[] promediosAlumnos=new double[10];
        int aprobado=0;
        
        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Ingrese la nota 1 del alumno "+(i+1));
            int nota1=leer.nextInt();
            System.out.println("Ingrese la nota 2 del alumno "+(i+1));
            int nota2=leer.nextInt();
            System.out.println("Ingrese la nota 3 del alumno "+(i+1));
            int nota3=leer.nextInt();
            System.out.println("Ingrese la nota 4 del alumno "+(i+1));
            int nota4=leer.nextInt();
            double promedio=(nota1*0.1+nota2*0.15+nota3*0.25+nota4*0.5);
            promediosAlumnos[i]=promedio;
            System.out.println("-----------------------------------------------");
        }
        
        for (int i = 0; i < promediosAlumnos.length; i++) {
            if(promediosAlumnos[i]>=7){
                aprobado+=1;
            }
        }
        
        System.out.println("En el curso hay "+aprobado+" alumnos aprobados y "+(cantidadAlumnos-aprobado)+
                " alumnos desaprobados de un total de "+cantidadAlumnos+" alumnos.");
        
    }
    
}
