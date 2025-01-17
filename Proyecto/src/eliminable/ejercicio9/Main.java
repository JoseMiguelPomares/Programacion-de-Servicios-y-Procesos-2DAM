package eliminable.ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean seguirJugando = true;

        ExecutorService ex = Executors.newFixedThreadPool(2);

        while (seguirJugando) {
            System.out.println("Cuantos dados quieres lanzar: ");
            int dados = scanner.nextInt();
            scanner.nextLine();
            ArrayList<Integer> totalDados = new ArrayList<>();
            for (int i = 0; i < dados; i++) {
                System.out.println("Escribe el numeros del dado " + (i + 1) + ":");
                int numDado = scanner.nextInt();
                scanner.nextLine();
                totalDados.add(numDado);
            }

            ex.execute(new Partida(totalDados, dados));

            System.out.println("Quieres jugar otra partida?");
            if (scanner.nextLine().equalsIgnoreCase("no")){
                seguirJugando = false;
                ex.shutdown();
                ex.shutdown();
            }
        }
    }
}
