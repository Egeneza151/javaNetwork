package javanetworkclient;

import java.awt.AWTException;
import java.io.IOException;
import javanetworkclient.mainWindow.MainWindow;
import javanetworkclient.configHandler.ConfigHandler;


public class JavaNetworkClient {

    public static void main(String[] args) throws AWTException, IOException {
        ConfigHandler cf = new ConfigHandler();
        
        
        
        //LoginWindow lw = new LoginWindow();
        MainWindow mw = new MainWindow();
       
    }
    
}
