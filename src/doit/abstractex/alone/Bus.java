package doit.abstractex.alone;

public class Bus extends Car {
    @Override
    public void stop() {
        System.out.println("버스가 멈춤");
    }

    @Override
    public void run() {
        System.out.println("버스가 츨발");
    }

    @Override
    public void refuel() {
        super.refuel();
    }

    public void takePassenger() {
        System.out.println("승객을 버스에 태웁니다");
    }


}
