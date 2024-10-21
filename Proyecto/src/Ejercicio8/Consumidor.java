package Ejercicio8;

public class Consumidor implements Runnable{

    @Override
    public void run() {
        Capsula c = new Capsula();
        synchronized (c){
            if (ProducirCapsulas.contenedor == 6) {
                System.out.println("Creando caja con 6 capsulas");
                ProducirCapsulas.contenedor = 0;
                System.out.println("Caja creada");
            }
            c.notify();
        }

    }
}
