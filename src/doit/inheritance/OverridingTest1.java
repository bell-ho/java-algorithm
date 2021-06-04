package doit.inheritance;

public class OverridingTest1 {
    public static void main(String[] args) {
        Customer c1 = new Customer(100, "종호");
        c1.bonusPoint = 10000;

        VIPCustomer v1 = new VIPCustomer(200, "정호", 123);
        v1.bonusPoint = 10000;

        int price = 10000;

        System.out.println(c1.calPrice(price));
        System.out.println(v1.calPrice(price));
    }
}
