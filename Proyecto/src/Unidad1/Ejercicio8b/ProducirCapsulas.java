package Unidad1.Ejercicio8b;

import java.util.ArrayList;
import java.util.List;

public class ProducirCapsulas implements Runnable {
    private String variedadCafe;
    private int intesidadCafe;

    public static volatile List<Capsula> contenedor = new ArrayList<>();

    public ProducirCapsulas(String variedadCafe, int intesidadCafe){
        this.variedadCafe = variedadCafe;
        this.intesidadCafe = intesidadCafe;
    }

    @Override
    public void run() {
        while(true){
            System.out.println("Produciendo capsula de cafe.");
            Capsula c = new Capsula();
            synchronized (contenedor) {
                contenedor.add(c);
                System.out.println("Capsula producida, numero total de capsulas: " + contenedor.size());
                if (contenedor.size() >= 6) {
                    contenedor.notifyAll();
                }
            }
            try{
                Thread.sleep((long) (Math.random()*1000+500));
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
