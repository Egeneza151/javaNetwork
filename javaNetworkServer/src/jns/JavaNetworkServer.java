package jns;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ClassNotFoundException;
import java.net.ServerSocket;
import java.net.Socket;
import jns.*;

public class JavaNetworkServer {

    private static ServerSocket server;
    private static int port;

    public static void main(String args[]) throws IOException, ClassNotFoundException {
        server = new ServerSocket(port);
        ConfigHandler cf = new ConfigHandler();
        port = Integer.parseInt(cf.getProperty("port"));
        boolean running = true;
        while (running) {
            Socket s = null;
            try{
                s = server.accept();
                Thread t = new ClientHandler(s);
                t.start();
                
            } catch(Exception e){
                running = false;
                e.printStackTrace();
            }

        }
        System.out.println("Shutting down...");
        server.close();
    }
}
