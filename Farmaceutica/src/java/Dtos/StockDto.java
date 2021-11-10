package Dtos;

public class StockDto {
    private int cantidad;
    private int idSucursal;

    public StockDto() {
    }

    public StockDto(int cantidad, int idSucursal) {
        this.cantidad = cantidad;
        this.idSucursal = idSucursal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    @Override
    public String toString() {
        return "StockDto{" + "cantidad=" + cantidad + ", idSucursal=" + idSucursal + '}';
    }
    
    
}
