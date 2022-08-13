package paqueteReto3Cine;

public class TarjetaOro extends TarjetaCine{
    public String[] beneficiosDescripcion = {"Boleto Gratis","Crispetas Gratis","Gaseosa Gratis"};
    private boolean[] beneficiosEstado = {true, true, true};

    
    public TarjetaOro(String idTarjeta, String nombreCompleto, String email, String telefono, int edad){
        super(idTarjeta, nombreCompleto, email, telefono, edad, 20);
    }

    public String[] getBeneficiosDescripcion() {
        return beneficiosDescripcion;
    }
    public boolean[] getBeneficiosEstado() {
        return beneficiosEstado;
    }

    public void setBeneficiosDescripcion(String[] beneficiosDescripcion) {
        this.beneficiosDescripcion = beneficiosDescripcion;
    }
    public void setBeneficiosEstado(boolean[] beneficiosEstado) {
        this.beneficiosEstado = beneficiosEstado;
    }

    
    public boolean redimirBeneficio(int posicionBeneficio){
        boolean band;
        if (this.beneficiosEstado[posicionBeneficio] == true){
            beneficiosEstado[posicionBeneficio] = false;
            band = true;
        } else{
            band = false;
        }
        return band;
    }
    
    
}
