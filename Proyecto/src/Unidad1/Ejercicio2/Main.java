package Unidad1.Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner myScan = new Scanner(System.in);
        int n;
        System.out.println("Escribe un numero de hilos a crear");
        n = myScan.nextInt();
        Thread t;
        for (int i = 0; i < n; i++){
            t = new Thread(new Ejercicio2Hilo());
            t.setName("Hilo " + i + 1);
            t.start();
        }
    }
}
