/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BI.artistas;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.util.HashMap;

/**
 *
 * @author Pardo
 */
public interface IArtistas {

    public void insertarArtistas(Artistas artista);

    public HashMap<Integer, Artistas> listarArtistas();

    public void modificarArtistas(Artistas artista);

    public void eliminarArtistas(Artistas artista) throws MySQLIntegrityConstraintViolationException;
}
