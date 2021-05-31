package doit.singleton.alone;

public class Cafe {

    public int money;

    public Cafe() {
    }

    public int getMoney() {
        return money;
    }

    public void sell(int money){
        this.money = this.money + money;
    }
}
