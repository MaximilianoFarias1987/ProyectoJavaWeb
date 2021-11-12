package Servlets;

import Dtos.DetalleRemitoDto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LlenarArrayDetalle", urlPatterns = {"/LlenarArrayDetalle"})
public class LlenarArrayDetalle extends HttpServlet {

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
        
        HttpSession session = request.getSession();
        ArrayList<DetalleRemitoDto> lst = (ArrayList<DetalleRemitoDto>) session.getAttribute("lstDetalle");
        
        if (lst == null) {
            lst = new ArrayList<>();
        }
        
        
        int idSuministro = Integer.parseInt(request.getParameter("txtIdSuministro"));
        String suministro = request.getParameter("txtSuministro");
        int cantidad = Integer.parseInt(request.getParameter("txtCantidad"));
        float precio = Float.parseFloat(request.getParameter("txtPrecio"));
        
        DetalleRemitoDto dto = new DetalleRemitoDto(0, idSuministro, suministro, cantidad, precio);
        lst.add(dto);
        
        session.setAttribute("lstDetalle", lst);
        
        RequestDispatcher rd= getServletContext().getRequestDispatcher("/generarRemito.jsp");
        rd.forward(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
