package Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) throws InterruptedException {
        Scanner myScan = new Scanner(System.in);
        int n;
        System.out.println("Escribe un numero de hilos a crear");
        n = myScan.nextInt();
        Thread t = null;
        for (int i = 0; i < n; i++){
            t = new Thread(new Ejercicio3Hilo());
            System.out.println(t.getName() + " " + t.getId()+ " " + t.getState());
            t.setName("Hilo " + i + 1);
            t.start();

        }
        while (t.isAlive()){
            System.out.println(t.getName() + " " + t.getId()+ " " + t.getState());
            Thread.sleep(1000);
        }
    }
}
