package backupclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Server {

    private final Socket socket;

    public Server() throws IOException {
        this.socket = new Socket("localhost", 2137);
    }
    OutputStream os = null;
    InputStream is = null;

    public boolean login(String username, String password) throws IOException {
        os = socket.getOutputStream();
        is = socket.getInputStream();
        PrintWriter osw = new PrintWriter(os, true);
        System.out.println("servverlogin");
        osw.print("clientCredentials\r\n");
        osw.print(username + ";" + password + "\n");
        osw.flush();
        System.out.println("servverloginsend");
        BufferedReader in = new BufferedReader(new InputStreamReader(is));

        String response = in.readLine();
            osw.close();
            in.close();
            os.close();
        return "OK".equals(response);
    }

    public void sendFile(String pathToFile) {

    }
}
