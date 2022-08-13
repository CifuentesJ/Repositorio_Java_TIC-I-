package reto4tienda;


import java.util.ArrayList;

public class Solution {
    public static Object[] reportes(ArrayList <Cliente> tienda){
        Object[] retorno = new Object[5];
        double promTot = 0;
        String nomCliMen = "", nomCliMay = "";
        int pagoMay = 0, pagoMen = 999999999;

        for (Cliente c: tienda){
            promTot += c.getTotalAPagar();
            if (c.getTotalAPagar() > pagoMay){
                pagoMay = c.getTotalAPagar();
                nomCliMay = c.getNombreCompleto();
            }
            if (c.getTotalAPagar() < pagoMen){
                pagoMen = c.getTotalAPagar();
                nomCliMen = c.getNombreCompleto();
            }
        }

        promTot /= tienda.size();
        
        retorno[0] = promTot;
        retorno[1] = nomCliMen;
        retorno[2] = pagoMen;
        retorno[3] = nomCliMay;
        retorno[4] = pagoMay;

        
        return retorno;
    }

}
