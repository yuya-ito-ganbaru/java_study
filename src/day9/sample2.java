package day9;
//継承
public class sample2 {
    // オブジェクトクラス
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.toString());
        System.out.println(c.getClass());
        Object o = (Object)c;
        System.out.println(o.toString());
        System.out.println(o.getClass());
    }
    /**
     * Objectクラスの主要メソッド
     * toString : オブジェクトの文字表現を返します。デフォルトでは「java.lang.Object@......」のようにオブジェクトのクラスとそのオブジェクト番号(ハンドル)が返ります。
     * get : 指定した番号の要素を取り出します。
     * equals : 同じ値を保持しているかどうか判定します。オブジェクトの同一比較は、==演算子でできます。
     */
}
