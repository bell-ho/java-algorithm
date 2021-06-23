package doit.object;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Circle implements Cloneable {

    Point point;
    int radius;

    public Circle(int x, int y, int radius) {
        this.radius = radius;
        point = new Point(x, y);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "point=" + point +
                ", radius=" + radius +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {    //클론메소드를 사용할 때 발생하는 오류를 예외처리
        return super.clone();
    }
}

public class ObjectCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle c1 = new Circle(10, 20, 20);
        Circle copyC1 = (Circle) c1.clone();

        System.out.println(c1);
        System.out.println(copyC1);
        System.out.println(System.identityHashCode(c1));
        System.out.println(System.identityHashCode(copyC1));
    }
}
