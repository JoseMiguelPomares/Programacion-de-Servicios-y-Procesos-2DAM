package Unidad1.Ejercicio2;

import java.util.Random;

public class Ejercicio2Hilo implements Runnable{
    @Override
    public void run(){
        Thread t = Thread.currentThread();
        Random r = new Random();
        int n, j = 2;
        boolean primo = true;
        n = r.nextInt(1, 100);
        System.out.println("Mostrando primos hasta el " + n);

        for (int i = 3; i < n; i++){
            while (j < i){
                if (i % j == 0){
                    primo = false;
                    j=i;
                }
                j++;
            }
            if (primo){
                System.out.println(t.getName() + " " + i);
            }
            try {
                Thread.sleep(r.nextInt(500, 1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            primo = true;
            j = 2;
        }
    }
}
