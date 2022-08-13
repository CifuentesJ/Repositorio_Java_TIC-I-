package paqueteSuperPer;
public class SuperPersonaje {
    
    //Atributos (Características o Cualidades)
    private String nombre, poder;
    //private int edad, vida;
    private double valorComercial;
    private boolean tieneAlas;
    //private char genero;

    //Método Constructor
    //Inicializa el objeto
    public SuperPersonaje(String nombre, String poder, double valorComercial, boolean tieneAlas){
        this.nombre = nombre;
        this.poder = poder;
        this.valorComercial = valorComercial;
        this.tieneAlas = tieneAlas;
    }


    /*Getter
     Los métodos get 
     * 
    */
    public String getNombre(){
        return this.nombre;
    }
    public String getPoder(){
        return this.poder;
    }
    public double getValor(){
        return this.valorComercial;
    }
    public boolean getAlas(){
        return this.tieneAlas;
    }

    //Setter, permite modificar atributos
    public void setValorComercial(double valorComercial){
        if (valorComercial>0){
            this.valorComercial = valorComercial;
        }
    }



    //Métodos (Acciones)
    void correr(){
        System.out.println("El jugador está corriendo");
    }
    void atacar(){

    }
    void saltar(){

    }
    void defender(){

    }
    void volar(){

    }
    void jugar(){

    }

}
