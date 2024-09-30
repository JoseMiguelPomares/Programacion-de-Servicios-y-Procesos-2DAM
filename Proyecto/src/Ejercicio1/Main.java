package Ejercicio1;

import java.io.InputStream;
import java.util.Scanner;
import java.util.stream.Stream;


public class Main {
    public static void main(String[]args){
        Thread t = new Thread(new Ejercicio1Hilo());
        t.start();
    }
}
