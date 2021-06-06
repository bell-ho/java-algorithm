package doit.polymorphism;

public class CustomerTest1 {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setCustomerID(100);
        c1.setCustomerName("종호");
        c1.bonusPoint = 1000;

        System.out.println(c1.toString());

        Customer c2 = new VIPCustomer(200, "종호2", 1234);
        c2.bonusPoint = 2000;

        System.out.println(c2.toString());

        int price = 20000;

        int c1Price = c1.calPrice(price);
        int c2Price = c2.calPrice(price);

        System.out.println(c1Price);
        System.out.println(c2Price);

    }
}
