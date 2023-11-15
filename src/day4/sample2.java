package day4;
// 繰り返し処理
public class sample2 {
    //for文 2重ループ
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                int k = i + j;
                System.out.print(i + " + " + j + " = " + k + " ");
            }
            System.out.println();
        }
    }
}
