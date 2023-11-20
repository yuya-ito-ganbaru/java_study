package day13;

//HashMap

import java.util.*;

public class sample1 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        String nengo[] = { "明治" , "大正" , "昭和" , "平成" };
        map.put(nengo[0], 1868);
        map.put(nengo[1], 1912);
        map.put(nengo[2], 1926);
        map.put(nengo[3], 1989);
        for (String s : nengo) {
            System.out.println(s + "元年は、西暦" + map.get(s) + "年");
        }
        /**
         * HashMap
         * キーと値を1セットとした要素の集まりを管理するクラス
         * 
         * 主要メソッド
         * メソッド : 働き
         * get() : 指定したキーの要素を返す
         * put() : キーと要素を対応させます。
         * remove() : 指定したキーの要素を削除します。
         * clear() : すべてのキーと要素を削除
         * containsKey() : 指定したキーの値が存在すれば、true、なければfalseを返す
         * isEmpty() : 要素がなければ、trueを返します。
         * size() : 要素数を返します。
         */
    }
}
