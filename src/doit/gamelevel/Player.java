package doit.gamelevel;

public class Player {
    private PlayerLevel level;  //Player가 가지는 level 변수

    public Player() {   //디폴트 샌선자 처음 생성되면 BeginnerLevel로 시작 하고 레벨 메세지 출력
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int count) {
        level.go(count);
    }
}
