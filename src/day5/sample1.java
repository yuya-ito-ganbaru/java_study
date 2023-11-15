package day5;
// 配列変数
public class sample1 {
    // 配列変数
    public static void main(String[] args) {
        double one,two,three;
        double sum,avg; // 合計数、平均値を入れる変数
        // 変数の代入
        one = 1.2;
        two = 3.7;
        three = 4.1;
        System.out.println(one + " " + two + " " + three);
        // 合計値の計算
        sum = one + two + three;
        // 平均値の計算
        avg = sum / 3.0;
        System.out.println("合計値:" + sum);
        System.out.println("平均値:" + avg);

        /* 変数を配列で処理 */
        /*
         * 配列の宣言
         * (変数の型名)(変数名)[] = new(変数の型名)[配列の数]
         * (変数の型名)[](変数名) = new(変数の型名)[配列の数]
         */
        double[] d = new double[3];
        double sum1,avg1; // 合計数、平均値を入れる変数
        // 値を代入
        d[0] = 1.2;
        d[1] = 3.7;
        d[2] = 4.1;
        sum1 = 0.0;
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
            sum1 += d[i];
        }
        System.out.println();
        avg1 = sum1 / 3.0;
        System.out.println("合計値:" + sum1);
        System.out.println("平均値:" + avg1);
    }
}
