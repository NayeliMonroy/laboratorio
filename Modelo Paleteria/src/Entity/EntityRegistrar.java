/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author DELL
 */
public class EntityRegistrar {

    /**
     * @return the NombreCajero
     */
    public String getNombreCajero() {
        return NombreCajero;
    }

    /**
     * @param NombreCajero the NombreCajero to set
     */
    public void setNombreCajero(String NombreCajero) {
        this.NombreCajero = NombreCajero;
    }

    /**
     * @return the Usuario
     */
    public String getUsuario() {
        return Usuario;
    }

    /**
     * @param Usuario the Usuario to set
     */
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    /**
     * @return the ClaveAcceso
     */
    public String getClaveAcceso() {
        return ClaveAcceso;
    }

    /**
     * @param ClaveAcceso the ClaveAcceso to set
     */
    public void setClaveAcceso(String ClaveAcceso) {
        this.ClaveAcceso = ClaveAcceso;
    }
    
    @Override
    public String toString() {
        return "EntityRegistrar{" + "NombreCajero=" + NombreCajero + ", Usuario=" + Usuario + ", ClaveAcceso=" + ClaveAcceso +'}';
    }
    
    private String NombreCajero;
    private String Usuario;
    private String ClaveAcceso;
    
}
