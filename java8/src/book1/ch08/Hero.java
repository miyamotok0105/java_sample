package book1.ch08;

public class Hero {
    private String name;
    int hp;
    static int money;

    Hero (){
//        System.out.println("引数なし生成！！");
    }

    Hero (String name){
        this.name = name;
//        System.out.println("引数あり生成！！");
//        System.out.println(this.name+"くん！");
    }

    //getter, setter
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static void setRandamMoney() {
        Hero.money = (int) (Math.random()*1000);
    }

    void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は眠って回復した");
    }

    void sit(int sec){
        this.hp += sec;
        System.out.println(this.name + "は、"+sec+"秒座った");
        System.out.println("HPが"+sec+"ポイント回復した");
    }

}
