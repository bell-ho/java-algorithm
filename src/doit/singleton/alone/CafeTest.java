package doit.singleton.alone;

public class CafeTest {
    public static void main(String[] args) {
        Person p1 = new Person(10000);
        Cafe c1 = new Cafe();

        p1.drink(c1);

        System.out.println(p1.getMoney());
        System.out.println(c1.getMoney());
    }
}
