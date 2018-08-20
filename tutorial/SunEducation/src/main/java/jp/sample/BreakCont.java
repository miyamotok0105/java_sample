package jp.sample;

public class BreakCont {
    public static void main(String args[]) {
        System.out.println("Start...");
        //下のfor文のラベル
        check_point:
        for(int i = 0; i < 3; i++){
            for(int j =0;j<3;j++){
                System.out.println("i : " + i + " j : " + j);
                if(i == 1 && j == 1){
                    //javaではbreakとかループ制御にラベルを指定してる。
                    break check_point;
                }
            }
        }

        System.out.println();
        System.out.println("Continue...");

        check_point2:
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("i: "+ i + " j: "+j);
                if(i==1 &&j==1) {
                    continue check_point2;
                }
            }
        }

        System.out.println("finished!!");
    }

}
