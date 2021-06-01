package doit.array;

public class BookArray {
    public static void main(String[] args) {
        Book[] libray = new Book[5];

        for (int i = 0; i < libray.length; i++) {
            libray[i] = new Book(i + "", i + "");
        }

        for (int i = 0; i < libray.length; i++) {
            libray[i].showInfo();
        }

        for (int i = 0; i < libray.length; i++) {
            System.out.println(libray[i]);
        }
    }
}
