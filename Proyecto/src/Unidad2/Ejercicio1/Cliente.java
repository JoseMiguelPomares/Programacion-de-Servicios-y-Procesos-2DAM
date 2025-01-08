package Unidad2.Ejercicio1;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        System.out.println("ClIENTE");

        try (Socket cliente = new Socket("localhost", 1234);
             OutputStream outputStream = cliente.getOutputStream();
             PrintWriter printWriter = new PrintWriter(outputStream, true)){

            String mensaje = "";
            while (!mensaje.equals("fin")){
                Scanner sc = new Scanner(System.in);
                System.out.println("Escribe el mensaje a enviar");
                mensaje = sc.nextLine();
                printWriter.println(mensaje);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
