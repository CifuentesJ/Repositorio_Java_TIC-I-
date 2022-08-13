public class Solution {
    public static int[] reporte(int[] participantes){
        int men=9999, may=0, cant;
        int[] array = new int[3];
        
        /*
         Pos 1= Cant competidores
         Pos 2= tiempo comp #1
         Pos 3= tiempo comp #2 
        */

        for (int i=0; i<participantes.length; i++){
            if (participantes[i]<men){
                men=participantes[i];
            }
            if (participantes[i]>may){
                may=participantes[i];
            }
        }

        cant=participantes.length;
        
        array[0]=cant;
        array[1]=men;
        array[2]=may;

        return array;
    }

    public static void main(String[] args){

        int [] arreglo = {19, 22, 21, 25, 32, 38, 16, 21, 30, 26, 19, 17, 23}; 

        /* int [] arreglo2 = {26, 17, 23, 16, 24, 21, 18, 25, 22, 20, 19};
        int [] arreglo3 = {1785, 1712, 1680, 1615, 1777, 1726, 1675, 1705, 1607, 1635, 1745, 1731,
            1760, 1799, 1679, 1718, 1664, 1778};
        int [] arreglo4 = {1801, 1806, 2094, 2075, 2044, 1634, 1735, 1616, 1998, 2109, 2078, 2141,
            1851, 2171, 1846, 2167, 1967, 2036};
        int [] arreglo5 = {1764, 1933, 1970, 1734, 2117, 2140, 1657, 1962, 1963};
        int [] arreglo6 = {1671, 1929, 2070, 2062, 2056, 2100, 1938, 1695, 2116}; */
        
        int [] report = new int[3];
        
        report=reporte(arreglo);

        for(int i=0; i<report.length; i++){
            System.out.print(report[i]+" ");
        }
        

    }
}
