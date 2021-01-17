 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctrl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    

    Connection conexion =null;
   
    public Connection getConexion() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
           
            conexion =DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba","root","1234" );
            
        }catch (ClassNotFoundException ex){
            System.out.println("error de clase: "+ex.getMessage());
           
        
          }
        catch (SQLException e){
            System.err.println( e.getMessage());
           
            
        } finally{
           return conexion;  
        }    
    }
public void cerrarconexion(){
    try {
        conexion.close();
    }catch (Exception e){
        System.out.println(e.getMessage());
    }
}



}
