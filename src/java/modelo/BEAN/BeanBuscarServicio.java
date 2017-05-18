
package modelo.BEAN;

public class BeanBuscarServicio {
    
    private String idServicio;
    private String tipoServicio;

    public BeanBuscarServicio(String idServicio, String tipoServicio) {
        this.idServicio = idServicio;
        this.tipoServicio = tipoServicio;
    }

    public String getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
    
}
