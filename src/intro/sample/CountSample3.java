package intro.sample;

import java.util.Arrays;

public class CountSample3 {
    public static void main(String[] args) {

       //条件にあった個数を数える
        //while

        //整数型配列の宣言
        int[] array = {-10,15,0,30,-20};

        //カウントを保存する変数の宣言
        int count = 0;
        int i= 0;

        //反復処理をしつつ０以上の数の個数を数える
        while ( i < array.length) {
            //配列の要素が正の数ならカウントを増やす
            if (array[i] >= 0) count++; //0以上の数ならcountに１加算
            i++; //index を１加算
        }

        //配列の内容を表示
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Arrays.html#toString(int%5B%5D)
        System.out.println(Arrays.toString(array));

        //条件に一致したデータの数を表示
        System.out.println("0以上のデータの個数:" + count);


        //for i
        //反復処理をしつつ０以上の数の個数を数える
        for (int i2 = 0; i2 < array.length; i2++) {
            //配列の要素が正の数ならカウントを増やす
            if (array[i2] >= 0) count++;
        }

        //配列の内容を表示
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Arrays.html#toString(int%5B%5D)
        System.out.println(Arrays.toString(array));

        //条件に一致したデータの数を表示
        System.out.println("0以上のデータの個数:" + count);


    //拡張for
        //反復処理をしつつ０以上の数の個数を数える
        for (int value:array) {
            //配列の要素が正の数ならカウントを増やす
            if (value >= 0) count++;
        }

        //配列の内容を表示
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Arrays.html#toString(int%5B%5D)
        System.out.println(Arrays.toString(array));

        //条件に一致したデータの数を表示
        System.out.println("0以上のデータの個数:" + count);



    }

    }


