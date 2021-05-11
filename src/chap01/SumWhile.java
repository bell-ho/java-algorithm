package chap01;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int i = 1;
        int n = sc.nextInt();

        while (i <= n) {
            System.out.println(i);
            sum += i;
            i++;
            System.out.println(sum);
        }
    }
}
