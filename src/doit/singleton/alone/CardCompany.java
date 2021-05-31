package doit.singleton.alone;

public class CardCompany {
    private static CardCompany instance = new CardCompany();

    private CardCompany() {
        /*생성자 접근권한자가 private인 이유 :
        public 이면 클래스에서 인스턴스를 여러개 생성할 수 있음
        접근제한자가 private 라서 외부클래서에서 Company인스턴스를 생성할 수 없게됨*/
    }

    //유일하게 외부에서도 사용할 수 있는 설정
    public static CardCompany getInstance() {
        if (instance == null) {
            instance = new CardCompany();
        }
        return instance;
    }

    public static Card createCard() {
        return new Card();
    }
}
