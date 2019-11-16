package oss1.Abstract;

//Javaのクラスは多重継承ができない。インターフェースは多重継承できる。

//抽象クラス
abstract class Parent{

    // 抽象メソッド(処理は定義しない)
    public abstract void run(String str);

    // 通常メソッド
    public void normal(){
        System.out.println("抽象クラスの通常メソッド");
    }
}

//子クラス(サブクラス)
class Child extends Parent{

    // オーバーライド
    public void run(String str) {
        System.out.println(str);
    }
}

public class MainAbstract {

    public static void main(String[] args) {
        Child child = new Child();
        child.run("プチモンテ");
        child.normal();
    }
}