/*
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
package Entidad;

import java.util.Scanner;

public class Barco {
    protected String matricula;
    protected Integer eslora;
    protected Integer anioDeFabricacion;
    Scanner leer=new Scanner(System.in);

    public Barco() {
    }

    public Barco(String matricula, Integer eslora, Integer anioDeFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioDeFabricacion = anioDeFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAnioDeFabricacion() {
        return anioDeFabricacion;
    }

    public void setAnioDeFabricacion(Integer anioDeFabricacion) {
        this.anioDeFabricacion = anioDeFabricacion;
    }
    
    public void crearBarco(){
        System.out.println("Ingrese la matricula");
        this.matricula=leer.nextLine();
        System.out.println("Ingrese la longitud de la eslora en metros");
        this.eslora=leer.nextInt();
        System.out.println("Ingrese el año de fabricación");
        this.anioDeFabricacion=leer.nextInt();        
    }
    
    public Integer calculoDeModulo(){
        Integer modulo=this.eslora*10;
        return modulo;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioDeFabricacion=" + anioDeFabricacion;
    }
    
    
}
