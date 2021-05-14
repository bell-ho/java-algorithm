package chap02;

public class InArray {
    public static void main(String[] args) {
        int[] a = new int[5];

        a[0] = 1;
        a[1] = 2;

        for (int b : a) {
            if (b != 0) {
                System.out.println(b);
            }
        }
    }
}
