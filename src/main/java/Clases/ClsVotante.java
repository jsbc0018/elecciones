package Clases;

/**
 *
 * @author MIRABAI
 */
public class ClsVotante extends ClsPersona{
    
    private String direccion;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ClsVotante(String direccion, String numeroDocumento, String nombre, String telefono, String correo) {
        super(numeroDocumento, nombre, telefono, correo);
        this.direccion = direccion;
    }
    
    
    
    
}
