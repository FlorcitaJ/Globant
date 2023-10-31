/*
Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.

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

import java.util.Date;
import java.util.Scanner;

public class Alquiler {
    private String nombre;
    private Long dni;
    private Date fechaDeAlquiler;
    private Date fechaDeDevolucion;
    private Integer posicionAmarre;
    private Barco barco;
    Scanner leer=new Scanner(System.in);

    public Alquiler() {
    }

    public Alquiler(String nombre, Long dni, Date fechaDeAlquiler, Date fechaDeDevolucion, Integer posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaDeAlquiler = fechaDeAlquiler;
        this.fechaDeDevolucion = fechaDeDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public Date getFechaDeAlquiler() {
        return fechaDeAlquiler;
    }

    public void setFechaDeAlquiler(Date fechaDeAlquiler) {
        this.fechaDeAlquiler = fechaDeAlquiler;
    }

    public Date getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    public void setFechaDeDevolucion(Date fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public Integer getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    public void crearAlquiler(){
        System.out.println("Ingrese el nombre del dueño del barco");
        this.nombre=leer.nextLine();
        System.out.println("Ingrese el Dni del titular del barco");
        this.dni=leer.nextLong();
        leer.nextLine();
        System.out.println("Ingrese la fecha de inicio de alquiler del barco");
        System.out.println("Año");
        Integer anio=leer.nextInt();
        System.out.println("Mes");
        Integer mes=leer.nextInt();
        System.out.println("Día");
        Integer dia=leer.nextInt();
        Date fecha=new Date(anio-1900,mes-1,dia);
        this.fechaDeAlquiler=fecha;
        System.out.println("Ingrese la fecha de devolucion");
        System.out.println("Año");
        Integer aniod=leer.nextInt();
        System.out.println("Mes");
        Integer mesd=leer.nextInt();
        System.out.println("Día");
        Integer diad=leer.nextInt();
        Date fechad=new Date(aniod-1900,mesd-1,diad);
        this.fechaDeDevolucion=fechad;
        System.out.println("Ingrese la posicion de amarre");
        this.posicionAmarre=leer.nextInt();
    }
    
    public Integer calculoDeAlquiler(){
        Integer dias;
        if(this.fechaDeAlquiler.getMonth()<this.fechaDeDevolucion.getMonth()){
            int mes=this.fechaDeDevolucion.getMonth()-this.fechaDeAlquiler.getMonth();
            dias=(mes*31-this.fechaDeAlquiler.getDate())+this.fechaDeDevolucion.getDate();            
        }else{
            dias=this.fechaDeDevolucion.getDate()-this.fechaDeAlquiler.getDate();
        }
        System.out.println(dias);
        Integer alquiler=dias*this.barco.calculoDeModulo();
        return alquiler;
    }
}
