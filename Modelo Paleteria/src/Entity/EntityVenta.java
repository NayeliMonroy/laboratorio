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
public class EntityVenta {


    /**
     * @return the IdVenta
     */
    public int getIdVenta() {
        return IdVenta;
    }

    /**
     * @param IdVenta the IdVenta to set
     */
    public void setIdVenta(int IdVenta) {
        this.IdVenta = IdVenta;
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
     * @return the Cantidad
     */
    public int getCantidad() {
        return Cantidad;
    }

    /**
     * @param Cantidad the Cantidad to set
     */
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }


    /**
     * @return the Fecha
     */
    public String getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    /**
     * @return the Total
     */
    public double getTotal() {
        return Total;
    }

    /**
     * @param Total the Total to set
     */
    public void setTotal(double Total) {
        this.Total = Total;
    }
     @Override
    public String toString() {
        return "EntityVenta{" + "IdVenta=" + getIdVenta() + ", Producto=" + getProducto() +", Precio=" + getPrecio()+ ", Cantidad=" + getCantidad() +
                "Fecha=" + getFecha()+ "Total=" + getTotal()+'}';
    }
    
    
    private int IdVenta;
    private String Producto; 
    private int Cantidad;
   private double precio;
    private String Fecha;
    private double Total;

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
