/*

 */
package pooej1;

import Entidad.Persona;
import Servicio.PersonaService;

public class POOEj1 {

    
    public static void main(String[] args) {
        Persona personaUno=new Persona();
        personaUno.setNombre("Florencia");
        personaUno.setEdad(34);
        personaUno.setDni(34317415);
        PersonaService.mostrarPersona(personaUno);
        
    }
    
}
