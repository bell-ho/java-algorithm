package doit.inheritance;

public class CustomerTest1 {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setCustomerID(100100);
        c1.setCustomerName("종호");
        c1.bonusPoint = 1000;
        System.out.println(c1.toString());

        VIPCustomer v1 = new VIPCustomer();
        v1.setCustomerID(100200);
        v1.setCustomerName("뿌꾸");
        v1.bonusPoint = 10000;
        System.out.println(v1.toString());
    }
}
