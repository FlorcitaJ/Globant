/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class Ej3 {

    public static void main(String[] args) {
       ArrayList<Integer> numerosA=new ArrayList();
       HashSet<Integer> numerosB=new HashSet();
       HashMap<Integer,String> alumnos=new HashMap();
       Scanner leer=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int j=i*2;
            numerosA.add(j);
        }
        System.out.println(numerosA);
        for (int i = 0; i < 5; i++) {
            int j=i*2+1;
            numerosB.add(j);
        }
        System.out.println(numerosB);
        
        int dni=34317414;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre de la persona "+(i+1));
            String nombre=leer.nextLine();
            dni=dni+1;
            alumnos.put(dni,nombre);
        }
        System.out.println(alumnos);
        System.out.println(numerosA);
        numerosA.remove(1);
        Integer x=4;
        numerosA.remove(x);
        System.out.println(numerosA);
        
        System.out.println(numerosB);
        Integer y=5;
        numerosB.remove(y);
        System.out.println(numerosB);
        
        System.out.println(alumnos);
        alumnos.remove(34317416);
        System.out.println(alumnos);
    }
    
}

