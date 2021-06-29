package doit.lambda;

interface PrintString{
    void showString(String str);
}

public class TestLambda {
    public static void main(String[] args) {
        PrintString lambda = s -> System.out.println(s);
        lambda.showString("gdgd");
        showMyString(lambda);
    }

    public static void showMyString(PrintString printString) {
        printString.showString("h2");
    }
}
