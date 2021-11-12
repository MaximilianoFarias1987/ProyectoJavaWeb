package Controllers;

import Dtos.EmpleadoDto;
import Dtos.SucursalDto;
import Models.EmpleadoSucursal;
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

public class EmpleadoSucursalController {

    private String url = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=ParcialFarmaceutica";
    private String user = "sa";
    private String password = "1234";

    public EmpleadoSucursalController() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmpleadoSucursalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<EmpleadoSucursal> obtenerEmpleados() {

        ArrayList<EmpleadoSucursal> listado = new ArrayList<>();

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from EmpleadosSucursales");

            while (rs.next()) {
                int idEmpleado = rs.getInt(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                String email = rs.getString(4);
                String telefono = rs.getString(5);
                String direccion = rs.getString(6);
                int idTipoDoc = rs.getInt(7);
                int idSucursal = rs.getInt(8);
                String documento = rs.getString(9);

                EmpleadoSucursal e = new EmpleadoSucursal(idEmpleado, nombre, apellido, email, telefono, direccion, idTipoDoc, documento, idSucursal);
                listado.add(e);
            }

            rs.close();
            st.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoSucursalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }

    public void agregarEmpleado(EmpleadoSucursal e) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement st = con.prepareStatement("insert into EmpleadosSucursales(nombre,apellido,email,telefono,direccion,idTipoDocumento,idSucursal,documento)values(?,?,?,?,?,?,?,?)");
            st.setString(1, e.getNombre());
            st.setString(2, e.getApellido());
            st.setString(3, e.getEmail());
            st.setString(4, e.getTelefono());
            st.setString(5, e.getDireccion());
            st.setInt(6, e.getIdTipoDoc());
            st.setInt(7, e.getIdSucursal());
            st.setString(8, e.getDocumento());

            st.executeUpdate();

            st.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoSucursalController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<EmpleadoDto> listadoEmpleadoDto() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int cantidad = 0;
        ArrayList<EmpleadoDto> listado = new ArrayList<>();
        EmpleadoDto dto = null;
        try {
            String Query = "select e.nombre nombre, e.apellido apellido, e.email email, e.telefono telefono, e.direccion direccion,\n"
                    + "  t.descripcion tipoDocumento, e.documento documento, s.nombre sucursal\n"
                    + "  from EmpleadosSucursales e join TiposDocumentos t\n"
                    + "  on e.idTipoDocumento = t.idTipoDocumento join Sucursales s\n"
                    + "  on s.idSucursal = e.idSucursal";
            con = DriverManager.getConnection(url, user, password);
            ps = con.prepareStatement(Query);
            rs = ps.executeQuery();

            while (rs.next()) {
                dto = new EmpleadoDto();
                dto.setNombre(rs.getString("nombre"));
                dto.setApellido(rs.getString("apellido"));
                dto.setEmail(rs.getString("email"));
                dto.setTelefono(rs.getString("telefono"));
                dto.setDireccion(rs.getString("direccion"));
                dto.setTipoDocumento(rs.getString("tipoDocumento"));
                dto.setDocumento(rs.getString("documento"));
                dto.setSucursal(rs.getString("sucursal"));
                listado.add(dto);
            }

            rs.close();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoSucursalController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }
}
