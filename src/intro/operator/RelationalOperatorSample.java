package intro.operator;

//関係演算子による条件の書き方
public class RelationalOperatorSample {
    public static void main(String[] args) {
        int num = 50;

        //numが0以上である
        System.out.println(num>=0);
        System.out.println(num<=100);

        boolean a = num>=100;//100以上か判断させる

        System.out.println(num %2 == 1); ///numが奇数かどうか判断させる
        System.out.println(num %3 ==0); //numは3の倍数か
        System.out.println(!(num <0 || num > 100));


//0以上100以下
        System.out.println(num >=0 && num <= 100);  //numが0以上かつ100以下


        System.out.println(a);

        if (num>=0){
            System.out.println("numは0以上");
        } else if (num>=100) {
            System.out.println("numは100以下");
        }
    }
}
