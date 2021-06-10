package doit.finallex;

public class Constant {
    int num = 10;
    final int NUM = 100;

    public static void main(String[] args) {
        Constant cos = new Constant();
        cos.num = 50;
//        cos.NUM = 200;

        System.out.println(cos.num);
//        System.out.println(cos.NUM);
    }
}

