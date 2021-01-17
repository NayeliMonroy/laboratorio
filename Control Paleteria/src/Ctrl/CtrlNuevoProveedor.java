/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctrl;

import Entity.EntityNuevoProveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class CtrlNuevoProveedor extends Conexion implements Interface.IOperaciones{

    @Override
    public boolean insertar(Object obj) {
        Entity.EntityNuevoProveedor pro = (EntityNuevoProveedor) (obj);
        String query = "insert into proveedor values(?,?,?,?,?,?,?)";
        try {
Connection con = super.getConexion();
PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,pro.getIdProveedor());
            ps.setString(2, pro.getNombreCompañia());
            ps.setString(3, pro.getNombreProveedor());
            ps.setString(4, pro.getTituloProveedor());
            ps.setString(5, pro.getDireccion());
            ps.setString(6,pro.getCodigoPostal());
            ps.setString(7,pro.getTelefono());
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
        ArrayList<EntityNuevoProveedor> Lista = new ArrayList<>();
        String query
                = "select IdProveedor,NombreCompañia,NombreProveedor,"
                + "TituloProveedor,Direccion,CodigoPostal,Telefono from proveedor";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                EntityNuevoProveedor prov = new EntityNuevoProveedor();
                 prov.setIdProveedor(rs.getInt(1));
                 prov.setNombreCompañia(rs.getString(2));
                 prov.setNombreProveedor(rs.getString(3));  
                 prov.setTituloProveedor(rs.getString(4));
                 prov.setDireccion(rs.getString(5));
                 prov.setCodigoPostal(rs.getString(6));
                 prov.setTelefono(rs.getString(7));
              Lista.add(prov);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return Lista;
    }
}
