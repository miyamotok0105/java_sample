package oss1.Object;

class MyClass{

    // メンバ変数
    private String name;
    private int age;

    // コンストラクタ1
    public MyClass() {
        // 未設定の場合はコンストラクタ2を呼び出す
        this("山田太郎", 17);
    }

    // コンストラクタ2
    public MyClass(String name,int age) {
        this.name = name ;
        this.age = age ;
    }

    // プロパティ1(setter)
    public void setName(String name) {
        this.name = name;
    }

    // プロパティ1(getter)
    public String getName() {
        return this.name;
    }

    // プロパティ2(setter)
    public void setAge(int age) {
        this.age = age;
    }

    // プロパティ2(getter)
    public int getAge() {
        return this.age;
    }

    // メソッド
    public void run1() {
        System.out.println("メソッドが実行されました。");
    }

    // 静的メソッド
    public static void run2() {
        System.out.println("静的メソッドが実行されました。");
    }
}

public class MainObject {

    public static void main(String[] args) {
        MyClass my1 = new MyClass();
        MyClass my2 = new MyClass("山田花子",15);

        System.out.println(my1.getName() + " " + my1.getAge() + "才");
        System.out.println(my2.getName() + " " + my2.getAge() + "才");

        my2.setAge(43);
        System.out.println(my2.getName() + " " + my2.getAge() + "才");

        my1.run1();
        MyClass.run2();

    }
}
