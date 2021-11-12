package Controllers;

import Dtos.DetalleRemitoDto;
import Dtos.RemitoDto;
import Dtos.SucursalDto;
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
        String query4 = "update Stocks set cantidadSuministros = (select sum(s.cantidadSuministros + d.cantidad) from Stocks s join\n"
                + " Suministros a on s.idSuministro = a.idSuministro join DetallesRemito d on d.idSuministro = a.idSuministro\n"
                + " join Remitos r on r.idRemito = d.idRemito where a.idSuministro = ? and r.idRemito = ?) where idSuministro = ?";
        try {
            con = DriverManager.getConnection(url, user, password);
            con.setAutoCommit(false);
            ps = con.prepareStatement(query);
            ps.setInt(1, r.getIdEmpleado());
            ps.setInt(2, r.getIdTransportista());
            ps.setDate(3, new java.sql.Date(r.getFecha().getTime( )));

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
                    ps3.setInt(2, idRemito);
                    ps3.setInt(3, d.getIdSuministro());
                    
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
    
    
    
    public ArrayList<RemitoDto> ultimoRemito() {
        Connection con = null;
        PreparedStatement ps = null;
        PreparedStatement ps2 = null;
        ResultSet rs = null;
        
        ArrayList<RemitoDto> listado = new ArrayList<>();
        RemitoDto dto = null;
        
        float total = 0;
        try {
            String Query = "select  r.idRemito Codigo, r.fecha Fecha, s.nombre Sucursal, p.descripcion Provincia, s.telefono Telefono,\n" +
                            "d.idSuministro CodigoSum,su.descripcion Suministro, d.cantidad Cantidad, d.precioUnitario PrecioUnitario,\n" +
                            "d.cantidad * d.precioUnitario Subtotal\n" +
                            "from Provincias p join Sucursales s\n" +
                            "on p.idProvincia = s.idProvincia join EmpleadosSucursales e\n" +
                            "on s.idSucursal = e.idSucursal join Remitos r \n" +
                            "on r.idEmpleado = e.idEmpleado join DetallesRemito d\n" +
                            "on r.idRemito = d.idRemito join Suministros su\n" +
                            "on su.idSuministro = d.idSuministro\n" +
                            "where r.idRemito = (select top 1 idRemito from Remitos order by idRemito desc)\n" +
                            "group by r.idRemito, r.fecha, s.nombre, p.descripcion, s.telefono,\n" +
                            "d.idSuministro,su.descripcion, d.cantidad, d.precioUnitario,\n" +
                            "d.cantidad * d.precioUnitario";
            
            String Query2 = "select \n" +
                            "SUM(cantidad * precioUnitario) Total\n" +
                            "from DetallesRemito \n" +
                            "where idRemito = (select top 1 idRemito from Remitos order by idRemito desc)";
            
            con = DriverManager.getConnection(url, user, password);
            
            ps2 = con.prepareStatement(Query2);
            rs = ps2.executeQuery();
            
            if (rs.next()) {
                total = rs.getFloat("Total");
            }
            
            
            ps = con.prepareStatement(Query);
            rs = ps.executeQuery();

            while (rs.next()) {
                dto = new RemitoDto();
                dto.setCodigo(rs.getInt("Codigo"));
                dto.setFecha(rs.getDate("Fecha"));
                dto.setNomSucursal(rs.getString("Sucursal"));
                dto.setProvincia(rs.getString("Provincia"));
                dto.setTelefono(rs.getString("Telefono"));
                dto.setIdSuministro(rs.getInt("CodigoSum"));
                dto.setNomSuministro(rs.getString("Suministro"));
                dto.setCantidad(rs.getInt("Cantidad"));
                dto.setPreUnitario(rs.getFloat("PrecioUnitario"));
                dto.setSubTotal(rs.getFloat("Subtotal"));
                dto.setTotal(total);
                listado.add(dto);
            }
            
            
            

            rs.close();
            ps.close();
            ps2.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(RemitoController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }
    
}
