package intro.order;

import java.time.LocalDateTime;   //API。日付取得
import java.util.Random;  //乱数発生

//分岐命令　if　その１☆
public class If1 {
    public static void main(String[] args) {
        //奇遇判定
        Random random= new Random(LocalDateTime.now().getSecond()); //クラス型変数？にnewでインスタンス生成して格納。中身はAPIで取得した今日の日付の秒数
        int num= random.nextInt(100); //0~99までの乱数発生
        if (num%2 == 0){  // num/2の余りが0なら…つまり偶数なら
            //偶数（true）
            System.out.println(num + "は偶数です");
        }else{
            //奇数（false）
            System.out.println(num + "は奇数です");
        }

    }
}
