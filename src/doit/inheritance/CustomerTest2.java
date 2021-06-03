package doit.inheritance;

public class CustomerTest2 {
    public static void main(String[] args) {
        VIPCustomer v1 = new VIPCustomer();
        v1.setCustomerID(100200);
        v1.setCustomerName("종호");
        v1.bonusPoint = 1000;
        System.out.println(v1.toString());
    }
}
