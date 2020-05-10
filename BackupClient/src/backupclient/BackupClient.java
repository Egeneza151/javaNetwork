package backupclient;

import java.io.IOException;
import backupclient.Server;

public class BackupClient {

    public static Config cfg;
    public static Server srv;
    public static void main(String[] args) throws IOException {
        cfg = new Config();
        if (cfg.getProperty("username").length() > 0 && cfg.getProperty("password").length() == 32) {
            if(!srv.login(cfg.getProperty("username"),cfg.getProperty("password"))){
                LoginWindow lg = new LoginWindow();
                lg.setInfoText("Username or password invalid!");
            }
        } else {
            LoginWindow lg = new LoginWindow();
        }
    }
}
