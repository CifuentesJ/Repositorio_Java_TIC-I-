package paqueteAbstraccion;
public class Vaca extends Animal {
    
    @Override
    public void comer(){
        System.out.println("La vaca come pasto del suelo...");
    }
    
    @Override
    public void respirar(){ //Sobreescribir un metodo
        System.out.println("La vaca respira mas lento");
    }
}