package ex;

import java.util.Scanner;

public class CalcBmi {
    /**
     * 実数の入力メソッド
     * @param message String 表示メッセージ
     * @return double 入力された値
     */

    static double inputDouble(String message) {
        Scanner scanner = new Scanner(System.in);//キーボード入力をするインスタンスを作成
        System.out.println(message);
        return scanner.nextDouble();//入力された値をdouble型で返す
    }



    public static void main(String[] args) {
        //入力操作
        double him = inputDouble("身長を入力してください（単位 m）");
        double kg = inputDouble("体重を入力してください（単位 kg）");

        double hims=Math.pow(him,2);
        double bmi =Math.round(((kg/hims)*10)/10);
        double te =Math.round(((hims*22)*10)/10);




        System.out.println("あなたの身長は"+him+"mです。\n体重は"+kg+"ですね");
        System.out.println("BMIは"+bmi+"です。\n適正体重は"+te+"です。\n");
        System.out.println("作者からひとこと");

        int a =0;
//日本肥満学会
        if (bmi<18.5) {
            System.out.println("やせすぎですよ！");
            a += 1;
        } else if (bmi<25) {
            System.out.println("普通ですね");
            a+=2;
        } else if (bmi<30){
            System.out.println("ちょっとダイエットしませんか？");
            a +=3;
        } else if(bmi<35){
            System.out.println("肥満2度です。お気を付けて");
            a+=4;
        } else if (bmi<40){
            System.out.println("肥満3度ですね。痩せましょう");
            a+=5;
        } else {
            System.out.println("!danger! 肥満4度です！");
        }

        //WHO基準
        if (bmi<16){
            System.out.println("やせすぎ");
        }else if (bmi<17){
            System.out.println("やせ");
        }

        switch (a){
            case 1:
                System.out.println("この");
            case 2:
                System.out.println("メッセージは");
            case 3:
                System.out.println("表示");
                case 4:
                System.out.println("されません");
            case 5:
                System.out.println("1");
            default:
                System.out.println("ドーーン");

        }


        }

        }
