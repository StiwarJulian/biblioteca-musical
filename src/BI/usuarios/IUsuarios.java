/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BI.usuarios;

import java.util.HashMap;

/**
 *
 * @author Pardo
 */
public interface IUsuarios {

    public void insertarUsuario(Usuarios usuario);

    public HashMap<Integer, Usuarios> listarUsuario();

    public boolean existirUnAdmin();

    public boolean existeId(int id);

    public boolean existeCorreo(String id);

    public Usuarios getUsuario(int usuario, String clave);

    public void modificarUsuarios(Usuarios usuarios);

    public Usuarios getUsuario(int usuario);
}
