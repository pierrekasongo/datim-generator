/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhis2datim;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author pierre
 */
public class PropertyReader {
    
    private Properties prop;
    
    private InputStream input;
    
    public   PropertyReader() throws IOException{
        
        prop=new Properties();
        try {
            
            input=new FileInputStream("/home/pierre/Documents/datim-generator/resources/config.properties"); /** Deploiement **/
            //input=new FileInputStream("C:/Users/ebongo/Documents/iHAP/DEVELOPMENT/dhis2datim/resources/config.properties");
            prop.load(input);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PropertyReader.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(input != null){
                
                input.close();
            }
        }
    }
    
    public String getAttributeCombo(){
        
        return this.prop.getProperty("attribute_combo");
    }
    
    public String getOutputFile(){
        
        return this.prop.getProperty("output_file");
    }
    
    public String getOuFile(){
        return this.prop.getProperty("ou_file_location");
    }
    
    public String getMetadataFile(){
        return this.prop.getProperty("metadata_file_location");
    }
    
    public String getDataFile(){
        return this.prop.getProperty("data_file");
    }
}
