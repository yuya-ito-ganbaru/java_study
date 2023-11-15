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
    }
}
