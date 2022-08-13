public class Tienda {
   
    public static int[] reporte(int[] compra){
        int[] report =new int[3];
        int tot=0, men=9999999, may=0;

        for(int i=0; i<compra.length; i++){
            tot+=compra[i];
            if (compra[i]>may){
                may=compra[i];
            }
            if (compra[i]<men){
                men=compra[i];
            }
        }

        report[0]=tot;
        report[1]=men;
        report[2]=may;

        return report;
    } 
    
    public static void main(String[] args) throws Exception {
        int[] compra= {2700, 9500, 300, 15000, 1800, 10000, 400, 3000, 400};
        //int[] compra2= {6700};
        int[] lista= new int[3];

        lista=reporte(compra);

        for(int i=0; i<lista.length; i++){
            System.out.print(lista[i]+" ");
        }

    }
}
