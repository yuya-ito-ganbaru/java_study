package day8;
// 静的メンバ
public class sample2 {
    // ガーベージコレクタ
    public sample2() {
        System.out.println("コンストラクタ");
    }
    public void foo() {
        System.out.println("インスタンスメソッド");
    }
    public static void bar() {
        System.out.println("静的メソッド");
    }
    public static void main(String[] args) {
        // ToDo 自動生成されたメソッド・スタブ
        sample2 i = new sample2();
        i.foo();
        /* 様々な静的メソッドの呼び出し */
        // インスタンスからも、静的メソッドを呼べる
        i.bar();
        // クラス名からの呼び出し
        sample2.bar();
        // 同じクラス内なら、クラス名なしで呼び出せる
        bar();
        // ガーベージコレクタの呼び出し
        System.gc();
    }
}
