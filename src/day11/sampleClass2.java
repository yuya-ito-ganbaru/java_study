package day11;
//インターフェース
public class sampleClass2 {
    //インターフェースと定数
    public static void main(String[] args) {
        Tank t = new Tank();
        System.out.println(t.getName() + "の武器の名前:" + Tank.WEAPON_NAME);
        System.out.println(t.getName() + "の武器のタイプ:" + Tank.TYPE_NAME);
        System.out.println();
        t.attack();//攻撃
    }
}
