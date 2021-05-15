package chap02;

import java.util.Scanner;

public class ReverseArray {
    static void swap(int[] a, int idx1, int idx2) {
        //배열 요소 idx1 과 idx2의 값을 바꿈
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    //배열 a의 요소를 역순으로 정렬
    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("요소수 : ");
        int n = sc.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        reverse(x);

        System.out.println("역정렬");
        for (int i = 0; i < n; i++) {
            System.out.println(x[i]);
        }
    }
}
