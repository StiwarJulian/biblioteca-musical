/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BI.albumes;

import BI.generos.MysqlGenerosDAO;
import DI.conexionBD;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pardo
 */
public class MysqlAlbumesDAO implements IAlbumes {

    String sql;

    @Override
    public void insertarAlbumes(Albumes album) {
        sql = "INSERT INTO `album`(`idalbum`, `nombre`, `fecha_lanzamiento`) values(NULL, '" + album.getNombre() + "','" + album.getFechaLanzamiento() + "')";
        try {
            conexionBD.con.ejecutarActualizacion(sql);
        } catch (Exception ex) {
            Logger.getLogger(MysqlGenerosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void eliminarAlbumes(Albumes album) {
        sql = "DELETE FROM `album` WHERE `idalbum` =" + album.getId();
        try {
            conexionBD.con.ejecutarQuery(sql);
        } catch (Exception ex) {
            Logger.getLogger(MysqlGenerosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public HashMap<Integer, Albumes> listarAlbumes() {
        sql = "SELECT * FROM `album`";
        HashMap<Integer, Albumes> albumes = new HashMap<>();
        try {
            ResultSet rs = conexionBD.getConnection().ejecutarQuery(sql);
            Albumes album = null;
            while (rs.next()) {
                album = new Albumes(rs.getInt("idalbum"), rs.getString("nombre"), rs.getDate("fecha_lanzamiento"));
                albumes.put(album.getId(), album);
            }
        } catch (Exception ex) {
            Logger.getLogger(MysqlAlbumesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return albumes;
    }

}
