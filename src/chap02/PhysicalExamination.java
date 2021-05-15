package chap02;

import java.util.Scanner;

public class PhysicalExamination {
    static final int VMAX = 21;

    static class PhyscData {
        String name;
        int h;
        double vision;

        public PhyscData(String name, int h, double vision) {
            this.name = name;
            this.h = h;
            this.vision = vision;
        }
    }

    static double aveH(PhyscData[] data) {
        double sum = 0;

        for (int i = 0; i < data.length; i++) {
            sum += data[i].h;
        }
        return sum / data.length;
    }

    //시력 분포도
    static void distVision(PhyscData[] data, int[] dist) {
        int i = 0;
        dist[i] = 0;
        for (i = 0; i < data.length; i++) {
            if (data[i].vision >= 0.0 && data[i].vision <= VMAX / 10.0) {
                dist[(int) (data[i].vision) * 10]++;
            }
        }
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("이종호1", 162, 0.3),
                new PhyscData("이종호2", 172, 0.1),
                new PhyscData("이종호3", 112, 0.2),
                new PhyscData("이종호4", 122, 0.3),
                new PhyscData("이종호5", 132, 2.0),
                new PhyscData("이종호6", 142, 1.0),
                new PhyscData("이종호7", 162, 0.6),
                new PhyscData("이종호8", 172, 0.8),
                new PhyscData("이종호9", 182, 0.5)
        };

        int[] vdist = new int[VMAX];

        System.out.println("신체검사");
        System.out.println("이름      키   시력");
        System.out.println("=====================");

        for (int i = 0; i < x.length; i++) {
            System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].h, x[i].vision);
        }

        System.out.printf("\n평균 키:%5.1fcm\n", aveH(x));
        distVision(x, vdist);

        System.out.println("\n시력 분포");
        for (int i = 0; i < VMAX; i++) {
            System.out.printf("%3.1f~:%2d명\n", i / 10.0, vdist[i]);
        }
    }
}

