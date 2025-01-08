package Unidad2.Ejercicio1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientHandler  implements Runnable{
    private Socket conexionCliente;

    public ClientHandler(Socket conexionCliente){
        this.conexionCliente = conexionCliente;
    }

    @Override
    public void run() {
        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(conexionCliente.getInputStream()));){
            String lineaRecibida = "";
            while (!lineaRecibida.equals("fin")){
                lineaRecibida = bufferedReader.readLine();
                if (!lineaRecibida.equals("fin")){
                    System.out.println("Mensaje: " + lineaRecibida);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
