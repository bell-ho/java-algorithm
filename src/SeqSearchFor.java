import java.util.Scanner;

public class SeqSearchFor {

    static int seqSearch(int[] x, int num, int key) {
        for (int i = 0; i < num; i++) {
            if (x[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("요소수 : ");
        int num = sc.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            x[i] = sc.nextInt();
        }

        System.out.println("검색 : ");
        int ky = sc.nextInt();

        int idx = seqSearch(x, num, ky);

        if (idx == -1) {
            System.out.println("못 찾음");
        } else {
            System.out.println(idx);
        }
    }
}
