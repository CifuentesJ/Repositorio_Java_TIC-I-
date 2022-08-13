package reto4tienda;

public class Cliente {
    private String nombreCompleto, documentoIdentidad, fechaCompra, numeroFactura;
    private int totalAPagar;

    public Cliente(String nombreCompleto, String documentoIdentidad,  int totalAPagar, String fechaCompra, String numeroFactura){
        this.nombreCompleto = nombreCompleto;
        this.documentoIdentidad = documentoIdentidad;
        this.fechaCompra = fechaCompra;
        this.numeroFactura = numeroFactura;
        this.totalAPagar = totalAPagar;
    }

    
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }
    public String getFechaCompra() {
        return fechaCompra;
    }
    public String getNumeroFactura() {
        return numeroFactura;
    }
    public int getTotalAPagar() {
        return totalAPagar;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }
    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }
    public void setTotalAPagar(int totalAPagar) {
        this.totalAPagar = totalAPagar;
    }
    
    
    
}
