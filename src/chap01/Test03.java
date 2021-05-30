package chap01;

public class Test03 {
    public static void main(String[] args) {
        Test03 t1 = new Test03();
        int num1 = 1;
        int num2 = 2;

        t1.eatRice();
        t1.rideBus();
        t1.studyProgramming();

        t1.plusNum(num1, num2);
        System.out.println(t1.plusNum(num1, num2));
    }

    public void eatRice() {
        System.out.println("밥먹음");
    }

    public void rideBus() {
        System.out.println("버스탐");
    }

    public void studyProgramming() {
        System.out.println("공부");
    }

    public int plusNum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}
