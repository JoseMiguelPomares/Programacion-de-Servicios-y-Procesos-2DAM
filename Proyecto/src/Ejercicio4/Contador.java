package Ejercicio4;

import java.util.Random;

public class Contador implements Runnable {
    @Override
    public void run(){
        Thread thread = Thread.currentThread();
        Random random = new Random();
        int num = random.nextInt(10, 20);

        System.out.println("Pulsar enter cuando creas que el contador ha llegado a " + num);
        for (int i = 1; i <= num + 1; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            while (i <= 5){
                System.out.println(i);
            }
            if (!thread.isAlive()){
                if (i == num)
                    System.out.println("Lo has conseguido");
                else if (i < num)
                    System.out.println("Vuelve ha intentarlo, has detenido el contador en " + i);
                else
                    System.out.println("Se ha pasado el contador");
            }
        }

    }
}
