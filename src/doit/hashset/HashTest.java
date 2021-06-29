package doit.hashset;

import java.util.HashSet;

public class HashTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(new String("a"));
        hashSet.add(new String("b"));
        hashSet.add(new String("a"));
        hashSet.add(new String("d"));
        hashSet.add(new String("f"));
        hashSet.add(new String("q"));

        System.out.println(hashSet);

    }
}
