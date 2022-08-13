package paqueteExploracion;
import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) throws Exception {
        String nombre,tipo="";
        byte edad;
        
        try (Scanner x = new Scanner(System.in)){

        System.out.print("Ingresa tu nombre: ");
        nombre=x.next();
        System.out.print("Ingresa tu edad: ");
        edad=x.nextByte();
        }
        /*
        if(edad>=18){
            tipo="mayor de edad.";
        }
        else{
            tipo="menor de edad.";
        }
        */
        
        switch(edad){
            case 18: tipo="mayor de edad"; break;
            case 17: tipo="menor de edad"; break;
        }
        System.out.println("Hola "+nombre+", eres "+tipo);
        
    }   
}
