package Programowanie.wzorceProjektowe;

public class Book {
    private Integer id;
    private String title;
    private String author;
    private Integer year;
    private Integer quantity;

    public Book(Integer id, String title, String author, Integer year, Integer quantity) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id = " + id +
                ", title = '" + title + '\'' +
                ", author = '" + author + '\'' +
                ", year = " + year +
                ", quantity = " + quantity +
                '}';
    }
}