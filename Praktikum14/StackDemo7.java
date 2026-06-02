package Praktikum14;
import java.util.Stack;
public class StackDemo7 {
    public static void main(String[] args) {
        Book7 book1 = new Book7("1234", "Dasar pemrograman");
        Book7 book2 = new Book7("7145", "Hafalah Shalat Delisa");
        Book7 book3 = new Book7("3562", "Muhammad Al-Fatih");

        Stack<Book7> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        Book7 temp = books.peek();
    
        if (temp != null) {
            System.out.println(temp.toString());
        }

        Book7 temp2 = books.pop();
        if (temp2 != null) {
            System.out.println(temp2.toString());
        }

        for (Book7 book : books) {
            System.out.println(book.toString());
        }

        int posisi = books.search(book1);
        System.out.println("Buku ini berada  di posisi " + posisi);
    }
}