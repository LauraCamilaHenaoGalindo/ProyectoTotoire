
package modelo.BEAN;

public class BeanSolicitud {
    
    private String idSolicitud;
    private String Personal_idPersonal;
    private String Servicio_idServicio;
    private String Cliente_idCliente;
    private String fechaServicio;
    private String fechaRegistro;
    private String estadoSolicitud;
    private String jornada;
    private String descripcion;
    private String observaciones;
    

    public BeanSolicitud(String idSolicitud, String Personal_idPersonal, String Servicio_idServicio, String Cliente_idCliente, String fechaServicio, String fechaRegistro, String estadoSolicitud, String jornada, String descripcion, String observaciones) {
        this.idSolicitud = idSolicitud;
        this.Personal_idPersonal = Personal_idPersonal;
        this.Servicio_idServicio = Servicio_idServicio;
        this.Cliente_idCliente = Cliente_idCliente;
        this.fechaServicio = fechaServicio;
        this.fechaRegistro = fechaRegistro;
        this.estadoSolicitud = estadoSolicitud;
        this.jornada = jornada;
        this.descripcion = descripcion;
        this.observaciones = observaciones;
    }

    public String getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(String idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public String getPersonal_idPersonal() {
        return Personal_idPersonal;
    }

    public void setPersonal_idPersonal(String Personal_idPersonal) {
        this.Personal_idPersonal = Personal_idPersonal;
    }

    public String getServicio_idServicio() {
        return Servicio_idServicio;
    }

    public void setServicio_idServicio(String Servicio_idServicio) {
        this.Servicio_idServicio = Servicio_idServicio;
    }

    public String getCliente_idCliente() {
        return Cliente_idCliente;
    }

    public void setCliente_idCliente(String Cliente_idCliente) {
        this.Cliente_idCliente = Cliente_idCliente;
    }

    public String getFechaServicio() {
        return fechaServicio;
    }

    public void setFechaServicio(String fechaServicio) {
        this.fechaServicio = fechaServicio;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getEstadoSolicitud() {
        return estadoSolicitud;
    }

    public void setEstadoSolicitud(String estadoSolicitud) {
        this.estadoSolicitud = estadoSolicitud;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    

    
   
    
}
