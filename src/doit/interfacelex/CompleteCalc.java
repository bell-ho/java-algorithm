package doit.interfacelex;

public class CompleteCalc extends Calculator {
    //추상이 아니니까 추상객체를 상속받을때 추상객체에선 재설정하지 않았던 메소드를 상속 받아야함

    @Override
    public int times(int a, int b) {
        return 0;
    }

    @Override
    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            return Calc.ERROR;
        }
    }

    @Override
    public int square(int a) {
        return a * a;
    }

    public void show() {
        System.out.println("Calc 인터페이스를 구현했다");
    }
}
