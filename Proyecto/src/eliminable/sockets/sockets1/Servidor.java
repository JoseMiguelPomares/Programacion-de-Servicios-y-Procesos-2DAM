package eliminable.sockets.sockets1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {

    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(1234)){
            while (true) {
                try (Socket conexionClient = server.accept()) {
                    System.out.println("Cliente conectado!");
                    Scanner scanner = new Scanner(System.in);
                    try (BufferedReader reader = new BufferedReader(new InputStreamReader(conexionClient.getInputStream()));) {
                        OutputStream outputStream = conexionClient.getOutputStream();
                        PrintWriter printWriter = new PrintWriter(outputStream, true);

                        String lineaRecibida = "";
                        String mensajeAEnviar= "";
                        while (!lineaRecibida.equalsIgnoreCase("fin")){
                            System.out.println("El mensaje recibido es: " + lineaRecibida);
                            System.out.println("Esocribe el mensaje a enviar: ");
                            mensajeAEnviar = scanner.nextLine();
                            printWriter.println(mensajeAEnviar);
                        }
                        System.out.println(reader.readLine());
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
