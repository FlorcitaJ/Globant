/*
Crea una clase de entidad llamada "Rutina" con los siguientes atributos: id, nombre, duracion, nivelDificultad,
descripcion
Crea una clase ServicioRutina.
 */
package Entidad;

public class Rutina {
    private long id;
    private String nombre;
    private int duracion;
    private String nivelDeDificultad;
    private String descripcion;

    public Rutina() {
    }

    public Rutina(long id, String nombre, int duracion, String nivelDeDificultad, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.nivelDeDificultad = nivelDeDificultad;
        this.descripcion = descripcion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNivelDeDificultad() {
        return nivelDeDificultad;
    }

    public void setNivelDeDificultad(String nivelDeDificultad) {
        this.nivelDeDificultad = nivelDeDificultad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Rutina{" + "id=" + id + ", nombre=" + nombre + ", duracion=" + duracion + ", nivelDeDificultad=" + nivelDeDificultad + ", descripcion=" + descripcion + '}';
    }
    
    
}
