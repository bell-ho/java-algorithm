package chap01;

import java.util.Scanner;

public class SumForPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.println("디시입력");
            n = sc.nextInt();
        } while (n <= 0); //<==n이 0이하라면 반복


        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println(-100 + 1);
    }
}
