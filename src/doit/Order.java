package doit;

import java.time.LocalDate;
import java.util.Date;

public class Order {
    String orderNum;
    String id;
    LocalDate date;
    String name;
    String goodsNum;
    String address;

    public Order(String orderNum, String id, LocalDate date, String name, String goodsNum, String address) {
        this.orderNum = orderNum;
        this.id = id;
        this.date = date;
        this.name = name;
        this.goodsNum = goodsNum;
        this.address = address;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGoodsNum(String goodsNum) {
        this.goodsNum = goodsNum;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNum='" + orderNum + '\'' +
                ", id='" + id + '\'' +
                ", date=" + date +
                ", name='" + name + '\'' +
                ", goodsNum='" + goodsNum + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Order o1 = new Order("2018", "abc", LocalDate.now(), "홍길", "PD0345", "서울");
        System.out.println(o1.toString());
    }
}
