package ejercicio9;

import java.util.ArrayList;
import java.util.Random;

public class Partida implements Runnable {
    private int dados;
    private ArrayList<Integer> resultado;
    public Partida(int dados, ArrayList<Integer> resultado) {
        this.dados = dados;
        this.resultado = resultado;
    }

    public void run() {
        boolean partidaGanada = false;
        Random r = new Random();
        int randomNum;
        ArrayList<Integer> random = new ArrayList<>();
        while (!partidaGanada){
            for (int i = 0; i < dados; i++) {
                try{
                    Thread.sleep(100);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
                randomNum = r.nextInt(1,6);
                random.add(randomNum);
            }
            if (resultado.equals(random)){
                System.out.println("Partida Ganada!");
                partidaGanada = true;
            }
        }
    }
}
