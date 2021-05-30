package doit.cooperation.alonecoding;

public class CallConst {
    public static void main(String[] args) {
        Student s1 = new Student("종호", 20000);
        Taxi t1 = new Taxi(3000);

        s1.ride(t1 , "개봉");
        s1.showInfo();
        t1.showInfo();
    }
}
