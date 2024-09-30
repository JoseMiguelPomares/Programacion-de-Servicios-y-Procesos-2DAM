package Ejercicio2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2Hilo implements Runnable{
    @Override
    public void run(){
        Random r = new Random();
        int n;
        n = r.nextInt(1, 100);;
    }
}
