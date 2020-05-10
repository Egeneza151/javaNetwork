package jns;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler extends Thread {

    private final Socket socket;
    private final DataInputStream inputStream;
    private final DataOutputStream outputStream;

    public ClientHandler(Socket s) throws IOException {
        this.socket = s;
        this.inputStream = new DataInputStream(s.getInputStream()); 
        this.outputStream = new DataOutputStream(s.getOutputStream());
    }
}
