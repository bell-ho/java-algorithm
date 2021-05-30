package doit.cooperation.alonecoding;

public class Student {
    private String name;
    private int money;
    private String destination;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }


    public void ride(Taxi t, String destination) {
        t.ride(10000, destination);
        this.money -= 10000;
    }

    public void showInfo() {
        System.out.println("학생 남은돈 : " + money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
