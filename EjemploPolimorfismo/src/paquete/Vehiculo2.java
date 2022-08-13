package paquete;
public class Vehiculo2 {
    
    protected String matricula, marca, modelo;

    public Vehiculo2(String matricula, String marca, String modelo){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }    
    
    public String mostrarDatos(){
        String datos;
        datos = "Matricula: "+this.matricula+
                "\nMarca: "+this.marca+
                "\nModelo: "+this.modelo;
        return datos;
    }


}
