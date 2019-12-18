/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BI.canciones;

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
public class MysqlCancionesDAO implements ICanciones {

    String sql;

    @Override
    public void insertarCanciones(Canciones cancion) {
        sql = "INSERT INTO `cancion`(`idcancion`, `nombre`, `idartista`, `idgenero`,"
                + " `idcompositor`, `fecha_lanzamiento`, `calificacion`, `idaalbum`,`precio`)"
                + "values(NULL, '" + cancion.getNombre()
                + "'," + cancion.getArtista()
                + "," + cancion.getGenero()
                + "," + cancion.getCompositor()
                + ",'" + cancion.getFechaLanzamiento()
                + "'," + cancion.getCalificacion()
                + "," + cancion.getAlbum()
                + "," + cancion.getPrecio() + ")";
        try {
            conexionBD.con.ejecutarActualizacion(sql);
        } catch (Exception ex) {
            Logger.getLogger(MysqlGenerosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void setAlbum(Canciones cancion) {
        sql = "UPDATE `cancion` SET `idaalbum`=" + cancion.getAlbum() + " WHERE `idcancion`=" + cancion.getId();
        try {
            conexionBD.con.ejecutarActualizacion(sql);
        } catch (Exception ex) {
            Logger.getLogger(MysqlGenerosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public HashMap<Integer, Canciones> listarCanciones() {
        sql = "SELECT * FROM `cancion`";
        HashMap<Integer, Canciones> canciones = new HashMap<>();
        try {
            ResultSet rs = conexionBD.getConnection().ejecutarQuery(sql);
            Canciones cancion = null;
            while (rs.next()) {
                cancion = new Canciones(rs.getInt("idcancion"), rs.getString("nombre"), rs.getInt("idartista"),
                        rs.getInt("idgenero"), rs.getInt("idcompositor"), rs.getDate("fecha_lanzamiento"),
                        rs.getInt("calificacion"), rs.getInt("idaalbum"), rs.getDouble("precio"));
                canciones.put(cancion.getId(), cancion);
            }
        } catch (Exception ex) {
            Logger.getLogger(MysqlGenerosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return canciones;
    }

    @Override
    public Canciones getCancion(int id) {
        sql = "SELECT * FROM `cancion` WHERE `idcancion` = " + id;
        ResultSet rs;
        try {
            rs = conexionBD.getNewConnection().ejecutarQuery(sql);
            if (rs.next() == false) {
                return null;
            } else {
                do {
                    return new Canciones(rs.getInt("idcancion"), rs.getString("nombre"), rs.getInt("idartista"),
                            rs.getInt("idgenero"), rs.getInt("idcompositor"), rs.getDate("fecha_lanzamiento"),
                            rs.getInt("calificacion"), rs.getInt("idaalbum"), rs.getDouble("precio"));
                } while (rs.next());
            }
        } catch (Exception ex) {
            Logger.getLogger(MysqlCancionesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
