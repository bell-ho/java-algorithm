package doit.lambda;

public class CalcTest {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        Calc c = (x, y) -> x + y;
        System.out.println(c.add(n1, n2));
    }

}
