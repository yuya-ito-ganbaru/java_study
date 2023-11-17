package day7;

public class sampleClass4 {
    // int型のフィールド(privateで隠蔽されている)
    private int number = 0;
    // string型のフィールド(privateで隠蔽されている)
    private String str = "";
    // コンストラクタ(引数つき)
    public sampleClass4(String str) {
        this.str = str;
    }
    // number変数のセッター
    public void setNumber(int number) {
        this.number = number;
    }
    // number変数のゲッター
    public int getNumber() {
        return this.number;
    }
    // str変数のゲッター
    public String getStr() {
        return this.str;
    }
}
