package doit.cooperation;

public class Student {
    public String studentName;
    public int grade;
    public int money;

    public Student(String a, String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    public void showInfo() {
        System.out.println(studentName + "남은돈 : " + money);
    }
}
