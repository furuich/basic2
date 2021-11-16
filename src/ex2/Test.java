package ex2;

class Test {
    public static void main(String[] args) {
        //書き換え練習
        int[] array = {10,30,40,50};

        //for
        int sum=0;
        for (int i = 0; i < array.length; i++ ) {
            sum += array[i];
        }
        System.out.println(sum);
            //拡張for
        int sum2 =0;
        for (int num :array){
            sum2 += num;
        }
        System.out.println(sum2/(double)array.length);

        //while
        int i2 = 0;
        int sum3 =0;

        while(i2 < array.length){
            sum3 += array[i2];
            i2++;
        }
        System.out.println(sum3);

        //do while
        int i3 = 0;
        int sum4 =0;

        do {
            sum4 +=array[i3];
            i3++ ;

        }while(i3 < array.length); //do while の時、条件式の後ろに　;　をつける

        System.out.println("doで　"+sum4);

        //if
        if (array[0] < array[1]){
            System.out.println(array[0] + " < " + array[1]);
        }else{
            System.out.println(array[0] + " > " + array[1]);
        }

        //switch
        int num = array[0];

        switch (num){
            case 10:
                System.out.println("\narray[0]は１０");
                break;
            default:   //　==elseみたいなもん
                System.out.println("あとは知らん");
                break;

        }
        //組み合わせ

        //for if
        int max = array[0];
        for (int i4= 0;i4 < array.length; i4++){
            if (max < array[i4]){
                max = array[i4] ;
            }
        }
        System.out.println(max);

        //do while ~ if
        int i5 = 0;
        int max2 = array[0];

        do {
            if (max2 < array[i5]){
                max2 = array[i5];
            }
            i5++;
        }while(i5 < array.length);

        System.out.println(max2);



        for (int num2 : array){
            switch(num2){
                case 10 :
                    System.out.println(" 10 ");
                break;
                    case 20 :
                    System.out.println(" 20 ");
                    break;
                default:
                    System.out.println(" ^ u ^  ");

            }
        }

    }
}
