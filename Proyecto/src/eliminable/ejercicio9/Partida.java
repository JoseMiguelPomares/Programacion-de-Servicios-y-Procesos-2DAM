package eliminable.ejercicio9;

import java.util.ArrayList;
import java.util.Random;

public class Partida implements Runnable{
    ArrayList<Integer> totalDados;
    int dados;

    public Partida(ArrayList<Integer> totalDados, int dados){
        this.totalDados = totalDados;
        this.dados = dados;
    }

    @Override
    public void run() {
        boolean partidaGanada = false;
        Random random = new Random();
        while (!partidaGanada){
            ArrayList<Integer> buscarDados = new ArrayList<>();
            try {
                Thread.sleep((long) (Math.random()*100));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i < dados; i++){
                int dado = random.nextInt(1, 7);
                buscarDados.add(dado);
            }
            //System.out.println("Numeros dados: " + buscarDados.toString());
            if (totalDados.equals(buscarDados)){
                System.out.println("Partida Ganada " + totalDados.toString());
                partidaGanada = true;
            }
        }
    }
}
