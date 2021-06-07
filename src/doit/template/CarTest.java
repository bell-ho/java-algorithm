package doit.template;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new AICar();
        myCar.run();

        Car hisCar = new MenualCar();
        hisCar.run();
    }
}
