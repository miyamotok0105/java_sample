package oss1.Interface;


// インターフェースの定義
interface IDog{
    void methodA(String msg);
}

// インターフェースの継承
interface IRabbit extends IDog{
    void methodB(String msg);
}

// インターフェイスを実装する
class MyClass2 implements IRabbit{

    public void methodA(String msg){
        System.out.println("methodA : " + msg);
    }

    public void methodB(String msg){
        System.out.println("methodB : " + msg);
    }
}

public class MainInterface2 {

    public static void main(String[] args) {
        MyClass2 my = new MyClass2();
        my.methodA("メソッドA");
        my.methodB("メソッドB");
    }
}
