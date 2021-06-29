package doit.hashset;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("a");
        treeSet.add("s");
        treeSet.add("t");

        for (String str : treeSet) {
            System.out.println(str);
        }
    }
}
