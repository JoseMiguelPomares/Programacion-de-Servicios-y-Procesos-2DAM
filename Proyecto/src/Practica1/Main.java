package Practica1;

public class Main {
    Thread c1 = new Thread(() -> new Carril().run());
    Thread c2 = new Thread(() -> new Carril().run());
    Thread c3 = new Thread(() -> new Carril().run());
    Thread c4 = new Thread(() -> new Carril().run());
}
