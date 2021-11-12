package Servlets;

import Controllers.RemitoController;
import Dtos.DetalleRemitoDto;
import Models.Remito;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RegistroRemito", urlPatterns = {"/RegistroRemito"})
public class RegistroRemito extends HttpServlet {

    
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
        
        int idEmpleado = Integer.parseInt(request.getParameter("txtIdEmpleado"));
        int idTransportista = Integer.parseInt(request.getParameter("txtIdTransportista"));
        
        
        
        
        Date fecha = new Date();
        
        Remito remito = new Remito(0, idEmpleado, idTransportista, fecha);
        
        RemitoController controlador = new RemitoController();
        
        ArrayList<DetalleRemitoDto> lst = (ArrayList<DetalleRemitoDto>) request.getSession().getAttribute("lstDetalle");
        
        if (lst != null) {
            int idRemito = controlador.insertarRemito(remito, lst);
            request.getSession().removeAttribute("lstDetalle");
        }
        
        RequestDispatcher rd= getServletContext().getRequestDispatcher("/imprimirRemito.jsp");
        rd.forward(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
