package ex2;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

class CalcBmi2 {
    public static void main(String[] args) {

        double height = 1.58;
        double weight = 44.0;
        double bmi = weight / Math.pow(height, 2);
        double tekisei = Math.pow(height, 2) * 22;

        System.out.println(String.format(
                "%.2f %.2f %.2f %.2f ",
                height, weight, bmi, tekisei));

        Random random = new Random(LocalDateTime.now().getSecond());
        int cpu = random.nextInt(4);
        //4種類使える

        Scanner scanner = new Scanner(System.in);
        System.out.println("choice");
        System.out.println("0:goo  1:pa-  2:choki ");
        int player = scanner.nextInt();

        //分岐

        switch (cpu) {
            case 0:
                System.out.println("cpu  goo");
                break;
            case 1:
                System.out.println("cpu pa-");
                break;
            case 2:
                System.out.println("cpu choki");
                break;
            case 3:
                System.out.println("cpu 最☆強");
                break;

        }
        switch (player) {
            case 0:
                System.out.println("you  goo");
                break;
            case 1:
                System.out.println(" player pa-");
                break;
            case 2:
                System.out.println("player choki");
                break;
            default:
                System.out.println("0~2で入力してください");

        }

        if (cpu == 0 && player == 1 || cpu == 1 && player == 2 || cpu == 2 && player == 0) {
            System.out.println("you win");
            System.out.println(cpu == 0 && player == 1);
        } else if (cpu == player){
            System.out.println("あいこ");
        } else {
            System.out.println("you loser");
        }
    }
}