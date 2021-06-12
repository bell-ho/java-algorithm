package doit.scheduler;

public class LeastJob implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("순서대로 대기열에서 가져옴");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("현재 상담 업무가 없거나 대기가 적은 상담원에게 할당");
    }
}
