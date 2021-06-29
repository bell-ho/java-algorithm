package doit.lambda;

public class TestStringConcat {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        StringConcatImpl c1 = new StringConcatImpl();
        c1.makeString(s1, s2);

        StringConcat c2 = (s, e) -> System.out.println(s + "," + e);
        c2.makeString(s1, s2);

    }
}
