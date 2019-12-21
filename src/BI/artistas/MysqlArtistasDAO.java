/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BI.artistas;

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
public class MysqlArtistasDAO implements IArtistas {

    String sql;

    @Override
    public void insertarArtistas(Artistas artista) {
        String defuncion = (artista.getFechaDefuncion() == null) ? null : "'" + artista.getFechaDefuncion().toString() + "'";
        sql = "INSERT INTO `artista`(`idartista`, `p_nombre`, `s_nombre`, `p_apellido`,"
                + " `s_apellido`, `nombre_artistico`, `fecha_nacimiento`, `fecha_defuncion`,"
                + " `pais_idpais`, `descripcion`, `idgenero`)  values(NULL, '" + artista.getPrimerNombre()
                + "','" + artista.getSegundoNombre() + "'" + ",'" + artista.getPrimerApellido() + "',"
                + "'" + artista.getSegundoApellido() + "'," + "'" + artista.getNombreArtistico() + "','"
                + artista.getFechaNacimiento() + "'," + defuncion + "," + artista.getPais() + ",'"
                + artista.getDescripcion() + "'," + artista.getGenero() + ")";
        try {
            conexionBD.con.ejecutarActualizacion(sql);
        } catch (Exception ex) {
            Logger.getLogger(MysqlArtistasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public HashMap<Integer, Artistas> listarArtistas() {
        sql = "SELECT * FROM `artista`";
        HashMap<Integer, Artistas> artistas = new HashMap<>();
        try {
            ResultSet rs = conexionBD.getConnection().ejecutarQuery(sql);
            Artistas artista = null;
            while (rs.next()) {
                artista = new Artistas(rs.getInt("idartista"), rs.getString("p_nombre"), rs.getString("p_apellido"),
                        rs.getString("nombre_artistico"), rs.getDate("fecha_nacimiento"), rs.getDate("fecha_defuncion"),
                        rs.getInt("pais_idpais"), rs.getString("descripcion"), rs.getInt("idgenero"),
                        rs.getString("s_apellido"), rs.getString("s_nombre"));
                artistas.put(artista.getId(), artista);
            }
        } catch (Exception ex) {
            Logger.getLogger(MysqlArtistasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return artistas;
    }

    @Override
    public void modificarArtistas(Artistas artista) {
        String defuncion = (artista.getFechaDefuncion() == null) ? null : "'" + artista.getFechaDefuncion().toString() + "'";
        sql = "UPDATE `artista` SET `p_nombre`='" + artista.getPrimerNombre() + "',"
                + "`s_nombre`='" + artista.getSegundoNombre() + "',`p_apellido`='" + artista.getPrimerApellido()
                + "',`s_apellido`='" + artista.getSegundoApellido() + "',`nombre_artistico`='" + artista.getNombreArtistico()
                + "',`fecha_nacimiento`='" + artista.getFechaNacimiento() + "',"
                + "`fecha_defuncion`=" + defuncion
                + ",`pais_idpais`=" + artista.getPais() + ",`descripcion`='" + artista.getDescripcion() + "',"
                + "`idgenero`=" + artista.getGenero() + " WHERE `idartista` =" + artista.getId();
        try {
            conexionBD.con.ejecutarActualizacion(sql);
        } catch (Exception ex) {
            Logger.getLogger(MysqlArtistasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminarArtistas(Artistas artista) throws MySQLIntegrityConstraintViolationException {
        sql = "DELETE FROM `artista` WHERE `idartista` =" + artista.getId();;
        try {
            conexionBD.con.ejecutarActualizacion(sql);
        } catch (Exception ex) {
            if (ex instanceof MySQLIntegrityConstraintViolationException) {
                throw new MySQLIntegrityConstraintViolationException();
            }
        }
    }

}
