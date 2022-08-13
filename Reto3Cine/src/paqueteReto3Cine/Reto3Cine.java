package paqueteReto3Cine;

import java.util.Arrays;

public class Reto3Cine{
    public static void main(String[] args) {
        TarjetaPlata tp1 = new TarjetaPlata("0123", "John Doe", "jd32@correo.co", "5553221", 26);


        tp1.pagar(new String[]{"Boleta","Boleta","Combo 1 - Crispetas + Gaseosa","Combo 2 - Perro + Gaseosa"});
        tp1.pagar(new String[]{"Boleta"});
        tp1.pagar(new String[]{"Boleta"});
        tp1.pagar(new String[]{"Boleta"});
        tp1.pagar(new String[]{"Boleta"});

        /*
        System.out.print("ID de la tarjeta: ");
        System.out.println(tp1.getIdTarjeta());
        System.out.print("Nombre del cliente: ");
        System.out.println(tp1.getNombreCompleto());
        System.out.print("Email del cliente: ");
        System.out.println(tp1.getEmail());
        System.out.print("Teléfono del cliente: ");
        System.out.println(tp1.getTelefono());
        System.out.print("Edad del cliente: ");
        System.out.println(tp1.getEdad());
        System.out.print("Porcentaje de descuento: ");
        System.out.println(tp1.getPorcentajeDescuento());
        System.out.print("Cantidad de visitas: ");
        System.out.println(tp1.getCantidadVisitas());
        System.out.print("¿El cliente es elegible para la tarjeta Oro?: ");
        System.out.println(tp1.isElegibleOro());
        */


        TarjetaOro to2 = new TarjetaOro("0123", "John Doe", "jd32@correo.co", "5553221", 26);


        double pago = to2.pagar(new String[]{"Boleta","Combo 1 - Crispetas + Gaseosa"});
        to2.redimirBeneficio(0);
        to2.redimirBeneficio(1);
        to2.redimirBeneficio(2);

        System.out.println(pago);
        System.out.print("ID de la tarjeta: ");
        System.out.println(to2.getIdTarjeta());
        System.out.print("Nombre del cliente: ");
        System.out.println(to2.getNombreCompleto());
        System.out.print("Email del cliente: ");
        System.out.println(to2.getEmail());
        System.out.print("Teléfono del cliente: ");
        System.out.println(to2.getTelefono());
        System.out.print("Edad del cliente: ");
        System.out.println(to2.getEdad());
        System.out.print("Porcentaje de descuento: ");
        System.out.println(to2.getPorcentajeDescuento());
        System.out.print("Beneficios: ");
        System.out.println(Arrays.toString(to2.getBeneficiosDescripcion()));
        System.out.print("Estado beneficios: ");
        System.out.println(Arrays.toString(to2.getBeneficiosEstado()));
    }
}