package Ejercicio8;

import java.util.Random;

public class ProducirCapsulas implements Runnable {
    private String variedadCafe;
    private int intesidadCafe;

    public static int contenedor = 0;

    public ProducirCapsulas(String variedadCafe, int intesidadCafe){
        this.variedadCafe = variedadCafe;
        this.intesidadCafe = intesidadCafe;
    }

    @Override
    public void run() {
        System.out.println("Produciendo capsula de cafe.");
        try{
            Thread.sleep((long) (Math.random()*1000+500));
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        Capsula c = new Capsula();
        contenedor++;
        System.out.println("Capsula producida, numero total de capsulas: " + contenedor);
        synchronized (c){
            while (contenedor >= 6){
                try {
                    c.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
