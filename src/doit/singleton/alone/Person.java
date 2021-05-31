package doit.singleton.alone;

public class Person {

    public int money;

    public Person(int money) {
        this.money = money;
    }

    public void drink(Cafe cafe) {
        this.money = money - 4500;
        cafe.sell(4500);
    }

    public int getMoney() {
        return money;
    }

}
