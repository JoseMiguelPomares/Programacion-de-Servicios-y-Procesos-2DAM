package Ejercicio8c;

public class Main {
    public static void main(String[] args) {
        String variedadCafe = "";
        int intesidadCafe = 1;

        Thread pc1 = new Thread(new ProducirCapsulas(variedadCafe, intesidadCafe));
        Thread pc2 = new Thread(new ProducirCapsulas(variedadCafe, intesidadCafe));
        Thread pc3 = new Thread(new ProducirCapsulas(variedadCafe, intesidadCafe));
        Thread pc4 = new Thread(new ProducirCapsulas(variedadCafe, intesidadCafe));
        Thread com = new Thread(new Consumidor());
        pc1.start();
        pc2.start();
        pc3.start();
        pc4.start();
        com.start();
    }
}
