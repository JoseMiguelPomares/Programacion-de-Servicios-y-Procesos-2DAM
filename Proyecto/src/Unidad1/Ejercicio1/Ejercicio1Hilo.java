package Unidad1.Ejercicio1;

import java.util.Scanner;

public class Ejercicio1Hilo implements Runnable {
    @Override
    public void run(){
        try{
            int n1;
            int n2;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escribe el n1: " );
            n1 = scanner.nextInt();
            System.out.println("Escribe el n2: " );
            n2 = scanner.nextInt();
            System.out.println("El hilo se ha lanzado");

            if (n1<n2){
                while (n1 <= n2){
                    System.out.println(n1);
                    n1++;
                    Thread.sleep(1000);
                }
            }
            else if(n1 > n2){
                while (n1 >= n2){
                    System.out.println(n2);
                    n2++;
                    Thread.sleep(1000);
                }
            }
            else {
                System.out.println(n1);
            }
        }
        catch (InterruptedException ie){
            System.out.println("Hilo interrumpido");
        }
    }
}
