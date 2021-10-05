package ex2;

import java.util.Scanner;

public class Ex {


    //キーボード入力コード練習
    static String inputString(String a){
        Scanner sc= new Scanner(System.in);
        System.out.println(a);
        return sc.nextLine();



    }


    public static void main(String[] args) {
    String ab = Ex.inputString("文字をうってみて");
    String cd = Ex.inputString("are you ok?");

        System.out.println(ab);
        System.out.println(cd);


    }
}
