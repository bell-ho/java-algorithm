package chap01;

public class test02 {
    public static void main(String[] args) {
        test02 t = new test02();
        long startTime = System.currentTimeMillis();
        t.testMethod();
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime));
    }

    public void testMethod() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
