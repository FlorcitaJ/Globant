
package Persistencia;

import Entidades.Fabricante;

public final class FabricanteDao extends Dao {
    
    public void guardarFabricante(Fabricante fabricante) throws Exception{
        try {
            if(fabricante==null){
                throw new Exception("Debe indicar un fabricante");
            }
            String sql="Insert into fabricante (nombre)"
                    +"VALUES ( '"+ fabricante.getNombre()+"');";
            System.out.println(sql);
            insertarCrearModificar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
}
