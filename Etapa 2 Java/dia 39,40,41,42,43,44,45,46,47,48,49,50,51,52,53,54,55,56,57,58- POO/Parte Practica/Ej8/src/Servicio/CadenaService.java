/*
xa) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

public class CadenaService {
    Cadena c=new Cadena();
    Scanner leer=new Scanner(System.in);
    
    public Cadena crearCadena(){
        System.out.println("Ingrese una frase");
        c.setFrase(leer.nextLine());
        c.setLongitud(c.getFrase().length());
        return c;
    }
    
    public int mostrarVocales(){
        String frase=c.getFrase();
        int vocales=0;
        for (int i = 0; i < c.getLongitud(); i++) {
            String letra=frase.substring(i, i+1);
            if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
                vocales+=1;
            }
        }
        System.out.println("Frase ingresada: "+frase);
        return vocales;
    }
    
    public String invertirFrase(){
        String frase=c.getFrase();
        String fraseInvertida="";
        for (int i = c.getLongitud()-1; i >= 0; i--) {
            String letra=frase.substring(i, i+1);
            fraseInvertida=fraseInvertida.concat(letra);
            }
        System.out.println("Frase ingresada: "+frase);
        return fraseInvertida;
    }
    
    public int vecesRepetido(){
        System.out.println("Ingrese el caracter que desea contar");
        String caracter=leer.next();
        int contador=0;
        String frase=c.getFrase();
        String fraseInvertida="";
        for (int i = 0; i < c.getLongitud(); i++) {
            String letra=frase.substring(i, i+1);
            if(letra.equalsIgnoreCase(caracter) ){
                contador+=1;
            }
        }
        System.out.println("Frase ingresada: "+frase);
        return contador;
    }
    
    public boolean compararLongitud(){
        System.out.println("Ingrese la frase a comparar");
        leer.next();
        String frase2=leer.nextLine();
        boolean resultado=false;
        if(c.getLongitud()==frase2.length()){
            resultado=true;
        }
        System.out.println(c.getLongitud()+"-"+frase2.length());
        return resultado;
    }
    
    public String unirFrases(){
        String frase=c.getFrase();
        System.out.println("Ingrese otra frase");
        String frase2=leer.nextLine();
        frase=frase.concat(" ");
        frase=frase.concat(frase2);
        System.out.println("Frase ingresada: "+frase);
        return frase;
    }
    
    public String reemplazar(){
        System.out.println("Ingrese el caracter por el cual desea reemplazar la letra 'a'");
        String caracter=leer.next();
        String frase=c.getFrase();
        String fraseReemplazada="";
        for (int i = 0; i < c.getLongitud(); i++) {
            String letra=frase.substring(i, i+1);
            if(letra.equalsIgnoreCase("a") ){
                letra=caracter;
            }
            fraseReemplazada=fraseReemplazada.concat(letra);
        }
        System.out.println("Frase ingresada: "+frase);
        return fraseReemplazada;
    }
    
    public boolean contiene(){
         String frase=c.getFrase();
        System.out.println("Ingrese el caracter que desea ver si esta contenido");
        String caracter=leer.next();
        boolean resultado=false;
        for (int i = 0; i < c.getLongitud(); i++) {
            String letra=frase.substring(i, i+1);
            if(letra.equalsIgnoreCase(caracter)){
                resultado=true;
                i=c.getLongitud();
            }
        }
        System.out.println("Frase ingresada: "+frase);
        return resultado;
    }
}
