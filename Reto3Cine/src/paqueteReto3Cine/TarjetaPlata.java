package paqueteReto3Cine;

public class TarjetaPlata extends TarjetaCine{
    private int cantidadVisitas = 0;
    private boolean elegibleOro = false;


    public TarjetaPlata(String idTarjeta, String nombreCompleto, String email, String telefono, int edad){
        super(idTarjeta, nombreCompleto, email, telefono, edad, 10);
    }

    public int getCantidadVisitas() {
        return cantidadVisitas;
    }
    public boolean isElegibleOro() {
        return elegibleOro;
    }

    public void setCantidadVisitas(int cantidadVisitas) {
        this.cantidadVisitas = cantidadVisitas;
    }
    public void setElegibleOro(boolean elegibleOro) {
        this.elegibleOro = elegibleOro;
    }
    
    @Override
    public double pagar(String[] cuenta){
        cantidadVisitas++;
        if (cantidadVisitas == 5){
            this.elegibleOro = true;
        }

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
        total *= (1 - super.getPorcentajeDescuento() / 100);
        
        
        return total;
    }
    
}
