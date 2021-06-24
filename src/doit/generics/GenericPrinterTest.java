package doit.generics;

public class GenericPrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderP = new GenericPrinter<>();

        powderP.setMeterial(new Powder());
        System.out.println(powderP);

        GenericPrinter<Plastic>plasticGenericPrinter = new GenericPrinter<>();

        plasticGenericPrinter.setMeterial(new Plastic());
        Plastic plastic = plasticGenericPrinter.getMeterial();
        System.out.println(plasticGenericPrinter);
    }
}
