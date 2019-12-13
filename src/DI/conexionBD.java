/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DI;

import com.mysql.jdbc.Connection;

/**
 *
 * @author Stiwar
 */
public class conexionBD {
    

    public static Connect con = null;
    
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String USER = "root";
    public static final String PASSWORD = "";
    public static final String URL = "jdbc:mysql://localhost/biblioteca_musica";
    
    public static Connect getConnection() throws Exception{
        if(con == null){
            con = new Connect(DRIVER, URL, USER, PASSWORD);
        }
        return con;
    }
}
