package jp.sample;

public class MyArray {
    public static void main(String args[]) {
        int i[] = new int[3];
        char[] c = {'A', 'B', 'C'};

        i[0] = 0; i[1] = 1; i[2] = 2;

        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println();

        System.out.println(c[0]);
        System.out.println(c[1]);

        System.out.println("size of i[] :"+i.length);
        System.out.println("size of c[] :"+c.length);

    }
}
