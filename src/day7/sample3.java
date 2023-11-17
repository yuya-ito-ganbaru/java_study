package day7;

public class sample3 {
    public static void main(String[] args) {
        // 引数つきのコンストラクタの呼び出し
        sampleClass4 s = new sampleClass4("HelloWorld");
        // sampleClass4 s = new sampleClass4();
        // numberのセッターで、値を設定
        s.setNumber(100);
        // ゲッターで値を呼び出し、内容を表示
        System.out.println(s.getNumber());
        System.out.println(s.getStr());
    }
}
