package Unidad2.Ejercicio1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Servidor {
    public static void main(String[] args) {
        System.out.println("SERVIDOR");
        ExecutorService ex = Executors.newCachedThreadPool();

        try (ServerSocket server = new ServerSocket(1234)){
            System.out.println("Esperando conexzion de un cliente");
            while (true){
                Socket socketCliente = server.accept();
                System.out.println("Cliente conectado");
                ex.execute(new ClientHandler(socketCliente));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
