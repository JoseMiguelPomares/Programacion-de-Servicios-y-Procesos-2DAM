package Unidad1.Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner myScan = new Scanner(System.in);
        Contador contador = new Contador();
        Thread thread = new Thread(contador);

        thread.start();

        myScan.nextLine();

        contador.Detener();

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (contador.getContador() == contador.getNum()) {
            System.out.println("Lo has conseguido");
        }
        else if (contador.getContador() < contador.getNum()) {
            System.out.println("Vuelve ha intentarlo, has detenido el contador en " + contador.getContador());
        }
        else if (contador.getContador() > contador.getNum()) {
            System.out.println("Se ha pasado el contador");

        }
    }
}
