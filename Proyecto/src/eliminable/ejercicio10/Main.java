package eliminable.ejercicio10;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ScheduledExecutorService ex = Executors.newScheduledThreadPool(1);

        System.out.println("Dime cada cuantos segundos quieres hacer una captura");
        int seg = scanner.nextInt();
        scanner.nextLine();
        Capturador capturador = new Capturador();
        ex.scheduleAtFixedRate(capturador, seg, seg, TimeUnit.SECONDS);
        ex.shutdown();
    }
}
