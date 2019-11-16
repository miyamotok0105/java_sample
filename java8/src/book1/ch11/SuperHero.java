package book1.ch11;

public class SuperHero extends Hero {
//    private String name = "みなと";
//    private int hp = 100;

    private boolean flying;

//    public void run() {
//        System.out.println(this.name+"逃げる！");
//    }

    public void fly() {
        this.flying = true;
        System.out.println(super.name+"飛んだ！");
    }

}
