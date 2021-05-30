package doit.cooperation.alonecoding;

public class Taxi {
    private int money;
    private int taxiNum;
    private String destination;

    public Taxi(int taxiNum) {
        this.taxiNum = taxiNum;
    }

    public void ride(int money, String destination) {
        this.money += money;
        this.destination = destination;
    }

    public void showInfo() {
        System.out.println("현재 택시 수입 : " + money + " 승객의 목적지 : " + destination);
    }
}
