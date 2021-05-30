package chap03;

import java.util.Arrays;
import java.util.Scanner;

public class BinSearch {

    //요소수가 n인 배열 a에서 k와 같은 요소를 이진검색한다
    static int binSearch(int[] a, int n, int k) {

        int pl = 0;
        int pr = n - 1;

        do {
            int pc = (pl + pr) / 2;
            if (a[pc] == k) {
                return pc;
            } else if (a[pc] < k) {
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
        } while (pl <= pr);
        return -1;  //검색 실패
    }

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

        int idx = binSearch(x, n, k);

        if (idx == -1) {
            System.out.println("없음");
        } else {
            System.out.println("x[" + idx + "]");
        }
    }
}
