package doit.polymorphism;

public class AnimalTest1 {
    public static void main(String[] args) {
        AnimalTest1 a1 = new AnimalTest1();
        a1.moveAnimal(new Human());
        a1.moveAnimal(new Tiger());
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}

class Animal {
    public void move() {
        System.out.println("동물이 움직임");
    }
}

class Human extends Animal {
    public void move() {
        System.out.println("사람이 두발로 걷습니다");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("호랑이 두발로 걷습니다");
    }
}
