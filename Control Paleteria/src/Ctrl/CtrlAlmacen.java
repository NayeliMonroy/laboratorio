/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctrl;

import Entity.EntityAlmacen;
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
public class CtrlAlmacen extends Ctrl.Conexion implements IOperaciones{

    @Override
    public boolean insertar(Object obj) {
        EntityAlmacen pro = (EntityAlmacen) (obj);
        String query = "insert into Almacen values(?,?,?,?)";
        try {
            Connection con = super.getConexion();
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setInt(1,pro.getIdAlmacen());
            ps.setString(2,pro.getMateriaPrima());
            ps.setInt(3,pro.getIdProveedor());
            ps.setInt(4,pro.getStock());
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
        ArrayList<EntityAlmacen> Lista = new ArrayList<>();
        String query
                = "select idAlmacen,MateriaPrima,IdProveedor,Stock from Almacen";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                EntityAlmacen prod = new EntityAlmacen();
                prod.setIdAlmacen(rs.getInt(1));
                prod.setMateriaPrima(rs.getString(2));
                prod.setIdProveedor(rs.getInt(3));
               prod.setStock(rs.getInt(4));
              Lista.add(prod);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return Lista;
    }
    }
    

