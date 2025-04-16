package com.scaler.librarymanagementsystem.books;

public class TextBook extends Book {

    private String subject;

    public TextBook(String title, String author, String isbn, String subject) {
        super(title, author, isbn);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        System.out.println("TextBook");
        System.out.println(getTitle() + " " + getAuthor() + " " + getIsbn());
        System.out.println(subject);
    }
}
