package doit.classex;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Person p1 = new Person();
        Class pClass1 = p1.getClass();
        System.out.println(pClass1.getName());

        Class pClass2 = Person.class;
        System.out.println(pClass2.getName());

        Class pClass3 = Class.forName("doit.classex.Person");
        System.out.println(pClass3.getName());
    }
}

