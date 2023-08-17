/*
A continuación, se implementarán los siguientes métodos:
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
package Servicio;

import Entidad.Movil;
import java.util.Scanner;

public class MovilService {
    Scanner leer=new Scanner(System.in);
    Movil m=new Movil();
    
    public Movil cargarCelular(){
        System.out.println("Ingrese la marca");
        m.setMarca(leer.nextLine());
        System.out.println("Ingrese el modelo");
        m.setModelo(leer.nextLine());
        System.out.println("Ingrese el tamaño de Ram");
        m.setMemoriaRam(leer.nextLine());
        System.out.println("Ingrese el tamaño de Rom");
        m.setAlmacenamiento(leer.nextLine());
        System.out.println("Ingrese el precio");
        m.setPrecio(leer.nextDouble());
        return m;
    }
    
    public void ingresarCodigo(){
        System.out.println("A continuación ingrese el código del móvil de a un dígito por vez y presione enter");
        int[]codigo=new int[7];
        for (int i = 0; i < 7; i++) {
            int num=leer.nextInt();
            codigo[i]=num;
        }
        m.setCodigo(codigo);
    }
    
    public void mostrarCelular(){
        System.out.println(m.toString());
    }
}
