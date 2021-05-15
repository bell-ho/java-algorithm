package chap02;

import java.util.Random;

public class Test02 {

    static void distVision(int[] dist) {
        int i = 0;
        dist[i] = 0;
        Random rand = new Random();
        for (i = 0; i < dist.length; i++) {
            dist[(int) rand.nextInt(5)] += 1;
        }
    }

    public static void main(String[] args) {
        int[] vdist = new int[5];
        distVision(vdist);

        for (int i = 0; i < vdist.length; i++) {
            System.out.println(vdist[i]);
        }
    }
}
