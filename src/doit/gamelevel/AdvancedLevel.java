package doit.gamelevel;

public class AdvancedLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("빨리 달림");
    }

    @Override
    public void jump() {
        System.out.println("점프 가능");
    }

    @Override
    public void turn() {
        System.out.println("턴 안됨");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("중급 레벨");
    }
}
