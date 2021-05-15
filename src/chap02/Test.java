package chap02;

public class Test {
    public static void main(String[] args) {
        int[] i1 = {0, 1};

        for (int i = 0; i < i1.length; i++) {
            System.out.println(i1[i]);
        }

//        형식
//        for(초기화;조건문;증감문){
//            실행문;
//        }

//        내부 동작은 while문과 거의 같고, while문과 마찬가지로
//        조건문이 참이여야 실행문이 실행된다.
//        동작 순서는 다음과 같다.
//        1. 초기화;
//        2. 조건문;
//        3. 조건이 참일시 실행문이 실행됨
//        4. 증감문이 발생함
//        5. 다시 조건문으로 감
//        6. 또 조건이 참일시 실행문이 실행됨
//        7. 증감문이 발생함
//        8. 또 해당하는 조건에 대입 근데 이번엔 거짓임
//        9. 거짓이니까 실행문 무시하고 for문 종료
    }
}
