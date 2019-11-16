package book1.ch06;

//importすることでFQCNのフルを書かなくて良い。
import book1.ch06.CalcLogic;

public class Calc {

    public static void main() {
        int a = 10; int b = 2;
        //CalcLogic.を入れて呼び出す。
        int total = CalcLogic.tasu(a, b);
        int delta = CalcLogic.hiku(a, b);
        System.out.println(total +" "+ delta);

    }

}
