package paquRetoPeaje;

import java.util.Arrays;

public class Reto2Peaje {
    public static void main(String[] args) {
        String[] filaCoches = {"FNC901", "RBP250", "TPS706", "ITN503", "RSP845", "SBL560", "IVD432", "LCS254", "ECT243", "RPL122", "FRS484", "TLB884", "NFT948", "INS230"};

        Peaje trapiche = new Peaje(filaCoches);

        trapiche.proximoCoche();
        trapiche.proximoCoche();
        trapiche.proximoCoche();
        trapiche.proximoCoche();

        trapiche.agregarCocheFlyPass();
        trapiche.proximoCoche();
        trapiche.agregarCocheFlyPass();
        trapiche.proximoCoche();
        trapiche.agregarCocheFlyPass();

        trapiche.cambiarEstadoPeaje();
        trapiche.cambiarEstadoPeaje();
        trapiche.proximoCoche();
        trapiche.agregarCocheFlyPass();

        System.out.println(Arrays.toString(trapiche.getFilaCoches()));
        System.out.println(Arrays.toString(trapiche.getCochesFlyPass()));
        System.out.println(trapiche.isEstadoPeaje());
        System.out.println(trapiche.getCocheEnAtencion());
        System.out.println(trapiche.getCantidadCochesAtendidos());

    }
}
