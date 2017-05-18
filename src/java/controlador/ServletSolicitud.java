
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.BEAN.BeanSolicitud;
import modelo.DAO.DAOSolicitud;


@WebServlet(name = "ServletSolicitud", urlPatterns = {"/ServletSolicitud"})
public class ServletSolicitud extends HttpServlet {

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
        String idSolicitud = request.getParameter("textidSolicitud");
        String Personal_idPersonal = request.getParameter("textPersonal_idPersonal");
        String Servicio_idServicio = request.getParameter("textServicio_idServicio");
        String Cliente_idCliente = request.getParameter("textCliente_idCliente");
        String fechaServicio = request.getParameter("textfechaServicio");
        String fechaRegistro = request.getParameter("textfechaRegistro");
        String estadoSolicitud  = request.getParameter("textestadoSolicitud");
        String jornada = request.getParameter("textjornada");
        String descripcion = request.getParameter("textdescripcion");
        String observaciones = request.getParameter("textobservaciones");
        
        
        BeanSolicitud BSolicitud = new BeanSolicitud(idSolicitud, Personal_idPersonal, Servicio_idServicio, Cliente_idCliente, fechaServicio, fechaRegistro,estadoSolicitud,jornada,descripcion,observaciones);
        
        DAOSolicitud DSolicitud = new DAOSolicitud(BSolicitud);
        
        switch (opcion) {

            case 1:// Agregar solicitud Niñeras

                if (DSolicitud.RegistrarSolicitudNiñeras()) {
                    request.setAttribute("exito", "<script> alert('Su solicitud fue registrada Correctamente!!')</script>");
                    
                } else {

                    request.setAttribute("error", "<script> alert('Su solicitud no fue registrado!!')</script>");
                
                request.getRequestDispatcher("RegistrarSolicitudNiñeras.jsp").forward(request, response);
                break;

        }
                
            case 2:// Agregar solicitud Aseo

                if (DSolicitud.RegistrarSolicitudAseo()) {
                    request.setAttribute("exito", "<script> alert('Su solicitud fue registrada Correctamente!!')</script>");
                    
                } else {

                    request.setAttribute("error", "<script> alert('Su solicitud no fue registrado!!')</script>");
                
                request.getRequestDispatcher("RegistrarSolicitudAseo.jsp").forward(request, response);
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
