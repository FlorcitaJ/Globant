
package Servicios;

import Entidades.Fabricante;
import Persistencia.FabricanteDao;
import java.util.Scanner;

public class FabricanteService {
    private FabricanteDao dao;

    public FabricanteService() {
        this.dao=new FabricanteDao();
    }
    
    Scanner leer=new Scanner(System.in);
    
    public void crearFabricante() throws Exception{
        System.out.println("Ingrese el nombre del fabricante");
        String nombre=leer.nextLine();
        try {
            if(nombre==null||nombre.trim().isEmpty()){
                throw new Exception("Debe ingresar un nombre");
            }
            Fabricante fabricante=new Fabricante();
            fabricante.setNombre(nombre);
            dao.guardarFabricante(fabricante);
            System.out.println("Fabricante creado y guardado con éxito");
        } catch (Exception e) {
            throw e;
        }
    }
}
