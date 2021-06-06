package doit.abstractex;

public abstract class Computer {
    public abstract void display();
    public abstract void typing();

    public void turnOn(){
        System.out.println("전원 킴");
    }
    public void turnOff(){
        System.out.println("전원 끔");
    }
}
