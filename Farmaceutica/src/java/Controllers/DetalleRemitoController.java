package Controllers;

import Models.DetalleRemito;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DetalleRemitoController {
    private String url = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=ParcialFarmaceutica";
    private String user = "sa";
    private String password = "1234";
    
    public DetalleRemitoController(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DetalleRemitoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void insertarDetalleRemito(DetalleRemito d) {
        Connection con = null;
        PreparedStatement ps = null;
        
        String query = "Insert into DetallesRemito (idRemito,idUministro,cantidad,precioUnitario) values (?,?,?,?)";
        try {
            con = DriverManager.getConnection(url, user, password);
            ps = con.prepareStatement(query);
            ps.setInt(1, d.getIdRemito());
            ps.setInt(2, d.getIdSuministro());
            ps.setInt(3, d.getCantidad());
            ps.setFloat(4, d.getPrecioUnitario());

            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DetalleRemitoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
