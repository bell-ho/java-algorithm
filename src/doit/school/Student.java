package doit.school;

import java.util.ArrayList;

public class Student {
    private int studentId;
    private String studentName;
    private Subject majorSubject;   //필수과목

    private ArrayList<Score> scoreList = new ArrayList<Score>(); //학생이 수강한 과목의 점수리스트

    public Student(int studentId, String studentName, Subject majorSubject) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.majorSubject = majorSubject;
    }

    public void addSubjectScore(Score score) {
        scoreList.add(score);
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public Subject getMajorSubject() {
        return majorSubject;
    }

    public ArrayList<Score> getScoreList() {
        return scoreList;
    }
}
