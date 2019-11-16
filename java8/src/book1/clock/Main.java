package book1.clock;

//import java.lang.Thread;

public class Main {
    public static void main(String[] args) {
//        Thread.sleep(3000);
        int byou = 0;
        int hun = 0;
        int jikan = 0;

        while(true) {

            System.out.println(jikan+"時"+hun+"分"+byou+"秒");

            byou += 1;
            if (byou == 60) {
                hun += 1;

                byou = 0;
            }
            if (hun == 60) {
                jikan += 1;

                hun = 0;
                byou = 0;
            }
            if (jikan == 24) {
                byou = 0;
                hun = 0;
                jikan = 0;
            }
        }

    }



}
