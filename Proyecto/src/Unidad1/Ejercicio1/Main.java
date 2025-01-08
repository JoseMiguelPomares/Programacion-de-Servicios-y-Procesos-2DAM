package Unidad1.Ejercicio1;


public class Main {
    public static void main(String[]args){
        Thread t = new Thread(new Ejercicio1Hilo());
        t.start();
    }
}
