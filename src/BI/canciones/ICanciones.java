/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BI.canciones;

import java.util.HashMap;

/**
 *
 * @author Pardo
 */
public interface ICanciones {

    public void insertarCanciones(Canciones canciones);

    public HashMap<Integer, Canciones> listarCanciones();

    public Canciones getCancion(int id);

   
}
