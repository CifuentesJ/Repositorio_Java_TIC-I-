public class Vehiculo {
    private String placa,  color, marca, estado;
    private int modelo, velocidad;
    private float cilindraje;


    //CONSTRUCTORES
    public Vehiculo(){
        this.estado = "Detenido";
        if (this.estado.equals("Detenido")){
            this.velocidad=0;
        }
    }
    public Vehiculo(String placa, String color, String marca, String estado, int modelo, int velocidad, float cilindraje){
        this.placa = placa;        
        this.color = color;
        this.marca = marca;
        this.estado = estado;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.cilindraje = cilindraje;
    }   


    //GETTERS
    public String getPlaca(){
        return this.placa;
    }
    public String getColor(){
        return this.color;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getEstado(){
        return this.estado;
    }
    public int getModelo(){
        return this.modelo;
    }
    public int getVelocidad(){
        return this.velocidad;
    }
    public float getCilindraje(){
        return this.cilindraje;
    }


    //SETTER
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public void setModelo(int modelo){
        this.modelo = modelo;
    }
    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }
    public void setCilindraje(float cilindraje){
        this.cilindraje = cilindraje;
    }

    //MÉTODOS
    public void arrancar(){
        if (this.estado.equals("Detenido")){
            System.out.println("Arrancando...");
            this.estado = "En marcha";
            this.velocidad = 10;
        }else{
            System.out.println("El vehículo ya está en movimiento");
        }
    }

    public int acelerar(){
        if (this.estado.equals("En marcha")){
            if ((this.velocidad+10)<=80){
                System.out.println("Aumento de velocidad...");
                this.velocidad += 10;
            }else{
                System.out.println("No puede exceder el límite de velocidad");
            }
        }else {
            System.out.println("El vehículo está detenido");
        }
        
        return this.velocidad;
    } 

    public void frenar(){
        if (this.estado.equalsIgnoreCase("En Marcha")){
            if (this.velocidad>0){
                System.out.println("Disminuyendo velocidad...");
                this.velocidad -= 10;
            }else{
                System.out.println("El carro ya está detenido");
                this.velocidad = 0;
                this.estado = "Detenido";
            }
        }else{
            System.out.println("El carro está detenido, no puede frenar");
            this.velocidad = 0;
        }
    }

    public void detener(){
        if (this.estado.equalsIgnoreCase("En Marcha")){
            System.out.println("Deteniendo...");
            this.velocidad = 0;
            this.estado = "Detenido";
        }else{
            System.out.println("El carro ya está detenido");
        }
    }


}
