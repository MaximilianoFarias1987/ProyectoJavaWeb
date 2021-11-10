package Models;

public class Suministro {
    private int idSuministro;
    private String descripcion;
    private float precio;
    private int idMarca;
    private int idCategoria;
    private int idTipoSuministro;

    public Suministro() {
    }

    public Suministro(int idSuministro, String descripcion, float precio, int idMarca, int idCategoria, int idTipoSuministro) {
        this.idSuministro = idSuministro;
        this.descripcion = descripcion;
        this.precio = precio;
        this.idMarca = idMarca;
        this.idCategoria = idCategoria;
        this.idTipoSuministro = idTipoSuministro;
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

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdTipoSuministro() {
        return idTipoSuministro;
    }

    public void setIdTipoSuministro(int idTipoSuministro) {
        this.idTipoSuministro = idTipoSuministro;
    }

    @Override
    public String toString() {
        return "Suministro{" + "idSuministro=" + idSuministro + ", descripcion=" + descripcion + ", precio=" + precio + ", idMarca=" + idMarca + ", idCategoria=" + idCategoria + ", idTipoSuministro=" + idTipoSuministro + '}';
    }

   
    
    
}
