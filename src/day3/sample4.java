package day3;
// 条件分岐
public class sample4 {
    // switch文
    public static void main(String[] args) {
        // 標準出力
        int num = 1; //整数値(色々変更してみて)
        switch(num) {
            case 1:
            System.out.println("one"); //numが1だった場合の処理
            break;
            case 2:
            System.out.println("two"); //numが2だった場合の処理
            break;
            case 3:
            System.out.println("three"); //numが3だった場合の処理
            break;
            default:
            System.out.println("不適切な値です"); //それ以外の値が入力された場合の処理
        }
    }
}
