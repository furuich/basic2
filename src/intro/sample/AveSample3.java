package intro.sample;

import java.util.Arrays;

public class AveSample3 {
    public static void main(String[] args) {
       //Whileを使った平均値

        //整数型配列の宣言
        int[] array = {20,30,10,50,40};

        //合計を保存する変数の宣言
        int sum = 0;
        int i = 0;

        //平均を保存する変数の宣言
        double ave = 0;

        //反復処理をしつつ合計を求める
        while(i < array.length) {
            sum += array[i];//合計に加算
            i++;
        }

        //配列の内容を表示
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Arrays.html#toString(int%5B%5D)
        System.out.println(Arrays.toString(array));

        //平均を求める
        ave = (double) sum / array.length;//double型へキャストしないと整数になります

        //平均の表示
        System.out.println("平均:" + ave);

    //for　i　を使った平均値

        //整数型配列の宣言
        int[] array2 = {20,30,10,50,40};

        //合計を保存する変数の宣言
        int sum2 = 0;

        //平均を保存する変数の宣言
        double ave2 = 0;

        //反復処理をしつつ合計を求める
        for (int i2 = 0; i2 < array2.length; i2++) {
            sum2 += array[i2];//合計に加算
        }

        //配列の内容を表示
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Arrays.html#toString(int%5B%5D)
        System.out.println(Arrays.toString(array2));

        //平均を求める
        ave2 = (double) sum2 / array2.length;//double型へキャストしないと整数になります

        //平均の表示
        System.out.println("平均:" + ave2);

    //拡張forを使って平均値を求める
        //整数型配列の宣言
        int[] array3 = {20,30,10,50,40};

        //合計を保存する変数の宣言
        int sum3 = 0;

        //平均を保存する変数の宣言
        double ave3 = 0;

        //反復処理をしつつ合計を求める
        for (int i3 = 0; i3 < array3.length; i3++) {
            sum3 += array3[i3];//合計に加算
        }

        //配列の内容を表示
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Arrays.html#toString(int%5B%5D)
        System.out.println(Arrays.toString(array3));

        //平均を求める
        ave3 = (double) sum3 / array3.length;//double型へキャストしないと整数になります

        //平均の表示
        System.out.println("平均:" + ave3);



    }
}

