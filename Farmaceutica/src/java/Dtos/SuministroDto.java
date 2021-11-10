package Dtos;

public class SuministroDto {
    private int idSuministro;
    private String descripcion;
    private float precio;
    private String marca;
    private String categoria;
    private String tipoSuministro;
    private int stock;

    public SuministroDto() {
    }

    public SuministroDto(int idSuministro, String descripcion, float precio, String marca, String categoria, String tipoSuministro, int stock) {
        this.idSuministro = idSuministro;
        this.descripcion = descripcion;
        this.precio = precio;
        this.marca = marca;
        this.categoria = categoria;
        this.tipoSuministro = tipoSuministro;
        this.stock = stock;
    }

    public int getIdSuministro() {
        return idSuministro;
    }

    public void setIdSuministro(int idSuministro) {
        this.idSuministro = idSuministro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipoSuministro() {
        return tipoSuministro;
    }

    public void setTipoSuministro(String tipoSuministro) {
        this.tipoSuministro = tipoSuministro;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "SuministroDto{" + "idSuministro=" + idSuministro + ", descripcion=" + descripcion + ", precio=" + precio + ", marca=" + marca + ", categoria=" + categoria + ", tipoSuministro=" + tipoSuministro + ", stock=" + stock + '}';
    }
    
    
}
