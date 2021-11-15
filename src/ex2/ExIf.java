package ex2;

import java.util.Arrays;
//テスト対策サンプル、相互書き換え
class ExIf {
    public static void main(String[] args) {

        int[] array = {10, 40, 30, 35, 5};
        System.out.println(Arrays.toString(array));

        //For～if
        for (int i = 0; i < array.length; i++) {
            if (array[i]  ==10) {
                System.out.println(i + "　番目は10");
            } else if (array[i] == 20) {
                System.out.println(array[i] + "番目は２０");
            } else if (array[i] == 30) {
                System.out.println(i + "番目は3０");
            }else{
                System.out.println( i +"番目はそれ以外");
            }
        }
    //elseに来たら、もうその時点で振り分けられてるので
        // 、i＜２０　＆＆　i＜１０とかは書かんでいい

        System.out.println("\nswitch版");
    //switch 版・等価比較しかできないので条件式とかは書けない
        //おみくじPGとかつくれるやつ

        for (int num :array){
        switch (num){
            case 10 :
                System.out.println(num + "は10");
                break;
            case 20:
                System.out.println(num + " 20");
                break;
            case 5 :
                System.out.println(num +"　は5");
                //breakしないと…
                //defaultも実行される
            default:
                System.out.println(num + "はどれでもない");
        }
        }
        System.out.println("\nwhile");

        int i=0;
        int sum =0;

        while(i < array.length){
            sum += array[i];
            System.out.println( array[i] + " 足しました");
        i++;
        }
        System.out.println("合計： "+sum);
        System.out.println("平均：　"+(double)sum/ array.length);
    }
//array[i]==配列の要素
    //i == 配列のインデックス　（何番目）
    //平均を出す場合は、double型にキャストするといいよ

    }



