package Dtos;

import java.util.Date;

public class RemitoDto {
    private int codigo;
    private Date fecha; 
    private String nomSucursal;
    private String provincia;
    private String telefono;
    private int idSuministro;
    private String nomSuministro;
    private int cantidad;
    private float preUnitario;
    private float subTotal;
    private float total;

    public RemitoDto() {
    }

    public RemitoDto(int codigo, Date fecha, String nomSucursal, String provincia, String telefono, int idSuministro, String nomSuministro, int cantidad, float preUnitario, float subTotal, float total) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.nomSucursal = nomSucursal;
        this.provincia = provincia;
        this.telefono = telefono;
        this.idSuministro = idSuministro;
        this.nomSuministro = nomSuministro;
        this.cantidad = cantidad;
        this.preUnitario = preUnitario;
        this.subTotal = subTotal;
        this.total = total;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNomSucursal() {
        return nomSucursal;
    }

    public void setNomSucursal(String nomSucursal) {
        this.nomSucursal = nomSucursal;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getIdSuministro() {
        return idSuministro;
    }

    public void setIdSuministro(int idSuministro) {
        this.idSuministro = idSuministro;
    }

    public String getNomSuministro() {
        return nomSuministro;
    }

    public void setNomSuministro(String nomSuministro) {
        this.nomSuministro = nomSuministro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPreUnitario() {
        return preUnitario;
    }

    public void setPreUnitario(float preUnitario) {
        this.preUnitario = preUnitario;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "RemitoDto{" + "codigo=" + codigo + ", fecha=" + fecha + ", nomSucursal=" + nomSucursal + ", provincia=" + provincia + ", telefono=" + telefono + ", idSuministro=" + idSuministro + ", nomSuministro=" + nomSuministro + ", cantidad=" + cantidad + ", preUnitario=" + preUnitario + ", subTotal=" + subTotal + ", total=" + total + '}';
    }

    
    
    
}
