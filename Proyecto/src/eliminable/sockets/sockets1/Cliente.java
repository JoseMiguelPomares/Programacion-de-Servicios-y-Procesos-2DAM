package eliminable.sockets.sockets1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (Socket cliente = new Socket("localhost", 1234)){
            PrintWriter writer = new PrintWriter( cliente.getOutputStream(),true);
            scanner.nextLine();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
