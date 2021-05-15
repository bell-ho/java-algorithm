package chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
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
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("사람수 : ");
        int n = sc.nextInt();

        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = 100 + rand.nextInt(90);
            System.out.println(h[i]);
        }

        System.out.println(maxOf(h));
    }
}
