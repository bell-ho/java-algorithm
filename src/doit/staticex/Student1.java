package doit.staticex;

public class Student1 {
    public static int serialNum = 1000;
    public int stuID;
    public String name;
    public int grade;
    public String address;

    public Student1() { //serialNum을 증가시키고 그 값을 stuID에 넣음
        serialNum++;
        this.stuID = serialNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
