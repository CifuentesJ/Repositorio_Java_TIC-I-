package paqueteReto3Cine;

public class TarjetaCine {
    private String idTarjeta, nombreCompleto, email, telefono;
    private int edad;
    private double porcentajeDescuento;

    
    public TarjetaCine(String idTarjeta, String nombreCompleto, String email, String telefono, int edad, double porcentajeDescuento){
        this.idTarjeta = idTarjeta;
        this.nombreCompleto = nombreCompleto;
        this.email = email; 
        this.telefono = telefono;
        this.edad = edad;
        this.porcentajeDescuento = porcentajeDescuento;
    }


    public String getIdTarjeta() {
        return idTarjeta;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefono() {
        return telefono;
    }
    public int getEdad() {
        return edad;
    }
    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setIdTarjeta(String idTarjeta) {
        this.idTarjeta = idTarjeta;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
    
    
    public double pagar(String[] cuenta){
        double total = 0;
        for (String producto: cuenta){
            if(producto.equals("Boleta")){
                total += 6000;
            } else if (producto.equals("Combo 1 - Crispetas + Gaseosa")){
                total += 8000;
            } else if (producto.equals("Combo 2 - Perro + Gaseosa")){
                total += 12000;
            }
        }
        total *= (1 - porcentajeDescuento / 100);
        
        
        return total;
    }


}
