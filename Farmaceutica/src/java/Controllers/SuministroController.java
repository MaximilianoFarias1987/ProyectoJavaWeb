package Controllers;

import Dtos.StockDto;
import Dtos.SuministroDto;
import Models.Proveedor;
import Models.Suministro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SuministroController {

    private String url = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=ParcialFarmaceutica";
    private String user = "sa";
    private String password = "1234";

    public SuministroController() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SuministroController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Suministro> ObtenerUministros() {

        ArrayList<Suministro> listado = new ArrayList<>();

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Suministros");

            while (rs.next()) {
                int idSuministro = rs.getInt(1);
                String descripcion = rs.getString(2);
                float precio = rs.getFloat(3);
                int idLaboratorio = rs.getInt(4);
                int idCategoria = rs.getInt(5);
                int idTipoSuministro = rs.getInt(6);

                Suministro s = new Suministro(idSuministro, descripcion, precio, idLaboratorio, idCategoria, idTipoSuministro);
                listado.add(s);
            }

            rs.close();
            st.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(SuministroController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }

    public void agregarSuministros(Suministro s, StockDto dto) {
        int idSuministro = 0;
        Connection con = null;
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection(url, user, password);
            con.setAutoCommit(false);
            PreparedStatement ps = con.prepareStatement("insert into Suministros(descripcion,precio,idMarca,idCategoria,idTipoSuministro)values(?,?,?,?,?)");
            ps.setString(1, s.getDescripcion());
            ps.setFloat(2, s.getPrecio());
            ps.setInt(3, s.getIdMarca());
            ps.setInt(4, s.getIdCategoria());
            ps.setInt(5, s.getIdTipoSuministro());

            int filas = ps.executeUpdate();
            
            if (filas !=0) {
                Statement st = con.createStatement();
                rs = st.executeQuery("select @@Identity id");
                
                if (rs.next()) {
                    idSuministro = rs.getInt("id");
                }
                PreparedStatement ps2 = con.prepareStatement("insert into Stocks(cantidadSuministros, idSuministro, idSucursal)values(?,?,?)");
                ps2.setInt(1, dto.getCantidad());
                ps2.setInt(2, idSuministro);
                ps2.setInt(3, dto.getIdSucursal());
                
                ps2.executeUpdate();
                
                con.commit();
            }

            ps.close();
            con.close();

        } catch (SQLException ex) {
            try {
                con.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(SuministroController.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(SuministroController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<SuministroDto> listadoSuministroDto() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<SuministroDto> listado = new ArrayList<>();
        SuministroDto dto = null;
        try {
            String Query = "select s.idSuministro,s.descripcion,s.precio, m.descripcion marca, c.descripcion categoria, t.descripcion tipoSuministro, st.cantidadSuministros stock\n"
                    + "from Marcas m join Suministros s\n"
                    + "on m.idMarca = s.idMarca join Stocks st\n"
                    + "on s.idSuministro = st.idSuministro join Categorias c\n"
                    + "on c.idCategoria = s.idCategoria join TiposSuministros t\n"
                    + "on t.idTipoSuministro = s.idTipoSuministro";
            con = DriverManager.getConnection(url, user, password);
            ps = con.prepareStatement(Query);
            rs = ps.executeQuery();

            while (rs.next()) {
                dto = new SuministroDto();
                dto.setIdSuministro(rs.getInt("idSuministro"));
                dto.setDescripcion(rs.getString("descripcion"));
                dto.setPrecio(rs.getFloat("precio"));
                dto.setMarca(rs.getString("marca"));
                dto.setCategoria(rs.getString("categoria"));
                dto.setTipoSuministro(rs.getString("tipoSuministro"));
                dto.setStock(rs.getInt("stock"));
                listado.add(dto);
            }

            rs.close();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SuministroController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }
}
