package doit.stream;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<>();
        sList.add("q");
        sList.add("b");
        sList.add("c");

        sList.stream().forEach(s -> System.out.println(s));

        System.out.println();

        sList.stream().sorted().forEach(s -> System.out.println(s));

    }
}
