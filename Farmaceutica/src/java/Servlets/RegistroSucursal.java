package Servlets;

import Controllers.SucursalController;
import Models.Sucursal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RegistroSucursal", urlPatterns = {"/RegistroSucursal"})
public class RegistroSucursal extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("txtNombre");
        String direccion = request.getParameter("txtDireccion");
        String email = request.getParameter("txtEmail");
        String telefono = request.getParameter("txtTelefono");
        int idProvincia = Integer.parseInt(request.getParameter("txtIdProvincia"));
        
        Sucursal sucursal = new Sucursal(0, nombre, direccion, email, telefono, idProvincia);
        
        SucursalController controlador = new SucursalController();
        controlador.agregarSucursal(sucursal);
        response.sendRedirect("/Farmaceutica/ListadoSucursal");
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
