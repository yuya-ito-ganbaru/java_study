package day4;
// 繰り返し処理
public class sample4 {
    //do〜while文
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 5);
        System.out.println();

        /* while文との違い */
        int a,num;
        num = 1;
        // whileループで実行
        System.out.print("while文で実行:");
        a = 1;
        while (a < num) {
            System.out.print("*");
            a++;
        }
        System.out.println();

        // do〜whileループで実行
        System.out.print("do〜whileで実行:");
        a = 1;
        do {
            System.out.print("*");
            a++;
        } while (a <= num);
        System.out.println();
    }
}
