package Controllers;

import Models.Categoria;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CategoriaController {
    private String url = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=ParcialFarmaceutica";
    private String user = "sa";
    private String password = "1234";
    
    public CategoriaController(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CategoriaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public ArrayList<Categoria> obtenerCategorias() {

        ArrayList<Categoria> listado = new ArrayList<>();

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Categorias");

            while (rs.next()) {
                int idCategoria = rs.getInt(1);
                String descripcion = rs.getString(2);

                Categoria c = new Categoria(idCategoria, descripcion);
                listado.add(c);
            }
            
                rs.close();
                st.close();
                con.close();
                
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }
    
    
}
