//import java.util.Scanner;

public class PrincipalCita {
    public static void main(String[] args) {
        /*int num, tip;
        double tar;
        try (Scanner x = new Scanner(System.in)){
            System.out.print("Ingrese el número de la cita: ");
            num = x.nextInt();
            System.out.print("Ingrese el tipo de la cita: ");
            tip = x.nextInt();
            System.out.print("Ingrese la tarifa de la cita: ");
            tar = x.nextDouble();
        }
        Cita cita1 = new Cita(num, tip, tar);

        System.out.println("\nEl número de la cita es: "+cita1.getNumero());
        System.out.println("Esta cita es de tipo: "+cita1.getTipo());
        System.out.println("Su tarifa normal es: "+cita1.getTarifa());
        System.out.println("El costo total de la cita es: "+cita1.calcularValorFinal());*/


        Ventana_Cita ven = new Ventana_Cita();
        ven.getAccessibleContext();

    }
}
