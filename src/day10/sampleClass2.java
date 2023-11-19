package day10;
//抽象クラス
public class sampleClass2 {
    //抽象クラス
    public static void main(String args[]) {
        Crow2 c = new Crow2();
        Sparrow2 s = new Sparrow2();

        // カラスが鳴く
        System.out.print(c.getName() + " : ");
        c.sing();
        // すずめが鳴く
        System.out.print(s.getName() + " : ");
        s.sing();
    }
    /**
     * 抽象メソッドの定義
     * abstract(戻り値)(メソッド名)(引数);
     */
}
