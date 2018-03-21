import java.util.ArrayList;

public class ObjectPractice06 {
    public static void main(String[] args) {

        CoinCase a = new CoinCase();

        for(int i = 0; i < 6; i++) {
            System.out.println("硬貨種類を入力しくたさい。");
            int type = new java.util.Scanner(System.in).nextInt();
            System.out.println("硬貨の枚数を入力しくたさい。");
            int mai = new java.util.Scanner(System.in).nextInt();
            a.AddCoins(type, mai);
        }

        a.GetCount();
        a.GetAmount();
    }
}
