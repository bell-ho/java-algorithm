package chap02;

import java.util.Scanner;

public class MaxOfArray {
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("최대값");
        System.out.print("사람수 :");
        int n = sc.nextInt();

        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("h[" + i + "]:");
            h[i] = sc.nextInt();
        }

        System.out.println("최대값 " + maxOf(h));
    }
}
