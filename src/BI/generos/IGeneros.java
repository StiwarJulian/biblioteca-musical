/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BI.generos;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.util.HashMap;

/**
 *
 * @author Pardo
 */
public interface IGeneros {

    public void insertarGenero(Generos genero);

    public HashMap<Integer, Generos> listarGeneros();

    public void modificarGeneros(Generos generos);

    public void eliminarGeneros(Generos generos) throws MySQLIntegrityConstraintViolationException;
}
