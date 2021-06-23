package doit.object;

public class HashCodeTest {
    public static void main(String[] args) {
        String st1 = new String("abc");
        String st2 = new String("abc");

        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());

        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());
    }
}
