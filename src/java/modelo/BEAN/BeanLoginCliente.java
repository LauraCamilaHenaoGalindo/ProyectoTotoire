
package modelo.BEAN;


public class BeanLoginCliente {
    
   private String idUsuario;
   private String rol;
   private String usuario;
   private String contraseña;
   

    public BeanLoginCliente(String idUsuario, String rol, String usuario, String contraseña) {
        this.idUsuario = idUsuario;
        this.rol = rol;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
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
