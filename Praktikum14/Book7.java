package Praktikum14;
public class Book7 {
    public String isbn;
    public String title;

    public Book7() {
    }

    public Book7(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }
    public String toString() {
        return " ISBN: " + this.isbn + " Title: " + this.title;
    }
}