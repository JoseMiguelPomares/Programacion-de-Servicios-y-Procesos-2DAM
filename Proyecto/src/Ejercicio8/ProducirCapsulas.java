package Ejercicio8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProducirCapsulas implements Runnable {
    private String variedadCafe;
    private int intesidadCafe;

    public static List<Capsula> contenedor = new ArrayList<Capsula>();

    public boolean a = true;

    public ProducirCapsulas(String variedadCafe, int intesidadCafe){
        this.variedadCafe = variedadCafe;
        this.intesidadCafe = intesidadCafe;
    }

    @Override
    public void run() {
        while(a){
            System.out.println("Produciendo capsula de cafe.");
            try{
                Thread.sleep((long) (Math.random()*1000+500));
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            Capsula c = new Capsula();
            contenedor.add(c);
            System.out.println("Capsula producida, numero total de capsulas: " + contenedor.size());

            synchronized (contenedor) {
                if (contenedor.size() >= 6) {
                    contenedor.notify();
                }
            }
        }
    }
}
