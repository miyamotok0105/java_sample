package oss1.Interface;

//インターフェースの多重継承
//IDog, ICatの二つを継承
//オブジェクトの場合はできない。

// インターフェースの定義
interface IDog2{

    // 抽象メソッド(public abstractは省略可能)
    void methodA(String msg);

    // 定数 (public static finalは省略可能)
    double PI = 3.14;
}

interface ICat2{

    // 抽象メソッド
    void methodB(String msg);
}

// インターフェイスを実装する(今回は多重継承)
class MyClass implements IDog2, ICat2{

    // IDogの抽象メソッドのオーバーライド
    public void methodA(String msg){
        System.out.println("methodA : " + msg);
    }

    // ICatの抽象メソッドのオーバーライド
    public void methodB(String msg){
        System.out.println("methodB : " + msg);
    }
}

public class MainInterface {

    public static void main(String[] args) {
        MyClass my = new MyClass();
        my.methodA("メソッドA");
        my.methodB("メソッドB");
        System.out.println(my.PI);
    }
}