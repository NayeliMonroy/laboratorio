/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctrl;

import Entity.EntityVenta;
import Interface.IOperaciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class CtrlVenta extends Conexion implements IOperaciones{

    @Override
    public boolean insertar(Object obj) {
        Entity.EntityVenta pro = (EntityVenta) (obj);
        String query = "insert into ventas values(?,?,?,?,?)";
        try {
            Connection con = super.getConexion();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,pro.getIdVenta());
            ps.setString(2, pro.getProducto());
            ps.setInt(3,pro.getCantidad());
            ps.setString(4, pro.getFecha());
            ps.setDouble(5, pro.getTotal());
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
        ArrayList<EntityVenta> Lista = new ArrayList<>();
        String query
                = "select Idventa,fecha,total from ventas";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                EntityVenta prod = new EntityVenta();
                prod.setIdVenta(rs.getInt(1));
                prod.setFecha(rs.getString(2));
                prod.setTotal(rs.getDouble(3));
                
              Lista.add(prod);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return Lista;    }   
}
