

//import java.util.ArrayList;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        /* ArrayList<Integer> lista = new ArrayList<Integer>();

        lista.add(13);
        lista.add(129);
        System.out.println(lista.size());
        System.out.println(lista);
        lista.remove(0);
        System.out.println(lista);
        lista.add(78);
        lista.add(314);
        lista.add(8);
        lista.add(32);
        lista.add(18);
        lista.add(31);
        System.out.println(lista);
        //lista.remove(new Integer(78));
        System.out.println(lista);
        System.out.println(lista.get(2));
        lista.set(2, 200);
        System.out.println(lista);*/

        /*float acum = 0;
        
        ArrayList<Producto> listaProductos = new ArrayList<Producto>();
        listaProductos.add(new Producto(12, 50, "Harina", 2500));
        listaProductos.add(new Producto(23, 20, "Halls", 300));
        listaProductos.add(new Producto(52, 40, "Coco", 5500));
        */

        /*
        for(int i=0; i<listaProductos.size(); i++){
            System.out.println(listaProductos.get(i).mostrarDatos());
        }
        */

        /*
        for(Producto p:listaProductos){
            //System.out.println(p.mostrarDatos());
            acum += p.getPrecio() * p.getInventario();
        }
        System.out.println("El total del inventario es: "+acum);


        try(Scanner x = new Scanner(System.in)){
            int cod;
            Boolean band = false;;
            Producto Pr = new Producto(-1, 0, "", 0);

            System.out.print("Ingrese el código a buscar: ");
            cod = x.nextInt();

            for(Producto p:listaProductos){
                if(p.getCodigo() == cod){
                    band = true;
                    Pr = p;
                    break;
                }else{
                    band = false;
                }
            }

            if (band == true){
                System.out.println("El profucto es: "+Pr.mostrarDatos());
                
            }else{
                System.out.println("El producto no se encontró");
            }
        }
        */


        ventanaProductos ven1 = new ventanaProductos();
        ven1.getAccessibleContext();
        /*
        Inventario inv = new Inventario();
        Producto x = new Producto(2,"Galletas",500.0f,8,"Confiteria",false);
        inv.productosInciales();
        inv.insertarProducto(x);
        System.out.println(inv.getListaProductos());
        */
    }
}
