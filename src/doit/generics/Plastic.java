package doit.generics;

public class Plastic extends Meterial{
    public void doPrinting(){
        System.out.println("플라스틱 재료");
    }

    @Override
    public String toString() {
        return "Plastic{}";
    }
}
