package modelo.DAO;

import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.BEAN.BeanSolicitud;
import util.Conexion;
import util.InterfaceCRUD;

public class DAOSolicitud extends Conexion implements InterfaceCRUD {

    private Connection conn = null;
    private Statement puente = null;
    private ResultSet rs = null;

    public String idSolicitud = "";
    private String Personal_idPersonal = "";
    private String Servicio_idServicio = "";
    private String Cliente_idCliente = "";
    public String fechaServicio = "";
    public String fechaRegistro = "";
    public String estadoSolicitud = "";
    public String jornada = "";
    public String descripcion = "";
    public String observaciones = "";

    public DAOSolicitud(BeanSolicitud BSol) {

        super();

        try {

            conn = this.ObtenerConexion();
            puente = conn.createStatement();

            idSolicitud = BSol.getIdSolicitud();
            Personal_idPersonal = BSol.getPersonal_idPersonal();
            Servicio_idServicio = BSol.getServicio_idServicio();
            Cliente_idCliente = BSol.getCliente_idCliente();
            fechaServicio = BSol.getFechaServicio();
            fechaRegistro = BSol.getFechaRegistro();
            estadoSolicitud = BSol.getEstadoSolicitud();
            jornada = BSol.getIdSolicitud();
            descripcion = BSol.getDescripcion();
            observaciones = BSol.getObservaciones();

        } catch (Exception e) {
        }

    }

    @Override
    public boolean RegistrarSolicitudNiñeras() {
        try {
            puente.executeUpdate("insert into solicitud(idSolicitud,Personal_idPersonal,Servicio_idServicio,Cliente_idCliente,fechaServicio,fechaRegistro,jornada,descripcion) Values(NULL,'" + fechaServicio + "','" + fechaRegistro + "','" + jornada + "','" + descripcion + "');");

        } catch (Exception e) {
            Logger.getLogger(DAORegistrarPersonal.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;

    }

    @Override
    public boolean RegistrarSolicitudAseo() {
         try {
            puente.executeUpdate("insert into solicitud(idSolicitud,Personal_idPersonal,Servicio_idServicio,Cliente_idCliente,fechaServicio,fechaRegistro,observaciones) Values(NULL,'" + fechaServicio + "','" + observaciones + "');");

        } catch (Exception e) {
            Logger.getLogger(DAORegistrarPersonal.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;

    }

    //Null
    @Override
    public boolean AgregarRegistroAspirante() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //Null

    @Override
    public boolean ConsultarServicioNiñera() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ConsultarServicioAseo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean AgregarRegistroUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
