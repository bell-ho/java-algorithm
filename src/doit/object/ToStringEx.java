package doit.object;

public class ToStringEx {
    public static void main(String[] args) {
        Book b1 = new Book(200, "개미");
        System.out.println(b1); //자동으로 toString
        System.out.println(b1.toString());
    }
}

class Book {
    int bookNumber;
    String bookTitle;

    public Book(int bookNumber, String bookTitle) {
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookNumber=" + bookNumber +
                ", bookTitle='" + bookTitle + '\'' +
                '}';
    }
}
