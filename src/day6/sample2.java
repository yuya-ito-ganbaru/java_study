package day6;
// クラスとオブジェクト
public class sample2 {
    //複数のインスタンス
    public static void main(String[] args) {
        sampleClass1 s1,s2;
        s1 = new sampleClass1();
        s2 = new sampleClass1();
        // インスタンスs1,s2ごとに、フィールドに違う値を代入
        s1.n = 111;
        s2.n = 222;
        s1.s = "ABC";
        s2.s = "あいう";
        // インスタンスごとにメソッドを呼び出す
        System.out.println(s1.add("DEF"));
        System.out.println(s2.add("えお"));
        s1.showNum();
        s2.showNum();
    }
}
