public class Notas {
    public static double[] reporte(double[] notas){
        double acum=0, may=0, men=6, prom;
        double[] report= new double[3];
        
        for (int i=0; i<notas.length; i++){
            acum+=notas[i];
            if (notas[i]<men){
                men=notas[i];
            }
            if (notas[i]>may){
                may=notas[i];
            }
        }
        
        prom=acum/notas.length;

        report[0]=prom;
        report[1]=men;
        report[2]=may;

        return report;
    }


    public static void main(String[] args) {
        double[] listaNotas = {4.1, 4.8, 1.5, 2.3, 0.1, 0.9, 1.4, 1.8, 1.5, 3.0};
        double[] lista =new double[3];

        lista= reporte(listaNotas);

        for(int i=0; i<lista.length; i++){
            System.out.print(lista[i]+" ");
        }
    }

}
