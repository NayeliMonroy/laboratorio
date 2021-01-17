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
public class EntityAlmacen {

    /**
     * @return the idAlmacen
     */
    public int getIdAlmacen() {
        return idAlmacen;
    }

    /**
     * @param idAlmacen the idAlmacen to set
     */
    public void setIdAlmacen(int idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    /**
     * @return the Producto
     */
    public String getMateriaPrima() {
        return MateriaPrima;
    }

    /**
     * @param Producto the Producto to set
     */
    public void setMateriaPrima(String MateriaPrima) {
        this.MateriaPrima = MateriaPrima;
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
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    @Override
    public String toString() {
        return "EntityAlmacen{" + "idAlmacen=" + getIdAlmacen() + "MateriaPrima=" + getMateriaPrima()+ ", IdProveedor=" + getIdProveedor() + ", Stock=" + getStock() +'}';
    }
 private int idAlmacen; 
 private String MateriaPrima;
 private int IdProveedor;
 private int stock ;
}
