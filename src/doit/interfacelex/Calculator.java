package doit.interfacelex;

public abstract class Calculator implements Calc {
    //추상클래스는 추상객체를 받아도 모든 메서드를 상속받을 필요가 없음

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int substract(int a, int b) {
        return a - b;
    }

    /*@Override
    public int times(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        return a / b;
    }*/
}
