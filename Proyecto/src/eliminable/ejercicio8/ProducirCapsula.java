package eliminable.ejercicio8;

import java.util.ArrayList;
import java.util.Random;

public class ProducirCapsula implements Runnable {
    private String variedadCapsula;
    private int intensidad;
    public static volatile ArrayList<Capsula> contenedor = new ArrayList<>();

    public ProducirCapsula(String variedadCapsula, int intensidad){
        this.variedadCapsula = variedadCapsula;
        this.intensidad = intensidad;
    }

    @Override
    public void run() {
        while (true){
            System.out.println("Produciendo Capsula");
            try {
                Thread.sleep((long)((Math.random()*1000)+500));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Capsula capsula = new Capsula();
            contenedor.add(capsula);
            System.out.println("Capsula producida " + contenedor.size());

            synchronized (contenedor){
                if (contenedor.size() >= 6){
                    contenedor.notify();
                }
            }
        }
    }
}
