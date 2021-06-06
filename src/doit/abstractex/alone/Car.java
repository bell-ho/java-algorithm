package doit.abstractex.alone;

public abstract class Car {
    public void refuel() {
        System.out.println("가스를 충전합니다");
    }

    public abstract void stop();
    public abstract void run();

}
