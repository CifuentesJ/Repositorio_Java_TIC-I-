package reto4Notas;

import java.util.ArrayList;

public class Solucion {
    public static Object[] reportes(ArrayList<Estudiante> grupo){
        Object[] reporte = new Object[5];
        double prom = 0, men = 99999999, may = 0;
        String nomMay = "", nomMen = "";

        for(Estudiante p: grupo){
            if (p.getNota() > may){
                nomMay = p.getNombreCompleto();
                may = p.getNota();
            }
            if (p.getNota() < men){
                nomMen = p.getNombreCompleto();
                men = p.getNota();
            }
            prom += p.getNota();

        }

        prom /= grupo.size();
        reporte[0] = prom;
        reporte[1] = nomMen;
        reporte[2] = men;
        reporte[3] = nomMay;
        reporte[4] = may;


        return reporte;
    }
}
