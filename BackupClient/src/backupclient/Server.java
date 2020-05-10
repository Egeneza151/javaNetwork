package backupclient;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;


public class Server {

    private final Socket socket;
    public Server() throws IOException{
        this.socket = new Socket("localhost",2137);
    }
    OutputStream  os = null;
    InputStream is = null;
    public boolean login(String username,String password) throws IOException{
        os = new OutputStream(socket.getOutputStream());
        is = new InputStream(socket.getInputStream());
        os.print("clientCredentials").append("\r\n");
        os.print(username+";"+password).append("\r\n");
        
        
        
        
        
        return false;
    }
}
