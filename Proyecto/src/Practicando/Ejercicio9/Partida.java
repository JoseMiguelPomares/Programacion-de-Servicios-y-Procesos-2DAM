package Practicando.Ejercicio9;

import java.util.ArrayList;
import java.util.Random;

public class Partida implements Runnable {
    private int dados;
    private ArrayList<Integer> resultado;

    public Partida(int dados, ArrayList<Integer> resultado){
        this.dados = dados;
        this.resultado = resultado;
    }

    @Override
    public void run() {
        boolean partidaGanada = false;
        Random r = new Random();
        int numRandom;

        while (!partidaGanada){
            ArrayList<Integer> randomList = new ArrayList<>();
            for (int i = 0; i < dados; i++){
                numRandom = r.nextInt(1, 7);
                randomList.add(numRandom);
            }
            System.out.println(randomList.toString());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (resultado.equals(randomList)){
                System.out.println("¡¡¡Has Ganado la Partida!!! " + resultado.toString());
                partidaGanada = true;
            }
        }
    }
}
