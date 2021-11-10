package Controllers;

import Models.Provincia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProvinciaController {
    private String url = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=ParcialFarmaceutica";
    private String user = "sa";
    private String password = "1234";
    
    public ProvinciaController(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProvinciaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Provincia> obtenerProvincias() {

        ArrayList<Provincia> listado = new ArrayList<>();

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Provincias");

            while (rs.next()) {
                int idProvincia = rs.getInt(1);
                String descripcion = rs.getString(2);

                Provincia p = new Provincia(idProvincia, descripcion);
                listado.add(p);
            }
            
                rs.close();
                st.close();
                con.close();
                
        } catch (SQLException ex) {
            Logger.getLogger(ProvinciaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }
}
