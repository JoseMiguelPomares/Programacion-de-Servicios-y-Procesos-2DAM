package Ejercicio1;

import java.io.InputStream;
import java.util.Scanner;
import java.util.stream.Stream;


public class Main {
    public static void main(String[]args){
        int n1;
        int n2;
        InputStream stream = System.in;
        Scanner scanner = new Scanner(stream);
        System.out.println("Escribe el n1: " );
        n1 = scanner.nextInt();
        System.out.println("Escribe el n2: " );
        n2 = scanner.nextInt();
        numeros(n1, n2);
    }

    public static void numeros(int n1, int n2){
        System.out.println("El hilo se ha lanzado");

        if (n1<n2){
            while (n1 < n2){
                n1++;

            }
        }
    }
}
