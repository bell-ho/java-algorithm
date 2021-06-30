package doit.stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
    public static void main(String[] args) {
        TravelCustomer c1 = new TravelCustomer("a", 40, 100);
        TravelCustomer c2 = new TravelCustomer("b", 20, 100);
        TravelCustomer c3 = new TravelCustomer("c", 13, 50);

        List<TravelCustomer> customers = new ArrayList<>();

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);

        System.out.println("고객 명단 순서");

        //map은 요소들을 순회하면서 다른형식으로 변환
        customers.stream().map(c -> c.getName()).forEach(c -> System.out.println(c));

        int total = customers.stream().mapToInt(c -> c.getPrice()).sum();
        System.out.println("총 비용" + total);

        System.out.println("20세 이상 고객");
        customers.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(c -> System.out.println(c));    //스트림은 쿼리문이랑 비슷
    }
}
