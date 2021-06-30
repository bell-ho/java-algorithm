package doit.school;

public class Score {
    int studentId;
    Subject subject;
    int point;

    public Score(int studentId, Subject subject, int point) {
        this.studentId = studentId;
        this.subject = subject;
        this.point = point;
    }

    public Subject getSubject() {
        return subject;
    }

    public int getPoint() {
        return point;
    }

    @Override
    public String toString() {
        return "Score{" +
                "studentId=" + studentId +
                ", subject=" + subject +
                ", point=" + point +
                '}';
    }
}
