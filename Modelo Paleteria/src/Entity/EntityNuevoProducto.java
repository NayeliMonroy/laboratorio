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
public class EntityNuevoProducto {

   

    /**
     * @return the IdCodigo
     */
    public int getIdCodigo() {
        return IdCodigo;
    }

    /**
     * @param IdCodigo the IdCodigo to set
     */
    public void setIdCodigo(int IdCodigo) {
        this.IdCodigo = IdCodigo;
    }
    
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
     * @return the Producto
     */
    public String getProducto() {
        return Producto;
    }

    /**
     * @param Producto the Producto to set
     */
    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    /**
     * @return the Stock
     */
    public int getStock() {
        return Stock;
    }

    /**
     * @param Stock the Stock to set
     */
    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    /**
     * @return the Precio
     */
    public double getPrecio() {
        return Precio;
    }

    /**
     * @param Precio the Precio to set
     */
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

   

    
    
    @Override
    public String toString() {
        return "EntityNuevoProducto{" + "IdCodigo=" + getIdCodigo() +"IdProveedor=" + getIdProveedor()+ ", Producto=" + getProducto() + ", Stock=" + getStock() +
                ", Precio=" + getPrecio() +", IdProveedor=" +", Descripcion=" + getDescripcion() +'}';
    }
    
    private int IdCodigo;
    private int IdProveedor;
    private String Producto;
    private int Stock;
    private double Precio;
    private String Descripcion;
    
}
