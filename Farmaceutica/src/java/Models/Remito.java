package Models;

import java.time.LocalDate;
import java.util.Date;

public class Remito {
    private int idRemito;
    private int idEmpleado;
    private int idTransportista;
    private Date fecha;

    public Remito() {
    }

    public Remito(int idRemito, int idEmpleado, int idTransportista, Date fecha) {
        this.idRemito = idRemito;
        this.idEmpleado = idEmpleado;
        this.idTransportista = idTransportista;
        this.fecha = fecha;
    }

    public int getIdRemito() {
        return idRemito;
    }

    public void setIdRemito(int idRemito) {
        this.idRemito = idRemito;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdTransportista() {
        return idTransportista;
    }

    public void setIdTransportista(int idTransportista) {
        this.idTransportista = idTransportista;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Remito{" + "idRemito=" + idRemito + ", idEmpleado=" + idEmpleado + ", idTransportista=" + idTransportista + ", fecha=" + fecha + '}';
    }
    
    
}
