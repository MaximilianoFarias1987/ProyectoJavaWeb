package Controllers;

import Dtos.ProveedorTransportistaDto;
import Dtos.SucursalEmpleadoDto;
import Models.Proveedor;
import Models.Sucursal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProveedorController {
    private String url = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=ParcialFarmaceutica";
    private String user = "sa";
    private String password = "1234";
    
    public ProveedorController(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProveedorController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public ArrayList<Proveedor> obtenerProveedores() {

        ArrayList<Proveedor> listado = new ArrayList<>();

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Proveedores");

            while (rs.next()) {
                int idProveedor = rs.getInt(1);
                String nombre = rs.getString(2);
                String direccion = rs.getString(3);
                String email = rs.getString(4);
                String telefono = rs.getString(5);
                int idProvincia = rs.getInt(6);

                Proveedor p = new Proveedor(idProveedor, nombre, direccion, email, telefono, idProvincia);
                listado.add(p);
            }
            
                rs.close();
                st.close();
                con.close();
                
        } catch (SQLException ex) {
            Logger.getLogger(SucursalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }
    
    
    
    
    public void agregarProveedor(Proveedor p) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement st = con.prepareStatement("insert into Proveedores(nombre,direccion,email,telefono,idProvincia)values(?,?,?,?,?,?)");
            st.setString(1, p.getNombre());
            st.setString(2, p.getDireccion());
            st.setString(3, p.getEmail());
            st.setString(4, p.getTelefono());
            st.setInt(5, p.getIdProvincia());

            st.executeUpdate();

            st.close();
            con.close();
        

        } catch (SQLException ex) {
                    Logger.getLogger(ProveedorController.class
        .getName()).log(Level.SEVERE, null, ex);
                }
    }
    
    
    
    public ArrayList<ProveedorTransportistaDto> listadoProveedorTransportistaDto(int idProveedor) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        ArrayList<ProveedorTransportistaDto> listado = new ArrayList<>();
        ProveedorTransportistaDto dto = null;
        try {
            String Query = "select t.idTransportista Id, t.nombre + ' ' + t.apellido Nombre\n" +
                            "  from Proveedores p join Transportistas t\n" +
                            "  on p.idProveedor = t.idProveedor\n" +
                            "  where p.idProveedor = ?";
            con = DriverManager.getConnection(url, user, password);
            ps = con.prepareStatement(Query);
            ps.setInt(1, idProveedor);
            rs = ps.executeQuery();

            while (rs.next()) {
                dto = new ProveedorTransportistaDto();
                dto.setIdTransportista(rs.getInt("Id"));
                dto.setNombre(rs.getString("Nombre"));
                listado.add(dto);
            }

            rs.close();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }
}
