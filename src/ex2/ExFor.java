package ex2;
import java.util.Scanner;

public class ExFor {
    public static void main(String[] args) {
        char[] array={'A','A','K','v','h','K'};

        char max=array[0];
        char min=array[0];

        for (char st:array) {
            if (max < st){
                max=st;
            }

        if (min > st){
            min=st;
        }
        }
        System.out.println(max);
        System.out.println(min);

        //以下オリジナル。入力された言葉（scanner）を配列要素ないで検索して表示したい（if？すぃｔｃｈ？）

    char[] array2 ={'A','b','g','K'};

    char thing=array2[0]; //比較対象



    for (char need:array2) {
            if (need==thing);
        System.out.println(thing+"同じのあったよ");

        }
    }
}
