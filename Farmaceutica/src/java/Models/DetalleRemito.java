package Models;

public class DetalleRemito {
    private int idDetalle;
    private int idRemito;
    private int idSuministro;
    private int cantidad;
    private float precioUnitario;

    public DetalleRemito() {
    }

    public DetalleRemito(int idDetalle, int idRemito, int idSuministro, int cantidad, float precioUnitario) {
        this.idDetalle = idDetalle;
        this.idRemito = idRemito;
        this.idSuministro = idSuministro;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getIdRemito() {
        return idRemito;
    }

    public void setIdRemito(int idRemito) {
        this.idRemito = idRemito;
    }

    public int getIdSuministro() {
        return idSuministro;
    }

    public void setIdSuministro(int idSuministro) {
        this.idSuministro = idSuministro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return "DetalleRemito{" + "idDetalle=" + idDetalle + ", idRemito=" + idRemito + ", idSuministro=" + idSuministro + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + '}';
    }
    
    
}
