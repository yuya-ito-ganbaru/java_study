package day6;
// クラスとオブジェクト
public class sample1 {
    //オブジェクト指向
    public static void main(String[] args) {
        // インスタンスの生成
        sampleClass1 s = new sampleClass1();
        s.n = 100; // フィールドnに値を代入
        s.s = "Hello"; // フィールドsに値を代入
        int ans = s.add(1,2); // メソッドadd()を呼び出し
        String str = s.add("World"); // メソッドadd()を呼び出し
        System.out.println(ans); // 呼びだし結果の表示
        System.out.println(str); // 呼びだし結果の表示
        s.showNum(); // メソッドshowNum()を呼び出し
    }
}
