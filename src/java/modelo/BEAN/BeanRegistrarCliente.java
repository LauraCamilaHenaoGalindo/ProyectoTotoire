
package modelo.BEAN;

public class BeanRegistrarCliente {
    
   private String idCliente;
   private String nombres;
   private String primerApellido;
   private String segundoApellido;
   private String tipoDoc;
   private String doc;
   private String estadoCliente;
   private String email;
   private String numeroHijos;
   private String fechaNacUltimoHijo;
   private String localidad;
   private String barrio;
   private String genero;
   private String direccion;
   private String celular;
   

    public BeanRegistrarCliente(String idCliente, String nombres, String primerApellido, String segundoApellido, String tipoDoc, String doc, String estadoCliente, String email, String numeroHijos, String fechaNacUltimoHijo, String localidad, String barrio, String genero, String direccion, String celular) {
        this.idCliente = idCliente;
        this.nombres = nombres;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.tipoDoc = tipoDoc;
        this.doc = doc;
        this.estadoCliente = estadoCliente;
        this.email = email;
        this.numeroHijos = numeroHijos;
        this.fechaNacUltimoHijo = fechaNacUltimoHijo;
        this.localidad = localidad;
        this.barrio = barrio;
        this.genero = genero;
        this.direccion = direccion;
        this.celular = celular;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
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

    public String getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroHijos() {
        return numeroHijos;
    }

    public void setNumeroHijos(String numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    public String getFechaNacUltimoHijo() {
        return fechaNacUltimoHijo;
    }

    public void setFechaNacUltimoHijo(String fechaNacUltimoHijo) {
        this.fechaNacUltimoHijo = fechaNacUltimoHijo;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
   
   
    
}
