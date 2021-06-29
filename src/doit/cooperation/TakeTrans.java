package doit.cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student s1 = new Student("a", "1", 5000);
        Student s2 = new Student("a", "2", 15000);

        Bus b1 = new Bus(100);

        s1.takeBus(b1);
        s1.showInfo();
        b1.showInfo();
        s2.takeBus(b1);
        b1.showInfo();
        s2.showInfo();
    }
}
