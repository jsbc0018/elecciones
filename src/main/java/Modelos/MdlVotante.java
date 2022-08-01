
package Modelos;

import Clases.ClsJdbc;
import Clases.ClsVotante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author MIRABAI
 */
public class MdlVotante {
    
    ClsJdbc jdbc;

    public MdlVotante() {
        this.jdbc = new ClsJdbc();
        this.jdbc.CrearConexion();
    }
    
    public boolean registrarVotante(ClsVotante votante){
        
        return true;
        
    }
    
    public LinkedList<ClsVotante> ObtenerVotantes(){
        try {
            
            LinkedList<ClsVotante> listaVotantes= new LinkedList<>();
            
            String sql = "SELECT * FROM tbl_votantes";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            ResultSet resultados = sentencia.executeQuery();
            
            while(resultados.next()){
                String numeroDocumento = resultados.getString("id_votantes");
                String nombre = resultados.getString("nombre");
                String telefono = resultados.getString("telefono");
                String correo = resultados.getString("correo");
                String direccion = resultados.getString("direccion");
                
                ClsVotante votante = new ClsVotante(direccion, numeroDocumento, nombre, telefono, correo);
                
                listaVotantes.add(votante);
            }
            return listaVotantes;
        } catch (Exception e) {
            System.out.println("Ocurrió un error" + e.getMessage());
            
            return null;
        }
    }
}
