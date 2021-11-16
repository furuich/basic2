package ex2;

class TestBC {
    public static void main(String[] args) {

        char[] chars = {'A', 'B', 'C'};

        char ch;
        int i = 0;

        do {
            switch (chars[i]) {
                case 'A':
                    System.out.println(" A ");
                    break;
                case 'B':
                    System.out.println(" B ");
                    break;
                default:
                    System.out.println("default");
            }
            i++;
        } while (i < chars.length);

        String[] strings = {"there", "is", "star", "man?"};

        //break ラベル
        for (String st : strings) {
            if (st.equals("star")) {
                break;
            }
            System.out.println(st);
        }
//break ラベル
        ext:

        for (char c : chars) {
            System.out.println(c);
            if (c == 'B') ;{
                System.out.println("Bを踏みました。終了します\n");
                break ext;
            }
        }
        //continue
        for (int i2 = 1; i2 <= 5; i2++){
            for (int j2 =1; j2 <= 5 ; j2++) {
                System.out.println(i2 * j2);
                if (((i2 * j2) % 3) == 0) continue;
                System.out.println("/");
            }
                }

    char a = '\u0000';
        char b = '\uffff';
        char c = '\u0021';
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        boolean b1 = false, b2= true;
        if(!((b1&&b2)||b2)){ //!を付けると、条件が成立しない時に実行になる
            System.out.println("    ");
        }else{
            System.out.println("   bbb");
        }

    }
        }







