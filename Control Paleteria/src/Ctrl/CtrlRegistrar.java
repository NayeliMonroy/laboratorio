/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctrl;

import Entity.EntityRegistrar;
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
public class CtrlRegistrar extends Conexion implements IOperaciones{

    @Override
    public boolean insertar(Object obj) {
        Entity.EntityRegistrar pro = (EntityRegistrar) (obj);
        String query = "insert into registrar values(?,?,?)";
        try {
            Connection con = super.getConexion();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, pro.getNombreCajero());
            ps.setString(2,pro.getUsuario());
            ps.setString(3,pro.getClaveAcceso());
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
        ArrayList<EntityRegistrar> Lista = new ArrayList<>();
        String query
                = "select Usuario, ClaveAcceso from Registrar";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                EntityRegistrar prod = new EntityRegistrar();
                prod.setUsuario(rs.getString(1));
                prod.setClaveAcceso(rs.getString(2));
              Lista.add(prod);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return Lista;    }
    
}
