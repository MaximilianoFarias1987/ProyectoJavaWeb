package Dtos;

public class DetalleRemitoDto {
    private int idRemito;
    private int idSuministro;
    private String suministro;
    private int cantidad;
    private float precioUnitario;
    private float subTotal = cantidad*precioUnitario;

    public DetalleRemitoDto() {
    }

    public DetalleRemitoDto(int idRemito, int idSuministro, String suministro, int cantidad, float precioUnitario) {
        this.idRemito = idRemito;
        this.idSuministro = idSuministro;
        this.suministro = suministro;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
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

    public String getSuministro() {
        return suministro;
    }

    public void setSuministro(String suministro) {
        this.suministro = suministro;
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

    public float getSubTotal() {
        return subTotal;
    }

    
    
    
            
}
