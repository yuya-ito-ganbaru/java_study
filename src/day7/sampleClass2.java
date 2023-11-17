package day7;

public class sampleClass2 {
    // コンストラクタ
    public sampleClass2() {
        System.out.println("コンストラクタ");
    }
    // privateメソッド
    private void method1() {
        System.out.println("method1(private)");
    }
    // publicメソッド①
    public void method2() {
        System.out.println("method2(public)");
    }
    // publicメソッド②
    public void method3() {
        // privateメソッドの呼び出し
        method1();
        System.out.println("method3(public) : num = " + this.num);
    }
    // privateフィールド
    private int num = 1;

    /**
     * アクセス修飾子
     * public : パブリック : どこからでも呼び出せる
     *  default : デフォルト : アクセス修飾子が省略されている場合。同じパッケージ内からしか呼び出せない。
     * protected : プロテクテッド : 同じパッケージか、そのサブクラスからしか呼び出せない
     * private : プライベート : 同じクラス内からしか呼び出せない
     */
}
