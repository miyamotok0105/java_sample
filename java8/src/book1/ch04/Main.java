package book1.ch04;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        hello2("高橋", 2);
//        System.out.println(hello3("鈴木"));
//        System.out.println(add(1,2));
//        double d1 = 1.0;
//        double d2 = 2.0;
//        System.out.println(add(1.0,2.0));
        int[] array = {1,2};
        add(array);


        for (int element : array) {
            System.out.println(element);
        }

    }


    public static int add(int x, int y) {
        return x+y;
    }
    public static double add(double x, double y) {
        return x+y;
    }
    public static void add(int[] array) {
        array[0] = array[0] +1;
        array[1] = array[1] +1;
//        int sum = 0;
//        for (int element : array) {
//            element = element + 1;
////            sum += element;
//        }
//        sum *= 2;
//        return sum;
    }




    //参照渡し

    public static void hello() {
        System.out.println("hello!");
    }

    //引数
    public static void hello2(String name, int num) {
//        IntStream stream = IntStream.of(123, 456);
//        IntStream.range(0, 10).forEach(i -> System.out.println("Java!"));
//        for (val : range(num))
        for (int i =  0; i < num; i++){
            System.out.println("hello!"+name+"さん");
        }
    }

    //戻り値、返り値
    public static String hello3(String name) {
        return name+"さん。おはよう。";
    }


}