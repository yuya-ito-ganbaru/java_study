package day7;
// アクセス指定子とカプセル化
public class sample1 {

    public static void main(String[] args) {
        sampleClass2 s = new sampleClass2();
        // method1()は、privateなので、外部からアクセスできない。
        // s.method1();
        // method2呼び出し
        s.method2();
        // method3呼び出し
        s.method3();
        // numは、privateフィールドなので、外部からアクセスできない。
        // s.num = 1;
    }
}
