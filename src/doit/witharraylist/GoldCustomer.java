package doit.witharraylist;

import doit.polymorphism.Customer;

public class GoldCustomer extends Customer {

    double saleRatio;

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        customerGrade = "골드";
        bonusRatio = 0.02;
        saleRatio = 0.1;
    }

    @Override
    public int calPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * saleRatio);
    }
}
