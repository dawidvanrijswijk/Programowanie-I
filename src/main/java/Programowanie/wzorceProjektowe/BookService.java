package Programowanie.wzorceProjektowe;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookService {
    public List<Book> bookList;

    public List<Book> getSampleBooks() {
        List<Book> returnList = new ArrayList<Book>();
        returnList.add(new Book(1, "Cień Wiatru", "Carlos Ruiz Zafon", 2001,5));
        returnList.add(new Book(2, "Gra Anioła", "Carlos Ruiz Zafon", 2008,10));
        returnList.add(new Book(3, "Więzień Nieba", "Carlos Ruiz Zafon", 2011,15));
        returnList.add(new Book(4, "Labirynt Duchów", "Carlos Ruiz Zafon", 2016,20));
        return returnList;
    }

    public BookService() {
        this.bookList = getSampleBooks();
    }

    public List<Book> getBooks() {
        return bookList;
    }

    public Book getBook(int id) {
        Optional<Book> bookOptional = bookList.stream().filter(x -> x.getId().equals(id)).findFirst();
        if (bookOptional.isPresent()) return bookOptional.get();
        else throw new Exception("Nie ma książki o id = " + id);
    }
}