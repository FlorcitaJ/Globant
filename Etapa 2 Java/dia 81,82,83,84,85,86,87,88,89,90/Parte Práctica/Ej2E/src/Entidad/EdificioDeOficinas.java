/*
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.

Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package Entidad;

public class EdificioDeOficinas extends Edificio {
    private Integer numeroDeOficinas;
    private Integer cantidadDePersonasPorOficina;
    private Integer numeroDePisos;

    public EdificioDeOficinas() {
    }
    
    public EdificioDeOficinas(Double ancho, Double alto, Double largo) {
        super(ancho,alto,largo);
    }

    public EdificioDeOficinas(Integer numeroDeOficinas, Integer cantidadDePersonasPorOficina, Integer numeroDePisos, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.numeroDeOficinas = numeroDeOficinas;
        this.cantidadDePersonasPorOficina = cantidadDePersonasPorOficina;
        this.numeroDePisos = numeroDePisos;
    }

    public Integer getNumeroDeOficinas() {
        return numeroDeOficinas;
    }

    public void setNumeroDeOficinas(Integer numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
    }

    public Integer getCantidadDePersonasPorOficina() {
        return cantidadDePersonasPorOficina;
    }

    public void setCantidadDePersonasPorOficina(Integer cantidadDePersonasPorOficina) {
        this.cantidadDePersonasPorOficina = cantidadDePersonasPorOficina;
    }

    public Integer getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumeroDePisos(Integer numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
    }

    public void crearEdificio(){
        System.out.println("Cuantas personas hay por oficina?");
        this.cantidadDePersonasPorOficina=leer.nextInt();
        System.out.println("Cuantas oficinas tiene el edificio?");
        this.numeroDeOficinas=leer.nextInt();
        System.out.println("Cuantos pisos tiene el edificio?");
        this.numeroDePisos=leer.nextInt();
        System.out.println("---------------------------------------------");
    }
    
    public void contPersonas(){
        Integer personasTotales=this.cantidadDePersonasPorOficina*this.numeroDeOficinas;
        Integer personasPorPiso=Math.round(personasTotales/this.numeroDePisos);
        System.out.println("En el edificio entran un total de "+personasTotales+" personas, entrando un total de "+personasPorPiso+" personas por piso");
    }
    
    @Override
    public void calcularSuperficie() {
        Double superficie=this.alto*this.ancho*this.numeroDePisos;
        System.out.println("La superficie de todo el edificio es "+superficie+"m2, con una superficie de "+(superficie/this.numeroDePisos)+"m2 por piso");
    }

    @Override
    public void calcularVolumen() {
        Double volumen=this.alto*this.ancho*this.largo*this.numeroDePisos;
        System.out.println("El volúmen de todo el edificio es "+volumen+"m3, con un volumen de "+(volumen/this.numeroDePisos)+"m3 por piso");
   }
    
    
}
