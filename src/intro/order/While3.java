package intro.order;

import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in); //Scannarクラスを利用。入力用インスタンス
        System.out.println("passを入力してください");
        String str = in.nextLine(); //入力受付。strでString型の入力をStringで返してくれる（戻ってくる）のでStringで受け取ってる
        // nextLine()のかっこは何も渡してないってこと？

        while (!"cat".equals(str)){  //”　”と等しくない場合、という意味。イコールズメソッド。
            //public boolean equals​(Object anObject)
            //”この文字列と、指定されたオブジェクトを比較”します。
            // ”　”＝＝主語と、（　）＝＝述語が一致するか＝＝動詞、メソッド。。”！で否定（論理演算）”なので、一致しないとき
            // ”引数がnullではなく”、このオブジェクトと同じ文字シーケンスを表すStringオブジェクトである場合にだけ、結果は trueになります。
            //主語が逆になったら、いきなり不確定から始まる（もしstrがNULLだったら、不成立になるのでメソッドが使えなくなる..エラーになる）ので使わないこと
            //比較したいもの（正解）を先に書こう

            System.out.println("ちがうんだが");
            str = in.nextLine();
        }
        System.out.println("おｋ");
    }

}
