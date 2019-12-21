/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BI.listas;

import BI.canciones.Canciones;
import BI.generos.*;
import java.util.HashMap;

/**
 *
 * @author Pardo
 */
public interface IListas {
    public void insertarListas(Listas lista);
    public  HashMap<Integer,Listas> listarListas();
    public void insertarCancionListas(Listas lista, Canciones cancion);    
}
