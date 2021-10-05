package ex;

//forで配列の合計を求め、表示する
public class ExFor {
    public static void main(String[] args) {
        int[] array ={20,30,10,50,40};
        int sum=0;
        for (int i = 0 ; i < array.length ; i++) {

            sum+=array[i];

        }
        System.out.println(sum);
        System.out.println((double) sum/ array.length); //平均を求める。.length（＝5）を使うとスマートにいける。
    }
}
