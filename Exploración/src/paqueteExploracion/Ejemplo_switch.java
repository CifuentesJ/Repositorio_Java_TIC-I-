package paqueteExploracion;
import java.util.Scanner;

public class Ejemplo_switch {
    
    public static void main(String[] args){

        int num1=0, num2=0, sum, res, mul,opcion;
        double div=0.0, resu=0;


        System.out.println("Opciones: ");
        System.out.println("\t1-->Suma\n\t2-->Resta\n\t3-->Multiplicación\n\t4-->División");
        
        try(Scanner x=new Scanner(System.in)){
            System.out.print("Ingrese la opción a elegir:");
            opcion=x.nextInt();
            System.out.print("Ingrese el número 1: ");
            num1=x.nextInt();
            System.out.print("Ingrese el número 2: ");
            num2=x.nextInt();
        }

        switch(opcion){
            case 1: sum=num1+num2; resu=sum; break;
            case 2: res=num1-num2; resu=res; break;
            case 3: mul=num1*num2; resu=mul; break;
            case 4: div=(double)num1/num2; resu=div; break;
            default: System.out.println("No existe la opción.");
        }

        System.out.println("El resultado es: "+resu);


    }

}
