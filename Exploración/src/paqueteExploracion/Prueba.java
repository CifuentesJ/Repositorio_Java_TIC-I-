package paqueteExploracion;
import javax.swing.JOptionPane;

//import java.util.Scanner;

public class Prueba {
    
    public static void main(String[] args){
        

        //INPUT usando JOption
        String nombre=JOptionPane.showInputDialog("Ingrese su nombre: ");
        //OUTPUT usando JOption
        JOptionPane.showMessageDialog(null, "Bienvenid@: "+nombre);
    
        
        int edad=Integer.parseInt(JOptionPane.showInputDialog("Digite su edad"));
        if (edad>17){
            JOptionPane.showMessageDialog(null, "Usted es mayor de edad.", "Age",-1);
        } else{
            JOptionPane.showMessageDialog(null, "Usted es menor de edad.", "Age",-1);
        }


        int[] numeros= new int[3];
        System.out.println(numeros);
    }
}
