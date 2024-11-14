package ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(2);
        Scanner myScanner = new Scanner(System.in);
        boolean seguirJugando = true;
        while (seguirJugando){
            System.out.println("Ingrese el numero de dados: ");
            int dados = myScanner.nextInt();
            ArrayList<Integer> resultado = new ArrayList<>();
            myScanner.nextLine();
            for (int i = 0; i < dados; i++) {
                System.out.println("Ingrese el numero del dado: ");
                resultado.add(myScanner.nextInt());
                myScanner.nextLine();
            }
            Partida partida = new Partida(dados, resultado);
            ex.execute(partida);
            System.out.println("Quieres seguir jugando?");
            if (myScanner.nextLine().equalsIgnoreCase("no")){
                seguirJugando = false;
            }
        }
    }
}
