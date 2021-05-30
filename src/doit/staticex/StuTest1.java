package doit.staticex;

public class StuTest1 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.setName("1");

        Student1 s2 = new Student1();
        s2.setName("2");

        System.out.println(s1.stuID);
        System.out.println(s2.stuID);
    }
}
