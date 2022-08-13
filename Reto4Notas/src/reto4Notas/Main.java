package reto4Notas;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        
        ArrayList<Estudiante> grupo = new ArrayList<>();
        grupo.add(new Estudiante("John Doe", "0123", 5.0, 4, 8));
        grupo.add(new Estudiante("Jane Doe", "9283", 4.1, 7, 13));
        grupo.add(new Estudiante("Pepito Perez", "0194", 1.5, 5, 9));
        grupo.add(new Estudiante("Fulano de tal", "9013", 2.3, 2, 6));
        
        Object[] retorno1 = Solucion.reportes(grupo);
        System.out.println(Arrays.toString(retorno1));
    }
}
