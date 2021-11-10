package Controllers;

import Models.EmpleadoSucursal;
import Models.Transportista;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TransportistaController {
    private String url = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=ParcialFarmaceutica";
    private String user = "sa";
    private String password = "1234";
    
    public TransportistaController(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TransportistaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public ArrayList<Transportista> ObtenerTransportistas() {

        ArrayList<Transportista> listado = new ArrayList<>();

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Transportistas");

            while (rs.next()) {
                int idTransportista = rs.getInt(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                String email = rs.getString(4);
                String telefono = rs.getString(5);
                String direccion = rs.getString(6);
                int idTipoDoc = rs.getInt(7);
                String documento = rs.getString(8);
                int idProveedor = rs.getInt(9);

                Transportista t = new Transportista(idTransportista, nombre, apellido, email, telefono, direccion, idTipoDoc, documento,idProveedor);
                listado.add(t);
            }

            rs.close();
            st.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(TransportistaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }

    public void agregarEmpleado(Transportista t) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement st = con.prepareStatement("insert into Tranportistas(nombre,apellido,email,telefono,direccion,idTipoDocumento,documento)values(?,?,?,?,?,?,?)");
            st.setString(1, t.getNombre());
            st.setString(2, t.getApellido());
            st.setString(3, t.getEmail());
            st.setString(4, t.getTelefono());
            st.setString(5, t.getDireccion());
            st.setInt(6, t.getIdTipoDocumento());
            st.setString(7, t.getDocumento());

            st.executeUpdate();

            st.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(TransportistaController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
