package modelo.DAO;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;
import modelo.BEAN.BeanBuscarServicio;
import util.Conexion;
import util.InterfaceCRUD;

public class DAOBuscarServicio extends Conexion implements InterfaceCRUD {

    private Connection conn = null;
    private Statement puente = null;
    private ResultSet rs = null;
    
    public String idServicio = "";
    public String tipoServicio = ""; 
    
    public DAOBuscarServicio(BeanBuscarServicio BBusSer) {

        super();

        try {
            conn = this.ObtenerConexion();
            puente = conn.createStatement();

            idServicio = BBusSer.getIdServicio();
            tipoServicio = BBusSer.getTipoServicio();           

        } catch (Exception e) {
        }

    }

    @Override
    public boolean ConsultarServicioNiñera() {
        try {

            Conexion conex = new Conexion();
            Connection con = conex.ObtenerConexion();
            Statement puente = con.createStatement();
            ResultSet rs = puente.executeQuery("select * from personal where tipoPersonal='" + tipoServicio + "';");

            rs.close();
            puente.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    @Override
    public boolean ConsultarServicioAseo() {
       try {

            Conexion conex = new Conexion();
            Connection con = conex.ObtenerConexion();
            Statement puente = con.createStatement();
            ResultSet rs = puente.executeQuery("select * from personal where tipoPersonal='" + tipoServicio + "';");

            rs.close();
            puente.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    //Null
    @Override
    public boolean AgregarRegistroAspirante() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean RegistrarSolicitudNiñeras() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean RegistrarSolicitudAseo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //Null

    @Override
    public boolean AgregarRegistroUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    

}
