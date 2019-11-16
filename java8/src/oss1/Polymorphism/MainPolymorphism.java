package oss1.Polymorphism;

//多態性：オブジェクトで同系列の別の型に属する事が可能である事。
//継承関係にあれば型をざっくり捉えられる。
//子インスタンスは親インスタンスに入る。

abstract class Animal{
    public abstract void run();
}

class Dog extends Animal{
    public void run() {
        System.out.println("Dog.runが呼び出されました。");
    }
}

class Cat extends Animal{
    public void run() {
        System.out.println("Cat.runが呼び出されました。");
    }

    // Catの独自メソッド
    public void nail() {
        System.out.println("Cat.nailが呼び出されました。");
    }
}

public class MainPolymorphism {

    public static void main(String[] args) {
        Animal obj1 = new Dog();
        Animal obj2 = new Cat();

        obj1.run();
        obj2.run();

        // obj2がCatクラスならば
        if (obj2 instanceof Cat) {
            // Catクラスに型変換を行い、Catクラスのnailメソッドを呼び出す
            ((Cat)obj2).nail();
        }
    }
}

