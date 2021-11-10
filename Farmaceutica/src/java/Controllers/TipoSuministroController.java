package Controllers;

import Models.TipoSuministro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TipoSuministroController {
    private String url = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=ParcialFarmaceutica";
    private String user = "sa";
    private String password = "1234";
    
    public TipoSuministroController(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TipoSuministroController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public ArrayList<TipoSuministro> obtenerTiposSuministros() {

        ArrayList<TipoSuministro> listado = new ArrayList<>();

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from TiposSuministros");

            while (rs.next()) {
                int idTipoSuministro = rs.getInt(1);
                String descripcion = rs.getString(2);

                TipoSuministro t = new TipoSuministro(idTipoSuministro, descripcion);
                listado.add(t);
            }
            
                rs.close();
                st.close();
                con.close();
                
        } catch (SQLException ex) {
            Logger.getLogger(TipoSuministroController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }
    
    
}
