/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BI.compositores;

import BI.generos.MysqlGenerosDAO;
import BI.logger.Log;
import DI.conexionBD;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pardo
 */
public class MysqlCompositoresDAO implements ICompositor {

    String sql;

    @Override
    public void insertarCompositor(Compositores compositor) {
        sql = "INSERT INTO `compositor`(`idcompositor`, `p_nombre`, "
                + "`s_nombre`, `p_apellido`, `s_apellido`, `edad`, `idpais`)"
                + "values(NULL,'" + compositor.getPrimerNombre() + "','" + compositor.getSegundoNombre() + "','" + compositor.getPrimerApellido() + "'"
                + ",'" + compositor.getSegundoApellido() + "'" + "," + compositor.getEdad() + "," + compositor.getPais() + ")";
        try {
            conexionBD.con.ejecutarActualizacion(sql);
        } catch (Exception ex) {
            Logger.getLogger(MysqlGenerosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public HashMap<Integer, Compositores> listarCompositores() {
        sql = "SELECT * FROM `compositor`";
        HashMap<Integer, Compositores> compositores = new HashMap<>();
        try {
            ResultSet rs = conexionBD.getConnection().ejecutarQuery(sql);
            Compositores compositor = null;
            while (rs.next()) {
                compositor = new Compositores(rs.getInt("idcompositor"), rs.getString("p_nombre"),
                        rs.getString("p_apellido"), rs.getInt("edad"), rs.getInt("idpais"),
                        rs.getString("s_nombre"), rs.getString("s_apellido"));
                compositores.put(compositor.getId(), compositor);
            }
        } catch (Exception ex) {
            Logger.getLogger(MysqlGenerosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return compositores;
    }

    @Override
    public void modificarCompositor(Compositores compositor) {
        sql = "UPDATE `compositor` SET `p_nombre`='" + compositor.getPrimerNombre()
                + "',`s_nombre`='" + compositor.getSegundoNombre() + "',"
                + "`p_apellido`='" + compositor.getPrimerApellido()
                + "',`s_apellido`='" + compositor.getSegundoApellido() + "',"
                + "`edad`=" + compositor.getEdad() + ",`idpais`=" + compositor.getPais()
                + " WHERE `idcompositor` = " + compositor.getId();
        try {
            conexionBD.con.ejecutarActualizacion(sql);
        } catch (Exception ex) {
            Logger.getLogger(MysqlCompositoresDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminarCompositor(Compositores compositor) throws MySQLIntegrityConstraintViolationException{
        sql = "DELETE FROM `compositor` WHERE `idcompositor` =" + compositor.getId();
        try {
            conexionBD.con.ejecutarActualizacion(sql);
        } catch (Exception ex) {
            if (ex instanceof MySQLIntegrityConstraintViolationException) {
                throw new MySQLIntegrityConstraintViolationException();
            }
        }
    }

}
