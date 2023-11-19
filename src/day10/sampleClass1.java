package day10;
//抽象クラス
public class sampleClass1 {
    //類似する概念の集約
    public static void main(String args[]) {
        //カラスクラス
        Crow1 c = new Crow1();
        //すずめクラス
        Sparrow1 s = new Sparrow1();

        // カラスが鳴く
        System.out.print(c.getName() + " : ");
        c.sing();
        // すずめが鳴く
        System.out.print(s.getName() + " : ");
        s.sing();
    }
}
