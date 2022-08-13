package conexionsql;

public class Main {
    public static void main(String[] args) {
        /*
        crudMunicipios cM = new crudMunicipios();
        // consultar
        for( Municipios p: cM.consultarTodos()){
            System.out.println("-->"+p.toString());
        }

        //buscar
        if(cM.buscarMunicipio("M1") != null){
            System.out.println(cM.buscarMunicipio("M2").toString());
        }else{
            System.out.println("No se encontró");
        }

        Municipios mun1 = new Municipios("M20","Villeta","Cundinamarca");
        //Insertar
        if(cM.insertaMunicipios(mun1)){
            System.out.println("Se registró el municipio");
        }else{
            System.out.println("No se registró");
        }

        //Modificar
        if(cM.modificaMunicipios(mun1)){
            System.out.println("Se modificó el municipio");
        }else{
            System.out.println("No se modificó");
        }

        //Eliminar
        if(cM.eliminarMunicipios("M7")){
            System.out.println("Se eliminó el municipio");
        }else{
            System.out.println("No se eliminó");
        }*/


        vtnPrincipal vtnP = new vtnPrincipal();
        vtnP.getAccessibleContext();
    }   
}
