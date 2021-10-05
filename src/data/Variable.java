package data;

public class Variable {
    public static void main(String[] args) {
//        整数型
    byte b=10;
    short s =32000;
    int i=100;
    long l=10000;

//    浮動小数点数型
        float f =12.34f;
        double d=123.456;

//        文字型
        char c1='A';
        char c2='\u0041'; //Unicode

//        真偽型
        boolean boo1=true; //true or false

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(boo1);

      double x =b+s+i+l+f+d;

        System.out.println(x);
        System.out.println(x*2.225);
        System.out.println(x/s);

        if (100<x){
            System.out.println(false);

        }

    }
}
