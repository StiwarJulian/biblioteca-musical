/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BI.usuarios;

import DI.conexionBD;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pardo
 */
public class MysqlUsuariosDAO implements IUsuarios {

    String sql;

    @Override
    public void insertarUsuario(Usuarios usuario) {
        sql = "INSERT INTO `usuario`(`idusuario`, `p_nombre`, `s_nombre`, `p_apellido`, "
                + "`s_apellido`, `edad`, `correo`, `usuario`, `clave`, `idpais`, "
                + "`autenticacion`, `idrol`) values(" + usuario.getId() + ", '" + usuario.getPrimerNombre()
                + "','" + usuario.getSegundoNombre() + "'" + ",'" + usuario.getPrimerApellido() + "','"
                + usuario.getSegundoApellido() + "'," + usuario.getEdad() + ",'" + usuario.getCorreo() + "','"
                + usuario.getUsuario() + "','" + usuario.getClave() + "'," + usuario.getPais() + ",'"
                + usuario.getAutenticacion() + "'," + usuario.getRol() + ")";
        try {
            conexionBD.getConnection().ejecutarActualizacion(sql);
        } catch (Exception ex) {
            Logger.getLogger(MysqlUsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public HashMap<Integer, Usuarios> listarUsuario() {
        sql = "SELECT * FROM `usuario`";
        HashMap<Integer, Usuarios> usuarios = new HashMap<>();
        try {
            ResultSet rs = conexionBD.getConnection().ejecutarQuery(sql);
            Usuarios usuario = null;
            while (rs.next()) {
                usuario = new Usuarios(rs.getInt("idusuario"), rs.getString("p_nombre"), rs.getString("s_nombre"),
                        rs.getString("p_apellido"), rs.getString("s_apellido"), rs.getInt("edad"), rs.getString("correo"),
                        rs.getString("usuario"), rs.getString("clave"), rs.getInt("idpais"), rs.getString("autenticacion"), rs.getInt("idrol"));
                usuarios.put(usuario.getId(), usuario);
            }
        } catch (Exception ex) {
            Logger.getLogger(MysqlUsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuarios;
    }

    @Override
    public boolean existirUnAdmin() {
        sql = "SELECT * FROM `usuario` WHERE `idrol` = 1";
        try {
            ResultSet rs = conexionBD.getConnection().ejecutarQuery(sql);
            return rs.next();
        } catch (Exception ex) {
            Logger.getLogger(MysqlUsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    @Override
    public boolean existeId(int id) {
        sql = "SELECT * FROM `usuario` WHERE `idusuario` = " + id;
        try {
            ResultSet rs = conexionBD.getConnection().ejecutarQuery(sql);
            return rs.next();
        } catch (Exception ex) {
            Logger.getLogger(MysqlUsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    @Override
    public boolean existeCorreo(String correo) {
        sql = "SELECT * FROM `usuario` WHERE `correo` = '" + correo + "'";
        try {
            ResultSet rs = conexionBD.getConnection().ejecutarQuery(sql);
            return rs.next();
        } catch (Exception ex) {
            Logger.getLogger(MysqlUsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    @Override
    public Usuarios getUsuario(int usuario, String clave) {
        sql = "SELECT * FROM `usuario` WHERE `idusuario` = " + usuario + " AND `clave` = '" + clave + "'";
        ResultSet rs;
        try {
            rs = conexionBD.getConnection().ejecutarQuery(sql);
            if (rs.next() == false) {
                return null;
            } else {
                do {
                    return new Usuarios(rs.getInt("idusuario"), rs.getString("p_nombre"), rs.getString("s_nombre"),
                            rs.getString("p_apellido"), rs.getString("s_apellido"), rs.getInt("edad"), rs.getString("correo"),
                            rs.getString("usuario"), rs.getString("clave"), rs.getInt("idpais"), rs.getString("autenticacion"), rs.getInt("idrol"));
                } while (rs.next());
            }
        } catch (Exception ex) {
            Logger.getLogger(MysqlUsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Usuarios getUsuario(int usuario) {
        sql = "SELECT * FROM `usuario` WHERE `idusuario` = '" + usuario + "'";
        ResultSet rs;
        try {
            rs = conexionBD.getConnection().ejecutarQuery(sql);
            if (rs.next() == false) {
                return null;
            } else {
                do {
                    return new Usuarios(rs.getInt("idusuario"), rs.getString("p_nombre"), rs.getString("s_nombre"),
                            rs.getString("p_apellido"), rs.getString("s_apellido"), rs.getInt("edad"), rs.getString("correo"),
                            rs.getString("usuario"), rs.getString("clave"), rs.getInt("idpais"), rs.getString("autenticacion"), rs.getInt("idrol"));
                } while (rs.next());
            }
        } catch (Exception ex) {
            Logger.getLogger(MysqlUsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void autenticarUsuario(int id) {
        sql = "UPDATE `usuario` set `autenticacion` = '' WHERE `idusuario` =" + id + "";
        try {
            conexionBD.getConnection().ejecutarActualizacion(sql);
        } catch (Exception ex) {
            Logger.getLogger(MysqlUsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modificarUsuarios(Usuarios usuarios) {
        sql = "UPDATE `usuario` SET `p_nombre`='" + usuarios.getPrimerNombre() + "',"
                + "`s_nombre`='" + usuarios.getSegundoNombre() + "',"
                + "`p_apellido`='" + usuarios.getPrimerApellido() + "',`s_apellido`='" + usuarios.getSegundoApellido() + "',"
                + "`edad`=" + usuarios.getEdad() + ",`correo`='" + usuarios.getCorreo() + "',"
                + "`usuario`='" + usuarios.getUsuario() + "' , `idpais` = " + usuarios.getPais()
                + " WHERE `idusuario` =" + usuarios.getId();
        try {
            conexionBD.con.ejecutarActualizacion(sql);
        } catch (Exception ex) {
            Logger.getLogger(MysqlUsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
