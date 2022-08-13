public class Cita {
    private int numero, tipo;
    private double valorFinal, tarifa;

    //CONSTRUCTORES
    public Cita(int numero, int tipo, double tarifa){
        this.numero = numero;
        this.tipo = tipo;
        this.tarifa = tarifa;
    }

    //GETTERS
    public int getNumero(){
        return this.numero;
    }
    public String getTipo(){
        String retorno="";
        if (this.tipo >= 1 && this.tipo <=3){
            retorno = "General";
        } else if (this.tipo == 4 || this.tipo == 5){
            retorno = "Especialista";
        } else{
            System.out.println("El tipo no es válido.");
            retorno = "No existe";
        }

        return retorno;
    }
    public double getTarifa(){
        return this.tarifa;
    }

    //MÉTODOS
    public double calcularValorFinal(){
        if (getTipo().equals("General")){
            this.valorFinal = this.tarifa * 0.5;
        } else if (getTipo().equals("Especialista")){
            this.valorFinal = this.tarifa * 1.5;
        } else{
            System.out.println("El tipo no se ha especificado");
            this.valorFinal = 0;
        }
        
        return this.valorFinal;
    }

}
