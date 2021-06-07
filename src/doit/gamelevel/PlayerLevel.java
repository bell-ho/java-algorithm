package doit.gamelevel;

public abstract class PlayerLevel {
    public abstract void run();

    public abstract void jump();

    public abstract void turn();

    public abstract void showLevelMessage();

    final public void go(int count) {    //재정의 안되게 final
        run();
        for (int i = 0; i < count; i++) {
            jump();
        }
        turn();
    }
}
