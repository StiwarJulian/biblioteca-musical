/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BI.compositores;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.util.HashMap;

/**
 *
 * @author Pardo
 */
public interface ICompositor {

    public void insertarCompositor(Compositores compositor);

    public HashMap<Integer, Compositores> listarCompositores();

    public void modificarCompositor(Compositores compositor);

    public void eliminarCompositor(Compositores compositor) throws MySQLIntegrityConstraintViolationException;
}
