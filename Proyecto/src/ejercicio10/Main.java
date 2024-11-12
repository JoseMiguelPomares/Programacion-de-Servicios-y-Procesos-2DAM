package ejercicio10;

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Ingrese el directorio al que desea guardar las capturas: ");
        String directorio = myScanner.nextLine();
        System.out.println("Con que frecuencia de segundos quieres hacer las capturas: ");
        int frecuencia = myScanner.nextInt();
        myScanner.nextLine();
        Capturador c = new Capturador(directorio);
        ses.scheduleAtFixedRate(c, frecuencia, frecuencia, TimeUnit.SECONDS);
        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        ses.shutdown();
    }
}
