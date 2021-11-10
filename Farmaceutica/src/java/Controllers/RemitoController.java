package Controllers;

import Dtos.DetalleRemitoDto;
import Models.Remito;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RemitoController {
    private String url = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=ParcialFarmaceutica";
    private String user = "sa";
    private String password = "1234";
    
    public RemitoController(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RemitoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public int insertarRemito(Remito r, ArrayList<DetalleRemitoDto> lst) {
        int idRemito = 0;
        Connection con = null;
        PreparedStatement ps = null;
        PreparedStatement ps2 = null;
        PreparedStatement ps3 = null;
        Statement st = null;
        ResultSet rs = null;
        
        String query = "Insert into Remitos (idEmpleado,idTransportista,fecha) values (?,?,?)";
        String query2 = "select @@Identity id";
        String query3 = "insert into DetallesRemito (idRemito, idSuministro, cantidad, precioUnitario) values (?,?,?,?)";
        //Revisar la query 4
        String query4 = "update Strocks set cantidad = (select sum(s.cantidad + d.cantidad) from Stocks s join\n"
                + " Suministros a on s.idSuministro = a.idSuministro join DetallesRemito d on d.idSuministro = a.idSuministro\n"
                + " where a.idSuministro = ?) where idSuministro = ?";
        try {
            con = DriverManager.getConnection(url, user, password);
            con.setAutoCommit(false);
            ps = con.prepareStatement(query);
            ps.setInt(1, r.getIdEmpleado());
            ps.setInt(2, r.getIdTransportista());
            ps.setDate(3, (Date) r.getFecha());

            int filas = ps.executeUpdate();
            if (filas != 0) {
                st = con.createStatement();
                rs = st.executeQuery(query2);
                
                if (rs.next()) {
                    idRemito = rs.getInt("id");
                }for (DetalleRemitoDto d : lst) {
                    ps2 = con.prepareStatement(query3);
                    ps2.setInt(1, idRemito);
                    ps2.setInt(2, d.getIdSuministro());
                    ps2.setInt(3, d.getCantidad());
                    ps2.setFloat(4, d.getPrecioUnitario());
                    
                    ps2.executeUpdate();
                    
                    ps3 = con.prepareStatement(query4);
                    ps3.setInt(1, d.getIdSuministro());
                    ps3.setInt(2, d.getIdSuministro());
                    
                    ps3.executeUpdate();
                }
                con.commit();
                
            }
            rs.close();
            st.close();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            try {
                con.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(RemitoController.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(RemitoController.class.getName()).log(Level.SEVERE, null, ex);
    }
        return idRemito;
    }
    
}
