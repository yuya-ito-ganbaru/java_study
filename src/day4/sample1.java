package day4;
// 繰り返し処理
public class sample1 {
    //for文
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        /**
        * インクリメント・デクリメント
        * i++ : インクリメント（後置） 変数の値を1増加させる
        * ++i : インクリメント（前置） 変数の値を1増加させる
        * i = i + 1, i += 1
        * i-- : デクリメント（後置） 変数の値を1減少させる
        * --i : デクリメント（前置） 変数の値を1減少させる
        * i = i - 1, i -= 1
        */
        int a1=1,b1=1,c1=1,d1=1;
        int a2,b2,c2,d2;
        a2 = a1++;
        b2 = ++b1;
        c2 = c1--;
        d2 = --d1;
        System.out.println("a1 =" + a1 + " b1 = " + b1 + " c1 = " + c1 + " d1 = " + d1);
        System.out.println("a2 =" + a2 + " b2 = " + b2 + " c2 = " + c2 + " d2 = " + d2);

        //①変数の値を1を増加させる。5になると、ループを抜ける。
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        //②-2から2まで、値を1つずつ増加させる。
        for (int i = -2; i <= 2; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        //③変数の値を2づつ増加させる
        for (int i = 0; i < 10; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println();
        //④変数の値を1減少させる。1になると、ループを抜ける。
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        //⑤2から-2まで、値を1つずつ減少させる。
        for (int i = 2; i >= -2; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        //⑥変数の値を3づつ減少させる。0になると、ループを抜ける
        for (int i = 12; i > 0; i-=3) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
