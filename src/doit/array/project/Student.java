package doit.array.project;

import java.util.ArrayList;

public class Student {

    private static int serialName = 100;
    private int stuID;
    ArrayList<Subject> subjectList;

    public Student() {
        serialName++;
        this.stuID = serialName;
        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setSubjectName(name);
        subject.setScore(score);
        subjectList.add(subject);
    }

    public void showInfo() {
        int total = 0;
        for (Subject s : subjectList) {
            total += s.getScore();
            System.out.println(stuID + " , " + s.getSubjectName() + " : " + s.getScore());
        }
        System.out.println("total : " + total);
    }
}
