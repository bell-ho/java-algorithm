package doit.staticex;

public class Student2 {
    private static int serialNum = 1000;
    int stuID;
    String name;
    int grade;
    String address;

    public Student2() { //serialNum을 증가시키고 그 값을 stuID에 넣음
        serialNum++;
        this.stuID = serialNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getSerialNum() {
        int i = 10;
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student2.serialNum = serialNum;
    }
}
