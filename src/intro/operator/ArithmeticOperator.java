package intro.operator;

public class ArithmeticOperator {
    public static void main(String[] args) {
        //
        int a=5,b=3;
        System.out.println("()");
        System.out.println(a+"+"+b+"="+(a+b));
        System.out.println(a+"-"+b+"="+(a-b));
        System.out.println(a+"*"+b+"="+(a*b));
        System.out.println(a+"/"+b+"="+(a/b));
        System.out.println(a+"%"+b+"="+(a%b));

    //
        int e=1,f =2;
        System.out.println("sanzyutu");
        System.out.println("-e:"+-e);//反転。-1に-つけると＋になる
        System.out.println("e:"+e++);//1加算　後置。表示後に＋１　
        System.out.println("f:"+ ++f);//1加算　前置。＋１して表示
        System.out.println("e++ + ++f:"+(e++ + ++f));//2+4
        System.out.println("e:"+e);// 前回表示後に加算されてるので⇒３
        System.out.println("f:"+f);//前回から変更がないのでそのまま⇒４

        //ワイドニング＝型自動変換
        double c= 5;
        int d=3;
        System.out.println(c+"+"+d+"="+(c+d));
        System.out.println(c+"-"+d+"="+(c-d));
        System.out.println(c+"*"+d+"="+(c*d));
        System.out.println(c+"/"+d+"="+(c/d));
        System.out.println(c+"%"+d+"="+(c%d));

        //ナローイング 明示的なキャストが必要
        int g;
        double h= 10;
        g = (int)h;//

        //代入演算子
        int i,j;
        i = j = 10;
        System.out.println("i:" + i);//10
        System.out.println("j:" + j);

        //複合代入
        int x = 1;
        System.out.println(x+= 1);//左辺に加算して代入⇒２
        System.out.println(x*= 10);//ｘ＝２なんで、⇒20




    }
}
