/*
Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
 */
package ej7;

import Servicio.PersonaService;
import java.util.concurrent.atomic.AtomicInteger;

public class Ej7 {

    
    public static void main(String[] args) {
        AtomicInteger contadorb = new AtomicInteger(0);
        AtomicInteger contadorid = new AtomicInteger(0);
        AtomicInteger contadors = new AtomicInteger(0);
        
        AtomicInteger contadorv = new AtomicInteger(0);
        AtomicInteger contadorf = new AtomicInteger(0);

        PersonaService ps1 = new PersonaService();
        PersonaService ps2 = new PersonaService();
//        PersonaService ps3 = new PersonaService();
//        PersonaService ps4 = new PersonaService();
        ps1=null;
        //ps2.crearPersona();
        System.out.println(ps2.toString());
//        ps3.crearPersona();
//        ps4.crearPersona();
//        System.out.println("------------------------------------------------------------");
//        System.out.println("Calculando IMC(-1 por debajo, 0 peso ideal, 1 sobrepeso");
//        System.out.println(ps1.calcularIMC());
//        System.out.println(ps2.calcularIMC());
//        System.out.println(ps3.calcularIMC());
//        System.out.println(ps4.calcularIMC());
        System.out.println("------------------------------------------------------------");
        System.out.println("Es mayor de edad?");
        try {
        System.out.println(ps2.esMayorDeEdad());
        System.out.println(ps1.esMayorDeEdad());
        } catch (Exception e) {
            System.out.println("Prueba");
        }
        
//        System.out.println(ps3.esMayorDeEdad());
//        System.out.println(ps4.esMayorDeEdad());
//         System.out.println("------------------------------------------------------------");
//        contadorImc(ps1,contadorb,contadorid,contadors);
//        //contadorImc(ps2,contadorb,contadorid,contadors);
////        contadorImc(ps3,contadorb,contadorid,contadors);
////        contadorImc(ps4,contadorb,contadorid,contadors);
////        
//        contadorMayor(ps1,contadorv,contadorf);
//        //contadorMayor(ps2,contadorv,contadorf);
////        contadorMayor(ps3,contadorv,contadorf);
////        contadorMayor(ps4,contadorv,contadorf);
//        
//        System.out.println("Hay "+contadorb+" personas por debajo de su peso ideal, "+contadorid+" personas en su peso ideal y "+contadors+" personas con sobrepeso");
//        System.out.println("Hay "+contadorv+" personas mayores de edad y "+contadorf+"personas menores de edad");
//    }
//    
//    public static void contadorImc(PersonaService ps, AtomicInteger contadorb, AtomicInteger contadorid, AtomicInteger contadors) {
//
//        int caso = ps.calcularIMC();
//        int contb=contadorb.get();
//        int contid=contadorid.get();
//        int conts=contadors.get();
//        switch (caso) {
//            case -1:
//                contb+=1;
//                contadorb.set(contb);
//                break;
//            case 0:
//                contid+=1;
//                contadorid.set(contid);
//                break;
//            case 1:
//                conts+=1;
//                contadors.set(conts);
//                break;
//        }
//    }
//    public static void contadorMayor(PersonaService ps, AtomicInteger contadorv, AtomicInteger contadorf) {
//        int contV=contadorv.get();
//        int contF=contadorf.get();
//
//       if(ps.esMayorDeEdad()){
//           contV+=1;
//           contadorv.set(contV);
//       }else{
//           contF+=1;
//           contadorf.set(contF);
//       }
    }
    
}
