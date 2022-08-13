package conexionsql;

import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class crudMunicipios {
    Conexion cnn = new Conexion(); // Instanciamos la conexión
    Connection con = null;
    PreparedStatement ps = null; // Prepara la consulta que haremos (Lenguaje SQL)
    Statement st = null; // Preparar la consulta sin parámetros
    ResultSet res = null; // Almacena los datos de la consulta - select

    private ArrayList<Municipios> datosMun = new ArrayList<>();
    private Municipios m = null;


    public ArrayList<Municipios> consultarTodos(){ // Consultar todos los municipios de la base de datos
        datosMun.clear();
        try {
            con = cnn.Conecta();
            String sql = "select * from municipios order by codigoMunicipio;";
            st = con.createStatement(); //Preparamos la consulta con la conexión
            res = st.executeQuery(sql); //Ejecuta la consulta
            while (res.next()){
                m = new Municipios(res.getString(1),res.getString(2),res.getString(3));
                datosMun.add(m);
            }
            con.close();
            } catch (SQLException e) {
            System.out.println("Error en la consulta: "+e);
        }
        return datosMun;
    }

    public Municipios buscarMunicipio(String codigo){
        Municipios m = null;
        try {
            con = cnn.Conecta();
            String sql = "select * from municipios where codigoMunicipio =?";
            ps = con.prepareStatement(sql);
            ps.setString(1, codigo);
            res = ps.executeQuery();
            while(res.next()){
                m = new Municipios(res.getString(1), res.getString(2), res.getString(3));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error en la consulta: "+e);
        }

        return m;
    }

    public boolean insertaMunicipios(Municipios m){
        boolean respuesta = false;

        try {
            if(buscarMunicipio(m.getCodigo()) == null){
                con = cnn.Conecta();
            String sql = "insert into municipios values (?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1,m.getCodigo());
            ps.setString(2, m.getNombre());
            ps.setString(3, m.getDepartamento());
            respuesta = ps.executeUpdate()>0;
            con.close();
            }else{
                JOptionPane.showMessageDialog(null, "El municipio ya existe");
            }

            
        } catch (SQLException e) {
            System.out.println("Error al insertar"+e);
        }

        return respuesta;
    }


    public boolean modificaMunicipios(Municipios m){
        boolean respuesta = false;

        try {
            if(buscarMunicipio(m.getCodigo()) != null){
                con = cnn.Conecta();
                String sql = "update municipios set nombre=?, departamento=? where codigoMunicipio=?";
                ps = con.prepareStatement(sql);
                ps.setString(1,m.getNombre());
                ps.setString(2, m.getDepartamento());
                ps.setString(3, m.getCodigo());
                respuesta = ps.executeUpdate()>0;
                con.close();
            }else{
                JOptionPane.showMessageDialog(null, "El municipio no existe");
            }

            
        } catch (SQLException e) {
            System.out.println("Error al modificar: "+e);
        }

        return respuesta;
    }


    public boolean eliminarMunicipios(String codigo){
        boolean respuesta = false;

        try {
            if(buscarMunicipio(codigo) != null){
                int si = JOptionPane.showConfirmDialog(null, "Desea eliminar el municipio "+codigo+"?");
                if(si == 0){
                    con = cnn.Conecta();
                    String sql = "delete from municipios where codigoMunicipio=?";
                    ps = con.prepareStatement(sql);
                    ps.setString(1,codigo);
                    respuesta = ps.executeUpdate()>0;
                    con.close();
                }
            }else{
                JOptionPane.showMessageDialog(null, "El municipio no existe");
            }

            
        } catch (SQLException e) {
            System.out.println("Error al modificar: "+e);
        }

        return respuesta;
    }

    public void cargaCombo(JComboBox<Municipios> combo){
        datosMun = consultarTodos();
        for(Municipios p: datosMun){
            combo.addItem(p);
        }

    }

}
