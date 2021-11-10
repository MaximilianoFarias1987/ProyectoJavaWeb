package Models;

public class TipoDocumento {
    private int idTipoDoc;
    private String descripcion;

    public TipoDocumento() {
    }

    public TipoDocumento(int idTipoDoc, String descripcion) {
        this.idTipoDoc = idTipoDoc;
        this.descripcion = descripcion;
    }

    public int getIdTipoDoc() {
        return idTipoDoc;
    }

    public void setIdTipoDoc(int idTipoDoc) {
        this.idTipoDoc = idTipoDoc;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "TipoDocumento{" + "idTipoDoc=" + idTipoDoc + ", descripcion=" + descripcion + '}';
    }
    
    
}
