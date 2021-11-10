package Models;

public class Stock {
    private int idStock;
    private int cantidadSuministros;
    private int idSuministro;
    private int idSucursal;

    public Stock() {
    }

    public Stock(int idStock, int cantidadSuministros, int idSuministro, int idSucursal) {
        this.idStock = idStock;
        this.cantidadSuministros = cantidadSuministros;
        this.idSuministro = idSuministro;
        this.idSucursal = idSucursal;
    }

    public int getIdStock() {
        return idStock;
    }

    public void setIdStock(int idStock) {
        this.idStock = idStock;
    }

    public int getCantidadSuministros() {
        return cantidadSuministros;
    }

    public void setCantidadSuministros(int cantidadSuministros) {
        this.cantidadSuministros = cantidadSuministros;
    }

    public int getIdSuministro() {
        return idSuministro;
    }

    public void setIdSuministro(int idSuministro) {
        this.idSuministro = idSuministro;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    @Override
    public String toString() {
        return "Stock{" + "idStock=" + idStock + ", cantidadSuministros=" + cantidadSuministros + ", idSuministro=" + idSuministro + ", idSucursal=" + idSucursal + '}';
    }
    
    
}
