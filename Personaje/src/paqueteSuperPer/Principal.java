package paqueteSuperPer;
public class Principal {
    public static void main(String[] args){

        //Instanciar una clase
        //Objeto Cavani de Tipo SuperPersonaje
        SuperPersonaje personaje= new SuperPersonaje("JuanMa", "teletransportarse",50000,false);
        
        System.out.println(personaje.getNombre());
        System.out.println(personaje.getPoder());
        System.out.println(personaje.getValor());

        personaje.setValorComercial(-78);
        System.out.println(personaje.getValor());

        personaje.setValorComercial(78000);
        System.out.println(personaje.getValor());

        personaje.correr();
   }    
}

