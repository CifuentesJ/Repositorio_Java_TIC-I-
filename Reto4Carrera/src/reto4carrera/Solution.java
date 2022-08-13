package reto4carrera;

import java.util.ArrayList;

public class Solution {
    public static Object[] reporte(ArrayList <Corredor> lista){
        Object[] rep = new Object[5];
        double prom = 0, men = 99999999, may = 0;
        String nomMay = "", nomMen = "";

        for(Corredor p: lista){
            if (p.getTiempoMeta() > may){
                nomMay = p.getNombreCompleto();
                may = p.getTiempoMeta();
            }
            if (p.getTiempoMeta() < men){
                nomMen = p.getNombreCompleto();
                men = p.getTiempoMeta();
            }
            prom += p.getTiempoMeta();

        }

        prom /= lista.size();
        rep[0] = prom;
        rep[1] = nomMen;
        rep[2] = men;
        rep[3] = nomMay;
        rep[4] = may;
        
        return rep;
    }
    
}
