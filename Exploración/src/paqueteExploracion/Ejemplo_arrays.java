package paqueteExploracion;
import java.util.Scanner;

public class Ejemplo_arrays {
    
    public static void  main(String[] argas){
        int acum=0;

        //ARREGLOS

        String[] nombres= new String[5];
        nombres[0]="Juan";
        nombres[1]="Marcos";

        int[] edad={8, 12, 15, 19, 23};
        for( int i=0; i<edad.length;i++){
            System.out.print(edad[i]+" ");
            acum+=edad[i];
        }
        System.out.println("");
        System.out.println("La suma acumulada es: "+acum+"\n");
        System.out.println("------------------------------\n");


        //MATRICES
        try(Scanner x=new Scanner(System.in)){
            System.out.print("Ingrese le número de filas: ");
            int filas=x.nextInt();
            System.out.print("Ingrese le número de columnas: ");
            int colum=x.nextInt();
            
            int [][] matriz=new int[filas][colum];

            for (int i=0; i<filas;i++){
                for (int j=0; j<colum; j++){
                    System.out.print("Ingrese un número: ");
                    matriz[i][j]=x.nextInt();
                }
            }

            for (int i=0; i<filas;i++){
                for (int j=0; j<colum; j++){
                    System.out.print(matriz[i][j]+" ");
                }
                System.out.println();
            }
        }

    }
}
