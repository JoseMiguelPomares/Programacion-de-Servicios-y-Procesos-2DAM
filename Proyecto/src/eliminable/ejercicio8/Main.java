package eliminable.ejercicio8;

public class Main {
    public static void main(String[] args) {

        Thread t = new Thread(new ProducirCapsula("Cafe", 1));
        Thread c = new Thread(new Consumidor());
        t.start();
        c.start();
    }
}
