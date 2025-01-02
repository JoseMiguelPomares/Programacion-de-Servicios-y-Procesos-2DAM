package Ejercicio8b;

public class Consumidor implements Runnable{

    @Override
    public void run() {
        while (true){
            synchronized (ProducirCapsulas.contenedor){
                while (ProducirCapsulas.contenedor.size() >= 6) {
                    System.out.println("Creando caja con 6 capsulas");
                    for (int i = 0; i < 6; i++) {
                        ProducirCapsulas.contenedor.remove(0);
                    }
                    System.out.println("Caja creada");
                }
                while (ProducirCapsulas.contenedor.size() < 6) {
                    try {
                        ProducirCapsulas.contenedor.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            try {
                Thread.sleep((long) (Math.random()*3000+1000));
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
