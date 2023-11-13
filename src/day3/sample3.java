package day3;
// 条件分岐
public class sample3 {
    // 複雑なif文
    public static void main(String[] args) {
        int dice = (int)(Math.random()*7)+1; //1〜7までの乱数を発生させる
        // サイコロの目を入力
        System.out.println("サイコロの目:" + dice);
        // 値が、サイコロの目の範囲内かどうかを調べる
        if (1 <= dice && dice <= 6) {
            /* ネスト処理 */
            // サイコロの目が、偶数か、奇数かで、処理を分ける
            if (dice == 2 || dice == 4 || dice ==6 || dice % 2 == 0) {
                System.out.println("丁（チョウ）です"); // 偶数なら丁
            } else {
                System.out.println("半（ハン）です"); // 奇数なら半
            }
        } else {
            System.out.println("範囲外の数値です");
        }
        /**
         * 論理演算子
         * ＆、＆＆ : 論理積 AND
         * |、 || : 論理わ OR
         * ! : 否定 NOT
         */
    }
}
