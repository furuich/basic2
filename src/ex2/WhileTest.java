package ex2;

class WhileTest {
    public static void main(String[] args) {
        int[] ints = {10, 20, 30, 40};

        //☆合計値、iも初期化しておく
        int sum = 0;
        int i = 1;

        while (i <= 5) {
            System.out.println(i + " 回目 (while)");
        i++;
        }

        int i2 = 1;
        do {
            System.out.println("do " + i2 + "回目");
            i2++;
        } while (i2 <= 5);{
            System.out.println("do while " + i2 + "回目");
        i2++;



        }
    }
}
