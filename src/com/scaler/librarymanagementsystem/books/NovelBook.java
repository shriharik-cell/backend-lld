package com.scaler.librarymanagementsystem.books;

public class NovelBook extends Book {

    private String genre;

    public NovelBook(String title, String author, String isbn, String genre) {
        super(title, author, isbn);
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("Novel Book");

        System.out.println(genre);
    }
}
