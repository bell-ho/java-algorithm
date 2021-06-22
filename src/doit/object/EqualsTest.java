package doit.object;

class Student {
    int stId;
    String stName;

    public Student(int stId, String stName) {
        this.stId = stId;
        this.stName = stName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stId=" + stId +
                ", stName='" + stName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student) {
            Student std = (Student) o;
            if (this.stId == std.stId) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}

public class EqualsTest {
    public static void main(String[] args) {
        Student s1 = new Student(100, "a");
        Student s2 = s1;
        Student s3 = new Student(100, "a");

        if (s1 == s2) {
            System.out.println("s1 , s2 주소같음");
        } else {
            System.out.println("s1 , s2 주소다음");
        }

        if (s1.equals(s2)) {
            System.out.println("s1 , s2 동일");
        } else {
            System.out.println("s1 , s2 동일하지 않음");
        }

        if (s1 == s3) {
            System.out.println("s1 , s3 주소같음");
        } else {
            System.out.println("s1 , s3 주소다름");
        }

        if (s1.equals(s3)) {
            System.out.println("s1 , s3 동일");
        } else {
            System.out.println("s1 , s3 동일하지 않음");
        }
    }
}
