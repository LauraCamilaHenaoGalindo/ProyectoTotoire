
package modelo.BEAN;


public class BeanModificarInformacionPersonal {
    
   private String idPersonal;
   private String nombre;
   private String primerApellido;
   private String segundoApellido;
   private String tipoDoc;
   private String doc;
   private String direccion;
   private String tipoPersonal;
   private String celular;
   private String email;
   private String barrio;
   private String fechaNac;
   private String genero;
   private String perfil;
   private String estadoPersonal;    
    

    public BeanModificarInformacionPersonal(String idPersonal, String nombre, String primerApellido, String segundoApellido, String tipoDoc, String doc, String direccion, String tipoPersonal, String celular, String email, String barrio, String fechaNac, String genero, String perfil, String estadoPersonal) {
        this.idPersonal = idPersonal;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.tipoDoc = tipoDoc;
        this.doc = doc;
        this.direccion = direccion;
        this.tipoPersonal = tipoPersonal;
        this.celular = celular;
        this.email = email;
        this.barrio = barrio;
        this.fechaNac = fechaNac;
        this.genero = genero;
        this.perfil = perfil;
        this.estadoPersonal = estadoPersonal;
    }

    public String getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(String idPersonal) {
        this.idPersonal = idPersonal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoPersonal() {
        return tipoPersonal;
    }

    public void setTipoPersonal(String tipoPersonal) {
        this.tipoPersonal = tipoPersonal;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getEstadoPersonal() {
        return estadoPersonal;
    }

    public void setEstadoPersonal(String estadoPersonal) {
        this.estadoPersonal = estadoPersonal;
    }
    

    
}
