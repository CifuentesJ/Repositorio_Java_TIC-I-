package paquete;
public class VehiculoDeportivo extends Vehiculo2{
    
    private int cilindrada;

    public VehiculoDeportivo(String matricula, String marca, String modelo, int cilindrada){
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    @Override
    public String mostrarDatos(){
        String datos;
        datos = "Matricula: "+matricula+
                "\nMarca: "+marca+
                "\nModelo: "+modelo+
                "\nCilindraje: "+cilindrada;
                
        return datos;
    }
}
