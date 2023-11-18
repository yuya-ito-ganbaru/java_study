package day9;
//継承
public class sample1 {
    // 継承の実相
    public static void main(String[] args) {
        // ToDo 自動生成されたメソッド・スタブ
        Car c = new Car();

        // 燃料補給
        c.supply(10);
        // 移動
        c.move();
        // 移動
        c.move();
        Ambulance a = new Ambulance();
        a.supply(10);
        a.move();
        a.sevePeople();
    }
}
