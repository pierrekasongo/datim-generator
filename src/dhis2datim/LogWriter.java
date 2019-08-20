/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhis2datim;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author ebongo
 */
public class LogWriter {
    static final Logger logger = Logger.getLogger("MyLog");  
    static FileHandler fh;
  
    public void writeLog(String value){
        try{  
            try {
                // This block configure the logger with handler and formatter
                fh = new FileHandler("C:\\temp\\MyLogFile.log");
                logger.addHandler(fh);
                SimpleFormatter formatter = new SimpleFormatter();
                fh.setFormatter(formatter);

                // the following statement is used to log any messages
                logger.info("Count :"+value);
            } catch (IOException ex) {
                Logger.getLogger(LogWriter.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SecurityException ex) {
                Logger.getLogger(LogWriter.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (Exception e) {  
            e.printStackTrace();  
        } 
        //logger.info("Hi How r u?"); 
    }
}
