
package Clases;

import java.util.LinkedList;

/**
 *
 * @author MIRABAI
 */
public class ClsCandidato extends ClsPersona {
    private String partidoPolitico;
    private String descripcion;
    private String mensajeCampania;
    private String ciudadOrigen;
    private LinkedList<String> propuestas;

    public ClsCandidato(String partidoPolitico, String descripcion, String ciudadOrigen, String numeroDocumento, String nombre, String telefono, String correo) {
        super(numeroDocumento, nombre, telefono, correo);
        this.partidoPolitico = partidoPolitico;
        this.descripcion = descripcion;
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMensajeCampania() {
        return mensajeCampania;
    }

    public void setMensajeCampania(String mensajeCampania) {
        this.mensajeCampania = mensajeCampania;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public LinkedList<String> getPropuestas() {
        return propuestas;
    }

    public void setPropuestas(LinkedList<String> propuestas) {
        this.propuestas = propuestas;
    }

    
    
    
}
