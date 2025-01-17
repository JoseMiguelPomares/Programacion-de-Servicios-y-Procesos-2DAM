package eliminable.ejercicio8;

public class Consumidor implements Runnable {
    @Override
    public void run() {
        while (true){
            synchronized (ProducirCapsula.contenedor) {
                while (ProducirCapsula.contenedor.size() >= 6) {
                    for (int i = 0; i < 6; i++) {
                        ProducirCapsula.contenedor.remove(0);
                    }
                    System.out.println("6 Capsulas conumidas");
                }
                while (ProducirCapsula.contenedor.size() < 6){
                    try {
                        ProducirCapsula.contenedor.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
