package Ejercicio8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String variedadCafe = "";
        int intesidadCafe = 1;

        Thread pc = new Thread(new  ProducirCapsulas(variedadCafe, intesidadCafe));
        Thread com = new Thread(new Consumidor());
        pc.start();
        com.start();
    }
}
