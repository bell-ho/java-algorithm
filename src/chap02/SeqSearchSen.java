package chap02;

import java.util.Scanner;

public class SeqSearchSen {

    static int seqSen(int[] a, int n, int k) {
        int i = 0;
        a[n] = k;   //보초 추가
        while (true) {
            if (a[i] == k) {
                break;
            }
            i++;
        }
        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n + 1];

        for (int i = 0; i < n; i++) {
            System.out.println("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        System.out.println("검색 : ");
        int k = sc.nextInt();

        int idx = seqSen(x, n, k);

        if (idx == -1) {
            System.out.println("없음");
        } else {
            System.out.println("x[" + idx + "]");
        }
    }

}
