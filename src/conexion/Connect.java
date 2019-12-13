/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.*;
/**
 *
 * @author Stiwar
 */
public class Connect {

    private Connection conn = null;
    private Statement state = null;
    
    public Connect(String driver, String url, String user, String password) throws ClassNotFoundException, SQLException{
        Class.forName(driver);
        conn = DriverManager.getConnection(url,user,password);
        state = conn.createStatement();
    }
    
    
    public void ejecutarActualizacion(String query) throws Exception {
        state.executeQuery(query);
    }
    
    public ResultSet ejecutarQuery(String query) throws Exception {
        ResultSet rs = null;
        rs = state.executeQuery(query);
        return rs;
    }
}
