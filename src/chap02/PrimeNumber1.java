package chap02;

public class PrimeNumber1 {
    public static void main(String[] args) {
        int c = 0;

        for (int i = 2; i <= 1000; i++) {
            int j;
            for (j = 2; j < i; j++) {
                c++;
                if (i % j == 0) {
                    break;
                }
            }
            //다 나누고 가져왔을때 i랑 같나 비교
            if (i == j) {
                System.out.println(i);
            }
        }
        System.out.println(c);
    }
}
