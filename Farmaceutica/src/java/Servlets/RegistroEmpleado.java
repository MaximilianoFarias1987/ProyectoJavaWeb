package Servlets;

import Controllers.EmpleadoSucursalController;
import Controllers.SucursalController;
import Models.EmpleadoSucursal;
import Models.Sucursal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RegistroEmpleado", urlPatterns = {"/RegistroEmpleado"})
public class RegistroEmpleado extends HttpServlet {

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
        String apellido = request.getParameter("txtApellido");
        String email = request.getParameter("txtEmail");
        String telefono = request.getParameter("txtTelefono");
        String direccion = request.getParameter("txtDireccion");
        int idTipoDoc = Integer.parseInt(request.getParameter("cboTipoDocumento"));
        String documento = request.getParameter("txtDocumento");
        int idSucursal = Integer.parseInt(request.getParameter("cboSucursal"));
        
        EmpleadoSucursal empleado = new EmpleadoSucursal(0, nombre, apellido, email, telefono, direccion, idTipoDoc, documento, idSucursal);
        
        EmpleadoSucursalController controlador = new EmpleadoSucursalController();
        controlador.agregarEmpleado(empleado);
        response.sendRedirect("/Farmaceutica/ListadoEmpleados");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
