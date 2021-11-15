package intro.sample;

public class DoubleLoop {
    public static void main(String[] args) {
        //二重ループｇ
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},   //3*3の正方形の配列
                {7, 8, 9}
        };
        System.out.println(array[0][2]); //0行目の2（0～なんで３番目ね）⇒3
        System.out.println(array[2][0]);//2行目0番列
        for (int i = 0; i < 3; i++) {  //
            for (int j = 0; j < 3; j++) {
                System.out.println(array[j][i]);
            }

        }
        char array1[][] = {
                {'あ', 'い', 'う', 'え', 'お'},
       //         {'か', 'き', 'く', 'け', 'こ'};
   };


    }
}
