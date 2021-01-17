/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctrl;

 
import Entity.EntityNuevoProducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class CtrlNuevoProducto extends Conexion implements Interface.IOperaciones{

    @Override
    public boolean insertar(Object obj) {
       Entity.EntityNuevoProducto pro = (EntityNuevoProducto) (obj);
        String query = "insert into NuevoProducto values(?,?,?,?,?,?)";
        try {
Connection con = super.getConexion();            
PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,pro.getIdCodigo());
            ps.setInt(2,pro.getIdProveedor());
            ps.setString(3, pro.getProducto());
            ps.setInt(4,pro.getStock());
            ps.setDouble(5,pro.getPrecio());
            ps.setString(6, pro.getDescripcion());
            ps.executeUpdate();
            
            return true;
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean eliminar(Object obj) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
    @Override
    public boolean actualizar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList consultar() {
       Connection con = super.getConexion();
        ArrayList<EntityNuevoProducto> Lista = new ArrayList<>();
        String query
                = "select IdCodigo,IdProveedor,Producto,Stock,"
                + "Precio,Descripcion from NuevoProducto";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                EntityNuevoProducto prod = new EntityNuevoProducto();
                prod.setIdCodigo(rs.getInt(1));
                prod.setIdProveedor(rs.getInt(2));
                prod.setProducto(rs.getString(3));
                prod.setStock(rs.getInt(4));
                prod.setPrecio(rs.getDouble(5)); 
            
                prod.setDescripcion(rs.getString(6));
              Lista.add(prod);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return Lista;
    }
}
