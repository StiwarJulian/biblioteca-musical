/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BI.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author Pardo
 */
public class Log {

    public static void escribirLog(String mensaje) {
        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh = null;
        try {

            try {
                fh = new FileHandler("log", true);
            } catch (IOException ex) {
                Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
            }
            logger.addHandler(fh);

            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            logger.info(mensaje);

        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }
}
