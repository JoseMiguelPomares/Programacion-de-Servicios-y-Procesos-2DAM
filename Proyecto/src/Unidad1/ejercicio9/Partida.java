package Unidad1.ejercicio9;

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

        //System.out.println("hola");
        while (!partidaGanada){
            ArrayList<Integer> random = new ArrayList<>();
            //System.out.println("hola2");
            for (int i = 0; i < dados; i++) {
                randomNum = r.nextInt(1,6);
                random.add(randomNum);
            }
            //System.out.println("RESULTADO DADOS " + random.toString());
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }

            //System.out.println("hola4");
            if (resultado.equals(random)){
                System.out.println("Partida Ganada! " + resultado.toString());
                partidaGanada = true;
            }
        }
    }
}
