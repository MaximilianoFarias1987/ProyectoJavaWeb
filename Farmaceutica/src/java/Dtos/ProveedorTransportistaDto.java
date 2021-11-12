package Dtos;

public class ProveedorTransportistaDto {
    private int idTransportista;
    private String nombre;

    public ProveedorTransportistaDto() {
    }

    public ProveedorTransportistaDto(int idTransportista, String nombre) {
        this.idTransportista = idTransportista;
        this.nombre = nombre;
    }

    public int getIdTransportista() {
        return idTransportista;
    }

    public void setIdTransportista(int idTransportista) {
        this.idTransportista = idTransportista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
