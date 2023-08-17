/*
En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Servicio;

import Entidad.Matematica;


public class MatematicaService {
    Matematica m=new Matematica();
    
    public Matematica crearMatematica(){
        m.setNum1(Math.random());
        m.setNum2(Math.random());
        return m;
    }
    
    public void mostrarValores(){
        System.out.println("Num1="+m.getNum1());
        System.out.println("Num2="+m.getNum2());
    }
    
    public double devolverMayor(){
        double mayor;
        double menor;
        if(m.getNum1()>m.getNum2()){
            mayor=m.getNum1();
            menor=m.getNum2();
        }else{
            mayor=m.getNum2();
            menor=m.getNum1();
        }
        m.setMenor(menor);
        m.setMayor(mayor);
        return mayor;
    }
    
    public int calcularPotencia(){
        int mayor=(int)Math.round(m.getMayor());
        int menor=(int)Math.round(m.getMenor());
        int potencia=(int)Math.pow(mayor, menor);
        return potencia;
    }
    
    public double calcularRaiz(){
        int menor=(int)Math.abs(m.getMenor());
        double raiz=Math.sqrt(menor);
        return raiz;
    }
}
