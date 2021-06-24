package doit.generics;

public class GenericPrinterTest2 {
    public static void main(String[] args) {
        GenericPrinter<Powder>pp = new GenericPrinter<>();
        pp.setMeterial(new Powder());
        pp.printing();


    }
}
