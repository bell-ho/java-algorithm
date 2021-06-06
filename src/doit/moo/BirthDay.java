package doit.moo;

public class BirthDay {
    // this는 생성된 인스턴스 스스로를 가리키는 예약어
    int day;
    int month;
    int year;

    public void setYear(int year) {
        this.year = year;
    }
    public void printThis(){
        System.out.println(this);
    }

    public static void main(String[] args) {
        BirthDay b1 = new BirthDay();
        b1.setYear(2000);
        System.out.println(b1);
        b1.printThis();
    }
}
