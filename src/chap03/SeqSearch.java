package chap03;

import java.util.Scanner;

public class SeqSearch {

    static int seqSearch(int[] x, int num, int key) {
        int i = 0;
        while (true) {
            if (i == num) {
                return -1;
            }
            if (x[i] == key) {
                return i;
            }
            i++;
        }
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
