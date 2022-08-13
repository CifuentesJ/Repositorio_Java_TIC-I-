package reto4tienda;

import java.util.ArrayList;
import java.util.Arrays;

public class Reto4Tienda {
    public static void main(String[] args) {
        ArrayList<Cliente> t = new ArrayList<>();

        t.add(new Cliente("Valeria Di", "1234567890", 9653, "567", "9876"));
        t.add(new Cliente("Johan Doe", "098765432", 3918, "76", "98765"));
        t.add(new Cliente("Maurice Doe", "57176373738", 6048, "83", "876"));
        t.add(new Cliente("Matthew Doe", "281376511", 5840, "876", "73516"));
        t.add(new Cliente("Agustina Doe", "74621671718", 3940, "31414", "98765"));
        t.add(new Cliente("Agusrina Doe", "18765413", 3840, "8765", "234"));
        t.add(new Cliente("Milena Doe", "876541", 3696, "876543", "6784"));
        t.add(new Cliente("Carla Di", "167438839", 2432, "6378", "3456"));


        System.out.println(Arrays.toString(Solution.reportes(t)));
        

    }
    
}
