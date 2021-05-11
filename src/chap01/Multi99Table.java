package chap01;

public class Multi99Table {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            for (int j = 1; j <= 30; j++) {
                System.out.printf("%5d", i * j);
            }
            System.out.println();
        }
    }
}
