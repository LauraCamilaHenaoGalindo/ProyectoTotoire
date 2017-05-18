
package modelo.BEAN;


public class BeanLoginPersonal {
    
    private String idPersonal;
    private String rol;
    private String usuario;
    private String contraseña;

    public BeanLoginPersonal(String idPersonal, String rol, String usuario, String contraseña) {
        this.idPersonal = idPersonal;
        this.rol = rol;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(String idPersonal) {
        this.idPersonal = idPersonal;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
}
