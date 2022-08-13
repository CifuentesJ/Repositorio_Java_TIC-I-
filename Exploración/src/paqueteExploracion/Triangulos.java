package paqueteExploracion;
import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args){
        byte ladA, ladB, ladC;
        String tipo="";

        try (Scanner x=new Scanner(System.in)){
            do{
                System.out.print("Ingrese la medida del lado A: ");
                ladA=x.nextByte();
            } while(ladA<=0);

            do{
                System.out.print("Ingrese la medida del lado B: ");
                ladB=x.nextByte();
            } while(ladB<=0);
            
            do{
                System.out.print("Ingrese la medida del lado C: ");
                ladC=x.nextByte();
            } while(ladC<=0);
        }

        if(ladA==ladB && ladB==ladC){
            tipo="equilátero";
        } else if(ladA!=ladB && ladA!=ladC && ladB!=ladC){
            tipo="escaleno";
        } else{
            tipo="isósceles";
        }

        System.out.println("El triángulo es "+tipo);
    }
}
