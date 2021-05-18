package chap03;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소수 : ");
        int n = sc.nextInt();
        int[] x = new int[n];

        System.out.println("입력");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        System.out.println("오름차순 정렬");
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] >= x[j]) {
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();

        System.out.println("검색할 값");
        int k = sc.nextInt();

        int idx = Arrays.binarySearch(x, k);

        if (idx < 0) {
            System.out.println("없음");
        } else {
            System.out.println("x[" + idx + "]");
        }
    }
}

