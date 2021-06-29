package doit.string;

public class StringBuilderTest {
    public static void main(String[] args) {
        String javaStr = new String("Java");
        System.out.println("문자열 주소 : " + System.identityHashCode(javaStr));

        StringBuilder buffer = new StringBuilder(javaStr);
        System.out.println("연산전" + System.identityHashCode(buffer));

        buffer.append(" and");
        buffer.append(" android");

        System.out.println("연산후" + System.identityHashCode(buffer));
        javaStr = buffer.toString();
        System.out.println(javaStr);
        System.out.println("연결된 " + System.identityHashCode(javaStr));
    }
}
