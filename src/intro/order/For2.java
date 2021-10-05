package intro.order;

public class For2 {
    public static void main(String[] args) {
        int[] array ={20,30,10,50,40}; //配列の宣言。5サイズでindexが0～4
    //
        for (int i = 1; i < array.length; i++) { //初期値が1=0なのは、indexが0からだから
            // i＋＋ってのは、iが変化していくだけ（indexが変化してく）で中の値は関係ない

            //配列名.lengthで全て参照！0～４までね。配列のサイズ分参照。APIで存在する。
            System.out.println(array[i]);

        }
    }
}
