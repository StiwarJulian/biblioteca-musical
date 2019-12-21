/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BI.paises;

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
public class MysqlPaisesDAO implements IPaises {

    String sql;

    @Override
    public HashMap<Integer, Paises> listarPaises() {
        sql = "SELECT * FROM `pais`";
        HashMap<Integer, Paises> paises = new HashMap<>();
        try {
            ResultSet rs = conexionBD.getConnection().ejecutarQuery(sql);
            Paises pais = null;
            while (rs.next()) {
                pais = new Paises(rs.getInt("idpais"), rs.getString("nombre"));
                paises.put(pais.getId(), pais);
            }
        } catch (Exception ex) {
            Logger.getLogger(MysqlGenerosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return paises;
    }

}
