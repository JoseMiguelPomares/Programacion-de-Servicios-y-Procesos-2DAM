package Ejercicio4;

import java.util.Random;
import java.util.Scanner;

public class Contador implements Runnable {
    @Override
    public void run(){
        Thread thread = Thread.currentThread();
        Scanner myScan = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(10, 20);

        System.out.println("Pulsar enter cuando creas que el contador ha llegado a " + num);
        for (int i = 1; i <= num + 1; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (i <= 5){
                System.out.println(i);
            }
            if (i == num && myScan.nextLine() == "") {
                System.out.println("Lo has conseguido");
                thread.stop();
            }
            else if (i < num && myScan.nextLine() == "") {
                System.out.println("Vuelve ha intentarlo, has detenido el contador en " + i);
                thread.stop();
            }
            else if (i > num) {
                System.out.println("Se ha pasado el contador");
                thread.stop();
            }
        }

    }
}
