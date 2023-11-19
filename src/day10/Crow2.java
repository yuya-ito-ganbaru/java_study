package day10;

//カラスクラス
public class Crow2 extends Bird {
    // コンストラクタ（引数なし）
    public Crow2() {
        //Birdクラスの引数つきコンストラクトを呼び出す
        super("カラス");
    }
    //カラスが鳴く
    public void sing() {
        System.out.println("カーカー");
    }
}
