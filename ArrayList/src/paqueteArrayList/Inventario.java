import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Inventario {
    private ArrayList<Producto> listaProductos = new ArrayList<>();


    public Inventario(){

    }

    
    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }
    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    

    public void productosInciales(){
        listaProductos.add(new Producto(1,"Manzana",5000.0f,25,"Frutas",true)); 
        listaProductos.add(new Producto(2,"Limones",2300.0f,15,"Frutas",true));
        listaProductos.add(new Producto(3,"Peras",2700.0f,33,"Frutas",true));
        listaProductos.add(new Producto(4,"Tomates",2100.0f,42,"Verduras",false));
        listaProductos.add(new Producto(5,"Arandanos",(float)9300.0,5,"Frutas",true));
        listaProductos.add(new Producto(6,"Fresas",4100.0f,3,"Frutas",true));
        listaProductos.add(new Producto(7,"Helado",4500.0f,41,"Congelados",true));
        listaProductos.add(new Producto(8,"Galletas",500.0f,8,"Confiteria",false));
        listaProductos.add(new Producto(9,"Chocolates",3500.0f,80,"Confiteria",true));
        listaProductos.add(new Producto(10,"Jamon",15000.0f,10,"Carnes",true));
          }
      
    //CRUD
    public void insertarProducto(Producto p){
        boolean band = false;
        for(int i=0; i<listaProductos.size(); i++){
            if(listaProductos.get(i).getCodigo() == p.getCodigo()){
                band = true;
                break;
            }else{
                band = false;
            }
        }
        if (band == true){
            JOptionPane.showMessageDialog(null, "El producto ya existe.", "Error.", 0);
        }else{
            listaProductos.add(p);
        }
        
    }

    public Producto buscarProducto(int codigo){
        Producto p = null;
        for (Producto x: listaProductos){
            if(x.getCodigo() == codigo){
                p = x;
                break;
            }
        }
        return p;
    }

    public boolean modificarProducto(int codigo, Producto nuevo){
        Producto p = null;
        p= buscarProducto(codigo);
        if (p != null){
            int pos = listaProductos.indexOf(buscarProducto(codigo));
            listaProductos.set(pos, nuevo);
            
            return true;
        }else{
            return false;
        }
        
    }

    public boolean elminarProducto(int codigo){
        Producto p = null;
        p = buscarProducto(codigo);
        if (p != null){
            listaProductos.remove(p);
            return true;
        }else{
            return false;
        }
    }




}
