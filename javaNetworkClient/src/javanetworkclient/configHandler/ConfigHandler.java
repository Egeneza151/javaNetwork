package javanetworkclient.configHandler;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ConfigHandler {

    public Properties props;
    String path = "./config.properties";
    
    public ConfigHandler() throws FileNotFoundException, IOException {
        props = new Properties();
       
        File tmp = new File(path);
        if (tmp.exists()) {
            InputStream is = new FileInputStream(path);
            props.load(is);
            is.close();

        }else{
            Writer os = new FileWriter(path);
            props.setProperty("username","");
            props.setProperty("password","");
            props.setProperty("sync_path","");
            props.setProperty("sync_time","");
            props.store(os,"Config file");
            os.close();
        }
    }
    public void saveProps() throws IOException{
        Writer os = new FileWriter(path);
        props.store(os,"Config file");
        os.close();
    }
}
