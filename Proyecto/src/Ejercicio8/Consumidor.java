package Ejercicio8;

public class Consumidor implements Runnable{

    @Override
    public void run() {
        System.out.println("HOLA");
        synchronized (ProducirCapsulas.contenedor){
            System.out.println("HOLA 2");
            System.out.println(ProducirCapsulas.contenedor.size());
            while (ProducirCapsulas.contenedor.size() >= 6) {
                System.out.println("Creando caja con 6 capsulas");
                for (int i = 0; i < 6; i++) {
                    ProducirCapsulas.contenedor.remove(i);
                }
                System.out.println("Caja creada");
            }
            try {
                System.out.println("ESPERO");
                ProducirCapsulas.contenedor.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
