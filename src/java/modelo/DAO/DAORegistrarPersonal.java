package modelo.DAO;

import static java.lang.System.out;
import util.Conexion;
import modelo.BEAN.BeanRegistrarPersonal;
import util.InterfaceCRUD;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAORegistrarPersonal extends Conexion implements InterfaceCRUD {

    private Connection conn = null;
    private Statement puente = null;
    private ResultSet rs = null;

    public boolean encontrado = false;
    public boolean listo = false;

    public String rol = "";
    public String usuario = "";
    public String contrasena = "";
    public String idPersonal = "";
    public String Usuarios_idUsusarios = "";
    public String nombres = "";
    public String primerApellido = "";
    public String segundoApellido = "";
    public String tipoDoc = "";
    public String doc = "";
    public String direccion = "";
    public String tipoPersonal = "";
    public String celular = "";
    public String email = "";
    public String barrio = "";
    public String fechaNac = "";
    public String genero = "";
    public String perfil = "";
    public String estadoPersonal = "";


    public DAORegistrarPersonal(BeanRegistrarPersonal BPer) {

        super();

        try {

            conn = this.ObtenerConexion();
            puente = conn.createStatement();

            rol = BPer.getRol();
            usuario = BPer.getUsuario();
            contrasena = BPer.getContrasena();
            idPersonal = BPer.getIdPersonal();
            Usuarios_idUsusarios = BPer.getUsuarios_idUsuarios();
            nombres = BPer.getNombres();
            primerApellido = BPer.getPrimerApellido();
            segundoApellido = BPer.getSegundoApellido();
            tipoDoc = BPer.getTipoDoc();
            doc = BPer.getDoc();
            direccion = BPer.getDireccion();
            tipoPersonal = BPer.getTipoPersonal();
            celular = BPer.getCelular();
            email = BPer.getEmail();
            barrio = BPer.getBarrio();
            fechaNac = BPer.getFechaNac();
            genero = BPer.getGenero();
            perfil = BPer.getPerfil();
            estadoPersonal = BPer.getEstadoPersonal();

        } catch (Exception e) {
        }
    }

    @Override
    public boolean AgregarRegistroAspirante() {

        try {
            puente.executeUpdate("insert into usuarios(rol,usuario,contrasena) Values('" + rol + "','" + usuario + "','" + contrasena + "');");
            //puente.executeQuery("Select LAST_INSERT_ID()");
            puente.executeUpdate("insert into personal(idPersonal,Usuarios_idUsuarios,nombres,primerApellido,segundoApellido,tipoDoc,doc,direccion,tipoPersonal,celular,email,barrio,fechaNac,genero,perfil,estadoPersonal) Values(null,'" + Usuarios_idUsusarios + "','" + nombres + "','" + primerApellido + "','" + segundoApellido + "','" + tipoDoc + "','" + doc + "','" + direccion + "','" + tipoPersonal + "','" + celular + "','" + email + "','" + barrio + "','" + fechaNac + "','" + genero + "',NULL,NULL)");

            listo = true;

        } catch (Exception e) {
            Logger.getLogger(DAORegistrarPersonal.class.getName()).log(Level.SEVERE, null, e);
        }
        return listo;
    }
    
    

    //Null
    @Override
    public boolean RegistrarSolicitudNiñeras() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean RegistrarSolicitudAseo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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

    //Null   
}