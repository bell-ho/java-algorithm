package doit.school;

import java.util.ArrayList;

public class School {
    private static School instance = new School();

    private static String SCHOOL_NAME = "GOOD School";
    private ArrayList<Student> studentList = new ArrayList<>();
    private ArrayList<Subject> subjectList = new ArrayList<>();

    public School() {
    }

    public static School getInstance() {
        if (instance == null) {
            instance = new School();
        }
        return instance;
    }

    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void addSubject(Subject subject) {
        subjectList.add(subject);
}
}
