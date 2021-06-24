package doit.generics;

public class GenericPrinter<T extends Meterial> {
    private T meterial;

    public void setMeterial(T meterial) {
        this.meterial = meterial;
    }

    public T getMeterial() {
        return meterial;
    }

    public void printing() {
        meterial.doPrinting();
    }

    @Override
    public String toString() {
        return meterial.toString();
    }
}
