package doit.singleton.alone;

public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();

        Car c1 = factory.createCar();
        Car c2 = factory.createCar();
        Car c3 = factory.createCar();
        System.out.println(c1.getCarID());
        System.out.println(c2.getCarID());
        System.out.println(c3.getCarID());
    }
}
