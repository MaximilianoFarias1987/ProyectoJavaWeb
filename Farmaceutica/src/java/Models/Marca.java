package Models;

public class Marca {
    private int idMarca;
    private String descripcion;

    public Marca() {
    }

    public Marca(int idLaboratorio, String nombreLab) {
        this.idMarca = idLaboratorio;
        this.descripcion = nombreLab;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Laboratorio{" + "idLaboratorio=" + idMarca + ", nombreLab=" + descripcion + '}';
    }
    
    
}
