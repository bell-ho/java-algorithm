package chap02;

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


}
