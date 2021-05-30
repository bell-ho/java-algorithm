package chap03;

class Id {
    private static int c = 0;
    private int id;

    public Id() {
        id = ++c;
    }

    public int getId() {
        return id;
    }

    public static int getC() {
        return c;
    }
}

public class IdTester {
    public static void main(String[] args) {

        Id a = new Id();
        Id b = new Id();
        Id c = new Id();

        System.out.println(a.getId());
        System.out.println(b.getId());
        System.out.println(a.getId());
        System.out.println(c.getId());

        System.out.println(Id.getC());
    }
}