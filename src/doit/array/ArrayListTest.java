package doit.array;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();

        library.add(new Book("1","2"));

        for(int i =0 ;i<library.size() ;i++ ){
            Book book = library.get(i);
            book.showInfo();
        }
        System.out.println();

        for(Book book : library){
            book.showInfo();

        }
    }
}
