package paqueteAbstraccion;
public class EjemploAbstracta {

    public static void main(String[] args) {
       
        //Animal a= new Animal();  //Una Clase abstracta no se puede instanciar  
        System.out.println("Persona - hijo - Animal");
        Persona persona1 = new Persona();
        persona1.comer();
        persona1.respirar();

        System.out.println("Vaca - hijo - Animal");
        Vaca v1 = new Vaca();
        v1.comer();
        v1.respirar();

        System.out.println("Perro - hijo - Animal");
        Perro per1 = new Perro();
        per1.comer();
        per1.respirar();
    }
    
}