
package Controladores;

import Clases.ClsVotante;
import Modelos.MdlVotante;
import java.util.LinkedList;

/**
 *
 * @author MIRABAI
 */
public class CtlVotante {
    MdlVotante modelo;

    public CtlVotante(MdlVotante votante) {
        this.modelo = votante;
    }

    public CtlVotante() {}

        
    public boolean registrarVotante(ClsVotante votante){
        boolean respuesta = this.modelo.registrarVotante(votante);
        
        return respuesta;
    }
    
    public LinkedList<ClsVotante> ObtenerVotantes(){
        return this.modelo.ObtenerVotantes();
    }
}
