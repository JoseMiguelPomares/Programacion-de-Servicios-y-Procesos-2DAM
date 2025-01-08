package Unidad1.Ejercicio4;

import java.util.Random;

public class Contador implements Runnable {
    Random random = new Random();
    public boolean ejecutar = true;
    public int num = random.nextInt(10, 20);
    public int contador = 0;

    public void Detener() { ejecutar = false; }
    public int getNum() { return num; }
    public int getContador() { return contador; }

    @Override
    public void run(){
        System.out.println("Pulsar enter cuando creas que el contador ha llegado a " + num);
        while (ejecutar) {
            contador++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (contador <= 5){
                System.out.println(contador);
            }
        }
    }
}
