package book1.ch08;

import book1.ch08.Hero;

public class Main {
    public static void main(String[] args) {
//        Hero.setRandamMoney();
        System.out.println(Hero.money);
        Hero h = new Hero();
//        h.money += 100;
        Hero h2 = new Hero("みなと");
//        h2.money += 200;
//        System.out.println("静的");
//        System.out.println(h.money);
//        System.out.println(Hero.money);
        h.setName("みなと１");
        System.out.println(h.getName());
    }

}
