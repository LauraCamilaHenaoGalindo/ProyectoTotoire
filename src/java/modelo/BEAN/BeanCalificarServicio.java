
package modelo.BEAN;


public class BeanCalificarServicio {
    
    private String idCalificacion;
    private String calificacion;
    private String comentarios;

    public BeanCalificarServicio(String idCalificacion, String calificacion, String comentarios) {
        this.idCalificacion = idCalificacion;
        this.calificacion = calificacion;
        this.comentarios = comentarios;
    }

    public String getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(String idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    
    
    
    
}
