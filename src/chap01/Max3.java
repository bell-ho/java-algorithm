package chap01;

import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 최대값을 구한다.");
        System.out.println("a의 값:");
        int a = sc.nextInt();
        System.out.println("b의 값:");
        int b = sc.nextInt();
        System.out.println("c의 값:");
        int c = sc.nextInt();

        int max = a;

        int[] arr = {a, b, c};

        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
