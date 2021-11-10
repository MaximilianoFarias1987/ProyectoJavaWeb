package Dtos;

public class SucursalDto {
    private int idSucursal;
    private String nombre;
    private String direccion;
    private String email;
    private String telefono;
    private String provincia;

    public SucursalDto() {
    }

    public SucursalDto(int idSucursal, String nombre, String direccion, String email, String telefono, String provincia) {
        this.idSucursal = idSucursal;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.provincia = provincia;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "SucursalDto{" + "idSucursal=" + idSucursal + ", nombre=" + nombre + ", direccion=" + direccion + ", email=" + email + ", telefono=" + telefono + ", provincia=" + provincia + '}';
    }

    
    
    
}
