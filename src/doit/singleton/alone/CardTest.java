package doit.singleton.alone;

public class CardTest {
    public static void main(String[] args) {
        //유일하게 외부에서도 사용할 수 있는 설정
        CardCompany cc = CardCompany.getInstance();

        Card c1 = cc.createCard();
        Card c2 = cc.createCard();

        System.out.println(c1.getCardNum());
        System.out.println(c2.getCardNum());
    }
}
