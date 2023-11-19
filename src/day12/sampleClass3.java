package day12;

//ラッパークラス

import java.util.*;

public class sampleClass3 {
    
    public static void main(String[] args) {
        // String型でデータを追加
        ArrayList<String> s1 = new ArrayList<String>();
        s1.add("ONE");
        s1.add("TWO");
        s1.add("THREE");
        // 特殊for文で結果を出力
        for (String s : s1) {
            System.out.print(s + " ");
        }
        System.out.println();//改行
        // Integer型でデータを追加
        ArrayList<Integer> i1 = new ArrayList<Integer>();
        i1.add(1);
        i1.add(2);
        i1.add(3);
        for (Integer i : i1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    /** 基本データ型とラッパークラス
     * 基本データ型 : ラッパークラス
     * byte : Byte
     * short : Short
     * int : Integer
     * long : Long
     * float : Float
     * double : Double
     * char : Character
     * boolean : Boolean
     */
}
