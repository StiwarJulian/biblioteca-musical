/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BI.listas;

import BI.canciones.Canciones;
import BI.canciones.MysqlCancionesDAO;
import DI.conexionBD;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pardo
 */
public class MysqlListasDAO implements IListas {

    String sql;

    @Override
    public void insertarListas(Listas lista) {
        sql = "INSERT INTO `lista`(`idlista`, `fecha_creacion`, `nombre`, `idusuario`) "
                + " values(NULL, '" + lista.getFechaCreacion() + "','" + lista.getNombre()
                + "'," + lista.getUsuario() + ")";
        try {
            conexionBD.getConnection().ejecutarActualizacion(sql);
        } catch (Exception ex) {
            Logger.getLogger(MysqlListasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void insertarCancionListas(Listas lista, Canciones cancion) {
        sql = "INSERT INTO `lista_canciones`(`idLista_canciones`, `idlista`, `idcancion`) "
                + " values(NULL, " + lista.getId() + "," + cancion.getId() + ")";
        try {
            conexionBD.getConnection().ejecutarActualizacion(sql);
        } catch (Exception ex) {
            Logger.getLogger(MysqlListasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public HashMap<Integer, Listas> listarListas() {
        sql = "SELECT * FROM `lista`";
        HashMap<Integer, Listas> listas = new HashMap<>();
        try {
            ResultSet rs = conexionBD.getConnection().ejecutarQuery(sql);
            Listas lista = null;
            while (rs.next()) {
                lista = new Listas(rs.getInt("idlista"), rs.getDate("fecha_creacion"),
                        rs.getString("nombre"), getCancionesLista(rs.getInt("idLista")), rs.getInt("idusuario"));
                listas.put(lista.getId(), lista);
            }
        } catch (Exception ex) {
            Logger.getLogger(MysqlListasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listas;
    }

    public ArrayList<Canciones> getCancionesLista(int idLista) {
        ArrayList<Canciones> arregloCanciones = new ArrayList<>();
        sql = "SELECT * FROM `lista_canciones` WHERE `idlista` = " + idLista;
        try {
            ResultSet rs = conexionBD.getNewConnection().ejecutarQuery(sql);
            while (rs.next()) {
                int idCancion = rs.getInt("idcancion");
                MysqlCancionesDAO mysqlCancionesDAO = new MysqlCancionesDAO();
                arregloCanciones.add(mysqlCancionesDAO.getCancion(idCancion));
            }
        } catch (Exception ex) {
            Logger.getLogger(MysqlListasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arregloCanciones;
    }
}
