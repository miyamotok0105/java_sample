package book1.ch11;

public class Main {
    public static void main(String[] args) {
        Hero h = new SuperHero();
        h.run();
        ((SuperHero) h).fly();
    }
}
