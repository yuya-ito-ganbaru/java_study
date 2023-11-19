package day12;

//java.util.パッケージの読み込み（インポート）
import java.util.*;

public class sample1 {
    
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(new Student("安藤一郎",1,1));
        al.add(new Student("鈴木ニ郎",1,2));
        al.add(new Student("佐藤三郎",2,3));
        al.add(new Student("伊藤四郎",2,4));
        al.add(new Student("清水五郎",3,5));
        // 3番目を削除
        al.remove(3);
        for(int i = 0; i < al.size(); i++) {
            Student s = (Student)al.get(i);//i番目のオブジェクトを取得
            System.out.println("番号:" + s.getNumber() + " 名前: " + s.getName() + " 学年" + s.getGrade());
        }
    }
}
