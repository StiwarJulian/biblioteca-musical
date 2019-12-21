/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BI.generos;

import BI.logger.Log;
import DI.conexionBD;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pardo
 */
public class MysqlGenerosDAO implements IGeneros {

    String sql;

    @Override
    public void insertarGenero(Generos genero) {
        sql = "INSERT INTO `genero`(`idgenero`, `genero`, `descripcion`)  values(NULL, '" + genero.getNombre() + "','" + genero.getDescipcion() + "')";
        try {
            conexionBD.getConnection().ejecutarActualizacion(sql);
        } catch (Exception ex) {
            Logger.getLogger(MysqlGenerosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public HashMap<Integer, Generos> listarGeneros() {
        sql = "SELECT * FROM `genero`";
        HashMap<Integer, Generos> generos = new HashMap<>();
        try {
            ResultSet rs = conexionBD.getConnection().ejecutarQuery(sql);
            Generos genero = null;
            while (rs.next()) {
                genero = new Generos(rs.getInt("idgenero"), rs.getString("genero"), rs.getString("descripcion"));
                generos.put(genero.getId(), genero);
            }
        } catch (Exception ex) {
            Logger.getLogger(MysqlGenerosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return generos;
    }

    @Override
    public void modificarGeneros(Generos generos) {
        sql = "UPDATE `genero` SET `genero`='" + generos.getNombre()
                + "',`descripcion`='" + generos.getDescipcion() + "'"
                + " WHERE `idgenero` = " + generos.getId();
        try {
            conexionBD.con.ejecutarActualizacion(sql);
        } catch (Exception ex) {
            Logger.getLogger(MysqlGenerosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminarGeneros(Generos generos) throws MySQLIntegrityConstraintViolationException {
        sql = "DELETE FROM `genero` WHERE `idgenero` = " + generos.getId();
        try {
            conexionBD.con.ejecutarActualizacion(sql);
        } catch (Exception ex) {
            if (ex instanceof MySQLIntegrityConstraintViolationException) {
                throw new MySQLIntegrityConstraintViolationException();
            }
        }
    }

}
