package day8;
// 静的メンバ
public class sample1 {
    
    public static void main(String[] args) {
        day8_Class1 s1,s2;

        // インスタンスの数を表示
        System.out.println("インスタンス数：" + day8_Class1.getNumberOfInstance());
        // インスタンスを生成
        s1 = new day8_Class1(50);// コンストラクタ①を呼び出す
        s2 = new day8_Class1();// コンストラクタ②を呼び出す
        // 値を取得して表示
        System.out.println(s1.getValue());
        System.out.println(s2.getValue());
        // インスタンスの数を表示
        System.out.println("インスタンス数：" + day8_Class1.getNumberOfInstance());
    }
}
