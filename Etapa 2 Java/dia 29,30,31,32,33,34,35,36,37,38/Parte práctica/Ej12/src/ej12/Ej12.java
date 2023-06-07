/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package ej12;

import java.util.Scanner;


public class Ej12 {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        boolean FDE=true;
        int correctas=0;
        int incorrectas=0;
        while (FDE) {
            System.out.println("Ingrese una frase de máximo 5 caracteres");
            String frase=leer.nextLine();
            int longi=frase.length();
            if(frase.equalsIgnoreCase("&&&&&")){
                FDE=false;
                break;
            }else if(longi<=5 && frase.substring(0, 1).equalsIgnoreCase("x") && frase.substring(longi-1, longi).equalsIgnoreCase("o") ){
                correctas++;
            }else{
                incorrectas++;
            }  
        }
        System.out.println("Los ingresos correctos fueron "+correctas+" y los ingresos incorrectos fueron "+incorrectas);
    }
    
}
