package doit.singleton.alone;

public class Card {
    private static int serialNum = 100;
    public int cardNum;

    public Card() {
        serialNum++;
        this.cardNum = serialNum;
    }

    public int getCardNum() {
        return cardNum;
    }
}
