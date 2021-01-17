/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface IOperaciones {
    boolean insertar (Object obj);
    boolean eliminar (Object obj);
    boolean actualizar (Object obj);
    ArrayList consultar ();
}
