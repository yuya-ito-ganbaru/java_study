package day8;
// 静的メンバもつクラス
public class day8_Class1 {
    // インスタンスフィールド
    private int value = 0;
    // 静的フィールド
    private static int num = 0;

    // コンストラクタ①引数あり
    public day8_Class1(int value) {
        // 引数をインスタンスフィールドに代入
        this.value = value;
        // 静的メンバのインスリメント
        num++;
    }

    // コンストラクタ②引数なし
    public day8_Class1() {
        // 引数つきコンストラクタを呼び出す
        this(100);
    }
    // インスタンスの数を取得
    public static int getNumberOfInstance() {
        return num;
    }
    // インスタンスフィールドを取得
    public int getValue() {
        return this.value;
    }
}
