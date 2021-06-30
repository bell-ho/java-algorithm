package doit.school;

import doit.school.report.GenerateGradeReport;
import doit.school.utils.Define;

public class TestMain {
    School goodSchool = School.getInstance();
    Subject korean;
    Subject math;
    Subject dance;

    GenerateGradeReport gradeReport = new GenerateGradeReport();

    public static void main(String[] args) {
        TestMain test = new TestMain();

        test.createSubject();
        test.createStudent();

        String report = test.gradeReport.getReport();
        System.out.println(report);

    }

    public void createSubject() {
        korean = new Subject("국어", Define.KOREAN);
        math = new Subject("수학", Define.MATH);
        dance = new Subject("댄스", Define.DANCE);

        goodSchool.addSubject(dance);
    }

    public void createStudent() {
        Student s1 = new Student(1001, "a", korean);    //필수과목으로하면 S 타입 성적표가뜸

        goodSchool.addStudent(s1);

        dance.register(s1);

        addScoreForStudent(s1, dance, 95);

    }

    public void addScoreForStudent(Student student, Subject subject, int point) {
        Score score = new Score(student.getStudentId(), subject, point);
        student.addSubjectScore(score);
    }
}
