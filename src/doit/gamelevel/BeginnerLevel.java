package doit.gamelevel;

public class BeginnerLevel extends PlayerLevel{

    @Override
    public void run() {
        System.out.println("천천히 달림");
    }

    @Override
    public void jump() {
        System.out.println("점프 불가");
    }

    @Override
    public void turn() {
        System.out.println("턴 불가");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("초보자 레벨");
    }
}
