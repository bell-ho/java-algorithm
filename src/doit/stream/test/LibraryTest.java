package doit.stream.test;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        List<Book> lb = new ArrayList<>();

        lb.add(new Book("a", 1000));
        lb.add(new Book("b", 2000));
        lb.add(new Book("c", 3000));

        int total = lb.stream().mapToInt(b -> b.getPrice()).sum();
        System.out.println(total);

        lb.stream().filter(b -> b.getPrice() >= 2000).map(b -> b.getName()).sorted().forEach(b -> System.out.println(b));
    }
}
