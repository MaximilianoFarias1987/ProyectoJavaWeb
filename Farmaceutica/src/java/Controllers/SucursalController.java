package Controllers;

import Dtos.SucursalDto;
import Dtos.SucursalEmpleadoDto;
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

public class SucursalController {

    private String url = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=ParcialFarmaceutica";
    private String user = "sa";
    private String password = "1234";

    public SucursalController() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SucursalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Sucursal> obtenerSucursales() {

        ArrayList<Sucursal> listado = new ArrayList<>();

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Sucursales");

            while (rs.next()) {
                int idsucursal = rs.getInt(1);
                String nombre = rs.getString(2);
                String direccion = rs.getString(3);
                String email = rs.getString(4);
                String telefono = rs.getString(5);
                int idProvincia = rs.getInt(6);

                Sucursal s = new Sucursal(idsucursal, nombre, direccion, email, telefono, idProvincia);
                listado.add(s);
            }

            rs.close();
            st.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(SucursalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }

    public void agregarSucursal(Sucursal s) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement st = con.prepareStatement("insert into Sucursales(nombre,direccion,email,telefono,idProvincia)values(?,?,?,?,?)");
            st.setString(1, s.getNombre());
            st.setString(2, s.getDireccion());
            st.setString(3, s.getEmail());
            st.setString(4, s.getTelefono());
            st.setInt(5, s.getIdProvincia());

            st.executeUpdate();

            st.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(SucursalController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<SucursalDto> listadoSucursalDto() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        ArrayList<SucursalDto> listado = new ArrayList<>();
        SucursalDto dto = null;
        try {
            String Query = "select s.idSucursal ID, s.nombre Nombre, s.direccion Direccion, s.email Email, s.telefono Telefono, p.descripcion Provincia\n"
                    + "  from Sucursales s join Provincias p\n"
                    + "  on s.idProvincia = p.idProvincia";
            con = DriverManager.getConnection(url, user, password);
            ps = con.prepareStatement(Query);
            rs = ps.executeQuery();

            while (rs.next()) {
                dto = new SucursalDto();
                dto.setIdSucursal(rs.getInt("ID"));
                dto.setNombre(rs.getString("Nombre"));
                dto.setDireccion(rs.getString("Direccion"));
                dto.setEmail(rs.getString("Email"));
                dto.setTelefono(rs.getString("Telefono"));
                dto.setProvincia(rs.getString("Provincia"));
                listado.add(dto);
            }

            rs.close();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SucursalController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }
    
    
    public ArrayList<SucursalEmpleadoDto> listadoSucursalEmpleadoDto(int idSucursal) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        ArrayList<SucursalEmpleadoDto> listado = new ArrayList<>();
        SucursalEmpleadoDto dto = null;
        try {
            String Query = "select e.idEmpleado Id, e.nombre + ' ' + e.apellido Nombre\n" +
                            "  from Sucursales s join EmpleadosSucursales e\n" +
                            "  on s.idSucursal = e.idSucursal\n" +
                            "  where s.idSucursal = ?";
            con = DriverManager.getConnection(url, user, password);
            ps = con.prepareStatement(Query);
            ps.setInt(1, idSucursal);
            rs = ps.executeQuery();

            while (rs.next()) {
                dto = new SucursalEmpleadoDto();
                dto.setIdEmpleado(rs.getInt("Id"));
                dto.setNombre(rs.getString("Nombre"));
                listado.add(dto);
            }

            rs.close();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SucursalController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }

}
