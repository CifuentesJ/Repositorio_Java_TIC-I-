package paquReto3Moodle;

import java.util.Arrays;

public class Reto3Moodle{
    public static void main(String[] args) {
        
        Tripulante John = new Tripulante("John Doe", "1037654354", "123456789","john.doe@udea.edu.co","Suoaovbeuabvauebvaebvnlvainioa", 5);

        Formador Jane = new Formador("3D", "Jane Di", "1038671761877", "987654321", "jane.di@udea.edu.co", "Me apasiona enseñar!");


        John.resolverReto(2);
        John.resolverReto(3);
        John.resolverReto(4);

        for (int i=1; i<6;i++){
            Jane.calificar(John, i);
        }

        John.editarPerfil("John Doe", "1037654354", "123456789","john.doe@udea.edu.co","Feliz en el programa");
        Jane.editarPerfil("Jane Di", "1038671761877", "987654321", "jane.di@udea.edu.co", "Enamorada de la vida!");



        System.out.println(John.getNombreCompleto());
        System.out.println(John.getDocumentoIdentidad());
        System.out.println(John.getPassword());
        System.out.println(John.getCorreo());
        System.out.println(John.getDescripcion());
        System.out.println(Arrays.toString(John.getEntregas()));
        System.out.println(Arrays.toString(John.getCalificaciones()));



    }
}