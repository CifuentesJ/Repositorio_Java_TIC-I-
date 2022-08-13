package paquete;
public class VehiculoFurgoneta extends Vehiculo2{
    
    private int carga;

    public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga){
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    @Override
    public String mostrarDatos(){
        String datos;
        datos = "Matricula: "+matricula+
                "\nMarca: "+marca+
                "\nModelo: "+modelo+
                "\nCarga: "+carga;
                
        return datos;
    }
}
