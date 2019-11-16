package oss1.Inheritance;

// 親クラス(スーパークラス/基底クラス)
class Parent{

    public Parent() {
        System.out.println("Parentのコンストラクタ");
    }

    public void run1() {
        System.out.println("Parent.run1メソッド");
    }

    public void run2() {
        System.out.println("Parent.run2メソッド");
    }

    public void run3() {
        System.out.println("Parent.run3メソッド");
    }
}

// 子クラス(サブクラス/派生クラス)
class Child extends oss1.Inheritance.Parent {

    public Child() {
        // 親クラスのコンストラクタを呼び出す
        // ※定義しなくてもコンパイルの際に暗黙的に挿入される
        super();

        // Childの独自処理
        System.out.println("Childのコンストラクタ");
    }

    // オーバーライド
    public void run2() {
        System.out.println("Child.run2メソッド");
    }

    // オーバーライド
    public void run3() {
        // 親クラスのrun3を呼び出す
        super.run3();

        // Childの独自処理
        System.out.println("Child.run3メソッド");
    }

    // Childの独自メソッド
    public void run4() {
        System.out.println("Child.run4メソッド");
    }
}

public class MainInheritance {

    public static void main(String[] args) {
        oss1.Inheritance.Child child = new oss1.Inheritance.Child();
        child.run1();
        child.run2();
        child.run3();
        child.run4();
    }
}
