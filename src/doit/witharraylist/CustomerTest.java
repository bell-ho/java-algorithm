package doit.witharraylist;

import doit.polymorphism.Customer;
import doit.polymorphism.VIPCustomer;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> cusList = new ArrayList<Customer>();

        Customer c1 = new Customer(10010, "이순신");
        Customer c2 = new Customer(10020, "홍길동");

        Customer c3 = new GoldCustomer(20010, "신사임당");
        Customer c4 = new GoldCustomer(20020, "신립");

        Customer c5 = new VIPCustomer(30010, "야수", 1414);

        cusList.add(c1);
        cusList.add(c2);
        cusList.add(c3);
        cusList.add(c4);
        cusList.add(c5);

        for (Customer c : cusList) {
            System.out.println(c.toString());
        }

        int price = 10000;

        for (Customer c : cusList) {
            int cost = c.calPrice(price);
            System.out.println(cost);
            System.out.println(c.getCustomerName() + "," + c.getBonusPoint());
        }
    }
}
