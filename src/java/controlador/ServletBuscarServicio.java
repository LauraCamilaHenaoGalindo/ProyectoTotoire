
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.BEAN.BeanBuscarServicio;
import modelo.DAO.DAOBuscarServicio;


@WebServlet(name = "ServletBuscarServicio", urlPatterns = {"/BuscarServicio"})
public class ServletBuscarServicio extends HttpServlet {
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
        String idServicio = request.getParameter("textid");
        String tipoServicio = request.getParameter("texttiposervicio");
        
        BeanBuscarServicio BBusSer = new BeanBuscarServicio(idServicio, tipoServicio);
        DAOBuscarServicio DBusSer = new DAOBuscarServicio(BBusSer);
        
         switch (opcion) {
            case 1: //ConsultarServicioNiñeras
                if (DBusSer.ConsultarServicioNiñera()) {
                    request.getRequestDispatcher("BuscarServicioNiñera.jsp").forward(request, response);
                } 
                break;

            case 2: //ConsultarServicioAseo
                if (DBusSer.RegistrarSolicitudAseo()) {
                    request.getRequestDispatcher("BuscarServicioAseo.jsp").forward(request, response);
                } 
                break;
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
