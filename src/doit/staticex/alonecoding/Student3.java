package doit.staticex.alonecoding;

public class Student3 {
    private static int serialNum = 1000;
    private int stuNum;
    private int cardNum;

    public Student3() {
        serialNum++;
        this.stuNum = serialNum;
        this.cardNum = stuNum + 100;
    }

    public int getCardNum() {
        return cardNum;
    }
}
