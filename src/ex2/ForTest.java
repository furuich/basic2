package ex2;

class ForTest {
    public static void main(String[] args) {

        String[] strings = {"Ground ","Control ","to ","Major ","Tom"};

    for(String st : strings){
        System.out.print(st);
    }
        System.out.println("\n１～１０の階乗します");

    //1~10の階乗をする　PG
    int sum =0;
    for (int i =1; i<=10; i++){
        sum += i;
        System.out.println(i +"回目: "+sum+"  +"+(i+1)+" します");
    }

    }
}
