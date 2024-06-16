package services;

import domain.Book;

public class BookServices {
    public static void addBook(Book book) {}

    public static void deleteBook(Book book) {}

    public static void updateBook(Book book) {
        boolean available = true;
        book.setAvailable(available);
    }

    public static void loanBook(Book book) {}

    public static void returnBook(Book book) {}
}
