package Controllers;

import Models.Marca;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MarcasController {
    private String url = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=ParcialFarmaceutica";
    private String user = "sa";
    private String password = "1234";
    
    public MarcasController(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MarcasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public ArrayList<Marca> obtenerMarcas() {

        ArrayList<Marca> listado = new ArrayList<>();

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Marcas");

            while (rs.next()) {
                int idMarca = rs.getInt(1);
                String descripcion = rs.getString(2);

                Marca l = new Marca(idMarca, descripcion);
                listado.add(l);
            }
            
                rs.close();
                st.close();
                con.close();
                
        } catch (SQLException ex) {
            Logger.getLogger(MarcasController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }
    
    
    
}
