package day2;

public class sample {
    /**
     * @param args
     */
    public static void main (String[] args) {
        System.out.println("<------- 練習1 ------->");
        System.out.print(5 + " + " + 2 + " = ");
        System.out.println(5+2);//足し算
        System.out.print(5 + " - " + 2 + " = ");
        System.out.println(5-2);//引き算
        System.out.print(5 + " * " + 2 + " = ");
        System.out.println(5*2);//掛け算
        System.out.print(5 + " / " + 2 + " = ");
        System.out.print(5/2);//割り算
        System.out.print("余り");
        System.out.println(5%2);//余剰
        System.out.println("ABC"+"DEF");
        System.out.println("答え:"+3);
        // " + " 足し算の演算子
        // " - " 引き算の演算子
        // " * " 掛け算の演算子
        // " / " 割り算の演算子
        // " % " 剰余（じょうよ）演算子。割り算の余り
        System.out.println("<------- 練習2 ------->");
        // 変数 //
        int a; // 変数の制限
        int b = 3; // 初期化と代入を同時に行う
        int add,sub; // 複数の変数を同時に宣言
        double svg; // int以外の変数を宣言
        a = 6; // 代入（最初に値を入れるので、"初期化"と言う）
        add = a + b; // a,bの和を求める
        sub = a - b; // a,bの差を求める
        svg = (a + b) / 2.0; // a,bの平均値を求める
        System.out.println(a + " + " + b + " = " + add);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + " と " + b + " の平均値は " + svg);
        // データ型 //
        /*
         * boolean : true or false
         * char : 16ビットUnicode文字 ¥u0000〜¥uFFFF
         * byte : 8ビット整数 -128〜127
         * short : 16ビット整数 -32768〜32768
         * int : 32ビット整数 -2147483648～2147483647
         * long : 64ビット整数 -9223372036854775808～9223372036854775807
         * float : 32ビット単精度浮動小数点
         * double : 64ビット倍精度浮動小数点
         */
        System.out.println("<------- 練習3 ------->");
        // 使用する変数の定義 //
        int a1=2,b1=2,c1=2,d1=2; //変数の宣言(1)
        int a2=2,b2=2,c2=2,d2=2; //変数の宣言(2)
        // 普通の演算による計算と代入
        a1 = a1 + 1;
        b1 = b1 - 1;
        c1 = c1 * 2;
        d1 = d1 / 2;
        // 代入演算による計算
        a2 += 1;
        b2 -= 1;
        c2 *= 2;
        d2 /= 2;
        System.out.println("a1=" + a1 + " b1=" + b1 + " c1=" + c1 + " d1=" + d1);
        System.out.println("a2=" + a2 + " b2=" + b2 + " c2=" + c2 + " d2=" + d2);
        // 代入演算子
        /**
         * += : a += 1 : a = a + 1
         * -= : a -= 1 : a = a - 1
         * *= : a *= 2 : a = a * 2
         * /= : a /= 2 : a = a / 2
         * %= : a %= 2 : a = a % 2
         */
        System.out.println("<------- 練習4 ------->");
        // キャストとデータの型変換 //
        int aa;
        double bb,cc,dd;
        aa = (int)1.23; // キャストで代入
        bb = 1.23;
        cc = 10; // キャストなしで代入
        dd = (double)cc; // キャストありで代入
        System.out.println("aa =" + aa + " bb =" + bb + " cc =" + cc + " dd =" + dd);
        System.out.println("<------- 練習5 ------->");
        // 文字列の変数 //
        String s1,s2,s3;
        s1 = "ABC"; // s1に文字列「ABC」を代入
        s2 = "DEF"; // s2に文字列「DEF」を代入
        s3 = s1 + s2; // s3に、s1とs2を結合したものを代入
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 + s2);
        System.out.println(s3);
        System.out.println("<------- 練習6 ------->");
        // 定数 //
        final int NUMBER = 100;
        final String STRING = "Hoge";
        System.out.println(NUMBER);
        System.out.println(STRING);
        // finalがついた変数は値を変えれない
        //NUMBER = 100;
        //STRING = "fuge";
    }
}
