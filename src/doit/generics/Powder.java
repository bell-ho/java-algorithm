package doit.generics;

public class Powder extends Meterial{
    public void doPrinting(){
        System.out.println("Powder 재료로 출력");
    }

    @Override
    public String toString() {
        return "Powder{}";
    }
}
