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

public class Polideportivo extends Edificio {
    private String nombre;
    private String tipoDeInstalacion;

    public Polideportivo() {
    }

    public Polideportivo(Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
    }
    
    public Polideportivo(String nombre, String tipoDeInstalacion, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeInstalacion() {
        return tipoDeInstalacion;
    }

    public void setTipoDeInstalacion(String tipoDeInstalacion) {
        this.tipoDeInstalacion = tipoDeInstalacion;
    }
    
    public void crearEdificio(){
        System.out.println("Ingrese el nombre del polideportivo");
        this.nombre=leer.nextLine();
        System.out.println("Es techado o abierto?");
        String rta=leer.nextLine();
        while (!rta.equalsIgnoreCase("techado")&&!rta.equalsIgnoreCase("abierto")) {            
            System.out.println("Respuesta incorrecta, ingrese una respuesta válida.(techado/abierto)");
            rta=leer.nextLine();
        }
        this.tipoDeInstalacion=rta;
        System.out.println("----------------------------------------------------------------");
    }
    
    @Override
    public void calcularSuperficie() {
        double superficie=this.alto*this.ancho;
        System.out.println("La superficie de "+this.nombre+" es de "+superficie+"m2");
    }

    @Override
    public void calcularVolumen() {
        double volumen=this.alto*this.ancho*this.largo;
        System.out.println("El volúmen del polideportivo "+this.nombre+" es de "+volumen+"m3");
    }
    
    
}
