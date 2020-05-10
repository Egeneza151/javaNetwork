package jns;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ClassNotFoundException;
import java.net.ServerSocket;
import java.net.Socket;

public class JavaNetworkServer {

    private static ServerSocket server;
    private static int port;

    public static void main(String args[]) throws IOException, ClassNotFoundException {
        server = new ServerSocket(port);
        ConfigHandler cf = new ConfigHandler();
        port = Integer.parseInt(cf.getProperty("port"));
           while(true){
               
               
               
           }       
        System.out.println("Shutting down...");
        server.close();
    }
}
