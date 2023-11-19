package day10;

//すずめクラス
public class Sparrow2 extends Bird {
    // コンストラクタ（引数なし）
    public Sparrow2() {
        //Birdクラスの引数つきコンストラクトを呼び出す
        super("すずめ");
    }
    // すずめが鳴く
    public void sing() {
        System.out.println("チュンチュん");
    }
}
