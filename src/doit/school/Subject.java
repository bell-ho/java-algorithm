package doit.school;

import doit.school.utils.Define;

import java.util.ArrayList;


public class Subject {
    private String subjectName;
    private int subjectId;
    private int gradeType;  //학점평가 정책

    private ArrayList<Student> studentList = new ArrayList<>(); //이 과목을 수강신청한 학생리스트

    public Subject(String subjectName, int subjectId) {
        this.subjectName = subjectName;
        this.subjectId = subjectId;
        this.gradeType = Define.AB_TYPE;    //학점평가 정책은 기본으로 A,B 방식
    }

    public void register(Student student) { //수강신청 메서드
        studentList.add(student);
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setGradeType(int pfType) {
    }
}
