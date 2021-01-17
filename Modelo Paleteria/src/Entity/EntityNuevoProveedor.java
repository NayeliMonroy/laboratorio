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
public class EntityNuevoProveedor {

    /**
     * @return the IdProveedor
     */
    public int getIdProveedor() {
        return IdProveedor;
    }

    /**
     * @param IdProveedor the IdProveedor to set
     */
    public void setIdProveedor(int IdProveedor) {
        this.IdProveedor = IdProveedor;
    }

    /**
     * @return the NombreCompañia
     */
    public String getNombreCompañia() {
        return NombreCompañia;
    }

    /**
     * @param NombreCompañia the NombreCompañia to set
     */
    public void setNombreCompañia(String NombreCompañia) {
        this.NombreCompañia = NombreCompañia;
    }

    /**
     * @return the NombreProveedor
     */
    public String getNombreProveedor() {
        return NombreProveedor;
    }

    /**
     * @param NombreProveedor the NombreProveedor to set
     */
    public void setNombreProveedor(String NombreProveedor) {
        this.NombreProveedor = NombreProveedor;
    }

    /**
     * @return the TituloProveedor
     */
    public String getTituloProveedor() {
        return TituloProveedor;
    }

    /**
     * @param TituloProveedor the TituloProveedor to set
     */
    public void setTituloProveedor(String TituloProveedor) {
        this.TituloProveedor = TituloProveedor;
    }

    /**
     * @return the Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @param Direccion the Direccion to set
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    /**
     * @return the CodigoPostal
     */
    public String getCodigoPostal() {
        return CodigoPostal;
    }

    /**
     * @param CodigoPostal the CodigoPostal to set
     */
    public void setCodigoPostal(String CodigoPostal) {
        this.CodigoPostal = CodigoPostal;
    }

    /**
     * @return the Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

   
    
    @Override
    public String toString() {
        return "EntityNuevoProveedor{" + "IdProveedor=" + getIdProveedor() + ", NombreCompañia=" 
                + getNombreCompañia() + ", NombreProveedor=" + getNombreProveedor() + ", TituloProveedor=" 
                + getTituloProveedor() + ", Direccion=" + getDireccion() +
                ", CodigoPostal=" + getCodigoPostal() +
                ", Telefono=" + getTelefono() +'}';
    }
   
    private int IdProveedor;
    private String NombreCompañia;
    private String NombreProveedor;
    private String TituloProveedor;
    private String Direccion;
    private String CodigoPostal;
    private String Telefono;
}
