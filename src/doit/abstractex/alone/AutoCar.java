package doit.abstractex.alone;

public class AutoCar extends Car {
    @Override
    public void stop() {
        System.out.println("차가 멈춤");
    }

    @Override
    public void run() {
        System.out.println("차가 달림");
    }

    public void load() {
        System.out.println("짐을 싣음");
    }
}
