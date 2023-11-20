package day14;

public class sample3 {
    
    public static void main(String[] args) {
        // ToDo 自動生成されたメソッド・スタブ
        try {
            // 故意に例外を発生させる
            throw new sampleException("自作の例外のサンプル");
        } catch (sampleException e) {
            e.printStackTrace();
        }
    }
}
