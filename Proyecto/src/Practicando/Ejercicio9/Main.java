package Practicando.Ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExecutorService ex = Executors.newFixedThreadPool(2);
        boolean seguirJugando = true;

        while (seguirJugando){
            System.out.println("Cuatos dados quieres lanzar:");
            int dados = scanner.nextInt();
            scanner.nextLine();
            ArrayList<Integer> resultado = new ArrayList<>();

            for (int i = 0; i < dados; i++){
                System.out.println("Escribe el numero del dado:");
                int numDado = scanner.nextInt();
                scanner.nextLine();
                if (numDado <= 6 && numDado >=1){
                    resultado.add(numDado);
                } else {
                    i--;
                }
            }
            Partida partida = new Partida(dados, resultado);
            ex.execute(partida);

            System.out.println("¿Quieres seguir jugando?");
            if (scanner.nextLine().equalsIgnoreCase("no")){
                seguirJugando = false;
            }
        }
    }
}
