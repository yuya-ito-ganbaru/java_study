package day11;
//インターフェース
public class sampleClass1 {
    public static void main(String args[]) {
        // 携帯電話クラスのインスタンスを生成
        CellPhone cp = new CellPhone("hoge@email.com","090-1234-1234");
        // 携帯電話クラスで、電話とメールを送る
        cp.call("011-123-1234");
        cp.sendMail("fuga@email.com");

        // 電話インターフェースでインスタンスにアクセス
        IPhone phone = (IPhone)cp;//CellPhoneクラスを、IPhone型にキャスト
        // 電話をかける
        phone.call("011-456-4567");
        // メールの送信メソッドは利用できない
        //phone.sendMail("foo@email.com");

        // メールインターフェースでインスタンスにアクセス
        IEmail mail = (IEmail)cp;//CellPhoneクラスを、IEmail型にキャスト
        // メール出す
        mail.sendMail("bar@email.com");
        // mailインターフェースでは、電話の機能を利用できない
        //mail.call("011-789-7890");
    }    
}
