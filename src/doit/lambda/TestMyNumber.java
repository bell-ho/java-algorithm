package doit.lambda;

public class TestMyNumber {
    public static void main(String[] args) {
        MyNumber max = (x, y) -> (x >= y) ? x : y;  //람다식을 인터페이스형 max변수에 대입
        int a =max.getMax(10, 20); //인터페이스평 변수로 getMax메서드호출
        System.out.println(a);
    }
}
