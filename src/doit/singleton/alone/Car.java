package doit.singleton.alone;

public class Car {
    private static int serialNum = 10000;
    private int carID;

    public Car() {
        serialNum++;
        this.carID = serialNum;
    }

    public int getCarID() {
        return carID;
    }
}
