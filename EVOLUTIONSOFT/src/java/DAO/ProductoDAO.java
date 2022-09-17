
package DAO;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ProductoDAO {
    Connection cn = null;
    PreparedStatement pt = null;
    ResultSet rs = null;
    ArrayList<Producto> lista = null;
    Producto objDatosBean = null;

   public ArrayList<Producto> ListarDatos() {

        try {
            cn = Conexion.getConexionBD();
            pt = cn.prepareStatement("SELECT  producto.id_prod,producto.descripcion,producto.stock FROM producto;");
            rs = pt.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                objDatosBean = new Producto();
                objDatosBean.setIdproducto(rs.getInt(1));
                objDatosBean.setDescripcion(rs.getString(2));
                objDatosBean.setStock(rs.getInt(3));                
                lista.add(objDatosBean);
            }

        } catch (Exception e) {
        }
        return lista;
    }

  public ArrayList<Producto> ListarCategoria() {

        try {
            cn = Conexion.getConexionBD();
            pt = cn.prepareStatement("SELECT * FROM categoria");
            rs = pt.executeQuery();
            lista = new ArrayList<Producto>();
            while (rs.next()) {
                objDatosBean = new Producto();
                objDatosBean.setId_categoria(rs.getInt(1));
                objDatosBean.setDescripcionCategoria(rs.getString(2));
                lista.add(objDatosBean);
            }

        } catch (Exception e) {
        }
        return lista;
    }
  public ArrayList<Producto> ListarMarca() {

        try {
            cn = Conexion.getConexionBD();
            pt = cn.prepareStatement("SELECT * FROM marca");
            rs = pt.executeQuery();
            lista = new ArrayList<Producto>();
            while (rs.next()) {
                objDatosBean = new Producto();
                objDatosBean.setId_marca(rs.getInt(1));
                objDatosBean.setDescripcionMarca(rs.getString(2));
                lista.add(objDatosBean);
            }

        } catch (Exception e) {
        }
        return lista;
    }

}

