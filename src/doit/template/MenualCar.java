package doit.template;

public class MenualCar extends Car {
    @Override
    public void drive() {
        System.out.println("사람이 운전");
        System.out.println("사람이 핸들 조작");
    }

    @Override
    public void stop() {
        System.out.println("브레이크로 정지");
    }
}
