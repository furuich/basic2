package ex;

public class MaxSample {
    public static void main(String[] args) {
        int[] array = {20, 30, 10, 50, 40}; //
        int max =array[0];
        int min = array[0];//仮の最大値。定石だよん。まず最初の値をとる。
        // 20とまｘを比較。それが大きければ値を更新。一つずつ比較していき、変数ｍaxより大きければ代入する
        //for でifを使う
        //変数maxが変わっていく
        for (int num:array) {
            if (max < num)   //{}内が1行しかない時、{}はなくてもいい。
                // elseがない（falseのとき何もしない）ので1行でおｋ
                max = num;

                if (min > num) {
                    min = num;
                }
            }
            System.out.println(min);
            System.out.println(max);
    }
            //maxと配列要素を比較
            //max＜array[i]なら 更新。maxに代入

        //最大値表示
    }

