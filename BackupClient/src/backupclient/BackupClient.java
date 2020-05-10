package backupclient;

import java.io.IOException;

public class BackupClient {

    public static Config cfg;
    public static Server srv;
    public static void main(String[] args) throws IOException {
        cfg = new Config();
        if (cfg.getProperty("username").length() > 0 && cfg.getProperty("password").length() == 32) {
            Server.login(cfg.getProperty("username"),cfg.getProperty("password"));
        } else {
            LoginWindow lg = new LoginWindow();
        }
    }
}
