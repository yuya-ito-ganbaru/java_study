package day12;
//ジェネリクスによる型の指定

import java.util.*;

public class sample2 {
    
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student("安藤一郎",1,1));
        al.add(new Student("鈴木ニ郎",1,2));
        al.add(new Student("佐藤三郎",2,3));
        al.add(new Student("伊藤四郎",2,4));
        al.add(new Student("清水五郎",3,5));
        // 3番目を削除
        al.remove(3);
        // 特殊for文による結果の出力
        // for((クラス名) 変数:コレクション) {}
        for (Student s : al) {
            System.out.println("番号:" + s.getNumber() + " 名前: " + s.getName() + " 学年" + s.getGrade());
        }
    }
}
