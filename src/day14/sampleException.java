package day14;
//簡単な例外クラスのサンプル
public class sampleException extends Exception {
    // シリアルバージョン番号
    private static final long serialVersionUID = 1L;

    // コンストラクタ
    public sampleException (String message) {
        super(message);
    }
}
