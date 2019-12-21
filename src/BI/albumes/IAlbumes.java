/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BI.albumes;

import java.util.HashMap;

/**
 *
 * @author Pardo
 */
public interface IAlbumes {

    public void insertarAlbumes(Albumes album);

    public HashMap<Integer, Albumes> listarAlbumes();


    public void eliminarAlbumes(Albumes album);

}
