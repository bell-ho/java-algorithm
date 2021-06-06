package doit.moo;

//this로 다른 생성자 호출하기
public class CallAnotherConst {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.name);
        System.out.println(p1.age);
    }
}

class Person {
    String name;
    int age;

    Person() {  //this를 이용하여 Persion(String,int) 생성자 호출
        this("ㄴ", 1);
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}