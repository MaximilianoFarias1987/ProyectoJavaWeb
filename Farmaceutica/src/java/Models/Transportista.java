package Models;

public class Transportista {
    private int idTransportista;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String direccion;
    private int idTipoDocumento;
    private String documento;
    private int idProveedor;

    public Transportista() {
    }

    public Transportista(int idTransportista, String nombre, String apellido, String email, String telefono, String direccion, int idTipoDocumento, String documento, int idProveedor) {
        this.idTransportista = idTransportista;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.idTipoDocumento = idTipoDocumento;
        this.documento = documento;
        this.idProveedor = idProveedor;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    @Override
    public String toString() {
        return "Transportista{" + "idTransportista=" + idTransportista + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + ", direccion=" + direccion + ", idTipoDocumento=" + idTipoDocumento + ", documento=" + documento + ", idProveedor=" + idProveedor + '}';
    }

    
    
    
    
}
