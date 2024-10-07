package Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner myScan = new Scanner(System.in);
        Thread thread = new Thread(new Contador());

        thread.start();
        if (myScan.nextLine() == "")
            thread.stop();
    }
}
