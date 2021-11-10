package Servlets;

import Controllers.EmpleadoSucursalController;
import Controllers.SuministroController;
import Dtos.StockDto;
import Dtos.SuministroDto;
import Models.EmpleadoSucursal;
import Models.Suministro;
import Models.TipoSuministro;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RegistroSuministro", urlPatterns = {"/RegistroSuministro"})
public class RegistroSuministro extends HttpServlet {

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
        String descripcion = request.getParameter("txtDescripcion");
        float precio = Float.parseFloat(request.getParameter("txtPrecio"));
        int idMarca = Integer.parseInt(request.getParameter("cboMarca"));
        int idCategoria = Integer.parseInt(request.getParameter("cboCategoria"));
        int idTipoSuministro = Integer.parseInt(request.getParameter("cboTipoSuministro"));
        int stock = Integer.parseInt(request.getParameter("txtStock"));
        int idSucursal = Integer.parseInt(request.getParameter("cboSucursal"));
        
        Suministro suministro = new Suministro(0, descripcion, precio, idMarca, idCategoria, idTipoSuministro);
        
        StockDto dto = new StockDto(stock, idSucursal);
        
        SuministroController controlador = new SuministroController();
        controlador.agregarSuministros(suministro, dto);
        response.sendRedirect("/Farmaceutica/listadoSuministro.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
