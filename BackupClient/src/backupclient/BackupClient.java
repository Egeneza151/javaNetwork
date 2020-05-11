package backupclient;

import java.io.IOException;
import backupclient.Server;

public class BackupClient {

    public static Config cfg;
    public static Server srv;
    public static LoginWindow lg;
    public static MainWindow mw;
    public static void main(String[] args) throws IOException {
        cfg = new Config();
        srv = new Server();
        mw = new MainWindow();
        mw.setVisible(false);
        if (cfg.getProperty("username").length() > 0 && cfg.getProperty("password").length() == 32) {
            System.out.println("if1");
            if (!srv.login(cfg.getProperty("username"), cfg.getProperty("password"))) {
                System.out.println("if2");
                 lg = new LoginWindow(mw, true);
                lg.setInfoText("Username or password invalid!");
            }
        } else {
             lg = new LoginWindow(mw, true);
        }
    mw.setVisible(true);
    }
}
