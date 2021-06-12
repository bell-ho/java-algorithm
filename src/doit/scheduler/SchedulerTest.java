package doit.scheduler;

import java.io.IOException;
import java.util.Scanner;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("전화 상담 방식을 선택");
        System.out.println("R : 한명씩 차례로 할당");
        System.out.println("L : 대기가 적은 상담원 할당");
        System.out.println("P : 우선순위가 높은 고객 먼저 할당");


        String ch = sc.next();

        Scheduler scheduler = null;

        switch (ch) {
            case "R":
            case "r":
                scheduler = new RoundRobin();
                break;
            case "L":
            case "l":
                scheduler = new LeastJob();
                break;
            case "P":
            case "p":
                scheduler = new PriorityAllocation();
                break;
            default:
                System.out.println("지원 되지 않는 기능");
                break;
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}
