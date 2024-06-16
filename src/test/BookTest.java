package test;

import domain.Book;

public class BookTest {
    public static void main(String[] args) {
        String title = "The Secret of the Old Clock";
        String author = "Nancy Drew";
        String isbn = "9780448466750";
        String publisher = "Simon & Schuster";
        boolean available = true;

        Book book = new Book(title, author, isbn, publisher, available);

        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Publisher: " + book.getPublisher());
        System.out.println("Available: " + book.isAvailable());
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println(book.toString());
    }
}
