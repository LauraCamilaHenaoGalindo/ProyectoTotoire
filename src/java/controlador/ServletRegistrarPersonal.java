package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.BEAN.BeanRegistrarPersonal;

import modelo.DAO.DAORegistrarPersonal;

@WebServlet(name = "ServletPersonal", urlPatterns = {"/ServletPersonal"})
public class ServletRegistrarPersonal extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        int opcion = Integer.parseInt(request.getParameter("textOpcion"));
        String rol = request.getParameter("textRol");
        String usuario = request.getParameter("textUsuario");
        String contrasena = request.getParameter("textContraseña");
        String idPersonal = request.getParameter("textIdPersonal");
        String Usuarios_idUsuarios = request.getParameter("textUsuarios_idUsuarios");
        String nombres = request.getParameter("textNombres");
        String primerApellido = request.getParameter("textPrimerApellido");
        String segundoApellido = request.getParameter("textSegundoApellido");
        String tipoDoc = request.getParameter("textTipoDoc");
        String doc = request.getParameter("textDoc");
        String direccion = request.getParameter("textDireccion");
        String tipoPersonal = request.getParameter("textTipoPersonal");
        String celular = request.getParameter("textCelular");
        String email = request.getParameter("textEmail");
        String barrio = request.getParameter("textBarrio");
        String fechaNac = request.getParameter("textFechaNac");
        String genero = request.getParameter("textGenero");
        String perfil = request.getParameter("textPerfil");
        String estadoPersonal = request.getParameter("textestadoPersonal");
        
        
       
        
        BeanRegistrarPersonal BRPersonal = new BeanRegistrarPersonal(rol, usuario, contrasena, idPersonal,Usuarios_idUsuarios,nombres, primerApellido, segundoApellido, tipoDoc, doc, direccion, tipoPersonal, celular, email, barrio, fechaNac, genero, perfil, estadoPersonal);
        
        DAORegistrarPersonal DRPersonal = new DAORegistrarPersonal(BRPersonal);

        switch (opcion) {

            case 1:// Agregar Registro

                if (DRPersonal.AgregarRegistroAspirante()) {
                    request.setAttribute("exito", "<script> alert('El aspirante fue registrado Correctamente!!')</script>");
                    
                } else {

                    request.setAttribute("error", "<script> alert('El aspirante no fue registrado!!')</script>");
                
                request.getRequestDispatcher("RegistrarPersonal.jsp").forward(request, response);
                break;

        }
    }
    }

        // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
        /**
         * Handles the HTTP <code>GET</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doGet
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Handles the HTTP <code>POST</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
        
            () {
        return "Short description";
        }// </editor-fold>
    }


