package doit.hashset;

import doit.cooperation.Student;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();

        set.add(new Student("a", "a", 1100));
        set.add(new Student("b", "b", 1100));
        set.add(new Student("c", "c", 1100));


        for (Student s : set) {
            System.out.println(s.studentName+":"+s.studentName);
        }
        System.out.println();
    }
}
