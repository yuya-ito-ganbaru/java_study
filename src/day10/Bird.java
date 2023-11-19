package day10;

// 抽象クラス
public abstract class Bird {
    // 名前フィールド
    private String name;
    // 引数つきコンストラクタ
    Bird(String name) {
        this.name = name;
    }
    // 名前の取得
    public String getName() {
        return name;
    }
    // 鳴く（抽出メソッド）
    abstract void sing();
}
