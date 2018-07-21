package Programowanie.Singleton;

import java.util.ArrayList;
import java.util.List;


public class BooksRegistry {
    private static BooksRegistry booksInstance = null;

    public static BooksRegistry getInstance() {
        if(booksInstance == null) {
            booksInstance = new BooksRegistry();

            booksInstance.add(new Book("Pan Tadeusz", "Adam Mickiewicz"));
        }
        return booksInstance;
    }

    private ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void add(Book book) {
        books.add(book);
    }

    public void borrow(int index) {
        books.remove(index);
    }
}