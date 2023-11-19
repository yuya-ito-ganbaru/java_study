package day10;
//抽象クラス
public class sample3 {
    //抽象クラスとしてインスタンスを持つ
    public static void main(String args[]) {
        // Birdクラスの変数の配列を生成
        Bird b[] = new Bird[2];
        // b[0]に、Crow2クラスのインスタンスを生成
        b[0] = new Crow2();
        // b[1]に、Sparrow2クラスのインスタンスを生成
        b[1] = new Sparrow2();
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i].getName() + " : ");
            b[i].sing();
        }
    }
}
