package intro.order;

public class For3 {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40};//配列の宣言
        int sum = 0;//合計の初期化
        for (int value:array) {
            sum += value;//配列の内容を合計に加算
        }
        System.out.println(sum);//合計の出力
    }
}
