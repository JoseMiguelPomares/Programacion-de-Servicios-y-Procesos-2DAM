package Unidad1.Ejercicio8;

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
