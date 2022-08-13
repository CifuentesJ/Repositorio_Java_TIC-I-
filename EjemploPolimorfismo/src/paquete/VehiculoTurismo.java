package paquete;
public class VehiculoTurismo extends Vehiculo2{

    private int numeroPuertas;

    public VehiculoTurismo(String matricula, String marca, String modelo, int numeroPuertas){
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String mostrarDatos(){
        String datos;
        datos = "Matricula: "+matricula+
                "\nMarca: "+marca+
                "\nModelo: "+modelo+
                "\nNumero de puertas: "+numeroPuertas;
                
        return datos;
    }
}
